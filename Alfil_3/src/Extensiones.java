import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Extensiones extends javax.swing.JFrame {

    public String pathArchivo;
    private static final String[] EXTENSIONES_IMAGEN = {"bmp", "jpg", "jpeg", "tif", "png", "raw", "psd"};
    private static final String[] EXTENSIONES_DOCUMENTO = {"ppt" ,"pptx" ,"doc", "docx", "xls", "txt", "pdf", "dochtml", "rtf", "dic", "html", "log", "accdb", "mdb", "sql", "sqlite", "xlsx"};
    private static final String[] EXTENSIONES_AUDIO = {"mp3", "wav", "acc", "ogg", "rm", "midi"};
    private static final String[] EXTENSIONES_PROGRAMA = {"exe", "bin", "jar"};
    private static final String[] EXTENSIONES_COMPRIMIDO = {"rar", "zip", "tar", "gz", "tgz", "ace", "bz"};
    private static final String[] EXTENSIONES_VIDEO = {"mp4", "avi", "mpeg", "mpg4", "mov", "wmv", "rm", "flv", "vlc"};

    public Extensiones() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(Principal.DO_NOTHING_ON_CLOSE);
    }

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
        lbDirectorio = new javax.swing.JLabel();
        txtRuta = new javax.swing.JTextField();
        btnRuta = new javax.swing.JButton();
        lbArchivos = new javax.swing.JLabel();
        btnEmpezar = new javax.swing.JButton();
        lbEstado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ordenar por extensión");
        setIconImage(getIconImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lbDirectorio.setText("Selecciona el directorio");

        btnRuta.setText("...");
        btnRuta.setToolTipText("Selecciona la ruta");
        btnRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutaActionPerformed(evt);
            }
        });

        lbArchivos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        btnEmpezar.setText("Comenzar");
        btnEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpezarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Ordenar por tipo de extensión");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/archivos.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbArchivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnEmpezar))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbEstado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtRuta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRuta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbDirectorio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lbDirectorio))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRuta))
                .addGap(18, 18, 18)
                .addComponent(lbArchivos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(lbEstado)
                .addGap(34, 34, 34)
                .addComponent(btnEmpezar)
                .addGap(11, 11, 11))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18))
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
        jfArchivos.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);//solo visualizamos los directorios
        int opcion = jfArchivos.showOpenDialog(jPanel1);
        if (opcion == JFileChooser.APPROVE_OPTION) {//si pulsamos el boton aceptar
            pathArchivo = jfArchivos.getSelectedFile().getAbsolutePath();//Obtiene path del archivo
            txtRuta.setText(pathArchivo);
            File carpeta = new File(pathArchivo);
            String ficheros[] = carpeta.list();//etiqueta que visualiza los ficheros listados
            lbArchivos.setText("Número total de archivos: " + ficheros.length);
        } else if (opcion == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(rootPane, "Debes seleccionar una ruta válida", "Alfil", 2);
        }
    }//GEN-LAST:event_btnRutaActionPerformed

    private void btnEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpezarActionPerformed
        String destino = null;
        String sistemaOperativo = System.getProperty("os.name");
        String barra = null;
        String carpetas[] = {"imagen", "video", "documento", "programa", "audio", "comprimido"};
        if (sistemaOperativo.equals("Windows XP") | sistemaOperativo.equals("Windows 7") | sistemaOperativo.equals("Windows 8")) {
            barra = "\\";
        } else {
            barra = "//";
        }
        File directorio = new File(txtRuta.getText());
        File[] archivos = directorio.listFiles();//listamos archivos
        for (int i = 0; i < carpetas.length; i++) {
            File carpeta = new File(txtRuta.getText() + barra + carpetas[i]);
            carpeta.mkdir();//creamos las carpetas
        }
        salir:
        for (int x = 0; x < archivos.length; x++) {
            if (archivos[x].isDirectory()) {
                continue;
            }
            String extension = txtRuta.getText() + barra + archivos[x].getName();
            //inFile = new File(txtRuta.getText() + barra + archivos[x].getName());//carpeta origen
            for (int i = 0; i < EXTENSIONES_IMAGEN.length; i++) {
                if (getExtensionFile(extension).equals(EXTENSIONES_IMAGEN[i])) {
                    destino = txtRuta.getText() + barra + carpetas[0] + barra + archivos[x].getName();//carpeta destino
                    lbEstado.setText("Moviendo los archivos a la carpeta: imagen");
                }
            }
            for (int i = 0; i < EXTENSIONES_AUDIO.length; i++) {
                if (getExtensionFile(extension).equals(EXTENSIONES_AUDIO[i])) {
                    destino = txtRuta.getText() + barra + carpetas[4] + barra + archivos[x].getName();
                    lbEstado.setText("Moviendo los archivos a la carpeta: audio");
                }
            }
            for (int i = 0; i < EXTENSIONES_COMPRIMIDO.length; i++) {
                if (getExtensionFile(extension).equals(EXTENSIONES_COMPRIMIDO[i])) {
                    destino = txtRuta.getText() + barra + carpetas[5] + barra + archivos[x].getName();
                    lbEstado.setText("Moviendo los archivos a la carpeta: comprimido");
                }
            }
            for (int i = 0; i < EXTENSIONES_DOCUMENTO.length; i++) {
                if (getExtensionFile(extension).equals(EXTENSIONES_DOCUMENTO[i])) {
                    destino = txtRuta.getText() + barra + carpetas[2] + barra + archivos[x].getName();
                    lbEstado.setText("Moviendo los archivos a la carpeta: documento");
                }
            }
            for (int i = 0; i < EXTENSIONES_PROGRAMA.length; i++) {
                if (getExtensionFile(extension).equals(EXTENSIONES_PROGRAMA[i])) {
                    destino = txtRuta.getText() + barra + carpetas[3] + barra + archivos[x].getName();
                    lbEstado.setText("Moviendo los archivos a la carpeta: programa");
                }
            }
            for (int i = 0; i < EXTENSIONES_VIDEO.length; i++) {
                if (getExtensionFile(extension).equals(EXTENSIONES_VIDEO[i])) {
                    destino = txtRuta.getText() + barra + carpetas[1] + barra + archivos[x].getName();
                    lbEstado.setText("Moviendo los archivos a la carpeta: video");
                }
            }
            String origen = txtRuta.getText() + barra + archivos[x].getName();
            Path source = Paths.get(origen);
            Path target = Paths.get(destino);
            try {
                Files.move(source, target);
            } catch (IOException ex) {}
            
        }

    JOptionPane.showMessageDialog(rootPane, "Todos los ficheros han sido ordenados correctamente", "Alfil", 1);
    }//GEN-LAST:event_btnEmpezarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int eleccion = JOptionPane.showConfirmDialog(null, "¿Deseas salir?");
        if (eleccion == 0) 
        {
            dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    public static String getExtensionFile(String filename) {
        File f = new File(filename);
        if (f == null || f.isDirectory()) {
            return "Has seleccionado un directorio vacio o nulo";
        } else if (f.isFile()) {
            int index = filename.lastIndexOf('.');
            if (index == -1) {
                return "";
            } else {
                return filename.substring(index + 1);
            }
        } else {
            return "¿que has seleccionado?";
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                

}
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Extensiones.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Extensiones.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Extensiones.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Extensiones.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Extensiones().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmpezar;
    private javax.swing.JButton btnRuta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFileChooser jfArchivos;
    private javax.swing.JLabel lbArchivos;
    private javax.swing.JLabel lbDirectorio;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}
