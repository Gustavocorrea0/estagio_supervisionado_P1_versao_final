package planta.CRUDMilho;

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
import planta.TelaCRUDMilho;

public class TelaDeAdicaoMilho extends javax.swing.JFrame {

    private String tipoDePlanta = "Milho";
    private String fornecedorPlanta;
    private int cicloEmDias;
    private String dataDePlantio;
    private String dataDeSurgimentoDeEspigas;
    private Double alturaAtualDaPlanta;
    private int idPropriedade;
    private String nomePropriedade;
    private ControlePlanta controlePlanta = new ControlePlanta();
    private ControlePropriedade controlePropriedade = new ControlePropriedade();
    private String msg;

    public TelaDeAdicaoMilho() {
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
        jTextFieldSurgimentoDeEspigas = new javax.swing.JTextField();
        jTextFieldIdPropriedade = new javax.swing.JTextField();
        jButtonSairDaTelaAdicionarMilho = new javax.swing.JButton();
        jButtonBuscarPropriedade = new javax.swing.JButton();
        jButtonConfirmarCadastro = new javax.swing.JButton();
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
        getContentPane().add(jTextFieldFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 250, 270, 29));

        jTextFieldCicloAproximadoEmDias.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCicloAproximadoEmDias.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCicloAproximadoEmDias.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCicloAproximadoEmDias.setBorder(null);
        jTextFieldCicloAproximadoEmDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCicloAproximadoEmDiasActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCicloAproximadoEmDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 462, 330, 29));

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
        getContentPane().add(jTextFieldAlturaPlanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 250, 330, 30));

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

        jTextFieldSurgimentoDeEspigas.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldSurgimentoDeEspigas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldSurgimentoDeEspigas.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldSurgimentoDeEspigas.setBorder(null);
        jTextFieldSurgimentoDeEspigas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSurgimentoDeEspigasActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldSurgimentoDeEspigas, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 354, 330, 30));

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

        jButtonConfirmarCadastro.setBorder(null);
        jButtonConfirmarCadastro.setBorderPainted(false);
        jButtonConfirmarCadastro.setContentAreaFilled(false);
        jButtonConfirmarCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 550, 280, 35));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasPlanta/img_tela_de_adicao_milho.png"))); // NOI18N
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

    private void jTextFieldSurgimentoDeEspigasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSurgimentoDeEspigasActionPerformed

    }//GEN-LAST:event_jTextFieldSurgimentoDeEspigasActionPerformed

    private void jTextFieldIdPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdPropriedadeActionPerformed

    }//GEN-LAST:event_jTextFieldIdPropriedadeActionPerformed

    private void jButtonBuscarPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarPropriedadeActionPerformed
        try {
            buscarPropriedade();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAdicaoMilho.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarPropriedadeActionPerformed

    private void jButtonSairDaTelaAdicionarMilhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDaTelaAdicionarMilhoActionPerformed
        this.dispose();
        new TelaCRUDMilho().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaAdicionarMilhoActionPerformed

    private void jButtonConfirmarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroActionPerformed
        adicionarPlanta();
    }//GEN-LAST:event_jButtonConfirmarCadastroActionPerformed

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
        tipoDePlanta = "Milho";
        fornecedorPlanta = jTextFieldFornecedor.getText();
        cicloEmDias = Integer.parseInt(jTextFieldCicloAproximadoEmDias.getText());
        alturaAtualDaPlanta = Double.parseDouble(jTextFieldAlturaPlanta.getText());
        idPropriedade = Integer.parseInt(jTextFieldIdPropriedade.getText());
        dataDeSurgimentoDeEspigas = jTextFieldSurgimentoDeEspigas.getText();
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
            Date dataSurgimentoDeEspigas = dateFormat.parse(dataDeSurgimentoDeEspigas);
            Date dataPlantio = dateFormat.parse(dataDePlantio);

            if (dataSurgimentoDeEspigas == dataPlantio) {
                JOptionPane.showMessageDialog(null, "Datas de Plantio e surgimento de sementes não devem ser iguais");
                return;
            }

            controlePlanta.milho.setTipoDePlanta(tipoDePlanta);
            controlePlanta.milho.setFornecedorPlanta(fornecedorPlanta);
            controlePlanta.milho.setCicloEmDias(cicloEmDias);
            controlePlanta.milho.setAlturaAtualDaPlanta(alturaAtualDaPlanta);
            controlePlanta.milho.setDataDePlantio(dataPlantio);
            controlePlanta.milho.setDataDeSurgimentoDeEspigas(dataSurgimentoDeEspigas);

            msg = controlePlanta.cadastrarMilho(ControlePlanta.INCLUSAO);
            JOptionPane.showMessageDialog(this, msg);

        } catch (ParseException px) {
            JOptionPane.showMessageDialog(this, "Formato de data inválido, o formato é dd/mm/aaaa.");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarPropriedade;
    private javax.swing.JButton jButtonConfirmarCadastro;
    private javax.swing.JButton jButtonSairDaTelaAdicionarMilho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldAlturaPlanta;
    private javax.swing.JTextField jTextFieldAlturaPlantaAdicionarMilho;
    private javax.swing.JTextField jTextFieldCicloAproximadoEmDias;
    private javax.swing.JTextField jTextFieldDataPlantio;
    private javax.swing.JTextField jTextFieldFornecedor;
    private javax.swing.JTextField jTextFieldIdPropriedade;
    private javax.swing.JTextField jTextFieldSurgimentoDeEspigas;
    // End of variables declaration//GEN-END:variables

}
