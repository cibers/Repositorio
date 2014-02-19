import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Carpetas extends javax.swing.JFrame {

    public Carpetas() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(Principal.DO_NOTHING_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfArchivos = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        lbRuta = new javax.swing.JLabel();
        txtRuta = new javax.swing.JTextField();
        lbTotalArchivos = new javax.swing.JLabel();
        btnRuta = new javax.swing.JButton();
        btnComenzar = new javax.swing.JButton();
        lbArchivos = new javax.swing.JLabel();
        txtArchivos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alfil - Archivos por carpeta");
        setIconImage(getIconImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lbRuta.setText("Selecciona el directorio");

        lbTotalArchivos.setText("Número total de archivos:");

        btnRuta.setText("...");
        btnRuta.setToolTipText("Selecciona la ruta");
        btnRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutaActionPerformed(evt);
            }
        });

        btnComenzar.setText("Comenzar");
        btnComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComenzarActionPerformed(evt);
            }
        });

        lbArchivos.setText("Introduce el número de archivos por carpeta");

        txtArchivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArchivosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Ordenar archivos por carpetas");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/carpeta.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbRuta)
                                .addComponent(lbTotalArchivos)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnRuta))
                                .addComponent(lbArchivos)
                                .addComponent(txtArchivos, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnComenzar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(lbRuta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRuta)
                    .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbTotalArchivos)
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addComponent(lbArchivos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtArchivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnComenzar)
                .addContainerGap())
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("resources/alfil2.png"));
        return retValue;
    }
    private void btnRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRutaActionPerformed
        jfArchivos.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if (jfArchivos.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            txtRuta.setText(jfArchivos.getSelectedFile().getAbsolutePath());
        } else {
            JOptionPane.showMessageDialog(btnComenzar, "Debes introducir una ruta valida", "Alfil", 2);
        }
        File carpeta = new File(txtRuta.getText());
        String ficheros[] = carpeta.list();//etiqueta que visualiza los ficheros listados
        lbTotalArchivos.setText("Número total de archivos: " + ficheros.length);
    }//GEN-LAST:event_btnRutaActionPerformed

    private void btnComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComenzarActionPerformed
        String barra = null;
        int carpetas = 0;
        int archivosPorCarpeta = 0;
        String sistemaOperativo = System.getProperty("os.name");
        try {
            archivosPorCarpeta = Integer.parseInt(txtArchivos.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, "Debes introducir un número de archivos por carpeta válido", "Alfil", 2);
            txtArchivos.setText("");
            txtArchivos.requestFocus();
        }
        if (sistemaOperativo.equals("Windows XP") | sistemaOperativo.equals("Windows 7") | sistemaOperativo.equals("Windows 8")) {
            barra = "\\";
        } else {
            barra = "//";
        }
        File directorio = new File(txtRuta.getText());
        File[] archivos = directorio.listFiles();
        if (txtRuta.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Debes introducir una ruta válida", "Alfil", 2);
            txtRuta.requestFocus();
        }
        else
        {
            carpetas = archivos.length / archivosPorCarpeta;
        }
        if (carpetas >= archivos.length) {
            JOptionPane.showMessageDialog(rootPane, "El número de archivos es superior al número de carpetas, reduce el número de archivos por carpeta", "Error", 2);
        } else {
            for (int i = 0; i <= carpetas; i++) {
                File carpeta = new File(txtRuta.getText() + barra + i);
                carpeta.mkdir();//creamos las carpetas
            }
            int contador = 0;
            try {
                for (int z = 0; z <= carpetas; z++) {
                    for (int j = 0; j <= archivosPorCarpeta; j++) {
                        String origen = txtRuta.getText() + barra + archivos[j + contador].getName();
                        String destino = txtRuta.getText() + barra + z + barra + archivos[j + contador].getName();
                        Path source = Paths.get(origen);
                        Path target = Paths.get(destino);
                        try {
                            Files.move(source, target);
                        } catch (IOException ex) {
                        }
                    }
                    contador += archivosPorCarpeta;
                }
            } catch (ArrayIndexOutOfBoundsException ex) {
                JOptionPane.showMessageDialog(btnComenzar, "Todos los ficheros han sido movidos correctamente", "Alfil", 1);
            }
    }//GEN-LAST:event_btnComenzarActionPerformed
    }
    private void txtArchivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArchivosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArchivosActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int eleccion = JOptionPane.showConfirmDialog(null, "¿Deseas salir?");
        if (eleccion == 0) 
        {
            dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Carpetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carpetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carpetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carpetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carpetas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComenzar;
    private javax.swing.JButton btnRuta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFileChooser jfArchivos;
    private javax.swing.JLabel lbArchivos;
    private javax.swing.JLabel lbRuta;
    private javax.swing.JLabel lbTotalArchivos;
    private javax.swing.JTextField txtArchivos;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}
