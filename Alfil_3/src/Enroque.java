import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Enroque extends javax.swing.JFrame {

    public Enroque() {
        initComponents();
        setLocationRelativeTo(null);
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

        jfArchivos = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        lbRuta = new javax.swing.JLabel();
        txtRuta = new javax.swing.JTextField();
        btnRuta = new javax.swing.JButton();
        lbArchivos = new javax.swing.JLabel();
        btnComenzar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Enroque - Imágenes");
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lbRuta.setText("Selecciona el directorio");

        btnRuta.setText("...");
        btnRuta.setToolTipText("Selecciona la ruta");
        btnRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutaActionPerformed(evt);
            }
        });

        lbArchivos.setText("Número total de imágenes:");

        btnComenzar.setText("Comenzar");
        btnComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComenzarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Limpieza de imágenes no válidas");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbArchivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnComenzar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lbRuta)
                            .addComponent(jLabel3))
                        .addContainerGap(185, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lbRuta)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRuta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnComenzar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lbArchivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
            JOptionPane.showMessageDialog(btnComenzar, "Debes introducir una ruta valida", "Enroque", 2);
            btnRuta.requestFocus();
        }
        File carpeta = new File(txtRuta.getText());
        String ficheros[] = carpeta.list();//etiqueta que visualiza los ficheros listados
        lbArchivos.setText("Número total de imágenes: " + ficheros.length);
    }//GEN-LAST:event_btnRutaActionPerformed

    private void btnComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComenzarActionPerformed
        BufferedImage img;
        int tamano = 0;
        int validos = 0, invalidos = 0;
        String barra = null;
        String imagenes_invalidas = "Imagenes corruptas";
        String sistemaOperativo = System.getProperty("os.name");
        if (sistemaOperativo.equals("Windows XP") | sistemaOperativo.equals("Windows 7") | sistemaOperativo.equals("Windows 8")) {
            barra = "\\";
        } else {
            barra = "//";
        }
        File directorio = new File(txtRuta.getText());
        File[] archivos = directorio.listFiles();
        if (txtRuta.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debes introducir una ruta válida", "Alfil", 2);
            txtRuta.requestFocus();
        }
        File carpeta = new File(txtRuta.getText() + barra + imagenes_invalidas);
        carpeta.mkdir();//creamos la carpeta
        for (int i = 0; i < archivos.length; i++) {
            try {
                String ruta = txtRuta.getText() + barra + archivos[i].getName();
                //img = ImageIO.read(new File(ruta));//error al crear la ruta con un objeto file
                img = ImageIO.read(getClass().getResource(ruta));
                if(img==null)
                {
                    String origen = txtRuta.getText() + barra + archivos[i].getName();
                    String destino = txtRuta.getText() + barra + imagenes_invalidas + barra + archivos[i].getName();
                    Path source = Paths.get(origen);
                    Path target = Paths.get(destino);
                    invalidos += 1;
                    try {
                        Files.move(source, target);
                    } catch (IOException ex1) {}
                }
            } catch (Exception ex) {
                    String origen = txtRuta.getText() + barra + archivos[i].getName();
                    String destino = txtRuta.getText() + barra + imagenes_invalidas + barra + archivos[i].getName();
                    Path source = Paths.get(origen);
                    Path target = Paths.get(destino);
                    invalidos += 1;
                    try {
                        Files.move(source, target);
                    } catch (IOException ex1) {}
            }
        }
        validos = archivos.length - invalidos;
        JOptionPane.showMessageDialog(btnComenzar, "Total de archivos válidos: " + validos + "\n" + "Total de archivos corruptos: " + invalidos, "Enroque", 1);
    }//GEN-LAST:event_btnComenzarActionPerformed

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
            java.util.logging.Logger.getLogger(Enroque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Enroque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Enroque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Enroque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Enroque().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComenzar;
    private javax.swing.JButton btnRuta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFileChooser jfArchivos;
    private javax.swing.JLabel lbArchivos;
    private javax.swing.JLabel lbRuta;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}
