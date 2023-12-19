package Estoque.CRUDAgrotoxico;

import Estoque.Agrotoxico;
import Estoque.ControleEstoque;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaDeAtualizacaoAgrotoxico extends javax.swing.JFrame {

    private ControleEstoque controleEstoque = new ControleEstoque();
    private String nomeAgrotoxicoEncontrado;
    private String marcaAgrotoxicoEncontrado;
    private String quantidadeEmLitrosEncontrado;
    private String quantidadeMinimaEmLitrosEncontrado;
    private String dataDeValidadeEncontrado;

    private String nomeAgrotoxicoAtualizado;
    private String marcaAgrotoxicoAtualizado;
    private Double quantidadeEmLitrosAtualizado;
    private Double quantidadeMinimaEmLitrosAtualizado;
    private String dataDeValidadeAtualizado;
    private String nomeInsumo;
    private int idInsumo;

    public TelaDeAtualizacaoAgrotoxico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldDataDeValidade = new javax.swing.JTextField();
        jTextFieldMarcaAgrotoxico = new javax.swing.JTextField();
        jTextFieldQuantidadeAgrotoxico = new javax.swing.JTextField();
        jButtonConfirmarAtualizacao = new javax.swing.JButton();
        jButtonCancelarAtualizacao = new javax.swing.JButton();
        jTextFieldIdAgrotoxico = new javax.swing.JTextField();
        jButtonSairDaTela = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jTextFieldQuantidadeMinima = new javax.swing.JTextField();
        jTextFieldNomeAgrotoxico = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldDataDeValidade.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDataDeValidade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDataDeValidade.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDataDeValidade.setBorder(null);
        jTextFieldDataDeValidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataDeValidadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDataDeValidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 228, 270, 30));

        jTextFieldMarcaAgrotoxico.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldMarcaAgrotoxico.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldMarcaAgrotoxico.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldMarcaAgrotoxico.setBorder(null);
        jTextFieldMarcaAgrotoxico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMarcaAgrotoxicoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMarcaAgrotoxico, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 390, 271, 30));

        jTextFieldQuantidadeAgrotoxico.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeAgrotoxico.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeAgrotoxico.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeAgrotoxico.setBorder(null);
        jTextFieldQuantidadeAgrotoxico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeAgrotoxicoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuantidadeAgrotoxico, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 564, 271, 30));

        jButtonConfirmarAtualizacao.setBorder(null);
        jButtonConfirmarAtualizacao.setBorderPainted(false);
        jButtonConfirmarAtualizacao.setContentAreaFilled(false);
        jButtonConfirmarAtualizacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarAtualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarAtualizacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 548, 282, 33));

        jButtonCancelarAtualizacao.setBorder(null);
        jButtonCancelarAtualizacao.setBorderPainted(false);
        jButtonCancelarAtualizacao.setContentAreaFilled(false);
        jButtonCancelarAtualizacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarAtualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarAtualizacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 600, 280, 32));

        jTextFieldIdAgrotoxico.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldIdAgrotoxico.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldIdAgrotoxico.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldIdAgrotoxico.setBorder(null);
        jTextFieldIdAgrotoxico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdAgrotoxicoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIdAgrotoxico, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 117, 272, 30));

        jButtonSairDaTela.setBorder(null);
        jButtonSairDaTela.setBorderPainted(false);
        jButtonSairDaTela.setContentAreaFilled(false);
        jButtonSairDaTela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSairDaTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairDaTelaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSairDaTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 30));

        jButtonBuscar.setBorder(null);
        jButtonBuscar.setBorderPainted(false);
        jButtonBuscar.setContentAreaFilled(false);
        jButtonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 111, 262, 42));

        jTextFieldQuantidadeMinima.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeMinima.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeMinima.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeMinima.setBorder(null);
        jTextFieldQuantidadeMinima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeMinimaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuantidadeMinima, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 390, 271, 30));

        jTextFieldNomeAgrotoxico.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeAgrotoxico.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeAgrotoxico.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeAgrotoxico.setBorder(null);
        jTextFieldNomeAgrotoxico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeAgrotoxicoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeAgrotoxico, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 228, 272, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasDeEstoque/telasAgrotoxico/img_tela_atualizacao_agrotoxico.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDataDeValidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataDeValidadeActionPerformed

    }//GEN-LAST:event_jTextFieldDataDeValidadeActionPerformed

    private void jTextFieldMarcaAgrotoxicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMarcaAgrotoxicoActionPerformed

    }//GEN-LAST:event_jTextFieldMarcaAgrotoxicoActionPerformed

    private void jTextFieldQuantidadeAgrotoxicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeAgrotoxicoActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeAgrotoxicoActionPerformed

    private void jTextFieldIdAgrotoxicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdAgrotoxicoActionPerformed

    }//GEN-LAST:event_jTextFieldIdAgrotoxicoActionPerformed

    private void jButtonSairDaTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDaTelaActionPerformed
        this.dispose();
        new TelaDeInicioAgrotoxico().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaActionPerformed

    private void jTextFieldQuantidadeMinimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeMinimaActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeMinimaActionPerformed

    private void jTextFieldNomeAgrotoxicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeAgrotoxicoActionPerformed

    }//GEN-LAST:event_jTextFieldNomeAgrotoxicoActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        try {
            consultarAgrotoxico();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAtualizacaoAgrotoxico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(TelaDeAtualizacaoAgrotoxico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonConfirmarAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarAtualizacaoActionPerformed
        try {
            atualizarAgrotoxico();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAtualizacaoAgrotoxico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonConfirmarAtualizacaoActionPerformed

    private void jButtonCancelarAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarAtualizacaoActionPerformed
        JOptionPane.showMessageDialog(null, "Atualização cancelada");
        jTextFieldDataDeValidade.setText("");
        jTextFieldIdAgrotoxico.setText("");
        jTextFieldMarcaAgrotoxico.setText("");
        jTextFieldNomeAgrotoxico.setText("");
        jTextFieldQuantidadeAgrotoxico.setText("");
        jTextFieldQuantidadeMinima.setText("");
    }//GEN-LAST:event_jButtonCancelarAtualizacaoActionPerformed

    public void consultarAgrotoxico() throws SQLException, ParseException {
        nomeInsumo = jTextFieldIdAgrotoxico.getText();
        Agrotoxico agrotoxicoEncontrado = controleEstoque.buscarAgrotoxico(nomeInsumo);

        if (agrotoxicoEncontrado != null) {

            SimpleDateFormat formatoSQL = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat formatoBrasileiro = new SimpleDateFormat("dd/MM/yyyy");

            Date data1 = formatoSQL.parse(agrotoxicoEncontrado.getDataDeValidade().toString());

            nomeAgrotoxicoEncontrado = agrotoxicoEncontrado.getNomeAgrotoxico();
            marcaAgrotoxicoEncontrado = agrotoxicoEncontrado.getMarcaAgrotoxico();
            quantidadeEmLitrosEncontrado = Double.toString(agrotoxicoEncontrado.getQuantidadeEmLitros());
            quantidadeMinimaEmLitrosEncontrado = Double.toString(agrotoxicoEncontrado.getQuantidadeMinimaEmLitros());
            dataDeValidadeEncontrado = formatoBrasileiro.format(data1);

            jTextFieldDataDeValidade.setText(dataDeValidadeEncontrado);
            jTextFieldMarcaAgrotoxico.setText(marcaAgrotoxicoEncontrado);
            jTextFieldNomeAgrotoxico.setText(nomeAgrotoxicoEncontrado);
            jTextFieldQuantidadeAgrotoxico.setText(quantidadeEmLitrosEncontrado);
            jTextFieldQuantidadeMinima.setText(quantidadeMinimaEmLitrosEncontrado);
            
            idInsumo = agrotoxicoEncontrado.getIdAgrotoxico();
        } else {
            JOptionPane.showMessageDialog(this, "Agrotoxico não encontrado");
            jTextFieldDataDeValidade.setText("");
            jTextFieldIdAgrotoxico.setText("");
            jTextFieldMarcaAgrotoxico.setText("");
            jTextFieldNomeAgrotoxico.setText("");
            jTextFieldQuantidadeAgrotoxico.setText("");
            jTextFieldQuantidadeMinima.setText("");
        }
    }

    public void atualizarAgrotoxico() throws SQLException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        nomeAgrotoxicoAtualizado = jTextFieldNomeAgrotoxico.getText();
        marcaAgrotoxicoAtualizado = jTextFieldMarcaAgrotoxico.getText();
        quantidadeEmLitrosAtualizado = Double.parseDouble(jTextFieldQuantidadeAgrotoxico.getText());
        quantidadeMinimaEmLitrosAtualizado = Double.parseDouble(jTextFieldQuantidadeMinima.getText());
        dataDeValidadeAtualizado = jTextFieldDataDeValidade.getText();

        if (nomeAgrotoxicoAtualizado.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Nome Inválido");
            return;
        }

        if (marcaAgrotoxicoAtualizado.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Marca Inválida");
            return;
        }

        if (quantidadeEmLitrosAtualizado < 0) {
            JOptionPane.showMessageDialog(this, "Quantidade Inválida");
            return;
        }

        if (quantidadeMinimaEmLitrosAtualizado < 0) {
            JOptionPane.showMessageDialog(this, "Quantidade minima Inválida");
            return;
        }

        try {
            Date dataDeValidadeAtualizada = dateFormat.parse(dataDeValidadeAtualizado);
            Agrotoxico agrotoxicoAtualizado = new Agrotoxico();

            agrotoxicoAtualizado.setNomeAgrotoxico(nomeAgrotoxicoAtualizado);
            agrotoxicoAtualizado.setMarcaAgrotoxico(marcaAgrotoxicoAtualizado);
            agrotoxicoAtualizado.setQuantidadeMinimaEmLitros(quantidadeMinimaEmLitrosAtualizado);
            agrotoxicoAtualizado.setQuantidadeEmLitros(quantidadeEmLitrosAtualizado);
            agrotoxicoAtualizado.setDataDeValidade(dataDeValidadeAtualizada);
            agrotoxicoAtualizado.setIdAgrotoxico(idInsumo);

            controleEstoque = new ControleEstoque();
            String msgAtualizacao = controleEstoque.atualizarAgrotoxico(agrotoxicoAtualizado);
            JOptionPane.showMessageDialog(null, msgAtualizacao);

        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Formato de data inválido, o formato é dd/mm/aaaa.");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelarAtualizacao;
    private javax.swing.JButton jButtonConfirmarAtualizacao;
    private javax.swing.JButton jButtonSairDaTela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldDataDeValidade;
    private javax.swing.JTextField jTextFieldIdAgrotoxico;
    private javax.swing.JTextField jTextFieldMarcaAgrotoxico;
    private javax.swing.JTextField jTextFieldNomeAgrotoxico;
    private javax.swing.JTextField jTextFieldQuantidadeAgrotoxico;
    private javax.swing.JTextField jTextFieldQuantidadeMinima;
    // End of variables declaration//GEN-END:variables
}
