/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Veiculo.CRUDCaminhaoOuVeiculoDeTransporte;

import Veiculo.ControleVeiculo;
import Veiculo.TelaCRUDCaminhaoOuVeiculoDeTransporte;
import javax.swing.JOptionPane;
import java.util.Calendar;

/**
 *
 * @author Gustavo
 */
public class TelaDeCadastroDeCaminhaoOuVeiculoDeTransporte extends javax.swing.JFrame {

    private ControleVeiculo controleVeiculo = new ControleVeiculo();
    private String estado = null;
    private String tipoVeiculo = null;

    /**
     * Creates new form TelaDeCadastroDeTrator
     */
    public TelaDeCadastroDeCaminhaoOuVeiculoDeTransporte() {
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
        jButtonCancelarCadastro = new javax.swing.JButton();
        jButtonConfirmarCadastro = new javax.swing.JButton();
        jTextFieldNomeCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jTextFieldMarcaCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jTextFieldAnoCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jTextFieldChassiCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jButtonVoltarATelaDeInicioVeiculo = new javax.swing.JButton();
        jRadioEstadoInativo = new javax.swing.JRadioButton();
        jRadioEstadoAtivo = new javax.swing.JRadioButton();
        jLabelFundoCadastroDeVeiculo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCancelarCadastro.setBorder(null);
        jButtonCancelarCadastro.setBorderPainted(false);
        jButtonCancelarCadastro.setContentAreaFilled(false);
        jButtonCancelarCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarCadastro.setDefaultCapable(false);
        jButtonCancelarCadastro.setFocusPainted(false);
        jButtonCancelarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 598, 280, 33));

        jButtonConfirmarCadastro.setBorder(null);
        jButtonConfirmarCadastro.setBorderPainted(false);
        jButtonConfirmarCadastro.setContentAreaFilled(false);
        jButtonConfirmarCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarCadastro.setDefaultCapable(false);
        jButtonConfirmarCadastro.setFocusPainted(false);
        jButtonConfirmarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 547, 280, 33));

        jTextFieldNomeCaminhaoOuVeiculoDeTransporte.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeCaminhaoOuVeiculoDeTransporte.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeCaminhaoOuVeiculoDeTransporte.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeCaminhaoOuVeiculoDeTransporte.setBorder(null);
        getContentPane().add(jTextFieldNomeCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 181, 270, 30));

        jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.setBorder(null);
        getContentPane().add(jTextFieldMarcaCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 284, 270, 30));

        jTextFieldAnoCaminhaoOuVeiculoDeTransporte.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldAnoCaminhaoOuVeiculoDeTransporte.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldAnoCaminhaoOuVeiculoDeTransporte.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldAnoCaminhaoOuVeiculoDeTransporte.setBorder(null);
        jTextFieldAnoCaminhaoOuVeiculoDeTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAnoCaminhaoOuVeiculoDeTransporteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAnoCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 392, 271, 30));

        jTextFieldChassiCaminhaoOuVeiculoDeTransporte.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldChassiCaminhaoOuVeiculoDeTransporte.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldChassiCaminhaoOuVeiculoDeTransporte.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldChassiCaminhaoOuVeiculoDeTransporte.setBorder(null);
        getContentPane().add(jTextFieldChassiCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 285, 270, 30));

        jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.setBorder(null);
        jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 182, 270, 30));

        jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.setBorder(null);
        jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 498, 270, 30));

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
        getContentPane().add(jButtonVoltarATelaDeInicioVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 39, 25));

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
        getContentPane().add(jRadioEstadoInativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 120, 20));

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
        getContentPane().add(jRadioEstadoAtivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 120, 20));

        jLabelFundoCadastroDeVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasVeiculo/img_tela_de_cadastro_de_caminhao.png"))); // NOI18N
        getContentPane().add(jLabelFundoCadastroDeVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCadastroActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButtonCancelarCadastroActionPerformed

    private void jButtonVoltarATelaDeInicioVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarATelaDeInicioVeiculoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TelaCRUDCaminhaoOuVeiculoDeTransporte().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarATelaDeInicioVeiculoActionPerformed

    private void jButtonConfirmarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroActionPerformed
        // TODO add your handling code here:
        cadastrarCaminhaoOuVeiculoDeTransporte();
    }//GEN-LAST:event_jButtonConfirmarCadastroActionPerformed

    private void jRadioEstadoInativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioEstadoInativoActionPerformed
        // TODO add your handling code here:
        estado = "I";
    }//GEN-LAST:event_jRadioEstadoInativoActionPerformed

    private void jRadioEstadoAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioEstadoAtivoActionPerformed
        // TODO add your handling code here:
        estado = "A";
    }//GEN-LAST:event_jRadioEstadoAtivoActionPerformed

    private void jTextFieldAnoCaminhaoOuVeiculoDeTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnoCaminhaoOuVeiculoDeTransporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAnoCaminhaoOuVeiculoDeTransporteActionPerformed

    private void jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporteActionPerformed

    private void jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporteActionPerformed

    public void cadastrarCaminhaoOuVeiculoDeTransporte() {

        Calendar cal = Calendar.getInstance();

        String nome = jTextFieldNomeCaminhaoOuVeiculoDeTransporte.getText();
        String marca = jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.getText();
        String chassi = jTextFieldChassiCaminhaoOuVeiculoDeTransporte.getText();

        int anoAtual = cal.get(Calendar.YEAR);
        int ano = Integer.parseInt(jTextFieldAnoCaminhaoOuVeiculoDeTransporte.getText());

        Double capacidadeDoTanque = Double.valueOf(jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.getText());
        Double capacidadeDeCarga = Double.valueOf(jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.getText());

        buttonGroupEstado.add(jRadioEstadoAtivo);
        buttonGroupEstado.add(jRadioEstadoInativo);

        if (capacidadeDeCarga <= 0) {
            JOptionPane.showMessageDialog(null, "Numero de rodas Inválidos");
            return;
        }

        if (nome.equals("")) {
            JOptionPane.showMessageDialog(null, "Nome Inválido");
            return;
        }

        if (marca.equals("")) {
            JOptionPane.showMessageDialog(null, "Marca Inválida");
            return;
        }

        if (ano > (anoAtual + 1) || ano < 1970) {
            JOptionPane.showMessageDialog(null, "Ano Inválido");
            return;
        }

        if (chassi.length() != 17) {
            JOptionPane.showMessageDialog(null, "Chassi Inválido");
            return;
        }

        if (capacidadeDoTanque <= 0) {
            JOptionPane.showMessageDialog(null, "Capacidade do tanque Inválida");
            return;
        }

        if (capacidadeDeCarga <= 0) {
            JOptionPane.showMessageDialog(null, "Capacidade do carga Inválida");
            return;
        }

        tipoVeiculo = "Caminhao ou Veiculo de Transporte";

        try {
            controleVeiculo.caminhaoOuVeiculoDeTransporte.setTipoVeiculo(tipoVeiculo);
            controleVeiculo.caminhaoOuVeiculoDeTransporte.setNomeVeiculo(nome);
            controleVeiculo.caminhaoOuVeiculoDeTransporte.setMarcaVeiculo(marca);
            controleVeiculo.caminhaoOuVeiculoDeTransporte.setAnoVeiculo(ano);
            controleVeiculo.caminhaoOuVeiculoDeTransporte.setChassiVeiculo(chassi);
            controleVeiculo.caminhaoOuVeiculoDeTransporte.setEstadoVeiculo(estado);
            controleVeiculo.caminhaoOuVeiculoDeTransporte.setCapacidadeDoTanqueDeCombustivel(capacidadeDoTanque);
            controleVeiculo.caminhaoOuVeiculoDeTransporte.setCapacidadeDeCarga(capacidadeDeCarga);

            String msg = controleVeiculo.cadastrarCaminhaoOuVeiculoDeTransporte(ControleVeiculo.INCLUSAO);
            JOptionPane.showMessageDialog(this, msg);

        } catch (NullPointerException ex) {
            System.out.println("Problema no sistema, tipo: ");
            ex.printStackTrace();
        }

    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupEstado;
    private javax.swing.JButton jButtonCancelarCadastro;
    private javax.swing.JButton jButtonConfirmarCadastro;
    private javax.swing.JButton jButtonVoltarATelaDeInicioVeiculo;
    private javax.swing.JLabel jLabelFundoCadastroDeVeiculo;
    private javax.swing.JRadioButton jRadioEstadoAtivo;
    private javax.swing.JRadioButton jRadioEstadoInativo;
    private javax.swing.JTextField jTextFieldAnoCaminhaoOuVeiculoDeTransporte;
    private javax.swing.JTextField jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte;
    private javax.swing.JTextField jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte;
    private javax.swing.JTextField jTextFieldChassiCaminhaoOuVeiculoDeTransporte;
    private javax.swing.JTextField jTextFieldMarcaCaminhaoOuVeiculoDeTransporte;
    private javax.swing.JTextField jTextFieldNomeCaminhaoOuVeiculoDeTransporte;
    // End of variables declaration//GEN-END:variables
}
