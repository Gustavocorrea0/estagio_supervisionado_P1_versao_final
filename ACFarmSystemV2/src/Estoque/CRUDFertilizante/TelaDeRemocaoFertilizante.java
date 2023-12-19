package Estoque.CRUDFertilizante;

import Estoque.Combustivel;
import Estoque.ControleEstoque;
import Estoque.Fertilizante;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaDeRemocaoFertilizante extends javax.swing.JFrame {

    private ControleEstoque controleEstoque = new ControleEstoque();
    private String nomeFertilizanteEncontrado;
    private String marcaFertilizanteEncontrado;
    private String tipoEncontrado;
    private String quantidadeEmSacosEncontrado;
    private String quantidadeEmLitrosEncontrado;
    private String msg;
    private String nomeInsumo;

    public TelaDeRemocaoFertilizante() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldIdFertilizante = new javax.swing.JTextField();
        jTextFieldQuantidadeEmLitros = new javax.swing.JTextField();
        jTextFieldMarcaFertilizante = new javax.swing.JTextField();
        jTextFieldTipoFertilizante = new javax.swing.JTextField();
        jTextFieldQuantidadeEmSacos = new javax.swing.JTextField();
        jTextFieldNomeFertilizante = new javax.swing.JTextField();
        jButtonBuscarFertilizante = new javax.swing.JButton();
        jButtonVoltarATelaAnterior = new javax.swing.JButton();
        jButtonConfirmarRemocao = new javax.swing.JButton();
        jButtonCancelarRemocao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldIdFertilizante.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldIdFertilizante.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldIdFertilizante.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldIdFertilizante.setBorder(null);
        jTextFieldIdFertilizante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdFertilizanteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIdFertilizante, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 116, 272, 30));

        jTextFieldQuantidadeEmLitros.setEditable(false);
        jTextFieldQuantidadeEmLitros.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeEmLitros.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeEmLitros.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeEmLitros.setBorder(null);
        jTextFieldQuantidadeEmLitros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeEmLitrosActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuantidadeEmLitros, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 397, 271, 30));

        jTextFieldMarcaFertilizante.setEditable(false);
        jTextFieldMarcaFertilizante.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldMarcaFertilizante.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldMarcaFertilizante.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldMarcaFertilizante.setBorder(null);
        jTextFieldMarcaFertilizante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMarcaFertilizanteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMarcaFertilizante, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 397, 271, 30));

        jTextFieldTipoFertilizante.setEditable(false);
        jTextFieldTipoFertilizante.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTipoFertilizante.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldTipoFertilizante.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldTipoFertilizante.setBorder(null);
        jTextFieldTipoFertilizante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTipoFertilizanteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTipoFertilizante, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 571, 271, 30));

        jTextFieldQuantidadeEmSacos.setEditable(false);
        jTextFieldQuantidadeEmSacos.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeEmSacos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeEmSacos.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeEmSacos.setBorder(null);
        jTextFieldQuantidadeEmSacos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeEmSacosActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuantidadeEmSacos, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 236, 271, 30));

        jTextFieldNomeFertilizante.setEditable(false);
        jTextFieldNomeFertilizante.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeFertilizante.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeFertilizante.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeFertilizante.setBorder(null);
        jTextFieldNomeFertilizante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeFertilizanteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeFertilizante, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 235, 271, 30));

        jButtonBuscarFertilizante.setBorder(null);
        jButtonBuscarFertilizante.setBorderPainted(false);
        jButtonBuscarFertilizante.setContentAreaFilled(false);
        jButtonBuscarFertilizante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarFertilizante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarFertilizanteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarFertilizante, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 111, 262, 42));

        jButtonVoltarATelaAnterior.setBorder(null);
        jButtonVoltarATelaAnterior.setBorderPainted(false);
        jButtonVoltarATelaAnterior.setContentAreaFilled(false);
        jButtonVoltarATelaAnterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarATelaAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarATelaAnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarATelaAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 30));

        jButtonConfirmarRemocao.setBorder(null);
        jButtonConfirmarRemocao.setBorderPainted(false);
        jButtonConfirmarRemocao.setContentAreaFilled(false);
        jButtonConfirmarRemocao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarRemocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarRemocaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarRemocao, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 548, 282, 33));

        jButtonCancelarRemocao.setBorder(null);
        jButtonCancelarRemocao.setBorderPainted(false);
        jButtonCancelarRemocao.setContentAreaFilled(false);
        jButtonCancelarRemocao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarRemocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarRemocaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarRemocao, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 600, 280, 32));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasDeEstoque/telasFertilizante/img_tela_remocao_fertilizante.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldIdFertilizanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdFertilizanteActionPerformed

    }//GEN-LAST:event_jTextFieldIdFertilizanteActionPerformed

    private void jTextFieldQuantidadeEmLitrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeEmLitrosActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeEmLitrosActionPerformed

    private void jTextFieldMarcaFertilizanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMarcaFertilizanteActionPerformed

    }//GEN-LAST:event_jTextFieldMarcaFertilizanteActionPerformed

    private void jTextFieldTipoFertilizanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTipoFertilizanteActionPerformed

    }//GEN-LAST:event_jTextFieldTipoFertilizanteActionPerformed

    private void jButtonVoltarATelaAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarATelaAnteriorActionPerformed
        this.dispose();
        new TelaDeInicioFertilizante().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarATelaAnteriorActionPerformed

    private void jButtonBuscarFertilizanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarFertilizanteActionPerformed
        try {
            buscarFertilizante();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeRemocaoFertilizante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarFertilizanteActionPerformed

    private void jTextFieldQuantidadeEmSacosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeEmSacosActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeEmSacosActionPerformed

    private void jTextFieldNomeFertilizanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeFertilizanteActionPerformed

    }//GEN-LAST:event_jTextFieldNomeFertilizanteActionPerformed

    private void jButtonConfirmarRemocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarRemocaoActionPerformed
        removerFertilizante();
    }//GEN-LAST:event_jButtonConfirmarRemocaoActionPerformed

    private void jButtonCancelarRemocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarRemocaoActionPerformed
        jTextFieldMarcaFertilizante.setText("");
        jTextFieldNomeFertilizante.setText("");
        jTextFieldQuantidadeEmLitros.setText("");
        jTextFieldQuantidadeEmSacos.setText("");
        jTextFieldTipoFertilizante.setText("");
    }//GEN-LAST:event_jButtonCancelarRemocaoActionPerformed

    public void buscarFertilizante() throws SQLException {
        nomeInsumo = jTextFieldIdFertilizante.getText();
        Fertilizante fertilizanteEncontrado = controleEstoque.buscarFertilizante(nomeInsumo);

        if (fertilizanteEncontrado != null) {
            nomeFertilizanteEncontrado = fertilizanteEncontrado.getNomeFertilizante();
            marcaFertilizanteEncontrado = fertilizanteEncontrado.getMarcaFertilizante();
            tipoEncontrado = fertilizanteEncontrado.getTipoFertilizante();
            quantidadeEmSacosEncontrado = Double.toString(fertilizanteEncontrado.getQuantidadeEmSacos());
            quantidadeEmLitrosEncontrado = Double.toString(fertilizanteEncontrado.getQuantidadeEmLitros());

            jTextFieldMarcaFertilizante.setText(marcaFertilizanteEncontrado);
            jTextFieldNomeFertilizante.setText(nomeFertilizanteEncontrado);
            jTextFieldQuantidadeEmLitros.setText(quantidadeEmLitrosEncontrado);
            jTextFieldQuantidadeEmSacos.setText(quantidadeEmSacosEncontrado);
            jTextFieldTipoFertilizante.setText(tipoEncontrado);
        } else {
            JOptionPane.showMessageDialog(this, "Fertilizante não encontrado");
            jTextFieldMarcaFertilizante.setText("");
            jTextFieldNomeFertilizante.setText("");
            jTextFieldQuantidadeEmLitros.setText("");
            jTextFieldQuantidadeEmSacos.setText("");
            jTextFieldTipoFertilizante.setText("");
        }
    }

    public void removerFertilizante() {
        nomeInsumo = jTextFieldIdFertilizante.getText();
        msg = controleEstoque.removerFertilizante(nomeInsumo);
        JOptionPane.showMessageDialog(this, msg);

        jTextFieldMarcaFertilizante.setText("");
        jTextFieldNomeFertilizante.setText("");
        jTextFieldQuantidadeEmLitros.setText("");
        jTextFieldQuantidadeEmSacos.setText("");
        jTextFieldTipoFertilizante.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarFertilizante;
    private javax.swing.JButton jButtonCancelarRemocao;
    private javax.swing.JButton jButtonConfirmarRemocao;
    private javax.swing.JButton jButtonVoltarATelaAnterior;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldIdFertilizante;
    private javax.swing.JTextField jTextFieldMarcaFertilizante;
    private javax.swing.JTextField jTextFieldNomeFertilizante;
    private javax.swing.JTextField jTextFieldQuantidadeEmLitros;
    private javax.swing.JTextField jTextFieldQuantidadeEmSacos;
    private javax.swing.JTextField jTextFieldTipoFertilizante;
    // End of variables declaration//GEN-END:variables
}
