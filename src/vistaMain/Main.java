/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Main.java
 *
 * Created on 29-dic-2012, 9:07:19
 */
package vistaMain;


import vista.gestorAsociado.JDGestorDeAsociado;
import java.awt.Image;
import javax.swing.Icon;


import javax.swing.ImageIcon;

import javax.swing.JOptionPane;

/**
 *
 * @author Pelaez Joel
 */
public class Main extends javax.swing.JFrame{

    /** Creates new form Main */
    public Main() {
        initComponents();
        configurarVentana();
     
    }
    /**
     * controla de que no se pueda acceder a ninguna operacion sin haberse logueado
     */ 
    
    
    private void configurarVentana(){
        setTitle("Gestion Cooperativa TECNOMATICA limitada");
        
        setIconImage(new ImageIcon("src/images/iconTecnomatica.png").getImage());
        setSize(500, 500);
        setLocationRelativeTo(this);
        
        panelLogin.setSize(330,600);
        
       
        ImageIcon img = new ImageIcon("src/images/iconUsuario.jpg");
        Icon icono = new ImageIcon(img.getImage().getScaledInstance(lblImagenUser.getWidth(), txtUser.getHeight(), Image.SCALE_DEFAULT));
        lblImagenUser.setIcon(icono);
       
       
        ImageIcon imgKey = new ImageIcon("src/images/iconKey.jpg");
        Icon iconoKey = new ImageIcon(imgKey.getImage().getScaledInstance(lblImagenKey.getWidth(), txtContraseña.getHeight(), Image.SCALE_SMOOTH));
        lblImagenKey.setIcon(iconoKey);
        panelLogin.setVisible(false);
        bloquearOpcionesXLogin();
    }
    private void bloquearOpcionesXLogin(){
        
        mnuAsociado.setVisible(false);
        mnuLibro.setVisible(false);
        mnuSigno.setVisible(false);
       
        mnuItemCerrarSesion.setVisible(false); 
        mnuSigno.setVisible(true);
    }
    
    /*
     * Activa todas las operaciones cuando el Usuario se loguea
     */
    private void ActivarOpcionesXLogin(){
       mnuAsociado.setVisible(true); 
       mnuLibro.setVisible(true); 
       mnuSigno.setVisible(true); 
       
       panelLogin.setVisible(false);
       
       mnuItemIngresar.setVisible(false);
       mnuItemCerrarSesion.setVisible(true);
     }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRectTranslucidoComplete1 = new org.edisoncor.gui.panel.PanelRectTranslucidoComplete();
        panelTranslucidoComplete1 = new org.edisoncor.gui.panel.PanelTranslucidoComplete();
        panelMain = new org.edisoncor.gui.panel.PanelImage();
        panelLogin = new org.edisoncor.gui.panel.PanelTranslucidoComplete();
        labelBackgroundTitle2 = new org.edisoncor.gui.label.LabelBackgroundTitle();
        jLabel1 = new javax.swing.JLabel();
        txtUser = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        txtContraseña = new org.edisoncor.gui.passwordField.PasswordFieldRoundIcon();
        jLabel2 = new javax.swing.JLabel();
        btnIngresar = new org.edisoncor.gui.button.ButtonRound();
        btnCancelar = new org.edisoncor.gui.button.ButtonSeven();
        lblErrorIngreso = new javax.swing.JLabel();
        lblImagenUser = new javax.swing.JLabel();
        lblImagenKey = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuItemIngresar = new javax.swing.JMenuItem();
        mnuItemCerrarSesion = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuItemSalir = new javax.swing.JMenuItem();
        mnuAsociado = new javax.swing.JMenu();
        mnuItemAddAsociado = new javax.swing.JMenuItem();
        mnuLibro = new javax.swing.JMenu();
        mnuSigno = new javax.swing.JMenu();
        mnuItemAcerca = new javax.swing.JMenuItem();
        mnuItemAyuda = new javax.swing.JMenuItem();

        javax.swing.GroupLayout panelRectTranslucidoComplete1Layout = new javax.swing.GroupLayout(panelRectTranslucidoComplete1);
        panelRectTranslucidoComplete1.setLayout(panelRectTranslucidoComplete1Layout);
        panelRectTranslucidoComplete1Layout.setHorizontalGroup(
            panelRectTranslucidoComplete1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelRectTranslucidoComplete1Layout.setVerticalGroup(
            panelRectTranslucidoComplete1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelTranslucidoComplete1Layout = new javax.swing.GroupLayout(panelTranslucidoComplete1);
        panelTranslucidoComplete1.setLayout(panelTranslucidoComplete1Layout);
        panelTranslucidoComplete1Layout.setHorizontalGroup(
            panelTranslucidoComplete1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        panelTranslucidoComplete1Layout.setVerticalGroup(
            panelTranslucidoComplete1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon("src/images/iconTecnomatica2.png").getImage());

        panelMain.setBackground(new java.awt.Color(102, 153, 255));
        panelMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoAzul2.jpg"))); // NOI18N
        panelMain.setOpaque(false);
        panelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLogin.setForeground(new java.awt.Color(255, 255, 255));

        labelBackgroundTitle2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelBackgroundTitle2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconUsuario.jpg"))); // NOI18N
        labelBackgroundTitle2.setText("Login");
        labelBackgroundTitle2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("        Usuario");

        txtUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtContraseña.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña");

        btnIngresar.setBackground(new java.awt.Color(0, 255, 204));
        btnIngresar.setText("Ingresar");
        btnIngresar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnIngresar.setOpaque(true);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 51, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.setColorBrillo(new java.awt.Color(153, 204, 255));
        btnCancelar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCancelar.setOpaque(true);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblErrorIngreso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblErrorIngreso.setForeground(new java.awt.Color(255, 255, 255));
        lblErrorIngreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblErrorIngreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconKey2.jpg"))); // NOI18N
        lblErrorIngreso.setText("gdfgdfgdfgdfgdfg");

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblImagenKey, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImagenUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(172, Short.MAX_VALUE))
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(labelBackgroundTitle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLoginLayout.createSequentialGroup()
                    .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLoginLayout.createSequentialGroup()
                            .addGap(76, 76, 76)
                            .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLoginLayout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(44, 44, 44)
                            .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLoginLayout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblErrorIngreso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelLoginLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(52, 52, 52)
                                    .addComponent(txtContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGap(33, 33, 33)))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelBackgroundTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblImagenUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblImagenKey, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLoginLayout.createSequentialGroup()
                    .addGap(85, 85, 85)
                    .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLoginLayout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jLabel2))
                        .addGroup(panelLoginLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(15, 15, 15)
                    .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLoginLayout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lblErrorIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        lblErrorIngreso.getAccessibleContext().setAccessibleName("");

        panelMain.add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 350, 260));

        jMenu1.setText("Inicio");

        mnuItemIngresar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        mnuItemIngresar.setText("Ingresar");
        mnuItemIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemIngresarActionPerformed(evt);
            }
        });
        jMenu1.add(mnuItemIngresar);

        mnuItemCerrarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        mnuItemCerrarSesion.setText("Cerrar Sesion");
        mnuItemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemCerrarSesionActionPerformed(evt);
            }
        });
        jMenu1.add(mnuItemCerrarSesion);
        jMenu1.add(jSeparator1);

        mnuItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        mnuItemSalir.setText("Salir");
        mnuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemSalirActionPerformed(evt);
            }
        });
        jMenu1.add(mnuItemSalir);

        jMenuBar1.add(jMenu1);

        mnuAsociado.setText("Asociado");

        mnuItemAddAsociado.setText("Gestor de Asociado");
        mnuItemAddAsociado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemAddAsociadoActionPerformed(evt);
            }
        });
        mnuAsociado.add(mnuItemAddAsociado);

        jMenuBar1.add(mnuAsociado);

        mnuLibro.setText("Libros");
        jMenuBar1.add(mnuLibro);

        mnuSigno.setText("?");
        mnuSigno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSignoActionPerformed(evt);
            }
        });

        mnuItemAcerca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        mnuItemAcerca.setText("Acerca de..");
        mnuItemAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemAcercaActionPerformed(evt);
            }
        });
        mnuSigno.add(mnuItemAcerca);

        mnuItemAyuda.setText("Ayuda");
        mnuSigno.add(mnuItemAyuda);

        jMenuBar1.add(mnuSigno);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void mnuItemIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemIngresarActionPerformed
     panelLogin.setVisible(true);
   //  lblErrorIngreso.setVisible(false);
    lblErrorIngreso.setText("");
    lblErrorIngreso.setIcon(null);
}//GEN-LAST:event_mnuItemIngresarActionPerformed

private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
// cuando ingrese 
    if (txtUser.getText().equalsIgnoreCase("joel")) {
       ActivarOpcionesXLogin();
       
    }else{
      // lblErrorIngreso.setVisible(true);
       lblErrorIngreso.setText("Ingreso incorrecto de datos");
     //  lblErrorIngreso.setIcon(new ImageIcon("src/images/iconKey2.jpg").getImage().getScaledInstance(lblErrorIngreso.getHeight(),lblErrorIngreso.getHeight(),Image.SCALE_DEFAULT));
        ImageIcon imgErrorLoguin = new ImageIcon("src/images/iconTecnomatica.png");
        Icon icono = new ImageIcon(imgErrorLoguin.getImage().getScaledInstance(lblErrorIngreso.getHeight(), lblErrorIngreso.getHeight(), Image.SCALE_DEFAULT));
        lblErrorIngreso.setIcon(icono);
       
       //lblErrorIngreso.setVisible(rootPaneCheckingEnabled);
    }
    
    
}//GEN-LAST:event_btnIngresarActionPerformed

private void mnuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemSalirActionPerformed
   int respuesta = JOptionPane.showConfirmDialog(panelMain, "Esta seguro de Salir?", "Cerrar Aplicacion", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,null);
    if (respuesta==0) {
      System.exit(0);   
    }
    // TODO add your handling code here:
}//GEN-LAST:event_mnuItemSalirActionPerformed

private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
 panelLogin.setVisible(false);// TODO add your handling code here:
}//GEN-LAST:event_btnCancelarActionPerformed

private void mnuItemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemCerrarSesionActionPerformed
    int respuesta = JOptionPane.showConfirmDialog(panelMain, "Esta seguro de Salir?", "Cerrar Sesion", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,null);
    if (respuesta==0) {
      bloquearOpcionesXLogin();  
      mnuItemIngresar.setVisible(true);
    }
   
    
}//GEN-LAST:event_mnuItemCerrarSesionActionPerformed

private void mnuSignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSignoActionPerformed
    
}//GEN-LAST:event_mnuSignoActionPerformed

private void mnuItemAddAsociadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemAddAsociadoActionPerformed
   new  JDGestorDeAsociado(this, true);
    // TODO add your handling code here:
}//GEN-LAST:event_mnuItemAddAsociadoActionPerformed

private void mnuItemAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemAcercaActionPerformed
 new JdialogAcerca(this, true).setVisible(true);
  
    // TODO add your handling code here:
}//GEN-LAST:event_mnuItemAcercaActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonSeven btnCancelar;
    private org.edisoncor.gui.button.ButtonRound btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private org.edisoncor.gui.label.LabelBackgroundTitle labelBackgroundTitle2;
    private javax.swing.JLabel lblErrorIngreso;
    private javax.swing.JLabel lblImagenKey;
    private javax.swing.JLabel lblImagenUser;
    private javax.swing.JMenu mnuAsociado;
    private javax.swing.JMenuItem mnuItemAcerca;
    private javax.swing.JMenuItem mnuItemAddAsociado;
    private javax.swing.JMenuItem mnuItemAyuda;
    private javax.swing.JMenuItem mnuItemCerrarSesion;
    private javax.swing.JMenuItem mnuItemIngresar;
    private javax.swing.JMenuItem mnuItemSalir;
    private javax.swing.JMenu mnuLibro;
    private javax.swing.JMenu mnuSigno;
    private org.edisoncor.gui.panel.PanelTranslucidoComplete panelLogin;
    private org.edisoncor.gui.panel.PanelImage panelMain;
    private org.edisoncor.gui.panel.PanelRectTranslucidoComplete panelRectTranslucidoComplete1;
    private org.edisoncor.gui.panel.PanelTranslucidoComplete panelTranslucidoComplete1;
    private org.edisoncor.gui.passwordField.PasswordFieldRoundIcon txtContraseña;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtUser;
    // End of variables declaration//GEN-END:variables
}
