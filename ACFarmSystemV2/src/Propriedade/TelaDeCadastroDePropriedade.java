/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Propriedade;

import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class TelaDeCadastroDePropriedade extends javax.swing.JFrame {
    

    public TelaDeCadastroDePropriedade() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoTipoDeCultura = new javax.swing.ButtonGroup();
        jButtonCancelarCadastroDePropriedade = new javax.swing.JButton();
        jButtonConfirmarCadastroDePropriedade = new javax.swing.JButton();
        jTextFieldLocalPropriedade = new javax.swing.JTextField();
        jTextFieldAreaPropriedade = new javax.swing.JTextField();
        jTextFieldCidadePropriedade = new javax.swing.JTextField();
        jTextFieldEstadoPropriedade = new javax.swing.JTextField();
        jTextFieldNomePropriedade = new javax.swing.JTextField();
        jButtonVoltarAoTelaDeUsuario = new javax.swing.JButton();
        jRadioCulturaSoja = new javax.swing.JRadioButton();
        jRadioCulturaMilho = new javax.swing.JRadioButton();
        jLabelCadatroPropriedade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCancelarCadastroDePropriedade.setBorder(null);
        jButtonCancelarCadastroDePropriedade.setContentAreaFilled(false);
        jButtonCancelarCadastroDePropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarCadastroDePropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarCadastroDePropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarCadastroDePropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 563, 280, 36));

        jButtonConfirmarCadastroDePropriedade.setBorder(null);
        jButtonConfirmarCadastroDePropriedade.setContentAreaFilled(false);
        jButtonConfirmarCadastroDePropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarCadastroDePropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarCadastroDePropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarCadastroDePropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 512, 280, 36));

        jTextFieldLocalPropriedade.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldLocalPropriedade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldLocalPropriedade.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldLocalPropriedade.setBorder(null);
        jTextFieldLocalPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLocalPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldLocalPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 286, 275, 29));

        jTextFieldAreaPropriedade.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldAreaPropriedade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldAreaPropriedade.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldAreaPropriedade.setBorder(null);
        jTextFieldAreaPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAreaPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAreaPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 403, 275, 28));

        jTextFieldCidadePropriedade.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCidadePropriedade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCidadePropriedade.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCidadePropriedade.setBorder(null);
        jTextFieldCidadePropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCidadePropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCidadePropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 167, 276, 28));

        jTextFieldEstadoPropriedade.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEstadoPropriedade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldEstadoPropriedade.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldEstadoPropriedade.setBorder(null);
        jTextFieldEstadoPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstadoPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEstadoPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 522, 275, 28));

        jTextFieldNomePropriedade.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomePropriedade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomePropriedade.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomePropriedade.setBorder(null);
        jTextFieldNomePropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomePropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomePropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 168, 276, 28));

        jButtonVoltarAoTelaDeUsuario.setBorder(null);
        jButtonVoltarAoTelaDeUsuario.setBorderPainted(false);
        jButtonVoltarAoTelaDeUsuario.setContentAreaFilled(false);
        jButtonVoltarAoTelaDeUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarAoTelaDeUsuario.setDefaultCapable(false);
        jButtonVoltarAoTelaDeUsuario.setFocusPainted(false);
        jButtonVoltarAoTelaDeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarAoTelaDeUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarAoTelaDeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 22, 35, 24));

        jRadioCulturaSoja.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jRadioCulturaSoja.setForeground(new java.awt.Color(255, 255, 255));
        jRadioCulturaSoja.setText("Soja");
        jRadioCulturaSoja.setBorder(null);
        jRadioCulturaSoja.setContentAreaFilled(false);
        jRadioCulturaSoja.setFocusable(false);
        jRadioCulturaSoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioCulturaSojaActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioCulturaSoja, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 120, 20));

        jRadioCulturaMilho.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jRadioCulturaMilho.setForeground(new java.awt.Color(255, 255, 255));
        jRadioCulturaMilho.setText("Milho");
        jRadioCulturaMilho.setBorder(null);
        jRadioCulturaMilho.setContentAreaFilled(false);
        jRadioCulturaMilho.setFocusable(false);
        jRadioCulturaMilho.setRequestFocusEnabled(false);
        jRadioCulturaMilho.setRolloverEnabled(false);
        jRadioCulturaMilho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioCulturaMilhoActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioCulturaMilho, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 120, 20));

        jLabelCadatroPropriedade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasPropriedade/img_tela_de_cadastro_de_propriedade.png"))); // NOI18N
        jLabelCadatroPropriedade.setText("jLabel1");
        getContentPane().add(jLabelCadatroPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private ControlePropriedade propriedade = new ControlePropriedade();
    private String cultura;
    private String limparCampo;
    private Double areaCovertida;
    private String nomePropriedade;
    private String localPropriedade;
    private String estadoPropriedade;
    private String cidadePropriedade;
    private String tipoCultura;

    private void jButtonCancelarCadastroDePropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCadastroDePropriedadeActionPerformed
 
        jTextFieldAreaPropriedade.setText(limparCampo);
        jTextFieldCidadePropriedade.setText(limparCampo);
        jTextFieldEstadoPropriedade.setText(limparCampo);
        jTextFieldLocalPropriedade.setText(limparCampo);
        jTextFieldNomePropriedade.setText(limparCampo);
    }//GEN-LAST:event_jButtonCancelarCadastroDePropriedadeActionPerformed

    private void jTextFieldLocalPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLocalPropriedadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLocalPropriedadeActionPerformed

    private void jTextFieldCidadePropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCidadePropriedadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCidadePropriedadeActionPerformed

    private void jTextFieldAreaPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAreaPropriedadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAreaPropriedadeActionPerformed

    private void jTextFieldEstadoPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadoPropriedadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEstadoPropriedadeActionPerformed

    private void jTextFieldNomePropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomePropriedadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomePropriedadeActionPerformed

    private void jButtonConfirmarCadastroDePropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroDePropriedadeActionPerformed
        // TODO add your handling code here:
        cadastrarPropriedade();
    }//GEN-LAST:event_jButtonConfirmarCadastroDePropriedadeActionPerformed

    private void jButtonVoltarAoTelaDeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoTelaDeUsuarioActionPerformed
        // TODO add your handling code here:
        this.dispose(); //Fechar tela
        new TelaDeInicioPropriedade().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoTelaDeUsuarioActionPerformed

    private void jRadioCulturaSojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioCulturaSojaActionPerformed
        // TODO add your handling code here:
        cultura = "soja";
    }//GEN-LAST:event_jRadioCulturaSojaActionPerformed

    private void jRadioCulturaMilhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioCulturaMilhoActionPerformed
        // TODO add your handling code here:
        cultura = "milho";
    }//GEN-LAST:event_jRadioCulturaMilhoActionPerformed

    public void cadastrarPropriedade() {

        botaoTipoDeCultura.add(jRadioCulturaMilho);
        botaoTipoDeCultura.add(jRadioCulturaSoja);
        areaCovertida = Double.parseDouble(jTextFieldAreaPropriedade.getText());
        nomePropriedade = jTextFieldNomePropriedade.getText();
        localPropriedade = jTextFieldLocalPropriedade.getText();
        estadoPropriedade = jTextFieldEstadoPropriedade.getText();
        cidadePropriedade = jTextFieldCidadePropriedade.getText();
        tipoCultura = cultura;

        if (nomePropriedade.equals("")) {
            JOptionPane.showMessageDialog(null, "Nome Inválido");
            jTextFieldNomePropriedade.requestFocus();
            return;
        }

        if (localPropriedade.equals("")) {
            JOptionPane.showMessageDialog(null, "Local Inválido");
            jTextFieldLocalPropriedade.requestFocus();
            return;
        }

        if (areaCovertida <= 0) {
            JOptionPane.showMessageDialog(null, "Area Inválida");
            return;
        }

        if (estadoPropriedade.equals("")) {
            JOptionPane.showMessageDialog(null, "Estado Inválido");
            jTextFieldEstadoPropriedade.requestFocus();
            return;
        }

        if (cidadePropriedade.equals("")) {
            JOptionPane.showMessageDialog(null, "Cidade Inválida");
            jTextFieldCidadePropriedade.requestFocus();
            return;
        }

        if (botaoTipoDeCultura.equals("")) {
            JOptionPane.showMessageDialog(null, "Adicione o nivel de Acesso");
            return;
        }

        if (botaoTipoDeCultura.equals(jRadioCulturaMilho) && botaoTipoDeCultura.equals(jRadioCulturaSoja)) {
            JOptionPane.showMessageDialog(null, "Escolha apenas uma cultura");
            return;
        }

        propriedade.propriedade.setNomePropriedade(nomePropriedade);
        propriedade.propriedade.setLocalPropriedade(localPropriedade);
        propriedade.propriedade.setAreaPropriedade(areaCovertida);
        propriedade.propriedade.setTipoDeCulturaDaPropriedade(tipoCultura);
        propriedade.propriedade.setEstado(estadoPropriedade);
        propriedade.propriedade.setCidade(cidadePropriedade);

        String msg = propriedade.cadastrarPropriedade(ControlePropriedade.INCLUSAO);

        JOptionPane.showMessageDialog(this, msg);
        
        jTextFieldAreaPropriedade.setText(limparCampo);
        jTextFieldCidadePropriedade.setText(limparCampo);
        jTextFieldEstadoPropriedade.setText(limparCampo);
        jTextFieldLocalPropriedade.setText(limparCampo);
        jTextFieldNomePropriedade.setText(limparCampo);

    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botaoTipoDeCultura;
    private javax.swing.JButton jButtonCancelarCadastroDePropriedade;
    private javax.swing.JButton jButtonConfirmarCadastroDePropriedade;
    private javax.swing.JButton jButtonVoltarAoTelaDeUsuario;
    private javax.swing.JLabel jLabelCadatroPropriedade;
    private javax.swing.JRadioButton jRadioCulturaMilho;
    private javax.swing.JRadioButton jRadioCulturaSoja;
    private javax.swing.JTextField jTextFieldAreaPropriedade;
    private javax.swing.JTextField jTextFieldCidadePropriedade;
    private javax.swing.JTextField jTextFieldEstadoPropriedade;
    private javax.swing.JTextField jTextFieldLocalPropriedade;
    private javax.swing.JTextField jTextFieldNomePropriedade;
    // End of variables declaration//GEN-END:variables
}
