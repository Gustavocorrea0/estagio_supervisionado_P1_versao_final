package producao;

import ConexaoComBanco.Conecta;
import com.itextpdf.text.BaseColor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import java.awt.Desktop;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.File;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;

import java.io.FileOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ControleProducao {

    public Conecta conexao = new Conecta();
    public PreparedStatement ps;
    public ResultSet resultados;
    public String msg;
    public String sql;
    private int linhasAfetadas;
    public Producao producao;

    public static final byte INCLUSAO = 1;
    public static final byte ALTERACAO = 2;
    public static final byte EXCLUSAO = 3;
    public static final byte CONSULTA = 4;

    public ControleProducao() {
        conexao = new Conecta();
        producao = new Producao();
    }

    public String cadastrarProducao(byte operacao) {
        if (!conexao.getConexao()) {
            msg = "Falha de conexao com o banco de dados";
            return msg;
        }

        try {
            if (operacao == INCLUSAO) {
                sql = "INSERT INTO producao (id_propriedade, propriedade_da_colheita, data_plantio, data_inicio_colheita,"
                        + " data_fim_colheita, quantidade_produzida_em_sacos, nome_producao, "
                        + "valor_total_despesas, valor_total_de_lucro, cultura) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                ps = conexao.conn.prepareStatement(sql);

                ps.setInt(1, producao.getIdPropriedade());
                ps.setString(2, producao.getPropriedade());
                ps.setDate(3, new java.sql.Date(producao.getDataDePlantio().getTime()));
                ps.setDate(4, new java.sql.Date(producao.getDataInicioColheita().getTime()));
                ps.setDate(5, new java.sql.Date(producao.getDataFimColheita().getTime()));
                ps.setInt(6, producao.getQuantidadeProduzidaEmSacos());
                ps.setString(7, producao.getNomeProducao());
                ps.setDouble(8, producao.getValorTotalDespesas());
                ps.setDouble(9, producao.getValorTotalDeLucro());
                ps.setString(10, producao.getCultura());

                linhasAfetadas = ps.executeUpdate();

                if (linhasAfetadas > 0) {
                    msg = "Producão lançada com sucesso";
                } else {
                    msg = "A produção não foi lançada";
                }

            } else {
                msg = "Operação não suportada";
            }

        } catch (SQLException ex) {
            msg = "Erro ao cadastrar Produção " + ex.getMessage();
        }

        return msg;
    }

    public Producao buscarProducao(String nomeProducao) throws SQLException {
        if (!conexao.getConexao()) {
            return null;
        }

        try {
            sql = "SELECT * FROM producao WHERE nome_producao = ?";
            ps = conexao.conn.prepareStatement(sql);
            ps.setString(1, nomeProducao);
            resultados = ps.executeQuery();

            if (resultados.next()) {
                Producao producaoBuscada = new Producao();

                producaoBuscada.setNomeProducao(resultados.getString("nome_producao"));
                producaoBuscada.setDataDePlantio(resultados.getDate("data_plantio"));
                producaoBuscada.setDataInicioColheita(resultados.getDate("data_inicio_colheita"));
                producaoBuscada.setDataFimColheita(resultados.getDate("data_fim_colheita"));
                producaoBuscada.setValorTotalDespesas(resultados.getDouble("valor_total_despesas"));
                producaoBuscada.setValorTotalDeLucro(resultados.getDouble("valor_total_de_lucro"));
                producaoBuscada.setQuantidadeProduzidaEmSacos(resultados.getInt("quantidade_produzida_em_sacos"));
                producaoBuscada.setCultura(resultados.getString("cultura"));
                producaoBuscada.setIdProducao(resultados.getInt("id_producao"));
                return producaoBuscada;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public String removerProducao(String nomeProducao) {
        if (!conexao.getConexao()) {
            return "Falha de conexao";
        }

        try {
            sql = "DELETE FROM producao WHERE nome_producao = ?";
            ps = conexao.conn.prepareCall(sql);
            ps.setString(1, nomeProducao);

            int linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                msg = "Produção removida com sucesso";
            } else {
                msg = "A Produção não foi removida";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            msg = "Falha no banco de dados ao remover producao";
        }
        return msg;
    }

    public List<Producao> lerProducao() {
        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
        }

        resultados = null;
        ps = null;
        sql = "SELECT * FROM producao";

        List<Producao> producoes = new ArrayList();

        try {
            ps = conexao.conn.prepareStatement(sql);
            resultados = ps.executeQuery();

            while (resultados.next()) {
                Producao producao = new Producao();

                producao.setIdProducao(resultados.getInt("id_producao"));
                producao.setNomeProducao(resultados.getString("nome_producao"));
                producao.setQuantidadeProduzidaEmSacos(resultados.getInt("quantidade_produzida_em_sacos"));
                producao.setValorTotalDeLucro(resultados.getDouble("valor_total_de_lucro"));
                producao.setCultura(resultados.getString("cultura"));
                producoes.add(producao);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return producoes;
    }

    private String formatarData(Date data) {
        SimpleDateFormat formatoBrasileiro = new SimpleDateFormat("dd/MM/yyyy");
        return formatoBrasileiro.format(data);
    }

    public void gerarRelatorioDeDadosDeProducoesEmPDF() throws SQLException, ParseException, IOException {
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataDeHoje = dataAtual.format(formatter);

        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
        }

        resultados = null;
        ps = null;
        sql = "SELECT * FROM producao";

        Document doc = new Document();

        String nomePDF = "C:\\Users\\Gustavo\\Desktop\\relatorio_de_dados_de_producao.pdf";
        //String nomePDF = "relatorio de dados de producoes.pdf"; // ORIGEM + NOME DO PDF

        try {
            ps = conexao.conn.prepareStatement(sql);
            resultados = ps.executeQuery();
            Font fonte2 = new Font(Font.FontFamily.HELVETICA, 12, Font.NORMAL);
            Paragraph linhaEmBranco = new Paragraph(" ", fonte2);

            // ERRO DE ORIGEM
            Image imagem = Image.getInstance("C:\\Users\\Gustavo\\Desktop\\AC FARM SYSTEMV2\\ACFarmSystemV2\\ACFarmSystemV2\\src\\logo_ac_farm_system.png");
            //Formacao de imagem pxXpx
            imagem.scaleToFit(55, 50);

            // linha de separacao
            LineSeparator line = new LineSeparator();
            line.setLineWidth(0.5f);
            line.setPercentage(85f);

            PdfWriter.getInstance(doc, new FileOutputStream(nomePDF));
            doc.open();

            imagem.setAbsolutePosition(76, imagem.getAbsoluteY());
            doc.add(imagem);

            Font fonte = new Font(Font.FontFamily.HELVETICA, 13, Font.BOLD);
            Paragraph p = new Paragraph("Relatorio de Dados de Produção", fonte);

            Paragraph data = new Paragraph("            Data de geração: " + dataDeHoje, fonte2);
            Paragraph tiposDeDados = new Paragraph("            Tipos de dados: Produção", fonte2);
            Paragraph formato = new Paragraph("            Formato: Tabela", fonte2);

            p.setAlignment(Element.ALIGN_CENTER);
            data.setAlignment(Element.ALIGN_JUSTIFIED);
            tiposDeDados.setAlignment(3);
            formato.setAlignment(3);

            doc.add(p);
            doc.add(linhaEmBranco);
            doc.add(line);
            doc.add(linhaEmBranco);
            doc.add(data);
            doc.add(tiposDeDados);
            doc.add(formato);
            doc.add(linhaEmBranco);
            doc.add(line);

            //Tamanho da coluna
            PdfPTable table = new PdfPTable(6);
            table.setWidthPercentage(85);
            table.setWidths(new int[]{2, 2, 2, 2, 2, 2});

            PdfPCell cellNomePropriedade = new PdfPCell(new Paragraph("Propriedade"));
            PdfPCell cellCultura = new PdfPCell(new Paragraph("Cultura"));
            PdfPCell cellDataPlantio = new PdfPCell(new Paragraph("Plantio"));
            PdfPCell cellDataInicioColheita = new PdfPCell(new Paragraph("Inicio Colheita"));
            PdfPCell cellDataFimColheita = new PdfPCell(new Paragraph("Fim Colheita"));
            PdfPCell cellQuantidadeProduzida = new PdfPCell(new Paragraph("Sacas"));

            cellNomePropriedade.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cellCultura.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cellDataPlantio.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cellDataInicioColheita.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cellDataFimColheita.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cellQuantidadeProduzida.setBackgroundColor(BaseColor.LIGHT_GRAY);

            cellNomePropriedade.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellCultura.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellDataPlantio.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellDataInicioColheita.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellDataFimColheita.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellQuantidadeProduzida.setHorizontalAlignment(Element.ALIGN_CENTER);

            table.addCell(cellNomePropriedade);
            table.addCell(cellCultura);
            table.addCell(cellDataPlantio);
            table.addCell(cellDataInicioColheita);
            table.addCell(cellDataFimColheita);
            table.addCell(cellQuantidadeProduzida);

            while (resultados.next()) {

                producao = new Producao();

                producao.setCultura(resultados.getString("cultura"));
                producao.setPropriedade(resultados.getString("propriedade_da_colheita"));
                producao.setDataDePlantio(resultados.getDate("data_plantio"));
                producao.setDataInicioColheita(resultados.getDate("data_inicio_colheita"));
                producao.setDataFimColheita(resultados.getDate("data_fim_colheita"));
                producao.setQuantidadeProduzidaEmSacos(resultados.getInt("quantidade_produzida_em_sacos"));

                cellCultura = new PdfPCell(new Paragraph(producao.getCultura()));
                cellNomePropriedade = new PdfPCell(new Paragraph(producao.getPropriedade()));
                cellDataPlantio = new PdfPCell(new Paragraph(formatarData(producao.getDataDePlantio())));
                cellDataInicioColheita = new PdfPCell(new Paragraph(formatarData(producao.getDataInicioColheita())));
                cellDataFimColheita = new PdfPCell(new Paragraph(formatarData(producao.getDataFimColheita())));
                cellQuantidadeProduzida = new PdfPCell(new Paragraph(String.valueOf(producao.getQuantidadeProduzidaEmSacos())));

                table.addCell(cellNomePropriedade);
                table.addCell(cellCultura);
                table.addCell(cellDataPlantio);
                table.addCell(cellDataInicioColheita);
                table.addCell(cellDataFimColheita);
                table.addCell(cellQuantidadeProduzida);
            }

            doc.add(new Paragraph(" "));
            doc.add(table);
            doc.close();

            Desktop.getDesktop().open(new File(nomePDF));

        } catch (DocumentException | FileNotFoundException | SQLException | NullPointerException d) {
            d.getMessage();
        }

    }

    public void gerarRelatorioDeDadosFinanceirosEmPDF() throws SQLException, ParseException, IOException {
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataDeHoje = dataAtual.format(formatter);

        conexao = new Conecta();

        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
        }

        resultados = null;
        ps = null;
        sql = "SELECT * FROM producao";

        Document doc = new Document();

        List<Producao> producoes = new ArrayList();

        String nomePDF = "C:\\Users\\Gustavo\\Desktop\\relatorio_dados_finaceiros_de_producao.pdf"; // ORIGEM + NOME DO PDF
        //String nomePDF = "relatorio de dados de producoes.pdf"; // ORIGEM + NOME DO PDF

        try {
            ps = conexao.conn.prepareStatement(sql);
            resultados = ps.executeQuery();
            Font fonte2 = new Font(Font.FontFamily.HELVETICA, 12, Font.NORMAL);
            Paragraph linhaEmBranco = new Paragraph(" ", fonte2);

            // ERRO DE ORIGEM
            Image imagem = Image.getInstance("C:\\Users\\Gustavo\\Desktop\\AC FARM SYSTEMV2\\ACFarmSystemV2\\ACFarmSystemV2\\src\\logo_ac_farm_system.png");
            // Formacao de imagem pxXpx
            imagem.scaleToFit(55, 50);

            // Linha de Separacao
            LineSeparator line = new LineSeparator();
            line.setLineWidth(0.5f);
            line.setPercentage(85f);

            PdfWriter.getInstance(doc, new FileOutputStream(nomePDF));
            doc.open();

            imagem.setAbsolutePosition(76, imagem.getAbsoluteY());
            doc.add(imagem);

            Font fonte = new Font(Font.FontFamily.HELVETICA, 13, Font.BOLD);
            Paragraph p = new Paragraph("Relatorio Finaceiro de Producao", fonte);

            Paragraph data = new Paragraph("            Data de geração: " + dataDeHoje, fonte2);
            Paragraph tiposDeDados = new Paragraph("            Tipos de dados: Financeiro", fonte2);
            Paragraph formato = new Paragraph("            Formato: Tabela", fonte2);

            p.setAlignment(Element.ALIGN_CENTER);
            data.setAlignment(Element.ALIGN_JUSTIFIED);
            tiposDeDados.setAlignment(3);
            formato.setAlignment(3);

            doc.add(p);
            doc.add(linhaEmBranco);
            doc.add(line);
            doc.add(linhaEmBranco);
            doc.add(data);
            doc.add(tiposDeDados);
            doc.add(formato);
            doc.add(linhaEmBranco);
            doc.add(line);

            PdfPTable table = new PdfPTable(6);
            table.setWidthPercentage(85);
            table.setWidths(new int[]{2, 2, 2, 2, 2, 2});

            PdfPCell cellNomePropriedade = new PdfPCell(new Paragraph("Propriedade"));
            PdfPCell cellCultura = new PdfPCell(new Paragraph("Cultura"));
            PdfPCell cellQuantidadeProduzida = new PdfPCell(new Paragraph("Sacas"));
            PdfPCell cellValorTotalDespesas = new PdfPCell(new Paragraph("Despesas"));
            PdfPCell cellValorTotalLucro = new PdfPCell(new Paragraph("Lucro"));
            PdfPCell cellValorTotalDeLucroLiquido = new PdfPCell(new Paragraph("Valor Liquido"));

            cellNomePropriedade.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cellCultura.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cellQuantidadeProduzida.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cellValorTotalDespesas.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cellValorTotalDespesas.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cellValorTotalLucro.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cellValorTotalDeLucroLiquido.setBackgroundColor(BaseColor.GREEN);

            cellNomePropriedade.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellCultura.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellQuantidadeProduzida.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellValorTotalDespesas.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellValorTotalDespesas.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellValorTotalLucro.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellValorTotalDeLucroLiquido.setHorizontalAlignment(Element.ALIGN_CENTER);

            table.addCell(cellNomePropriedade);
            table.addCell(cellCultura);
            table.addCell(cellQuantidadeProduzida);
            table.addCell(cellValorTotalDespesas);
            table.addCell(cellValorTotalLucro);
            table.addCell(cellValorTotalDeLucroLiquido);

            while (resultados.next()) {

                producao = new Producao();

                producao.setCultura(resultados.getString("cultura"));
                producao.setPropriedade(resultados.getString("propriedade_da_colheita"));
                producao.setQuantidadeProduzidaEmSacos(resultados.getInt("quantidade_produzida_em_sacos"));
                producao.setValorTotalDespesas(resultados.getDouble("valor_total_despesas"));
                producao.setValorTotalDeLucro(resultados.getDouble("valor_total_de_lucro"));

                cellCultura = new PdfPCell(new Paragraph(producao.getCultura()));
                cellNomePropriedade = new PdfPCell(new Paragraph(producao.getPropriedade()));
                cellQuantidadeProduzida = new PdfPCell(new Paragraph(String.valueOf(producao.getQuantidadeProduzidaEmSacos())));
                cellValorTotalDespesas = new PdfPCell(new Paragraph(String.valueOf("R$ " + producao.getValorTotalDespesas())));
                cellValorTotalLucro = new PdfPCell(new Paragraph(String.valueOf("R$ " + producao.getValorTotalDeLucro())));
                Double valorLiquido = producao.getValorTotalDeLucro() - producao.getValorTotalDespesas();
                cellValorTotalDeLucroLiquido = new PdfPCell(new Paragraph("R$ " + String.valueOf(valorLiquido)));

                table.addCell(cellNomePropriedade);
                table.addCell(cellCultura);
                table.addCell(cellQuantidadeProduzida);
                table.addCell(cellValorTotalDespesas);
                table.addCell(cellValorTotalLucro);
                table.addCell(cellValorTotalDeLucroLiquido);

            }

            doc.add(new Paragraph(" "));
            doc.add(table);
            doc.close();

            Desktop.getDesktop().open(new File(nomePDF));

        } catch (DocumentException | FileNotFoundException | SQLException | NullPointerException d) {
            d.getMessage();
        }

    }
    
}
