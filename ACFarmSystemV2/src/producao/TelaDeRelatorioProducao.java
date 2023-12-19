/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package producao;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class TelaDeRelatorioProducao extends javax.swing.JFrame {

    ControleProducao controleProducao = new ControleProducao();

    public TelaDeRelatorioProducao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVoltarATelaDeProducao = new javax.swing.JButton();
        jButtonGerarRelatorioFinanceiro = new javax.swing.JButton();
        jButtonGerarRelatorioProducao = new javax.swing.JButton();
        jLabelTelaProducao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonVoltarATelaDeProducao.setBorder(null);
        jButtonVoltarATelaDeProducao.setBorderPainted(false);
        jButtonVoltarATelaDeProducao.setContentAreaFilled(false);
        jButtonVoltarATelaDeProducao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarATelaDeProducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarATelaDeProducaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarATelaDeProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 23, 40, 24));

        jButtonGerarRelatorioFinanceiro.setBorder(null);
        jButtonGerarRelatorioFinanceiro.setBorderPainted(false);
        jButtonGerarRelatorioFinanceiro.setContentAreaFilled(false);
        jButtonGerarRelatorioFinanceiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGerarRelatorioFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerarRelatorioFinanceiroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGerarRelatorioFinanceiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 457, 250, 44));

        jButtonGerarRelatorioProducao.setBorder(null);
        jButtonGerarRelatorioProducao.setBorderPainted(false);
        jButtonGerarRelatorioProducao.setContentAreaFilled(false);
        jButtonGerarRelatorioProducao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGerarRelatorioProducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerarRelatorioProducaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGerarRelatorioProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 457, 250, 44));

        jLabelTelaProducao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasProducao/img_tela_de_relatorio_producao.png"))); // NOI18N
        jLabelTelaProducao.setText("jLabel1");
        getContentPane().add(jLabelTelaProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGerarRelatorioProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarRelatorioProducaoActionPerformed
        try {
            JOptionPane.showMessageDialog(this, "Gerando Relatorio de produção");
            controleProducao.gerarRelatorioDeDadosDeProducoesEmPDF();
            this.dispose();
            new TelaDeRelatorioProducao().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeRelatorioProducao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(TelaDeRelatorioProducao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TelaDeRelatorioProducao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonGerarRelatorioProducaoActionPerformed

    private void jButtonVoltarATelaDeProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarATelaDeProducaoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TelaDeInicioProducao().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarATelaDeProducaoActionPerformed

    private void jButtonGerarRelatorioFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarRelatorioFinanceiroActionPerformed
        // TODO add your handling code here:
        try {
            JOptionPane.showMessageDialog(this, "Gerando Relatorio de custos");
            controleProducao.gerarRelatorioDeDadosFinanceirosEmPDF();
            this.dispose();
            new TelaDeRelatorioProducao().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeRelatorioProducao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(TelaDeRelatorioProducao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TelaDeRelatorioProducao.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();

    }//GEN-LAST:event_jButtonGerarRelatorioFinanceiroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGerarRelatorioFinanceiro;
    private javax.swing.JButton jButtonGerarRelatorioProducao;
    private javax.swing.JButton jButtonVoltarATelaDeProducao;
    private javax.swing.JLabel jLabelTelaProducao;
    // End of variables declaration//GEN-END:variables
}
