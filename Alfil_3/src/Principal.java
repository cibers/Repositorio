import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("resources/alfil2.png")));
        setLocationRelativeTo(null);
        jMenu1.setMnemonic(KeyEvent.VK_A);
        setDefaultCloseOperation(Principal.DO_NOTHING_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("resources/alfil2.png"));
        return retValue;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCarpeta = new javax.swing.JButton();
        btnArchivos = new javax.swing.JButton();
        btnPdf = new javax.swing.JButton();
        btnImagenes = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jfCarpetas = new javax.swing.JMenuItem();
        jfEnroque = new javax.swing.JMenuItem();
        jfExtensiones = new javax.swing.JMenuItem();
        jfCaballo = new javax.swing.JMenuItem();
        jfSeparador = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jfSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ALFIL");
        setIconImage(getIconImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btnCarpeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/carpeta.png"))); // NOI18N
        btnCarpeta.setToolTipText("ORDENAR ARCHIVOS POR CARPETAS");
        btnCarpeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarpetaActionPerformed(evt);
            }
        });

        btnArchivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/archivos_50.png"))); // NOI18N
        btnArchivos.setToolTipText("ORDENAR POR TIPO DE EXTENSION");
        btnArchivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivosActionPerformed(evt);
            }
        });

        btnPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pdf.png"))); // NOI18N
        btnPdf.setToolTipText("LIMPIEZA DE PDFS NO VALIDOS");
        btnPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPdfActionPerformed(evt);
            }
        });

        btnImagenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes.png"))); // NOI18N
        btnImagenes.setToolTipText("LIMPIEZA DE IMAGENES NO VALIDAS");
        btnImagenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagenesActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/documentos_opt.png"))); // NOI18N
        jButton1.setToolTipText("LIMPIEZA DE DOCUMENTOS NO VALIDOS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/winrar.png"))); // NOI18N
        jButton2.setToolTipText("LIMPIEZA DE COMPRIMIDOS NO VALIDOS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jMenu1.setText("Archivo");

        jfCarpetas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jfCarpetas.setText("Dama - carpetas");
        jfCarpetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfCarpetasActionPerformed(evt);
            }
        });
        jMenu1.add(jfCarpetas);

        jfEnroque.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jfEnroque.setText("Enroque - imágenes");
        jfEnroque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfEnroqueActionPerformed(evt);
            }
        });
        jMenu1.add(jfEnroque);

        jfExtensiones.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jfExtensiones.setText("Peón - extensiones");
        jfExtensiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfExtensionesActionPerformed(evt);
            }
        });
        jMenu1.add(jfExtensiones);

        jfCaballo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jfCaballo.setText("Caballo - pdfs");
        jfCaballo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfCaballoActionPerformed(evt);
            }
        });
        jMenu1.add(jfCaballo);
        jMenu1.add(jfSeparador);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem1.setText("Acerca de...");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jfSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jfSalir.setText("Salir");
        jfSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jfSalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCarpeta)
                    .addComponent(btnImagenes, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnArchivos, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnCarpeta, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                        .addComponent(btnArchivos, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnImagenes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPdf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jfEnroqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfEnroqueActionPerformed
        Enroque formEnroque = new Enroque();
        formEnroque.setVisible(true);
    }//GEN-LAST:event_jfEnroqueActionPerformed

    private void jfExtensionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfExtensionesActionPerformed
        Extensiones formExtensiones = new Extensiones();
        formExtensiones.setVisible(true);
    }//GEN-LAST:event_jfExtensionesActionPerformed

    private void jfCaballoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfCaballoActionPerformed
        Caballo formCaballo = new Caballo();
        formCaballo.setVisible(true);
    }//GEN-LAST:event_jfCaballoActionPerformed

    private void jfSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jfSalirActionPerformed

    private void jfCarpetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfCarpetasActionPerformed
        Carpetas carpetas = new Carpetas();
        carpetas.setVisible(true);
    }//GEN-LAST:event_jfCarpetasActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int eleccion = JOptionPane.showConfirmDialog(null, "¿Deseas salir?");
        if (eleccion == 0) 
        {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void btnImagenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagenesActionPerformed
        Enroque enroque = new Enroque();
        enroque.setVisible(true);
    }//GEN-LAST:event_btnImagenesActionPerformed

    private void btnPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPdfActionPerformed
        Caballo caballo = new Caballo();
        caballo.setVisible(true);
    }//GEN-LAST:event_btnPdfActionPerformed

    private void btnArchivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivosActionPerformed
        Extensiones extensiones = new Extensiones();
        extensiones.setVisible(true);
    }//GEN-LAST:event_btnArchivosActionPerformed

    private void btnCarpetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarpetaActionPerformed
        Carpetas carpetas = new Carpetas();
        carpetas.setVisible(true);
    }//GEN-LAST:event_btnCarpetaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Acercade frmAcerca = new Acercade();
        frmAcerca.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Torre frmTorre = new Torre();
        frmTorre.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Peon frmPeon = new Peon();
        frmPeon.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArchivos;
    private javax.swing.JButton btnCarpeta;
    private javax.swing.JButton btnImagenes;
    private javax.swing.JButton btnPdf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jfCaballo;
    private javax.swing.JMenuItem jfCarpetas;
    private javax.swing.JMenuItem jfEnroque;
    private javax.swing.JMenuItem jfExtensiones;
    private javax.swing.JMenuItem jfSalir;
    private javax.swing.JPopupMenu.Separator jfSeparador;
    // End of variables declaration//GEN-END:variables
}
