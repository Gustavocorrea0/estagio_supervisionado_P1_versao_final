/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Veiculo;


import acfarmsystemv2.telaDeInicio.TelaDeInicio;


public class TelaDeEscolhaTipoDeVeiculo extends javax.swing.JFrame {

    public TelaDeEscolhaTipoDeVeiculo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVoltarATelaDeInicioVeiculo = new javax.swing.JButton();
        jButtonVerificarCaminhaoOuTransporte = new javax.swing.JButton();
        jButtonVerificarTrator = new javax.swing.JButton();
        jLabelFundoEscolhaParaVerificacao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonVoltarATelaDeInicioVeiculo.setBorder(null);
        jButtonVoltarATelaDeInicioVeiculo.setBorderPainted(false);
        jButtonVoltarATelaDeInicioVeiculo.setContentAreaFilled(false);
        jButtonVoltarATelaDeInicioVeiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarATelaDeInicioVeiculo.setDefaultCapable(false);
        jButtonVoltarATelaDeInicioVeiculo.setFocusPainted(false);
        jButtonVoltarATelaDeInicioVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarATelaDeInicioVeiculoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarATelaDeInicioVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 23, 39, 25));

        jButtonVerificarCaminhaoOuTransporte.setBorder(null);
        jButtonVerificarCaminhaoOuTransporte.setContentAreaFilled(false);
        jButtonVerificarCaminhaoOuTransporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVerificarCaminhaoOuTransporte.setVerifyInputWhenFocusTarget(false);
        jButtonVerificarCaminhaoOuTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarCaminhaoOuTransporteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerificarCaminhaoOuTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 345, 169, 45));

        jButtonVerificarTrator.setBorder(null);
        jButtonVerificarTrator.setContentAreaFilled(false);
        jButtonVerificarTrator.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVerificarTrator.setVerifyInputWhenFocusTarget(false);
        jButtonVerificarTrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarTratorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerificarTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 345, 169, 45));

        jLabelFundoEscolhaParaVerificacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasVeiculo/img_escolha_tipo_de_veiculo.png"))); // NOI18N
        getContentPane().add(jLabelFundoEscolhaParaVerificacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarATelaDeInicioVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarATelaDeInicioVeiculoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TelaDeInicio().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarATelaDeInicioVeiculoActionPerformed

    private void jButtonVerificarCaminhaoOuTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarCaminhaoOuTransporteActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TelaCRUDCaminhaoOuVeiculoDeTransporte().setVisible(true);
    }//GEN-LAST:event_jButtonVerificarCaminhaoOuTransporteActionPerformed

    private void jButtonVerificarTratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarTratorActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TelaCRUDTrator().setVisible(true);
    }//GEN-LAST:event_jButtonVerificarTratorActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVerificarCaminhaoOuTransporte;
    private javax.swing.JButton jButtonVerificarTrator;
    private javax.swing.JButton jButtonVoltarATelaDeInicioVeiculo;
    private javax.swing.JLabel jLabelFundoEscolhaParaVerificacao;
    // End of variables declaration//GEN-END:variables
}
