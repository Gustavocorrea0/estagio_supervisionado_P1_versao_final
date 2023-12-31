/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Maquina.CRUDCarregador;

import Maquina.ControleMaquina;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinicius Camacho
 */
public class TelaDeCadastroCarregador extends javax.swing.JFrame {

    private ControleMaquina controleMaquina = new ControleMaquina();

    private String estado = null;
    private String tipoMaquina = null;
    private String nomeMaquina = null;
    private String marcaMaquina = null;
    private int anoMaquina;
    private String chassiMaquina = null;

    public TelaDeCadastroCarregador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupEstado = new javax.swing.ButtonGroup();
        jTextFieldAnoMaquina = new javax.swing.JTextField();
        jTextFieldChassiMaquina = new javax.swing.JTextField();
        jTextFieldMarcaMaquina = new javax.swing.JTextField();
        jTextFieldPesoSuportado = new javax.swing.JTextField();
        jTextFieldNomeMaquina = new javax.swing.JTextField();
        jRadioEstadoInativo = new javax.swing.JRadioButton();
        jRadioEstadoAtivo = new javax.swing.JRadioButton();
        jButtonCancelarCadastroDeMaquina = new javax.swing.JButton();
        jButtonConfirmarCadastroDeMaquina = new javax.swing.JButton();
        jButtonSairDaTelaDeConsulta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldAnoMaquina.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldAnoMaquina.setBorder(null);
        jTextFieldAnoMaquina.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldAnoMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAnoMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAnoMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 305, 270, 27));

        jTextFieldChassiMaquina.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldChassiMaquina.setBorder(null);
        jTextFieldChassiMaquina.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldChassiMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldChassiMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldChassiMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 396, 270, 27));

        jTextFieldMarcaMaquina.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldMarcaMaquina.setBorder(null);
        jTextFieldMarcaMaquina.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldMarcaMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMarcaMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMarcaMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 220, 270, 27));

        jTextFieldPesoSuportado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldPesoSuportado.setBorder(null);
        jTextFieldPesoSuportado.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldPesoSuportado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesoSuportadoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPesoSuportado, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 134, 270, 27));

        jTextFieldNomeMaquina.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeMaquina.setBorder(null);
        jTextFieldNomeMaquina.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNomeMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 137, 270, 27));

        jRadioEstadoInativo.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jRadioEstadoInativo.setForeground(new java.awt.Color(255, 255, 255));
        jRadioEstadoInativo.setText("Inativo");
        jRadioEstadoInativo.setBorder(null);
        jRadioEstadoInativo.setContentAreaFilled(false);
        jRadioEstadoInativo.setFocusable(false);
        jRadioEstadoInativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioEstadoInativoActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioEstadoInativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 120, 20));

        jRadioEstadoAtivo.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jRadioEstadoAtivo.setForeground(new java.awt.Color(255, 255, 255));
        jRadioEstadoAtivo.setText("Ativo");
        jRadioEstadoAtivo.setBorder(null);
        jRadioEstadoAtivo.setContentAreaFilled(false);
        jRadioEstadoAtivo.setFocusable(false);
        jRadioEstadoAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioEstadoAtivoActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioEstadoAtivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 120, 20));

        jButtonCancelarCadastroDeMaquina.setBorder(null);
        jButtonCancelarCadastroDeMaquina.setBorderPainted(false);
        jButtonCancelarCadastroDeMaquina.setContentAreaFilled(false);
        jButtonCancelarCadastroDeMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButtonCancelarCadastroDeMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 600, 280, 33));

        jButtonConfirmarCadastroDeMaquina.setBorder(null);
        jButtonConfirmarCadastroDeMaquina.setBorderPainted(false);
        jButtonConfirmarCadastroDeMaquina.setContentAreaFilled(false);
        jButtonConfirmarCadastroDeMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarCadastroDeMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarCadastroDeMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarCadastroDeMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 550, 280, 33));

        jButtonSairDaTelaDeConsulta.setBorder(null);
        jButtonSairDaTelaDeConsulta.setBorderPainted(false);
        jButtonSairDaTelaDeConsulta.setContentAreaFilled(false);
        jButtonSairDaTelaDeConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSairDaTelaDeConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairDaTelaDeConsultaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSairDaTelaDeConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 22, 40, 28));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasMaquinas/telasDeCadastro/img_tela_cadastro_de_carregador.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldMarcaMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMarcaMaquinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMarcaMaquinaActionPerformed

    private void jTextFieldChassiMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldChassiMaquinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldChassiMaquinaActionPerformed

    private void jTextFieldAnoMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnoMaquinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAnoMaquinaActionPerformed

    private void jTextFieldPesoSuportadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesoSuportadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesoSuportadoActionPerformed

    private void jRadioEstadoInativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioEstadoInativoActionPerformed
        // TODO add your handling code here:
        estado = "I";
    }//GEN-LAST:event_jRadioEstadoInativoActionPerformed

    private void jRadioEstadoAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioEstadoAtivoActionPerformed
        // TODO add your handling code here:
        estado = "A";
    }//GEN-LAST:event_jRadioEstadoAtivoActionPerformed

    private void jButtonSairDaTelaDeConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDaTelaDeConsultaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TelaCRUDCarregador().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaDeConsultaActionPerformed

    private void jTextFieldNomeMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeMaquinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeMaquinaActionPerformed

    private void jButtonConfirmarCadastroDeMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroDeMaquinaActionPerformed
        // TODO add your handling code here:
        cadastrarCarregador();
    }//GEN-LAST:event_jButtonConfirmarCadastroDeMaquinaActionPerformed

    public void cadastrarCarregador() {

        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);
        
        nomeMaquina = jTextFieldNomeMaquina.getText();
        marcaMaquina = jTextFieldMarcaMaquina.getText();
        anoMaquina = Integer.parseInt(jTextFieldAnoMaquina.getText());
        chassiMaquina = jTextFieldChassiMaquina.getText();
        buttonGroupEstado.add(jRadioEstadoAtivo);
        buttonGroupEstado.add(jRadioEstadoInativo);

        Double pesoSuportado = Double.valueOf(jTextFieldPesoSuportado.getText());

        if (nomeMaquina.equals("")) {
            JOptionPane.showMessageDialog(null, "Nome Inválido");
            return;
        }

        if (marcaMaquina.equals("")) {
            JOptionPane.showMessageDialog(null, "Marca Inválida");
            return;
        }

        if (anoMaquina > (anoAtual + 1) || anoMaquina < 1970) {
            JOptionPane.showMessageDialog(null, "Ano Inválido");
            return;
        }

        if (chassiMaquina.length() != 17) {
            JOptionPane.showMessageDialog(null, "Chassi Inválido");
            return;
        }
        
        if (buttonGroupEstado.equals("")) {
            JOptionPane.showMessageDialog(null, "Adicione o nivel de Acesso");
        }

        if (buttonGroupEstado.equals(jRadioEstadoAtivo) && buttonGroupEstado.equals(jRadioEstadoInativo)) {
            JOptionPane.showMessageDialog(null, "Escolha apenas um nivel de acesso");
        }

        if (pesoSuportado <= 0) {
            JOptionPane.showMessageDialog(null, "Peso Inválido");
            return;
        }

        tipoMaquina = "Carregador";

        try {
            controleMaquina.carregador.setTipoMaquina(tipoMaquina);
            controleMaquina.carregador.setNomeMaquina(nomeMaquina);
            controleMaquina.carregador.setMarcaMaquina(marcaMaquina);
            controleMaquina.carregador.setAnoMaquina(anoMaquina);
            controleMaquina.carregador.setChassiMaquina(chassiMaquina);
            controleMaquina.carregador.setEstadoMaquina(estado);
            controleMaquina.carregador.setPesoSuportado(pesoSuportado);

            String msg = controleMaquina.cadastrarCarregador(ControleMaquina.INCLUSAO);
            JOptionPane.showMessageDialog(this, msg);

        } catch (NullPointerException ex) {
            System.out.println("Problema no sistema, tipo: ");
            ex.printStackTrace();
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupEstado;
    private javax.swing.JButton jButtonCancelarCadastroDeMaquina;
    private javax.swing.JButton jButtonConfirmarCadastroDeMaquina;
    private javax.swing.JButton jButtonSairDaTelaDeConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioEstadoAtivo;
    private javax.swing.JRadioButton jRadioEstadoInativo;
    private javax.swing.JTextField jTextFieldAnoMaquina;
    private javax.swing.JTextField jTextFieldChassiMaquina;
    private javax.swing.JTextField jTextFieldMarcaMaquina;
    private javax.swing.JTextField jTextFieldNomeMaquina;
    private javax.swing.JTextField jTextFieldPesoSuportado;
    // End of variables declaration//GEN-END:variables
}
