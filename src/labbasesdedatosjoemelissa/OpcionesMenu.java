package labbasesdedatosjoemelissa;

import javax.swing.JOptionPane;


public class OpcionesMenu extends javax.swing.JFrame {

    public OpcionesMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCrearNuevoExamen = new javax.swing.JButton();
        btnCrearNuevaClase = new javax.swing.JButton();
        btnCrearCategoria = new javax.swing.JButton();
        btnCrearNuevaPregunta = new javax.swing.JButton();
        btnVerClases = new javax.swing.JButton();
        btnCentroCalificaciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCrearNuevoExamen.setText("Crear Nuevo Examen");
        btnCrearNuevoExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearNuevoExamenActionPerformed(evt);
            }
        });

        btnCrearNuevaClase.setText("Crear Nueva Clase");
        btnCrearNuevaClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearNuevaClaseActionPerformed(evt);
            }
        });

        btnCrearCategoria.setText("Crear Categoria");

        btnCrearNuevaPregunta.setText("Crear Nueva Pregunta");
        btnCrearNuevaPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearNuevaPreguntaActionPerformed(evt);
            }
        });

        btnVerClases.setText("Ver Clases");

        btnCentroCalificaciones.setText("Ir a Centro de Calificaciones");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCrearNuevaPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addComponent(btnCrearNuevoExamen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCrearCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCrearNuevaClase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerClases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCentroCalificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(185, 185, 185))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCentroCalificaciones, btnCrearCategoria, btnCrearNuevaClase, btnCrearNuevaPregunta, btnCrearNuevoExamen, btnVerClases});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(btnCrearNuevoExamen)
                .addGap(31, 31, 31)
                .addComponent(btnCrearNuevaClase)
                .addGap(27, 27, 27)
                .addComponent(btnCrearCategoria)
                .addGap(31, 31, 31)
                .addComponent(btnCrearNuevaPregunta)
                .addGap(29, 29, 29)
                .addComponent(btnVerClases)
                .addGap(32, 32, 32)
                .addComponent(btnCentroCalificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCentroCalificaciones, btnCrearCategoria, btnCrearNuevaClase, btnCrearNuevaPregunta, btnCrearNuevoExamen, btnVerClases});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearNuevoExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearNuevoExamenActionPerformed
        // TODO add your handling code here:
        CrearExamen ce = new CrearExamen();
        ce.setVisible(true);
    }//GEN-LAST:event_btnCrearNuevoExamenActionPerformed

    private void btnCrearNuevaClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearNuevaClaseActionPerformed
        // TODO add your handling code here:
        String nombreClase = JOptionPane.showInputDialog(null, "Ingrese el nombre de la nueva clase: ");
        int resp = JOptionPane.showConfirmDialog(null, "Desea añadir la clase: "+nombreClase+" al sistema?");
        
        if(resp == 0) {
            System.out.println("Se añadio la clase: "+ nombreClase);
            //Si dice que si, se agrega la clase
            //Agregar clase
        }
        
    }//GEN-LAST:event_btnCrearNuevaClaseActionPerformed

    private void btnCrearNuevaPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearNuevaPreguntaActionPerformed
        // TODO add your handling code here:
        CrearPregunta cp = new CrearPregunta();
        cp.setVisible(true);
    }//GEN-LAST:event_btnCrearNuevaPreguntaActionPerformed

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
            java.util.logging.Logger.getLogger(OpcionesMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpcionesMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpcionesMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpcionesMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpcionesMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCentroCalificaciones;
    private javax.swing.JButton btnCrearCategoria;
    private javax.swing.JButton btnCrearNuevaClase;
    private javax.swing.JButton btnCrearNuevaPregunta;
    private javax.swing.JButton btnCrearNuevoExamen;
    private javax.swing.JButton btnVerClases;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
