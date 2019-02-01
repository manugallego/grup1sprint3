package JFrame.Zona;

import Biblioteques.*;
import JFrame.Main;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/** 
 * Pantalla principal de la gestio de zones amb el menu per elegir que fer
 * (eliminar, llistar, modificar o registrar zona)
 *
 * @author Marcos
 */
public class Gestio_zones extends javax.swing.JFrame {

    /**
     * Creates new form Gestio_Zones
     */
    public Gestio_zones() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Gestio de zones");

        if (Config.arxiuConfig.exists()) {
            try {
                jPanel1.setBackground(Config.llegirColorFons());             //Implementar el color de fons al jPanel
            } catch (IOException ex) {
                Auxiliar.escriure_error("Error: " + ex);
            }
        }
        
        /*Canviem la tipografia a la que hi ha en l'arxiu de fonts.txt*/
        Config.aplicarFont(rootPane);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        alta_zona = new javax.swing.JButton();
        consultar_zona = new javax.swing.JButton();
        modificar_zona = new javax.swing.JButton();
        baixa_zona = new javax.swing.JButton();
        enrere = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        alta_zona.setText("Alta Zona");
        alta_zona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alta_zonaActionPerformed(evt);
            }
        });

        consultar_zona.setText("Consultar Zones");
        consultar_zona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar_zonaActionPerformed(evt);
            }
        });

        modificar_zona.setText("Modificar Zones");
        modificar_zona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_zonaActionPerformed(evt);
            }
        });

        baixa_zona.setText("Baixa Zona");
        baixa_zona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baixa_zonaActionPerformed(evt);
            }
        });

        enrere.setText("Enrere");
        enrere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrereActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(baixa_zona, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificar_zona, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultar_zona, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alta_zona, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(enrere))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(alta_zona)
                .addGap(18, 18, 18)
                .addComponent(consultar_zona)
                .addGap(18, 18, 18)
                .addComponent(modificar_zona)
                .addGap(18, 18, 18)
                .addComponent(baixa_zona)
                .addGap(23, 23, 23)
                .addComponent(enrere)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Botó per registrar zona
     *
     * @param evt
     */
    private void alta_zonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alta_zonaActionPerformed
        Registrar_zona registrar = new Registrar_zona();
        registrar.setVisible(true);
        dispose();
    }//GEN-LAST:event_alta_zonaActionPerformed
    /**
     * Modificar zona
     *
     * @param evt
     */
    private void modificar_zonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_zonaActionPerformed
        Modificar_zona modificar = new Modificar_zona();
        modificar.setVisible(true);
        dispose();
    }//GEN-LAST:event_modificar_zonaActionPerformed
    /**
     * Botó per llistar zones
     *
     * @param evt
     */
    private void consultar_zonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar_zonaActionPerformed
        Llistar_zona llistar = new Llistar_zona();
        llistar.setVisible(true);
        dispose();
    }//GEN-LAST:event_consultar_zonaActionPerformed
    /**
     * Boto per anar a la finestra principal del programa
     *
     * @param evt
     */
    private void enrereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrereActionPerformed
        Main principal = new Main();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_enrereActionPerformed
    /**
     * Botó per eliminar zona
     *
     * @param evt
     */
    private void baixa_zonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baixa_zonaActionPerformed
        Eliminar_zona eliminar = new Eliminar_zona();
        eliminar.setVisible(true);
        dispose();
    }//GEN-LAST:event_baixa_zonaActionPerformed

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
            java.util.logging.Logger.getLogger(Gestio_zones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestio_zones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestio_zones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestio_zones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        }
        //</editor-fold>
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestio_zones().setVisible(true);
                
                /*Llegim el fitxer de configuracio per agafar el tipus de lletra que es va establir l'ultima vegada*/
                try {    
                    BufferedReader lectura = new BufferedReader(new FileReader ("font.txt"));

                    String font = lectura.readLine();
                    int tipus = Integer.parseInt(lectura.readLine());
                    int mida = Integer.parseInt(lectura.readLine());

                } catch (FileNotFoundException ex) {
                    Auxiliar.escriure_error("Error: " + ex);
                } catch (IOException ex) {
                    Auxiliar.escriure_error("Error: " + ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alta_zona;
    private javax.swing.JButton baixa_zona;
    private javax.swing.JButton consultar_zona;
    private javax.swing.JButton enrere;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modificar_zona;
    // End of variables declaration//GEN-END:variables
}
