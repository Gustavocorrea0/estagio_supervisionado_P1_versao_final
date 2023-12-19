package Estoque.CRUDFertilizante;

import Estoque.ControleEstoque;
import javax.swing.JOptionPane;

public class TelaDeCadastroFertilizante extends javax.swing.JFrame {

    private ControleEstoque controleEstoque = new ControleEstoque();
    private String nomeFertilizante;
    private String marcaFertilizante;
    private String tipo;
    private Double quantidadeEmSacos;
    private Double quantidadeEmLitros;
    private String msg;

    public TelaDeCadastroFertilizante() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTipo = new javax.swing.ButtonGroup();
        jButtonConfirmarCadastro = new javax.swing.JButton();
        jButtonCancelarCadastro = new javax.swing.JButton();
        jTextFieldQuantidadeEmLitros = new javax.swing.JTextField();
        jTextFieldMarcaFertilizante = new javax.swing.JTextField();
        jTextFieldQuantidadeEmSacos = new javax.swing.JTextField();
        jTextFieldNomeFertilizante = new javax.swing.JTextField();
        jButtonVoltarATelaAnterior = new javax.swing.JButton();
        jRadioTipoSolido = new javax.swing.JRadioButton();
        jRadioTipoLiquido = new javax.swing.JRadioButton();
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
        getContentPane().add(jButtonCancelarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 599, 280, 35));

        jTextFieldQuantidadeEmLitros.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeEmLitros.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeEmLitros.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeEmLitros.setBorder(null);
        jTextFieldQuantidadeEmLitros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeEmLitrosActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuantidadeEmLitros, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 314, 270, 30));

        jTextFieldMarcaFertilizante.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldMarcaFertilizante.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldMarcaFertilizante.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldMarcaFertilizante.setBorder(null);
        jTextFieldMarcaFertilizante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMarcaFertilizanteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMarcaFertilizante, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 314, 272, 30));

        jTextFieldQuantidadeEmSacos.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeEmSacos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeEmSacos.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeEmSacos.setBorder(null);
        jTextFieldQuantidadeEmSacos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeEmSacosActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuantidadeEmSacos, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 153, 272, 30));

        jTextFieldNomeFertilizante.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeFertilizante.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeFertilizante.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeFertilizante.setBorder(null);
        jTextFieldNomeFertilizante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeFertilizanteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeFertilizante, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 153, 272, 30));

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

        jRadioTipoSolido.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jRadioTipoSolido.setForeground(new java.awt.Color(255, 255, 255));
        jRadioTipoSolido.setText("Solido");
        jRadioTipoSolido.setBorder(null);
        jRadioTipoSolido.setContentAreaFilled(false);
        jRadioTipoSolido.setFocusable(false);
        jRadioTipoSolido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioTipoSolidoActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioTipoSolido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 120, 20));

        jRadioTipoLiquido.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jRadioTipoLiquido.setForeground(new java.awt.Color(255, 255, 255));
        jRadioTipoLiquido.setText("Liquido");
        jRadioTipoLiquido.setBorder(null);
        jRadioTipoLiquido.setContentAreaFilled(false);
        jRadioTipoLiquido.setFocusable(false);
        jRadioTipoLiquido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioTipoLiquidoActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioTipoLiquido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 120, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasDeEstoque/telasFertilizante/img_tela_cadastro_fertilizante.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldQuantidadeEmLitrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeEmLitrosActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeEmLitrosActionPerformed

    private void jTextFieldMarcaFertilizanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMarcaFertilizanteActionPerformed

    }//GEN-LAST:event_jTextFieldMarcaFertilizanteActionPerformed

    private void jButtonVoltarATelaAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarATelaAnteriorActionPerformed
        this.dispose();
        new TelaDeInicioFertilizante().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarATelaAnteriorActionPerformed

    private void jTextFieldQuantidadeEmSacosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeEmSacosActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeEmSacosActionPerformed

    private void jTextFieldNomeFertilizanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeFertilizanteActionPerformed

    }//GEN-LAST:event_jTextFieldNomeFertilizanteActionPerformed

    private void jButtonCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCadastroActionPerformed
        JOptionPane.showMessageDialog(this, "Cadastro cancelado");
        jTextFieldMarcaFertilizante.setText("");
        jTextFieldNomeFertilizante.setText("");
        jTextFieldQuantidadeEmLitros.setText("");
        jTextFieldQuantidadeEmSacos.setText("");
    }//GEN-LAST:event_jButtonCancelarCadastroActionPerformed

    private void jRadioTipoSolidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioTipoSolidoActionPerformed
        tipo = "Solido";
    }//GEN-LAST:event_jRadioTipoSolidoActionPerformed

    private void jRadioTipoLiquidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioTipoLiquidoActionPerformed
        tipo = "Liquido";
    }//GEN-LAST:event_jRadioTipoLiquidoActionPerformed

    private void jButtonConfirmarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroActionPerformed
        cadastrarFertilizante();
    }//GEN-LAST:event_jButtonConfirmarCadastroActionPerformed

    public void cadastrarFertilizante() {
        buttonGroupTipo.add(jRadioTipoSolido);
        buttonGroupTipo.add(jRadioTipoLiquido);

        nomeFertilizante = jTextFieldNomeFertilizante.getText();
        marcaFertilizante = jTextFieldMarcaFertilizante.getText();
        quantidadeEmSacos = Double.valueOf(jTextFieldQuantidadeEmSacos.getText());
        quantidadeEmLitros = Double.valueOf(jTextFieldQuantidadeEmLitros.getText());

        if (nomeFertilizante.equals("")) {
            JOptionPane.showMessageDialog(null, "Nome inválido ");
            return;
        }

        if (marcaFertilizante.equals("")) {
            JOptionPane.showMessageDialog(null, "Marca inválido ");
            return;
        }

        if (quantidadeEmSacos < 0) {
            JOptionPane.showMessageDialog(null, "Quantidade em sacos inválida ");
            return;
        }

        if (quantidadeEmLitros < 0) {
            JOptionPane.showMessageDialog(null, "Quantidade em litros inválida ");
            return;
        }

        if (buttonGroupTipo.equals(jRadioTipoSolido) && buttonGroupTipo.equals(jRadioTipoLiquido)) {
            JOptionPane.showMessageDialog(null, "Escolha apenas um tipo ");
            return;
        }

        if (buttonGroupTipo.equals("")) {
            JOptionPane.showMessageDialog(null, "Escolha apenas um tipo ");
            return;
        }

        try {
            controleEstoque.fertilizante.setNomeFertilizante(nomeFertilizante);
            controleEstoque.fertilizante.setMarcaFertilizante(marcaFertilizante);
            controleEstoque.fertilizante.setQuantidadeEmLitros(quantidadeEmLitros);
            controleEstoque.fertilizante.setQuantidadeEmSacos(quantidadeEmSacos);
            controleEstoque.fertilizante.setTipoFertilizante(tipo);

            msg = controleEstoque.cadastrarFertilizante(ControleEstoque.INCLUSAO);
            JOptionPane.showMessageDialog(this, msg);

            jTextFieldMarcaFertilizante.setText("");
            jTextFieldNomeFertilizante.setText("");
            jTextFieldQuantidadeEmLitros.setText("");
            jTextFieldQuantidadeEmSacos.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, msg);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupTipo;
    private javax.swing.JButton jButtonCancelarCadastro;
    private javax.swing.JButton jButtonConfirmarCadastro;
    private javax.swing.JButton jButtonVoltarATelaAnterior;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioTipoLiquido;
    private javax.swing.JRadioButton jRadioTipoSolido;
    private javax.swing.JTextField jTextFieldMarcaFertilizante;
    private javax.swing.JTextField jTextFieldNomeFertilizante;
    private javax.swing.JTextField jTextFieldQuantidadeEmLitros;
    private javax.swing.JTextField jTextFieldQuantidadeEmSacos;
    // End of variables declaration//GEN-END:variables
}
