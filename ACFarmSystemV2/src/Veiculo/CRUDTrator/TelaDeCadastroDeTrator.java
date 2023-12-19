/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Veiculo.CRUDTrator;

import Veiculo.ControleVeiculo;
import Veiculo.TelaCRUDTrator;
import javax.swing.JOptionPane;
import java.util.Calendar;

/**
 *
 * @author Gustavo
 */
public class TelaDeCadastroDeTrator extends javax.swing.JFrame {

    private ControleVeiculo controleVeiculo = new ControleVeiculo();
    private String estado = null;
    private String tipoVeiculo = null;

    public TelaDeCadastroDeTrator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupEstado = new javax.swing.ButtonGroup();
        jButtonCancelarCadastro = new javax.swing.JButton();
        jButtonConfirmarCadastro = new javax.swing.JButton();
        jTextFieldPotenciaTrator = new javax.swing.JTextField();
        jTextFieldNomeTrator = new javax.swing.JTextField();
        jTextFieldMarcaTrator = new javax.swing.JTextField();
        jTextFieldAnoTrator = new javax.swing.JTextField();
        jTextFieldChassiTrator = new javax.swing.JTextField();
        jTextFieldCapacidadeDoTanqueTrator = new javax.swing.JTextField();
        jTextFieldNumeroDeMarchasTrator = new javax.swing.JTextField();
        jTextFieldQuantidadeDeRodasTrator = new javax.swing.JTextField();
        jButtonVoltarATelaDeInicioVeiculo = new javax.swing.JButton();
        jRadioEstadoInativo = new javax.swing.JRadioButton();
        jRadioEstadoAtivo = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

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
        getContentPane().add(jButtonCancelarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 600, 280, 33));

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
        getContentPane().add(jButtonConfirmarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 550, 280, 33));

        jTextFieldPotenciaTrator.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPotenciaTrator.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldPotenciaTrator.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldPotenciaTrator.setBorder(null);
        getContentPane().add(jTextFieldPotenciaTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 395, 270, 30));

        jTextFieldNomeTrator.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeTrator.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeTrator.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeTrator.setBorder(null);
        getContentPane().add(jTextFieldNomeTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 135, 270, 30));

        jTextFieldMarcaTrator.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldMarcaTrator.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldMarcaTrator.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldMarcaTrator.setBorder(null);
        getContentPane().add(jTextFieldMarcaTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 218, 270, 30));

        jTextFieldAnoTrator.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldAnoTrator.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldAnoTrator.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldAnoTrator.setBorder(null);
        jTextFieldAnoTrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAnoTratorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAnoTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 304, 271, 30));

        jTextFieldChassiTrator.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldChassiTrator.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldChassiTrator.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldChassiTrator.setBorder(null);
        getContentPane().add(jTextFieldChassiTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 395, 270, 30));

        jTextFieldCapacidadeDoTanqueTrator.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCapacidadeDoTanqueTrator.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCapacidadeDoTanqueTrator.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDoTanqueTrator.setBorder(null);
        getContentPane().add(jTextFieldCapacidadeDoTanqueTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 132, 270, 30));

        jTextFieldNumeroDeMarchasTrator.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNumeroDeMarchasTrator.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNumeroDeMarchasTrator.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNumeroDeMarchasTrator.setBorder(null);
        getContentPane().add(jTextFieldNumeroDeMarchasTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 218, 270, 30));

        jTextFieldQuantidadeDeRodasTrator.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeDeRodasTrator.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeDeRodasTrator.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeDeRodasTrator.setBorder(null);
        getContentPane().add(jTextFieldQuantidadeDeRodasTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 303, 270, 30));

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
        getContentPane().add(jRadioEstadoInativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 120, 20));

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
        getContentPane().add(jRadioEstadoAtivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 120, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasVeiculo/img_tela_de_cadastro_de_trator.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCadastroActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButtonCancelarCadastroActionPerformed

    private void jButtonVoltarATelaDeInicioVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarATelaDeInicioVeiculoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TelaCRUDTrator().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarATelaDeInicioVeiculoActionPerformed

    private void jButtonConfirmarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroActionPerformed
        // TODO add your handling code here:
        cadastrarTrator();
    }//GEN-LAST:event_jButtonConfirmarCadastroActionPerformed

    private void jRadioEstadoInativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioEstadoInativoActionPerformed
        // TODO add your handling code here:
        estado = "I";
    }//GEN-LAST:event_jRadioEstadoInativoActionPerformed

    private void jRadioEstadoAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioEstadoAtivoActionPerformed
        // TODO add your handling code here:
        estado = "A";
    }//GEN-LAST:event_jRadioEstadoAtivoActionPerformed

    private void jTextFieldAnoTratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnoTratorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAnoTratorActionPerformed

    public void cadastrarTrator() {

        Calendar cal = Calendar.getInstance();

        String nome = jTextFieldNomeTrator.getText();
        String marca = jTextFieldMarcaTrator.getText();
        String chassi = jTextFieldChassiTrator.getText();

        Double capacidadeDoTanque = Double.valueOf(jTextFieldCapacidadeDoTanqueTrator.getText());

        int anoAtual = cal.get(Calendar.YEAR);
        int ano = Integer.parseInt(jTextFieldAnoTrator.getText());
        int numeroDeMarchas = Integer.parseInt(jTextFieldNumeroDeMarchasTrator.getText());
        int quantidadeDeRodas = Integer.parseInt(jTextFieldQuantidadeDeRodasTrator.getText());
        int potenciaEmCv = Integer.parseInt(jTextFieldPotenciaTrator.getText());

        buttonGroupEstado.add(jRadioEstadoAtivo);
        buttonGroupEstado.add(jRadioEstadoInativo);

        if (numeroDeMarchas <= 0) {
            JOptionPane.showMessageDialog(null, "Numero de marchas Inválida");
            return;
        }

        if (quantidadeDeRodas <= 4) {
            JOptionPane.showMessageDialog(null, "Numero de rodas Inválida");
            return;
        }

        if (potenciaEmCv <= 0) {
            JOptionPane.showMessageDialog(null, "Potencia Inválida");
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

        tipoVeiculo = "Trator";

        try {
            controleVeiculo.trator.setTipoVeiculo(tipoVeiculo);
            controleVeiculo.trator.setNomeVeiculo(nome);
            controleVeiculo.trator.setMarcaVeiculo(marca);
            controleVeiculo.trator.setAnoVeiculo(ano);
            controleVeiculo.trator.setChassiVeiculo(chassi);
            controleVeiculo.trator.setEstadoVeiculo(estado);
            controleVeiculo.trator.setCapacidadeDoTanqueDeCombustivel(capacidadeDoTanque);
            controleVeiculo.trator.setQuantidadeDeMarchas(numeroDeMarchas);
            controleVeiculo.trator.setQuantidadeDeRodas(quantidadeDeRodas);
            controleVeiculo.trator.setPotenciaEmCV(potenciaEmCv);

            String msg = controleVeiculo.cadastrarTrator(ControleVeiculo.INCLUSAO);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioEstadoAtivo;
    private javax.swing.JRadioButton jRadioEstadoInativo;
    private javax.swing.JTextField jTextFieldAnoTrator;
    private javax.swing.JTextField jTextFieldCapacidadeDoTanqueTrator;
    private javax.swing.JTextField jTextFieldChassiTrator;
    private javax.swing.JTextField jTextFieldMarcaTrator;
    private javax.swing.JTextField jTextFieldNomeTrator;
    private javax.swing.JTextField jTextFieldNumeroDeMarchasTrator;
    private javax.swing.JTextField jTextFieldPotenciaTrator;
    private javax.swing.JTextField jTextFieldQuantidadeDeRodasTrator;
    // End of variables declaration//GEN-END:variables
}
