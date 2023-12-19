/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package producao;

import Propriedade.ControlePropriedade;
import Propriedade.Propriedade;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class TelaDeCadastroProducao extends javax.swing.JFrame {

    private ControleProducao controleProducao = new ControleProducao();
    private ControlePropriedade controlePropriedade = new ControlePropriedade();
    private String tipoDeCultura;
    private String dataPlantio;
    private String dataInicioColheita;
    private String dataFimColheita;
    private int idPropriedade;
    private String nomeProducao;
    private int quantidadeProduzidaEmSacos;
    private Double valorTotalDeDespesas;
    private Double valorTotalDeLucro;
    private String nomePropriedade;
    private String msg;

    public TelaDeCadastroProducao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoCultura = new javax.swing.ButtonGroup();
        jButtonCancelarAdicao = new javax.swing.JButton();
        jButtonVoltarATelaDeProducao = new javax.swing.JButton();
        jButtonBuscarPropriedade = new javax.swing.JButton();
        jButtonConfirmarAdicao = new javax.swing.JButton();
        jTextFieldIdPropriedade = new javax.swing.JTextField();
        jTextFieldDataInicioColheita = new javax.swing.JTextField();
        jTextFieldDataFimColheita = new javax.swing.JTextField();
        jTextFieldValorTotalDeDespesas = new javax.swing.JTextField();
        jTextFieldValorTotalDeLucro = new javax.swing.JTextField();
        jTextFieldQuantidadeProduzidaEmSacos = new javax.swing.JTextField();
        jTextFieldNomeProducao = new javax.swing.JTextField();
        jTextFieldDataPlantio = new javax.swing.JTextField();
        jRadioMilho = new javax.swing.JRadioButton();
        jRadioSoja = new javax.swing.JRadioButton();
        jLabelTelaProducao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCancelarAdicao.setBorder(null);
        jButtonCancelarAdicao.setBorderPainted(false);
        jButtonCancelarAdicao.setContentAreaFilled(false);
        jButtonCancelarAdicao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarAdicaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarAdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 596, 280, 37));

        jButtonVoltarATelaDeProducao.setBorder(null);
        jButtonVoltarATelaDeProducao.setBorderPainted(false);
        jButtonVoltarATelaDeProducao.setContentAreaFilled(false);
        jButtonVoltarATelaDeProducao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarATelaDeProducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarATelaDeProducaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarATelaDeProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 23, 40, 22));

        jButtonBuscarPropriedade.setBorder(null);
        jButtonBuscarPropriedade.setBorderPainted(false);
        jButtonBuscarPropriedade.setContentAreaFilled(false);
        jButtonBuscarPropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 112, 260, 45));

        jButtonConfirmarAdicao.setBorder(null);
        jButtonConfirmarAdicao.setBorderPainted(false);
        jButtonConfirmarAdicao.setContentAreaFilled(false);
        jButtonConfirmarAdicao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarAdicaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarAdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 595, 280, 38));

        jTextFieldIdPropriedade.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldIdPropriedade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldIdPropriedade.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldIdPropriedade.setBorder(null);
        jTextFieldIdPropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldIdPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIdPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 121, 302, 27));

        jTextFieldDataInicioColheita.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDataInicioColheita.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDataInicioColheita.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDataInicioColheita.setBorder(null);
        jTextFieldDataInicioColheita.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTextFieldDataInicioColheita, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 419, 269, 28));

        jTextFieldDataFimColheita.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDataFimColheita.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDataFimColheita.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDataFimColheita.setBorder(null);
        jTextFieldDataFimColheita.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTextFieldDataFimColheita, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 519, 269, 28));

        jTextFieldValorTotalDeDespesas.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldValorTotalDeDespesas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldValorTotalDeDespesas.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldValorTotalDeDespesas.setBorder(null);
        jTextFieldValorTotalDeDespesas.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTextFieldValorTotalDeDespesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 233, 269, 27));

        jTextFieldValorTotalDeLucro.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldValorTotalDeLucro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldValorTotalDeLucro.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldValorTotalDeLucro.setBorder(null);
        jTextFieldValorTotalDeLucro.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTextFieldValorTotalDeLucro, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 327, 269, 27));

        jTextFieldQuantidadeProduzidaEmSacos.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeProduzidaEmSacos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeProduzidaEmSacos.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeProduzidaEmSacos.setBorder(null);
        jTextFieldQuantidadeProduzidaEmSacos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTextFieldQuantidadeProduzidaEmSacos, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 419, 310, 27));

        jTextFieldNomeProducao.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeProducao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeProducao.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeProducao.setBorder(null);
        jTextFieldNomeProducao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTextFieldNomeProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 233, 269, 28));

        jTextFieldDataPlantio.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDataPlantio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDataPlantio.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDataPlantio.setBorder(null);
        jTextFieldDataPlantio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTextFieldDataPlantio, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 327, 269, 28));

        jRadioMilho.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jRadioMilho.setForeground(new java.awt.Color(255, 255, 255));
        jRadioMilho.setText("Milho");
        jRadioMilho.setBorder(null);
        jRadioMilho.setContentAreaFilled(false);
        jRadioMilho.setFocusable(false);
        jRadioMilho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioMilhoActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioMilho, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 510, 120, 20));

        jRadioSoja.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jRadioSoja.setForeground(new java.awt.Color(255, 255, 255));
        jRadioSoja.setText("Soja");
        jRadioSoja.setBorder(null);
        jRadioSoja.setContentAreaFilled(false);
        jRadioSoja.setFocusable(false);
        jRadioSoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioSojaActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioSoja, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, 120, 20));

        jLabelTelaProducao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasProducao/img_tela_de_adicao_producao.png"))); // NOI18N
        jLabelTelaProducao.setText("jLabel1");
        getContentPane().add(jLabelTelaProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioMilhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioMilhoActionPerformed
        tipoDeCultura = "Milho";
    }//GEN-LAST:event_jRadioMilhoActionPerformed

    private void jRadioSojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioSojaActionPerformed
        tipoDeCultura = "Soja";
    }//GEN-LAST:event_jRadioSojaActionPerformed

    private void jTextFieldIdPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdPropriedadeActionPerformed

    }//GEN-LAST:event_jTextFieldIdPropriedadeActionPerformed

    private void jButtonConfirmarAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarAdicaoActionPerformed
        cadastrarProducao();
    }//GEN-LAST:event_jButtonConfirmarAdicaoActionPerformed

    private void jButtonBuscarPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarPropriedadeActionPerformed
        try {
            buscarPropriedade();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeCadastroProducao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarPropriedadeActionPerformed

    private void jButtonVoltarATelaDeProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarATelaDeProducaoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TelaDeInicioProducao().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarATelaDeProducaoActionPerformed

    private void jButtonCancelarAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarAdicaoActionPerformed
        JOptionPane.showMessageDialog(this, "Adição cancelada");
        jTextFieldDataFimColheita.setText("");
        jTextFieldDataInicioColheita.setText("");
        jTextFieldDataPlantio.setText("");
        jTextFieldIdPropriedade.setText("");
        jTextFieldNomeProducao.setText("");
        jTextFieldQuantidadeProduzidaEmSacos.setText("");
        jTextFieldValorTotalDeDespesas.setText("");
        jTextFieldValorTotalDeLucro.setText("");
    }//GEN-LAST:event_jButtonCancelarAdicaoActionPerformed

    public void buscarPropriedade() throws SQLException {
        nomePropriedade = jTextFieldIdPropriedade.getText();
        Propriedade propriedadeEncontrada = controlePropriedade.buscarPropriedadePorNome(nomePropriedade);

        if (propriedadeEncontrada != null) {
            nomePropriedade = propriedadeEncontrada.getNomePropriedade();
            JOptionPane.showMessageDialog(this, "Propriedade encontrada.");
        } else {
            JOptionPane.showMessageDialog(this, "Propriedade não encontrada.");
        }
    }

    public void cadastrarProducao() {
        botaoCultura.add(jRadioSoja);
        botaoCultura.add(jRadioMilho);

        dataPlantio = jTextFieldDataPlantio.getText();
        dataInicioColheita = jTextFieldDataInicioColheita.getText();
        dataFimColheita = jTextFieldDataFimColheita.getText();
        idPropriedade = Integer.parseInt(jTextFieldIdPropriedade.getText());
        nomeProducao = jTextFieldNomeProducao.getText();
        quantidadeProduzidaEmSacos = Integer.parseInt(jTextFieldQuantidadeProduzidaEmSacos.getText());
        valorTotalDeDespesas = Double.parseDouble(jTextFieldValorTotalDeDespesas.getText());
        valorTotalDeLucro = Double.parseDouble(jTextFieldValorTotalDeLucro.getText());

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        if (nomeProducao.equals("")) {
            JOptionPane.showMessageDialog(this, "Nome Inválido");
            return;
        }

        if (quantidadeProduzidaEmSacos <= 0) {
            JOptionPane.showMessageDialog(this, "Quantidade produzida inválida");
            return;
        }

        if (valorTotalDeDespesas <= 0) {
            JOptionPane.showMessageDialog(this, "Valor de despesa inválida");
            return;
        }

        if (valorTotalDeLucro <= 0) {
            JOptionPane.showMessageDialog(this, "Valor de lucro inválido");
            return;
        }

        if (botaoCultura.equals("")) {
            JOptionPane.showMessageDialog(null, "Adicione a cultura");
            return;
        }

        try {
            Date dataPlantioValida = dateFormat.parse(dataPlantio);
            Date dataInicioColheitaValida = dateFormat.parse(dataInicioColheita);
            Date dataFimColheitaValida = dateFormat.parse(dataFimColheita);

            if (dataPlantioValida == dataInicioColheitaValida) {
                JOptionPane.showMessageDialog(null, "Datas de Plantio e colheita não devem ser iguais");
                return;
            }

            controleProducao.producao.setIdPropriedade(idPropriedade);
            controleProducao.producao.setNomeProducao(nomeProducao);
            controleProducao.producao.setPropriedade(nomePropriedade);
            controleProducao.producao.setDataDePlantio(dataPlantioValida);
            controleProducao.producao.setDataInicioColheita(dataInicioColheitaValida);
            controleProducao.producao.setDataFimColheita(dataFimColheitaValida);
            controleProducao.producao.setQuantidadeProduzidaEmSacos(quantidadeProduzidaEmSacos);
            controleProducao.producao.setValorTotalDeLucro(valorTotalDeLucro);
            controleProducao.producao.setValorTotalDespesas(valorTotalDeDespesas);
            controleProducao.producao.setCultura(tipoDeCultura);

            msg = controleProducao.cadastrarProducao(ControlePropriedade.INCLUSAO);
            JOptionPane.showMessageDialog(this, msg);

            jTextFieldDataFimColheita.setText("");
            jTextFieldDataInicioColheita.setText("");
            jTextFieldDataPlantio.setText("");
            jTextFieldIdPropriedade.setText("");
            jTextFieldNomeProducao.setText("");
            jTextFieldQuantidadeProduzidaEmSacos.setText("");
            jTextFieldValorTotalDeDespesas.setText("");
            jTextFieldValorTotalDeLucro.setText("");
            
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Formato de data inválido, o formato é dd/mm/aaaa.");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botaoCultura;
    private javax.swing.JButton jButtonBuscarPropriedade;
    private javax.swing.JButton jButtonCancelarAdicao;
    private javax.swing.JButton jButtonConfirmarAdicao;
    private javax.swing.JButton jButtonVoltarATelaDeProducao;
    private javax.swing.JLabel jLabelTelaProducao;
    private javax.swing.JRadioButton jRadioMilho;
    private javax.swing.JRadioButton jRadioSoja;
    private javax.swing.JTextField jTextFieldDataFimColheita;
    private javax.swing.JTextField jTextFieldDataInicioColheita;
    private javax.swing.JTextField jTextFieldDataPlantio;
    private javax.swing.JTextField jTextFieldIdPropriedade;
    private javax.swing.JTextField jTextFieldNomeProducao;
    private javax.swing.JTextField jTextFieldQuantidadeProduzidaEmSacos;
    private javax.swing.JTextField jTextFieldValorTotalDeDespesas;
    private javax.swing.JTextField jTextFieldValorTotalDeLucro;
    // End of variables declaration//GEN-END:variables
}
