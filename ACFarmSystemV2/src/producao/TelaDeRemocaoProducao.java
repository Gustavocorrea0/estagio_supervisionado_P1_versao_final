package producao;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;

/**
 *
 * @author Gustavo
 */
public class TelaDeRemocaoProducao extends javax.swing.JFrame {

    private ControleProducao controleProducao = new ControleProducao();
    private String nomeProducao;
    private String dataDePlantio;
    private String dataInicioColheita;
    private String dataFimColheita;
    private String valorTotalDespesas;
    private String valorTotalDeLucro;
    private String quantidadeProduzidaEmSacos;
    private String cultura;
    private String nomeProducaoBuscada;

    public TelaDeRemocaoProducao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCancelarAdicao = new javax.swing.JButton();
        jButtonVoltarATelaDeProducao = new javax.swing.JButton();
        jButtonBuscarPropriedade = new javax.swing.JButton();
        jButtonConfirmarAdicao = new javax.swing.JButton();
        jTextFieldIdProducao = new javax.swing.JTextField();
        jTextFieldNomeProducao = new javax.swing.JTextField();
        jTextFieldDataInicioColheita = new javax.swing.JTextField();
        jTextFieldDataFimColheita = new javax.swing.JTextField();
        jTextFieldValorTotalDeDespesas = new javax.swing.JTextField();
        jTextFieldValorTotalDeLucro = new javax.swing.JTextField();
        jTextFieldQuantidadeProduzidaEmSacos = new javax.swing.JTextField();
        jTextFieldDataPlantio = new javax.swing.JTextField();
        jTextFieldCultura = new javax.swing.JTextField();
        jLabelTelaProducao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCancelarAdicao.setBorder(null);
        jButtonCancelarAdicao.setBorderPainted(false);
        jButtonCancelarAdicao.setContentAreaFilled(false);
        jButtonCancelarAdicao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButtonCancelarAdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 598, 280, 35));

        jButtonVoltarATelaDeProducao.setBorder(null);
        jButtonVoltarATelaDeProducao.setBorderPainted(false);
        jButtonVoltarATelaDeProducao.setContentAreaFilled(false);
        jButtonVoltarATelaDeProducao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarATelaDeProducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarATelaDeProducaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarATelaDeProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 23, 40, 25));

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
        getContentPane().add(jButtonConfirmarAdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 598, 280, 36));

        jTextFieldIdProducao.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldIdProducao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldIdProducao.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldIdProducao.setBorder(null);
        jTextFieldIdProducao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldIdProducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdProducaoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIdProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 121, 303, 27));

        jTextFieldNomeProducao.setEditable(false);
        jTextFieldNomeProducao.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeProducao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeProducao.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeProducao.setBorder(null);
        jTextFieldNomeProducao.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNomeProducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeProducaoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 230, 270, 27));

        jTextFieldDataInicioColheita.setEditable(false);
        jTextFieldDataInicioColheita.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDataInicioColheita.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDataInicioColheita.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDataInicioColheita.setBorder(null);
        jTextFieldDataInicioColheita.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldDataInicioColheita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataInicioColheitaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDataInicioColheita, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 423, 270, 27));

        jTextFieldDataFimColheita.setEditable(false);
        jTextFieldDataFimColheita.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDataFimColheita.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDataFimColheita.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDataFimColheita.setBorder(null);
        jTextFieldDataFimColheita.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldDataFimColheita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataFimColheitaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDataFimColheita, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 520, 268, 27));

        jTextFieldValorTotalDeDespesas.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldValorTotalDeDespesas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldValorTotalDeDespesas.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldValorTotalDeDespesas.setBorder(null);
        jTextFieldValorTotalDeDespesas.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldValorTotalDeDespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorTotalDeDespesasActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldValorTotalDeDespesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 310, 27));

        jTextFieldValorTotalDeLucro.setEditable(false);
        jTextFieldValorTotalDeLucro.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldValorTotalDeLucro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldValorTotalDeLucro.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldValorTotalDeLucro.setBorder(null);
        jTextFieldValorTotalDeLucro.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldValorTotalDeLucro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorTotalDeLucroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldValorTotalDeLucro, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 323, 310, 27));

        jTextFieldQuantidadeProduzidaEmSacos.setEditable(false);
        jTextFieldQuantidadeProduzidaEmSacos.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeProduzidaEmSacos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeProduzidaEmSacos.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeProduzidaEmSacos.setBorder(null);
        jTextFieldQuantidadeProduzidaEmSacos.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeProduzidaEmSacos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeProduzidaEmSacosActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuantidadeProduzidaEmSacos, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 423, 310, 27));

        jTextFieldDataPlantio.setEditable(false);
        jTextFieldDataPlantio.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDataPlantio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDataPlantio.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDataPlantio.setBorder(null);
        jTextFieldDataPlantio.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldDataPlantio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataPlantioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDataPlantio, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 324, 270, 27));

        jTextFieldCultura.setEditable(false);
        jTextFieldCultura.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCultura.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCultura.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCultura.setBorder(null);
        jTextFieldCultura.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCultura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCulturaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCultura, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 520, 309, 27));

        jLabelTelaProducao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasProducao/img_tela_de_remover_producao.png"))); // NOI18N
        jLabelTelaProducao.setText("jLabel1");
        getContentPane().add(jLabelTelaProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 912, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarPropriedadeActionPerformed
        try {
            consultarProducao();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeRemocaoProducao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(TelaDeRemocaoProducao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarPropriedadeActionPerformed

    private void jTextFieldIdProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdProducaoActionPerformed

    }//GEN-LAST:event_jTextFieldIdProducaoActionPerformed

    private void jButtonVoltarATelaDeProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarATelaDeProducaoActionPerformed
        this.dispose();
        new TelaDeInicioProducao().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarATelaDeProducaoActionPerformed

    private void jTextFieldNomeProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeProducaoActionPerformed

    }//GEN-LAST:event_jTextFieldNomeProducaoActionPerformed

    private void jTextFieldDataInicioColheitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataInicioColheitaActionPerformed

    }//GEN-LAST:event_jTextFieldDataInicioColheitaActionPerformed

    private void jTextFieldDataFimColheitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataFimColheitaActionPerformed

    }//GEN-LAST:event_jTextFieldDataFimColheitaActionPerformed

    private void jTextFieldValorTotalDeDespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorTotalDeDespesasActionPerformed

    }//GEN-LAST:event_jTextFieldValorTotalDeDespesasActionPerformed

    private void jTextFieldQuantidadeProduzidaEmSacosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeProduzidaEmSacosActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeProduzidaEmSacosActionPerformed

    private void jTextFieldCulturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCulturaActionPerformed

    }//GEN-LAST:event_jTextFieldCulturaActionPerformed

    private void jTextFieldValorTotalDeLucroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorTotalDeLucroActionPerformed

    }//GEN-LAST:event_jTextFieldValorTotalDeLucroActionPerformed

    private void jTextFieldDataPlantioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataPlantioActionPerformed

    }//GEN-LAST:event_jTextFieldDataPlantioActionPerformed

    private void jButtonConfirmarAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarAdicaoActionPerformed
        removerProducao();
    }//GEN-LAST:event_jButtonConfirmarAdicaoActionPerformed

    public void consultarProducao() throws SQLException, ParseException {
        nomeProducaoBuscada = jTextFieldIdProducao.getText();
        Producao producaoEncontrada = controleProducao.buscarProducao(nomeProducaoBuscada);

        if (producaoEncontrada != null) {
            nomeProducao = producaoEncontrada.getNomeProducao();
            valorTotalDespesas = Double.toString(producaoEncontrada.getValorTotalDespesas());
            valorTotalDeLucro = Double.toString(producaoEncontrada.getValorTotalDeLucro());
            quantidadeProduzidaEmSacos = Integer.toString(producaoEncontrada.getQuantidadeProduzidaEmSacos());
            cultura = producaoEncontrada.getCultura();

            SimpleDateFormat formatoSQL = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat formatoBrasileiro = new SimpleDateFormat("dd/MM/yyyy");

            Date data1 = formatoSQL.parse(producaoEncontrada.getDataDePlantio().toString());
            Date data2 = formatoSQL.parse(producaoEncontrada.getDataInicioColheita().toString());
            Date data3 = formatoSQL.parse(producaoEncontrada.getDataFimColheita().toString());

            dataDePlantio = formatoBrasileiro.format(data1);
            dataInicioColheita = formatoBrasileiro.format(data2);
            dataFimColheita = formatoBrasileiro.format(data3);

            jTextFieldCultura.setText(cultura);
            jTextFieldNomeProducao.setText(nomeProducao);
            jTextFieldDataFimColheita.setText(dataFimColheita);
            jTextFieldDataInicioColheita.setText(dataInicioColheita);
            jTextFieldDataPlantio.setText(dataDePlantio);
            jTextFieldQuantidadeProduzidaEmSacos.setText(quantidadeProduzidaEmSacos);
            jTextFieldValorTotalDeDespesas.setText(valorTotalDespesas);
            jTextFieldValorTotalDeLucro.setText(valorTotalDeLucro);

            jTextFieldCultura.setEnabled(false);
            jTextFieldNomeProducao.setEnabled(false);
            jTextFieldDataFimColheita.setEnabled(false);
            jTextFieldDataInicioColheita.setEnabled(false);
            jTextFieldDataPlantio.setEnabled(false);
            jTextFieldQuantidadeProduzidaEmSacos.setEnabled(false);
            jTextFieldValorTotalDeDespesas.setEnabled(false);
            jTextFieldValorTotalDeLucro.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(this, "Producao não encontrada");
            jTextFieldCultura.setText("");
            jTextFieldDataFimColheita.setText("");
            jTextFieldDataInicioColheita.setText("");
            jTextFieldDataPlantio.setText("");
            jTextFieldNomeProducao.setText("");
            jTextFieldNomeProducao.setText("");
            jTextFieldQuantidadeProduzidaEmSacos.setText("");
            jTextFieldValorTotalDeDespesas.setText("");
            jTextFieldValorTotalDeLucro.setText("");
        }
    }

    public void removerProducao() {
        nomeProducaoBuscada = jTextFieldIdProducao.getText();
        String msg = controleProducao.removerProducao(nomeProducaoBuscada);
        JOptionPane.showMessageDialog(this, msg);

        jTextFieldCultura.setText("");
        jTextFieldDataFimColheita.setText("");
        jTextFieldDataInicioColheita.setText("");
        jTextFieldDataPlantio.setText("");
        jTextFieldNomeProducao.setText("");
        jTextFieldNomeProducao.setText("");
        jTextFieldQuantidadeProduzidaEmSacos.setText("");
        jTextFieldValorTotalDeDespesas.setText("");
        jTextFieldValorTotalDeLucro.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarPropriedade;
    private javax.swing.JButton jButtonCancelarAdicao;
    private javax.swing.JButton jButtonConfirmarAdicao;
    private javax.swing.JButton jButtonVoltarATelaDeProducao;
    private javax.swing.JLabel jLabelTelaProducao;
    private javax.swing.JTextField jTextFieldCultura;
    private javax.swing.JTextField jTextFieldDataFimColheita;
    private javax.swing.JTextField jTextFieldDataInicioColheita;
    private javax.swing.JTextField jTextFieldDataPlantio;
    private javax.swing.JTextField jTextFieldIdProducao;
    private javax.swing.JTextField jTextFieldNomeProducao;
    private javax.swing.JTextField jTextFieldQuantidadeProduzidaEmSacos;
    private javax.swing.JTextField jTextFieldValorTotalDeDespesas;
    private javax.swing.JTextField jTextFieldValorTotalDeLucro;
    // End of variables declaration//GEN-END:variables
}
