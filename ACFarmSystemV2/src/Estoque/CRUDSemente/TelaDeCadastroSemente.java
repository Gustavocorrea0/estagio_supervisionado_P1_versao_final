package Estoque.CRUDSemente;

import Estoque.ControleEstoque;
import javax.swing.JOptionPane;

public class TelaDeCadastroSemente extends javax.swing.JFrame {

    private ControleEstoque controleEstoque = new ControleEstoque();
    private String nomeSemente;
    private String marcaSemente;
    private Double quantidadeEmSacos;
    private Double quantidadeMinima;
    private String msg;

    public TelaDeCadastroSemente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonConfirmarCadastro = new javax.swing.JButton();
        jButtonCancelarCadastro = new javax.swing.JButton();
        jTextFieldQuantidadeMinima = new javax.swing.JTextField();
        jTextFieldQuantidadeEmSacos = new javax.swing.JTextField();
        jTextFieldMarcaSemente = new javax.swing.JTextField();
        jTextFieldNomeSemente = new javax.swing.JTextField();
        jButtonVoltarATelaAnterior = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonConfirmarCadastro.setBorder(null);
        jButtonConfirmarCadastro.setBorderPainted(false);
        jButtonConfirmarCadastro.setContentAreaFilled(false);
        jButtonConfirmarCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 548, 282, 33));

        jButtonCancelarCadastro.setBorder(null);
        jButtonCancelarCadastro.setBorderPainted(false);
        jButtonCancelarCadastro.setContentAreaFilled(false);
        jButtonCancelarCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 599, 280, 33));

        jTextFieldQuantidadeMinima.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeMinima.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeMinima.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeMinima.setBorder(null);
        jTextFieldQuantidadeMinima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeMinimaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuantidadeMinima, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 152, 272, 30));

        jTextFieldQuantidadeEmSacos.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeEmSacos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeEmSacos.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeEmSacos.setBorder(null);
        jTextFieldQuantidadeEmSacos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeEmSacosActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuantidadeEmSacos, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 488, 270, 29));

        jTextFieldMarcaSemente.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldMarcaSemente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldMarcaSemente.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldMarcaSemente.setBorder(null);
        jTextFieldMarcaSemente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMarcaSementeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMarcaSemente, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 313, 272, 30));

        jTextFieldNomeSemente.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeSemente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeSemente.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeSemente.setBorder(null);
        jTextFieldNomeSemente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeSementeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeSemente, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 152, 272, 30));

        jButtonVoltarATelaAnterior.setBorder(null);
        jButtonVoltarATelaAnterior.setBorderPainted(false);
        jButtonVoltarATelaAnterior.setContentAreaFilled(false);
        jButtonVoltarATelaAnterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarATelaAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarATelaAnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarATelaAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 24, 40, 22));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasDeEstoque/telasSemente/img_tela_cadastro_semente.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldQuantidadeMinimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeMinimaActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeMinimaActionPerformed

    private void jTextFieldMarcaSementeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMarcaSementeActionPerformed

    }//GEN-LAST:event_jTextFieldMarcaSementeActionPerformed

    private void jTextFieldQuantidadeEmSacosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeEmSacosActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeEmSacosActionPerformed

    private void jButtonVoltarATelaAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarATelaAnteriorActionPerformed
        this.dispose();
        new TelaDeInicioSemente().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarATelaAnteriorActionPerformed

    private void jTextFieldNomeSementeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeSementeActionPerformed

    }//GEN-LAST:event_jTextFieldNomeSementeActionPerformed

    private void jButtonCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCadastroActionPerformed
        JOptionPane.showMessageDialog(this, "Cadastro Cancelado");
        jTextFieldMarcaSemente.setText("");
        jTextFieldNomeSemente.setText("");
        jTextFieldQuantidadeEmSacos.setText("");
        jTextFieldQuantidadeMinima.setText("");
    }//GEN-LAST:event_jButtonCancelarCadastroActionPerformed

    private void jButtonConfirmarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroActionPerformed
        cadastratrCombustivel();
    }//GEN-LAST:event_jButtonConfirmarCadastroActionPerformed

    public void cadastratrCombustivel() {
        nomeSemente = jTextFieldNomeSemente.getText();
        marcaSemente = jTextFieldMarcaSemente.getText();
        quantidadeEmSacos = Double.parseDouble(jTextFieldQuantidadeEmSacos.getText());
        quantidadeMinima = Double.parseDouble(jTextFieldQuantidadeMinima.getText());

        if (nomeSemente.equals("")) {
            JOptionPane.showMessageDialog(this, "Nome Inválido");
            return;
        }

        if (marcaSemente.equals("")) {
            JOptionPane.showMessageDialog(this, "Marca Inválida");
            return;
        }

        if (quantidadeEmSacos < 0) {
            JOptionPane.showMessageDialog(this, "Quantidade Inválida");
            return;
        }

        if (quantidadeMinima < 0) {
            JOptionPane.showMessageDialog(this, "Quantidade minima Inválida");
            return;
        }

        try {
            controleEstoque.semente.setNomeSemente(nomeSemente);
            controleEstoque.semente.setMarcaSemente(marcaSemente);
            controleEstoque.semente.setQuantidadeEmSacos(quantidadeEmSacos);
            controleEstoque.semente.setQuantidadeMinimaEmSacos(quantidadeMinima);

            msg = controleEstoque.cadastrarSemente(ControleEstoque.INCLUSAO);
            JOptionPane.showMessageDialog(this, msg);

            jTextFieldMarcaSemente.setText("");
            jTextFieldNomeSemente.setText("");
            jTextFieldQuantidadeEmSacos.setText("");
            jTextFieldQuantidadeMinima.setText("");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Falha ao cadastrar semente");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarCadastro;
    private javax.swing.JButton jButtonConfirmarCadastro;
    private javax.swing.JButton jButtonVoltarATelaAnterior;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldMarcaSemente;
    private javax.swing.JTextField jTextFieldNomeSemente;
    private javax.swing.JTextField jTextFieldQuantidadeEmSacos;
    private javax.swing.JTextField jTextFieldQuantidadeMinima;
    // End of variables declaration//GEN-END:variables
}
