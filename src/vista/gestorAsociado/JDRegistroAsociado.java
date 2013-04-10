/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.gestorAsociado;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Alumno
 */
public class JDRegistroAsociado extends javax.swing.JDialog {

    
    
    int BotonOperacion;

    private int getBotonOperacion() {
        return BotonOperacion;
    }

    private void setBotonOperacion(int BotonOperacion) {
        this.BotonOperacion = BotonOperacion;
    }
    /**
     * Creates new form JDRegistroAsociado
     */
    public JDRegistroAsociado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAsociado = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        btnInfAsociado = new javax.swing.JButton();
        btnAlta = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        rbtnVaron = new javax.swing.JRadioButton();
        rdbtnMujer = new javax.swing.JRadioButton();
        btnBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        rbtnActivoSI = new javax.swing.JRadioButton();
        rbtnActivoNO = new javax.swing.JRadioButton();
        rbtnRecibido = new javax.swing.JRadioButton();
        rbtnEstudiante = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Asociado");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Asociado");

        tablaAsociado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "ASOCIADO", "CARGO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaAsociado);

        jLabel2.setText("Buscar Por Nombre");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setOpaque(false);

        btnInfAsociado.setBackground(new java.awt.Color(255, 255, 255));
        btnInfAsociado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_16.png"))); // NOI18N
        btnInfAsociado.setFocusable(false);
        btnInfAsociado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInfAsociado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInfAsociado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfAsociadoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnInfAsociado);

        btnAlta.setBackground(new java.awt.Color(255, 255, 255));
        btnAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus_16.png"))); // NOI18N
        btnAlta.setFocusable(false);
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAlta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(533, 533, 533))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                        .addGap(536, 536, 536))
                    .addComponent(jScrollPane1)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jTabbedPane1.addTab("ASOCIADO", jPanel1);

        jLabel4.setText("Sexo");
        jLabel4.setBounds(20, 160, 24, 14);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setText("DNI");
        jLabel3.setBounds(20, 120, 33, 23);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        txtDni.setBounds(60, 130, 108, 20);
        jLayeredPane1.add(txtDni, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buttonGroup1.add(rbtnVaron);
        rbtnVaron.setText("varon");
        rbtnVaron.setBounds(80, 150, 53, 23);
        jLayeredPane1.add(rbtnVaron, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buttonGroup1.add(rdbtnMujer);
        rdbtnMujer.setText("mujer");
        rdbtnMujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnMujerActionPerformed(evt);
            }
        });
        rdbtnMujer.setBounds(80, 180, 53, 23);
        jLayeredPane1.add(rdbtnMujer, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnBuscar.setText("Buscar");
        btnBuscar.setBounds(180, 120, 65, 23);
        jLayeredPane1.add(btnBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setText("Socio Activo ?");
        jLabel5.setBounds(200, 160, 66, 14);
        jLayeredPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buttonGroup2.add(rbtnActivoSI);
        rbtnActivoSI.setText("SI");
        rbtnActivoSI.setBounds(280, 150, 35, 23);
        jLayeredPane1.add(rbtnActivoSI, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buttonGroup2.add(rbtnActivoNO);
        rbtnActivoNO.setText("NO");
        rbtnActivoNO.setBounds(280, 180, 41, 23);
        jLayeredPane1.add(rbtnActivoNO, javax.swing.JLayeredPane.DEFAULT_LAYER);

        rbtnRecibido.setText("Socio Recibido");
        rbtnRecibido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnRecibidoActionPerformed(evt);
            }
        });
        rbtnRecibido.setBounds(350, 150, 93, 23);
        jLayeredPane1.add(rbtnRecibido, javax.swing.JLayeredPane.DEFAULT_LAYER);

        rbtnEstudiante.setText("Socio Estudiante");
        rbtnEstudiante.setBounds(350, 170, 105, 23);
        jLayeredPane1.add(rbtnEstudiante, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane1.addTab("BUSQUEDA AVANZADA", jLayeredPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbtnMujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnMujerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnMujerActionPerformed

    private void rbtnRecibidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnRecibidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnRecibidoActionPerformed

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        // alta de asosciado =  btnOperacion =1
        setBotonOperacion(1);
        JdAsociado ventanaAsociado = new JdAsociado(null, true,getBotonOperacion());     
        ventanaAsociado.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAltaActionPerformed

    private void btnInfAsociadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfAsociadoActionPerformed
        // Informacion de contacto =  botonOperacion=1
        setBotonOperacion(2);
        JdAsociado ventanaAsociado = new JdAsociado(null, rootPaneCheckingEnabled, getBotonOperacion());
        ventanaAsociado.setVisible(true);
    }//GEN-LAST:event_btnInfAsociadoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

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
            java.util.logging.Logger.getLogger(JDRegistroAsociado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDRegistroAsociado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDRegistroAsociado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDRegistroAsociado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDRegistroAsociado dialog = new JDRegistroAsociado(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnInfAsociado;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JRadioButton rbtnActivoNO;
    private javax.swing.JRadioButton rbtnActivoSI;
    private javax.swing.JRadioButton rbtnEstudiante;
    private javax.swing.JRadioButton rbtnRecibido;
    private javax.swing.JRadioButton rbtnVaron;
    private javax.swing.JRadioButton rdbtnMujer;
    private javax.swing.JTable tablaAsociado;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
