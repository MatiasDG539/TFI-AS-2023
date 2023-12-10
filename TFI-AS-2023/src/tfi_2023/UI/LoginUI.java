package tfi_2023.UI;

import tfi_2023.Controlador.Controlador;
import java.awt.Color;
import javax.swing.JTextField;

public class LoginUI extends javax.swing.JFrame {

    
    public LoginUI() {
        initComponents();
        
        getContentPane().setBackground(Color.DARK_GRAY);
    }
    
    public void setControlator(Controlador control){
        loginButton.addActionListener(control);
    }
    public void execute(){
        this.setVisible(true);
    }
    public String getUserName(){
        return userName.getText();
    }
    public String getPassword(){
        return password.getText();
    }
    
    public JTextField getConexionPrologODBC(){
        return conexionPrologODBC;
    }
    
    public void setConexionPrologODBC(JTextField conexionPrologODBC){
        this.conexionPrologODBC = conexionPrologODBC;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        userLabel = new java.awt.Label();
        passwordField = new java.awt.Label();
        userName = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        conexionPrologODBC = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estudio Juridico Pillitteri & Asoc - LOGIN");
        setBackground(java.awt.Color.darkGray);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        titleLabel.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        titleLabel.setForeground(java.awt.Color.white);
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("INICIO DE SESION");

        userLabel.setAlignment(java.awt.Label.CENTER);
        userLabel.setBackground(java.awt.Color.darkGray);
        userLabel.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        userLabel.setForeground(java.awt.Color.white);
        userLabel.setName(""); // NOI18N
        userLabel.setText("Usuario");

        passwordField.setAlignment(java.awt.Label.CENTER);
        passwordField.setBackground(java.awt.Color.darkGray);
        passwordField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        passwordField.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        passwordField.setForeground(java.awt.Color.white);
        passwordField.setName(""); // NOI18N
        passwordField.setText("Contraseña");

        userName.setBackground(new java.awt.Color(204, 204, 204));
        userName.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        userName.setForeground(new java.awt.Color(0, 0, 0));
        userName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userName.setCaretColor(new java.awt.Color(0, 0, 0));
        userName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        password.setBackground(new java.awt.Color(204, 204, 204));
        password.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        password.setForeground(new java.awt.Color(0, 0, 0));
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setCaretColor(new java.awt.Color(0, 0, 0));
        password.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        loginButton.setBackground(new java.awt.Color(204, 204, 204));
        loginButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(0, 0, 0));
        loginButton.setText("Iniciar sesion");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        conexionPrologODBC.setEditable(false);
        conexionPrologODBC.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        conexionPrologODBC.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(conexionPrologODBC, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(userName)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))
                    .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(209, 209, 209))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(conexionPrologODBC, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        ListaConsorciosUI ListConsorciosUI = new ListaConsorciosUI();
        ListConsorciosUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginButtonMouseClicked

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed

    }//GEN-LAST:event_loginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField conexionPrologODBC;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField password;
    private java.awt.Label passwordField;
    private javax.swing.JLabel titleLabel;
    private java.awt.Label userLabel;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
