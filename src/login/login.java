/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package login;

import tools.UtilsGUI;
/**
 *
 * @author Alex
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        configComponents();
    }
    	
        private void configComponents(){
        // Titulo de la ventana
        setTitle("Iniciar sesión");
        // posición de la ventana
        setLocationRelativeTo(null);		    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        ZORRIANA = new javax.swing.JLabel();
        LOGO = new javax.swing.JLabel();
        FONDO = new javax.swing.JLabel();
        iniciarsesion = new javax.swing.JLabel();
        UsrTitle = new javax.swing.JLabel();
        UsrTxtF = new javax.swing.JTextField();
        UsrSep = new javax.swing.JSeparator();
        PswTitle = new javax.swing.JLabel();
        PswField = new javax.swing.JPasswordField();
        PswSep = new javax.swing.JSeparator();
        BTNEntrar = new javax.swing.JPanel();
        LblEntrar = new javax.swing.JLabel();
        BTNCancelar = new javax.swing.JPanel();
        LblCancelar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage( getClass().getResource("/img/icono.png")));
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setName("Iniciar Sesión"); // NOI18N
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ZORRIANA.setFont(new java.awt.Font("Jost", 1, 36)); // NOI18N
        ZORRIANA.setForeground(new java.awt.Color(240, 240, 240));
        ZORRIANA.setText("ZORRIANA");
        ZORRIANA.setToolTipText("");
        bg.add(ZORRIANA, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 200, 50));

        LOGO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoblanco.png"))); // NOI18N
        bg.add(LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 290, 210));

        FONDO.setBackground(new java.awt.Color(247, 139, 86));
        FONDO.setForeground(new java.awt.Color(247, 139, 86));
        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/warehouse.png"))); // NOI18N
        bg.add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 500));

        iniciarsesion.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        iniciarsesion.setText("INICIAR SESIÓN");
        bg.add(iniciarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 270, 50));

        UsrTitle.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        UsrTitle.setText("USUARIO");
        bg.add(UsrTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 80, 30));

        UsrTxtF.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        UsrTxtF.setForeground(new java.awt.Color(204, 204, 204));
        UsrTxtF.setText("Ingrese su usuario");
        UsrTxtF.setBorder(null);
        UsrTxtF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UsrTxtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsrTxtFActionPerformed(evt);
            }
        });
        bg.add(UsrTxtF, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 270, 30));
        bg.add(UsrSep, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 270, 20));

        PswTitle.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        PswTitle.setText("CONTRASEÑA");
        bg.add(PswTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 110, 30));

        PswField.setForeground(new java.awt.Color(204, 204, 204));
        PswField.setText("Inserte su contraseña");
        PswField.setBorder(null);
        PswField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bg.add(PswField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 270, 30));
        bg.add(PswSep, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 270, 20));

        BTNEntrar.setBackground(new java.awt.Color(0, 204, 51));
        BTNEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        LblEntrar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        LblEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblEntrar.setText("ENTRAR");

        javax.swing.GroupLayout BTNEntrarLayout = new javax.swing.GroupLayout(BTNEntrar);
        BTNEntrar.setLayout(BTNEntrarLayout);
        BTNEntrarLayout.setHorizontalGroup(
            BTNEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BTNEntrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addContainerGap())
        );
        BTNEntrarLayout.setVerticalGroup(
            BTNEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BTNEntrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg.add(BTNEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 130, 40));

        BTNCancelar.setBackground(new java.awt.Color(255, 51, 51));

        LblCancelar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        LblCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblCancelar.setText("CANCELAR");
        LblCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LblCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblCancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BTNCancelarLayout = new javax.swing.GroupLayout(BTNCancelar);
        BTNCancelar.setLayout(BTNCancelarLayout);
        BTNCancelarLayout.setHorizontalGroup(
            BTNCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LblCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        BTNCancelarLayout.setVerticalGroup(
            BTNCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LblCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(BTNCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsrTxtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsrTxtFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsrTxtFActionPerformed

    private void LblCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblCancelarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_LblCancelarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BTNCancelar;
    private javax.swing.JPanel BTNEntrar;
    private javax.swing.JLabel FONDO;
    private javax.swing.JLabel LOGO;
    private javax.swing.JLabel LblCancelar;
    private javax.swing.JLabel LblEntrar;
    private javax.swing.JPasswordField PswField;
    private javax.swing.JSeparator PswSep;
    private javax.swing.JLabel PswTitle;
    private javax.swing.JSeparator UsrSep;
    private javax.swing.JLabel UsrTitle;
    private javax.swing.JTextField UsrTxtF;
    private javax.swing.JLabel ZORRIANA;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel iniciarsesion;
    // End of variables declaration//GEN-END:variables
}
