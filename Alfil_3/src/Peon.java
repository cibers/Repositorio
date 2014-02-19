import java.awt.Image;
import java.awt.Toolkit;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

public class Peon extends javax.swing.JFrame {

    private static final String[] COMPRIMIDOS = {"rar", "tar", "jar", "gz", "tgz", "zip"};
    boolean comprimido_rar = true, comprimido_zip = true, comprimido_tar = true, comprimido_gz = true, comprimido_tgz = true, comprimido_jar = true;

    public Peon() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(Principal.DO_NOTHING_ON_CLOSE);
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("resources/alfil2.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfArchivos = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        lbRuta = new javax.swing.JLabel();
        txtRuta = new javax.swing.JTextField();
        btnRuta = new javax.swing.JButton();
        lbArchivos = new javax.swing.JLabel();
        btnComenzar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbRuta.setText("Selecciona el directorio");

        btnRuta.setText("...");
        btnRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutaActionPerformed(evt);
            }
        });

        lbArchivos.setText("Número total de documentos:");

        btnComenzar.setText("Comenzar");
        btnComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComenzarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/winrar.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Limpieza de comprimidos no válidos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lbRuta)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbArchivos, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnComenzar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRuta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addComponent(lbRuta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRuta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbArchivos)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComenzar)
                    .addComponent(btnSalir))
                .addGap(0, 13, Short.MAX_VALUE))
        );

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

    private void btnRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRutaActionPerformed
        jfArchivos.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if (jfArchivos.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            txtRuta.setText(jfArchivos.getSelectedFile().getAbsolutePath());
        } else {
            JOptionPane.showMessageDialog(btnComenzar, "Debes introducir una ruta valida", "Torre", 2);
            btnRuta.requestFocus();
        }
        File carpeta = new File(txtRuta.getText());
        String ficheros[] = carpeta.list();//etiqueta que visualiza los ficheros listados
        lbArchivos.setText("Número total de documentos: " + ficheros.length);
    }//GEN-LAST:event_btnRutaActionPerformed

    public static String getExtensionFile(String filename) {
        File f = new File(filename);
        if (f == null || f.isDirectory()) {
            return "Has seleccionado un directorio vacio o nulo";
        } else if (f.isFile()) {
            int index = filename.lastIndexOf('.');
            if (index == -1) {
                return "";
            } else {
                System.out.println(filename.substring(index + 1));
                return filename.substring(index + 1);
            }
        } else {
            return "¿que has seleccionado?";
        }
    }

    public static boolean isMimeType(byte[] b, String mime) throws IOException, SAXException, TikaException {
        boolean res = false;
        InputStream is = new ByteArrayInputStream(b);

        ContentHandler contenthandler = new BodyContentHandler();
        Metadata metadata = new Metadata();
        metadata.set(Metadata.RESOURCE_NAME_KEY, "temporal");
        Parser parser = new AutoDetectParser();
        //OOXMLParser parser = new OOXMLParser();
        ParseContext context = new ParseContext();
        parser.parse(is, contenthandler, metadata, context);
        if (mime.trim().toLowerCase().equals(
                metadata.get(Metadata.CONTENT_TYPE).trim().toLowerCase())) {
            res = true;
        }
        return res;
    }

    private static byte[] getBytesFromFile(File file) throws IOException {
        InputStream is = new FileInputStream(file);
        long length = file.length();
        if (length > Integer.MAX_VALUE) {
        }
        byte[] bytes = new byte[(int) length];
        int offset = 0;
        int numRead = 0;
        while (offset < bytes.length
                && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
            offset += numRead;
        }
        if (offset < bytes.length) {
            throw new IOException("No se ha podido leer el archivo completo " + file.getName());
        }
        is.close();
        return bytes;
    }
    private void btnComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComenzarActionPerformed
        String sistemaOperativo = System.getProperty("os.name");
        String barra = null;
        int validos = 0, invalidos = 0;
        String documentos_corruptos = "comprimidos corruptos";
        if (sistemaOperativo.equals("Windows XP") | sistemaOperativo.equals("Windows 7") | sistemaOperativo.equals("Windows 8")) {
            barra = "\\";
        } else {
            barra = "//";
        }
        File carpeta = new File(txtRuta.getText() + barra + documentos_corruptos);
        carpeta.mkdir();//creamos la carpeta
        File directorio = new File(txtRuta.getText());
        File[] archivos = directorio.listFiles();//listamos archivos
        salir:
        for (int x = 0; x < archivos.length; x++) {
            if (archivos[x].isDirectory()) {
                continue;
            }
            String extension = txtRuta.getText() + barra + archivos[x].getName();
            for (int i = 0; i < COMPRIMIDOS.length; i++) {
                if (getExtensionFile(extension).equals(COMPRIMIDOS[i])) {
                    try {
                        //destino = txtRuta.getText() + barra + barra + archivos[x].getName();//carpeta destino
                        //sentencia switch o sentencia if
                        switch (getExtensionFile(extension)) {
                            case "rar":
                                comprimido_rar = Peon.isMimeType(Peon.getBytesFromFile(new File(extension)), "application/x-rar-compressed");
                                comprimido_zip = true;
                                comprimido_tar = true;
                                comprimido_gz = true;
                                comprimido_tgz = true;
                                comprimido_jar = true;
                                break;
                            case "zip":
                                comprimido_zip = Peon.isMimeType(Peon.getBytesFromFile(new File(extension)), "application/zip");
                                comprimido_rar = true;
                                comprimido_tar = true;
                                comprimido_gz = true;
                                comprimido_tgz = true;
                                comprimido_jar = true;
                                break;
                            case "tar":
                                comprimido_tar = Peon.isMimeType(Peon.getBytesFromFile(new File(extension)), "application/x-tar");
                                comprimido_zip = true;
                                comprimido_rar = true;
                                comprimido_gz = true;
                                comprimido_tgz = true;
                                comprimido_jar = true;
                                break;
                            case "gz":
                                comprimido_gz = Peon.isMimeType(Peon.getBytesFromFile(new File(extension)), "application/x-gzip");
                                comprimido_zip = true;
                                comprimido_tar = true;
                                comprimido_rar = true;
                                comprimido_tgz = true;
                                comprimido_jar = true;
                                break;
                            case "tgz":
                                comprimido_tgz = Peon.isMimeType(Peon.getBytesFromFile(new File(extension)), "application/x-gzip");
                                comprimido_zip = true;
                                comprimido_tar = true;
                                comprimido_gz = true;
                                comprimido_rar = true;
                                comprimido_jar = true;
                                break;
                            case "jar":
                                comprimido_jar = Peon.isMimeType(Peon.getBytesFromFile(new File(extension)), "text/plain");
                                comprimido_zip = true;
                                comprimido_tar = true;
                                comprimido_gz = true;
                                comprimido_tgz = true;
                                comprimido_rar = true;
                                break;

                        }
//                        boolean comprimido_rar = Peon.isMimeType(Peon.getBytesFromFile(new File(extension)), "application/x-rar-compressed");
//                        boolean comprimido_zip = Peon.isMimeType(Peon.getBytesFromFile(new File(extension)), "application/zip");
//                        boolean comprimido_tar = Peon.isMimeType(Peon.getBytesFromFile(new File(extension)), "application/x-tar");
//                        boolean comprimido_gz = Peon.isMimeType(Peon.getBytesFromFile(new File(extension)), "application/x-gzip");
//                        boolean comprimido_tgz = Peon.isMimeType(Peon.getBytesFromFile(new File(extension)), "application/x-gzip");
//                        boolean comprimido_jar = Peon.isMimeType(Peon.getBytesFromFile(new File(extension)), "application/java-archive");
                        if (!comprimido_rar) {
                            String origen = txtRuta.getText() + barra + archivos[x].getName();
                            String destino = txtRuta.getText() + barra + documentos_corruptos + barra + archivos[x].getName();
                            Path source = Paths.get(origen);
                            Path target = Paths.get(destino);
                            invalidos += 1;
                            try {
                                Files.move(source, target);
                            } catch (IOException ex1) {
                            }
                        }
                        if (!comprimido_zip) {
                            String origen = txtRuta.getText() + barra + archivos[x].getName();
                            String destino = txtRuta.getText() + barra + documentos_corruptos + barra + archivos[x].getName();
                            Path source = Paths.get(origen);
                            Path target = Paths.get(destino);
                            invalidos += 1;
                            try {
                                Files.move(source, target);
                            } catch (IOException ex1) {
                            }
                        }
                        if (!comprimido_tar) {
                            String origen = txtRuta.getText() + barra + archivos[x].getName();
                            String destino = txtRuta.getText() + barra + documentos_corruptos + barra + archivos[x].getName();
                            Path source = Paths.get(origen);
                            Path target = Paths.get(destino);
                            invalidos += 1;
                            try {
                                Files.move(source, target);
                            } catch (IOException ex1) {
                            }
                        }
                        if (!comprimido_gz) {
                            String origen = txtRuta.getText() + barra + archivos[x].getName();
                            String destino = txtRuta.getText() + barra + documentos_corruptos + barra + archivos[x].getName();
                            Path source = Paths.get(origen);
                            Path target = Paths.get(destino);
                            invalidos += 1;
                            try {
                                Files.move(source, target);
                            } catch (IOException ex1) {
                            }
                        }
                        if (!comprimido_tgz) {
                            String origen = txtRuta.getText() + barra + archivos[x].getName();
                            String destino = txtRuta.getText() + barra + documentos_corruptos + barra + archivos[x].getName();
                            Path source = Paths.get(origen);
                            Path target = Paths.get(destino);
                            invalidos += 1;
                            try {
                                Files.move(source, target);
                            } catch (IOException ex1) {
                            }
                        }
                        if (!comprimido_jar) {
                            String origen = txtRuta.getText() + barra + archivos[x].getName();
                            String destino = txtRuta.getText() + barra + documentos_corruptos + barra + archivos[x].getName();
                            Path source = Paths.get(origen);
                            Path target = Paths.get(destino);
                            invalidos += 1;
                            try {
                                Files.move(source, target);
                            } catch (IOException ex1) {
                            }
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(Torre.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SAXException ex) {
                        Logger.getLogger(Torre.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (TikaException ex) {
                        String origen = txtRuta.getText() + barra + archivos[x].getName();
                        String destino = txtRuta.getText() + barra + documentos_corruptos + barra + archivos[x].getName();
                        Path source = Paths.get(origen);
                        Path target = Paths.get(destino);
                        invalidos += 1;
                        try {
                            Files.move(source, target);
                        } catch (IOException ex1) {
                        }
                    }
                }
            }
        }
        validos = archivos.length - invalidos;
        JOptionPane.showMessageDialog(btnComenzar, "Total de documentos válidos: " + validos + "\n" + "Total de documentos corruptos: " + invalidos, "Torre", 1);
    }//GEN-LAST:event_btnComenzarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "¿Deseas salir de Torre?",
                "Salir del programa", JOptionPane.YES_NO_OPTION, 3) == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Peon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Peon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Peon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Peon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Peon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComenzar;
    private javax.swing.JButton btnRuta;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFileChooser jfArchivos;
    private javax.swing.JLabel lbArchivos;
    private javax.swing.JLabel lbRuta;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}
