package acfarmsystemv2.telaDeInicio;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import usuario.Usuario;

public class TelaDeLogin extends javax.swing.JFrame {

    ControleUsuario controleUsuario = new ControleUsuario();

    public TelaDeLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonEntrar = new javax.swing.JButton();
        jTextNomeUsuario = new javax.swing.JTextField();
        jPasswordSenhaDoUsuario = new javax.swing.JPasswordField();
        jButtonEncerrarSistema = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonEntrar.setBorder(null);
        jButtonEntrar.setBorderPainted(false);
        jButtonEntrar.setContentAreaFilled(false);
        jButtonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEntrar.setFocusable(false);
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 417, 405, 50));

        jTextNomeUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jTextNomeUsuario.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jTextNomeUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jTextNomeUsuario.setBorder(null);
        getContentPane().add(jTextNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 222, 404, 45));

        jPasswordSenhaDoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordSenhaDoUsuario.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jPasswordSenhaDoUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordSenhaDoUsuario.setBorder(null);
        getContentPane().add(jPasswordSenhaDoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 307, 405, 45));

        jButtonEncerrarSistema.setBorder(null);
        jButtonEncerrarSistema.setBorderPainted(false);
        jButtonEncerrarSistema.setContentAreaFilled(false);
        jButtonEncerrarSistema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEncerrarSistema.setFocusPainted(false);
        jButtonEncerrarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEncerrarSistemaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEncerrarSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 10, 50, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_tela_de_login.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        try {
            executarLogin();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jButtonEncerrarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEncerrarSistemaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonEncerrarSistemaActionPerformed

    public void executarLogin() throws SQLException {
        String nome = jTextNomeUsuario.getText();
        String senha = jPasswordSenhaDoUsuario.getText();
        Usuario usuarioEncontrado = controleUsuario.executarLogin(nome, senha);

        if (usuarioEncontrado != null) {
            this.dispose();
            new TelaDeInicio().setVisible(true);
        } else {
            jTextNomeUsuario.setText("");
            jPasswordSenhaDoUsuario.setText("");
            JOptionPane.showMessageDialog(null, "Dados Inválidos");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEncerrarSistema;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordSenhaDoUsuario;
    private javax.swing.JTextField jTextNomeUsuario;
    // End of variables declaration//GEN-END:variables
}
