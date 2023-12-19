package acfarmsystemv2.telaDeInicio;

import Estoque.TelaDeInicioEstoque;
import Maquina.TelaDeInicioMaquinas;
import Propriedade.TelaDeInicioPropriedade;
import Subdivisao.TelaDeInicioSubdivisao;
import Veiculo.TelaDeEscolhaTipoDeVeiculo;
import planta.TelaDeInicioPlanta;
import producao.TelaDeInicioProducao;
import usuario.TelaDeInicioUsuario;

public class TelaDeInicio extends javax.swing.JFrame {

    public TelaDeInicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAcessarEstoque = new javax.swing.JButton();
        jButtonAcessarMaquinas = new javax.swing.JButton();
        jButtonAcessarControlePlanta = new javax.swing.JButton();
        jButtonAcessarProducao = new javax.swing.JButton();
        jButtonAcessarPropriedade = new javax.swing.JButton();
        jButtonAcessarSubdivisao = new javax.swing.JButton();
        jButtonAcessarUsuario = new javax.swing.JButton();
        jButtonAcessarVeiculos = new javax.swing.JButton();
        jButtonVoltarAoLogin = new javax.swing.JButton();
        jButtonEquipe = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAcessarEstoque.setBorder(null);
        jButtonAcessarEstoque.setBorderPainted(false);
        jButtonAcessarEstoque.setContentAreaFilled(false);
        jButtonAcessarEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarEstoqueActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 270, 136, 35));

        jButtonAcessarMaquinas.setBorder(null);
        jButtonAcessarMaquinas.setBorderPainted(false);
        jButtonAcessarMaquinas.setContentAreaFilled(false);
        jButtonAcessarMaquinas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarMaquinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarMaquinasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarMaquinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 136, 35));

        jButtonAcessarControlePlanta.setBorder(null);
        jButtonAcessarControlePlanta.setBorderPainted(false);
        jButtonAcessarControlePlanta.setContentAreaFilled(false);
        jButtonAcessarControlePlanta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarControlePlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarControlePlantaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarControlePlanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 138, 35));

        jButtonAcessarProducao.setToolTipText("");
        jButtonAcessarProducao.setBorder(null);
        jButtonAcessarProducao.setBorderPainted(false);
        jButtonAcessarProducao.setContentAreaFilled(false);
        jButtonAcessarProducao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarProducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarProducaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(733, 270, 136, 35));

        jButtonAcessarPropriedade.setToolTipText("");
        jButtonAcessarPropriedade.setBorder(null);
        jButtonAcessarPropriedade.setBorderPainted(false);
        jButtonAcessarPropriedade.setContentAreaFilled(false);
        jButtonAcessarPropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 547, 136, 35));

        jButtonAcessarSubdivisao.setToolTipText("");
        jButtonAcessarSubdivisao.setBorder(null);
        jButtonAcessarSubdivisao.setBorderPainted(false);
        jButtonAcessarSubdivisao.setContentAreaFilled(false);
        jButtonAcessarSubdivisao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarSubdivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarSubdivisaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarSubdivisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 546, 136, 35));

        jButtonAcessarUsuario.setBorder(null);
        jButtonAcessarUsuario.setBorderPainted(false);
        jButtonAcessarUsuario.setContentAreaFilled(false);
        jButtonAcessarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 547, 137, 35));

        jButtonAcessarVeiculos.setBorder(null);
        jButtonAcessarVeiculos.setBorderPainted(false);
        jButtonAcessarVeiculos.setContentAreaFilled(false);
        jButtonAcessarVeiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarVeiculosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarVeiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(733, 547, 136, 35));

        jButtonVoltarAoLogin.setBorder(null);
        jButtonVoltarAoLogin.setBorderPainted(false);
        jButtonVoltarAoLogin.setContentAreaFilled(false);
        jButtonVoltarAoLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarAoLogin.setDefaultCapable(false);
        jButtonVoltarAoLogin.setFocusPainted(false);
        jButtonVoltarAoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarAoLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarAoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 30, 44, 27));

        jButtonEquipe.setBorder(null);
        jButtonEquipe.setBorderPainted(false);
        jButtonEquipe.setContentAreaFilled(false);
        jButtonEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEquipeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEquipe, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 7, 84, 73));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_tela_de_inicio.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAcessarControlePlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarControlePlantaActionPerformed
        this.dispose();
        new TelaDeInicioPlanta().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarControlePlantaActionPerformed

    private void jButtonVoltarAoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoLoginActionPerformed
        this.dispose();
        new TelaDeLogin().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoLoginActionPerformed

    private void jButtonAcessarPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarPropriedadeActionPerformed
        this.dispose();
        new TelaDeInicioPropriedade().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarPropriedadeActionPerformed

    private void jButtonAcessarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarUsuarioActionPerformed
        this.dispose();
        new TelaDeInicioUsuario().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarUsuarioActionPerformed

    private void jButtonAcessarVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarVeiculosActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TelaDeEscolhaTipoDeVeiculo().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarVeiculosActionPerformed

    private void jButtonAcessarProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarProducaoActionPerformed
        this.dispose();
        new TelaDeInicioProducao().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarProducaoActionPerformed

    private void jButtonAcessarMaquinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarMaquinasActionPerformed
        this.dispose();
        new TelaDeInicioMaquinas().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarMaquinasActionPerformed

    private void jButtonAcessarSubdivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarSubdivisaoActionPerformed
        this.dispose();
        new TelaDeInicioSubdivisao().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarSubdivisaoActionPerformed

    private void jButtonAcessarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarEstoqueActionPerformed
        this.dispose();
        new TelaDeInicioEstoque().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarEstoqueActionPerformed

    private void jButtonEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEquipeActionPerformed
        this.dispose();
        new TelaDeEsterEgg().setVisible(true);
    }//GEN-LAST:event_jButtonEquipeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcessarControlePlanta;
    private javax.swing.JButton jButtonAcessarEstoque;
    private javax.swing.JButton jButtonAcessarMaquinas;
    private javax.swing.JButton jButtonAcessarProducao;
    private javax.swing.JButton jButtonAcessarPropriedade;
    private javax.swing.JButton jButtonAcessarSubdivisao;
    private javax.swing.JButton jButtonAcessarUsuario;
    private javax.swing.JButton jButtonAcessarVeiculos;
    private javax.swing.JButton jButtonEquipe;
    private javax.swing.JButton jButtonVoltarAoLogin;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
