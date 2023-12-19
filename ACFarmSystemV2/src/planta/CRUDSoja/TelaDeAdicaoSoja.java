package planta.CRUDSoja;

import Propriedade.ControlePropriedade;
import Propriedade.Propriedade;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import planta.ControlePlanta;
import planta.TelaCRUDSoja;

public class TelaDeAdicaoSoja extends javax.swing.JFrame {

    private String tipoDePlanta = "Soja";
    private String fornecedorPlanta;
    private int cicloEmDias;
    private String dataDePlantio;
    private String dataDeSurgimentoDeSementes;
    private Double alturaAtualDaPlanta;
    private int idPropriedade;
    private String nomePropriedade;
    private ControlePlanta controlePlanta = new ControlePlanta();
    private ControlePropriedade controlePropriedade = new ControlePropriedade();
    private String msg;

    public TelaDeAdicaoSoja() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldFornecedor = new javax.swing.JTextField();
        jTextFieldCicloAproximadoEmDias = new javax.swing.JTextField();
        jTextFieldDataPlantio = new javax.swing.JTextField();
        jTextFieldAlturaPlanta = new javax.swing.JTextField();
        jTextFieldAlturaPlantaAdicionarMilho = new javax.swing.JTextField();
        jTextFieldSurgimentoDeSementes = new javax.swing.JTextField();
        jTextFieldIdPropriedade = new javax.swing.JTextField();
        jButtonSairDaTelaAdicionarMilho = new javax.swing.JButton();
        jButtonBuscarPropriedade = new javax.swing.JButton();
        jButtonConfirmaCadastro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldFornecedor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldFornecedor.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldFornecedor.setBorder(null);
        jTextFieldFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 252, 270, 29));

        jTextFieldCicloAproximadoEmDias.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCicloAproximadoEmDias.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCicloAproximadoEmDias.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCicloAproximadoEmDias.setBorder(null);
        jTextFieldCicloAproximadoEmDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCicloAproximadoEmDiasActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCicloAproximadoEmDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 463, 330, 29));

        jTextFieldDataPlantio.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDataPlantio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDataPlantio.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDataPlantio.setBorder(null);
        jTextFieldDataPlantio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataPlantioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDataPlantio, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 354, 270, 30));

        jTextFieldAlturaPlanta.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldAlturaPlanta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldAlturaPlanta.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldAlturaPlanta.setBorder(null);
        jTextFieldAlturaPlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAlturaPlantaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAlturaPlanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 251, 330, 30));

        jTextFieldAlturaPlantaAdicionarMilho.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldAlturaPlantaAdicionarMilho.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldAlturaPlantaAdicionarMilho.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldAlturaPlantaAdicionarMilho.setBorder(null);
        jTextFieldAlturaPlantaAdicionarMilho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAlturaPlantaAdicionarMilhoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAlturaPlantaAdicionarMilho, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 330, 30));

        jTextFieldSurgimentoDeSementes.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldSurgimentoDeSementes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldSurgimentoDeSementes.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldSurgimentoDeSementes.setBorder(null);
        jTextFieldSurgimentoDeSementes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSurgimentoDeSementesActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldSurgimentoDeSementes, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 354, 330, 30));

        jTextFieldIdPropriedade.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldIdPropriedade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldIdPropriedade.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldIdPropriedade.setBorder(null);
        jTextFieldIdPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIdPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 116, 305, 28));

        jButtonSairDaTelaAdicionarMilho.setBorder(null);
        jButtonSairDaTelaAdicionarMilho.setBorderPainted(false);
        jButtonSairDaTelaAdicionarMilho.setContentAreaFilled(false);
        jButtonSairDaTelaAdicionarMilho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSairDaTelaAdicionarMilho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairDaTelaAdicionarMilhoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSairDaTelaAdicionarMilho, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 30));

        jButtonBuscarPropriedade.setBorder(null);
        jButtonBuscarPropriedade.setBorderPainted(false);
        jButtonBuscarPropriedade.setContentAreaFilled(false);
        jButtonBuscarPropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 105, 260, 45));

        jButtonConfirmaCadastro.setBorder(null);
        jButtonConfirmaCadastro.setBorderPainted(false);
        jButtonConfirmaCadastro.setContentAreaFilled(false);
        jButtonConfirmaCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmaCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmaCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 550, 280, 35));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasPlanta/img_tela_de_adicao_soja.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFornecedorActionPerformed

    }//GEN-LAST:event_jTextFieldFornecedorActionPerformed

    private void jTextFieldCicloAproximadoEmDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCicloAproximadoEmDiasActionPerformed

    }//GEN-LAST:event_jTextFieldCicloAproximadoEmDiasActionPerformed

    private void jTextFieldDataPlantioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataPlantioActionPerformed

    }//GEN-LAST:event_jTextFieldDataPlantioActionPerformed

    private void jTextFieldAlturaPlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAlturaPlantaActionPerformed

    }//GEN-LAST:event_jTextFieldAlturaPlantaActionPerformed

    private void jTextFieldAlturaPlantaAdicionarMilhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAlturaPlantaAdicionarMilhoActionPerformed

    }//GEN-LAST:event_jTextFieldAlturaPlantaAdicionarMilhoActionPerformed

    private void jTextFieldSurgimentoDeSementesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSurgimentoDeSementesActionPerformed

    }//GEN-LAST:event_jTextFieldSurgimentoDeSementesActionPerformed

    private void jTextFieldIdPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdPropriedadeActionPerformed

    }//GEN-LAST:event_jTextFieldIdPropriedadeActionPerformed

    private void jButtonBuscarPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarPropriedadeActionPerformed
        try {
            buscarPropriedade();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAdicaoSoja.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarPropriedadeActionPerformed

    private void jButtonSairDaTelaAdicionarMilhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDaTelaAdicionarMilhoActionPerformed
        this.dispose();
        new TelaCRUDSoja().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaAdicionarMilhoActionPerformed

    private void jButtonConfirmaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmaCadastroActionPerformed
        adicionarPlanta();
    }//GEN-LAST:event_jButtonConfirmaCadastroActionPerformed

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

    public void adicionarPlanta() {
        tipoDePlanta = "Soja";
        fornecedorPlanta = jTextFieldFornecedor.getText();
        cicloEmDias = Integer.parseInt(jTextFieldCicloAproximadoEmDias.getText());
        alturaAtualDaPlanta = Double.valueOf(jTextFieldAlturaPlanta.getText());
        idPropriedade = Integer.parseInt(jTextFieldIdPropriedade.getText());
        dataDeSurgimentoDeSementes = jTextFieldSurgimentoDeSementes.getText();
        dataDePlantio = jTextFieldDataPlantio.getText();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        if (fornecedorPlanta.equals("")) {
            JOptionPane.showMessageDialog(this, "Fornecedor inválido");
            return;
        }

        if (cicloEmDias < 0) {
            JOptionPane.showMessageDialog(this, "Ciclo em dias inválido");
            return;
        }

        if (alturaAtualDaPlanta < 0) {
            JOptionPane.showMessageDialog(this, "Altura atual da planta inválido");
            return;
        }

        try {
            Date dataSurgimentoDeSementes = dateFormat.parse(dataDeSurgimentoDeSementes);
            Date dataPlantio = dateFormat.parse(dataDePlantio);

            if (dataSurgimentoDeSementes == dataPlantio) {
                JOptionPane.showMessageDialog(null, "Datas de Plantio e surgimento de sementes não devem ser iguais");
                return;
            }

            controlePlanta.soja.setTipoDePlanta(tipoDePlanta);
            controlePlanta.soja.setFornecedorPlanta(fornecedorPlanta);
            controlePlanta.soja.setCicloEmDias(cicloEmDias);
            controlePlanta.soja.setAlturaAtualDaPlanta(alturaAtualDaPlanta);
            controlePlanta.soja.setDataDePlantio(dataPlantio);
            controlePlanta.soja.setDataDeSurgimentoDeSementes(dataSurgimentoDeSementes);

            msg = controlePlanta.cadastrarSoja(ControlePlanta.INCLUSAO);
            JOptionPane.showMessageDialog(this, msg);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Formato de data inválido, o formato é dd/mm/aaaa.");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarPropriedade;
    private javax.swing.JButton jButtonConfirmaCadastro;
    private javax.swing.JButton jButtonSairDaTelaAdicionarMilho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldAlturaPlanta;
    private javax.swing.JTextField jTextFieldAlturaPlantaAdicionarMilho;
    private javax.swing.JTextField jTextFieldCicloAproximadoEmDias;
    private javax.swing.JTextField jTextFieldDataPlantio;
    private javax.swing.JTextField jTextFieldFornecedor;
    private javax.swing.JTextField jTextFieldIdPropriedade;
    private javax.swing.JTextField jTextFieldSurgimentoDeSementes;
    // End of variables declaration//GEN-END:variables

}
