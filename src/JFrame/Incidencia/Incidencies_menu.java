/*
 * Menu del programa per a navegar entre els diferents opcions del programa
 *
 * @author ivan
 */
package JFrame.Incidencia;

import Biblioteques.*;
import JFrame.Main;
import java.awt.Color;

public class Incidencies_menu extends javax.swing.JFrame {

    /**
     * Creates new form Incidencies_menu
     */
    public Incidencies_menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Gestio d'incidencies");
        
        Color bg_color = Config.parseColor();           //variable per guardar el color
        getContentPane().setBackground(bg_color);       //aplicar el color al background
                
        /*Canviem la tipografia a la que hi ha en l'arxiu de fonts.txt*/
        Config.canviarFont(rootPane);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alta_incidencies = new javax.swing.JButton();
        consultar_incidencies = new javax.swing.JButton();
        modificar_incidencies = new javax.swing.JButton();
        baixa_incidencia = new javax.swing.JButton();
        informeIncidencies = new javax.swing.JButton();
        enrere = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        alta_incidencies.setText("Alta Incidencia");
        alta_incidencies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alta_incidenciesActionPerformed(evt);
            }
        });

        consultar_incidencies.setText("Consultar Incidencies");
        consultar_incidencies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar_incidenciesActionPerformed(evt);
            }
        });

        modificar_incidencies.setText("Modificar Incidencies");
        modificar_incidencies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_incidenciesActionPerformed(evt);
            }
        });

        baixa_incidencia.setText("Baixa Incidencia");
        baixa_incidencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baixa_incidenciaActionPerformed(evt);
            }
        });

        informeIncidencies.setText("Generar CSV");
        informeIncidencies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informeIncidenciesActionPerformed(evt);
            }
        });

        enrere.setText("Enrere");
        enrere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrereActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(alta_incidencies, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(consultar_incidencies, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modificar_incidencies, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(baixa_incidencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(informeIncidencies, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(124, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(enrere)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(alta_incidencies)
                .addGap(18, 18, 18)
                .addComponent(consultar_incidencies)
                .addGap(18, 18, 18)
                .addComponent(modificar_incidencies)
                .addGap(18, 18, 18)
                .addComponent(baixa_incidencia)
                .addGap(18, 18, 18)
                .addComponent(informeIncidencies)
                .addGap(18, 18, 18)
                .addComponent(enrere)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   /**
     * Boto per anar enrere
     *
     * @param evt
     */
    private void enrereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrereActionPerformed
        Main principal = new Main();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_enrereActionPerformed

    private void informeIncidenciesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informeIncidenciesActionPerformed
        // TODO add your handling code here:
        try {
            Auxiliar.guardarInformeIncidencies();
        } catch (Exception ex) {
            Auxiliar.escriure_error("Error: " + ex);
        }
    }//GEN-LAST:event_informeIncidenciesActionPerformed

    private void baixa_incidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baixa_incidenciaActionPerformed
        setVisible(false);
        Suprimir_incidencies baixa = new Suprimir_incidencies();
        baixa.setVisible(true);
        dispose();
    }//GEN-LAST:event_baixa_incidenciaActionPerformed

   /**
     * Anar a modificar
     *
     * @param evt
     */

    private void modificar_incidenciesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_incidenciesActionPerformed
        setVisible(false);
        Modificar_incidencies modificar = new Modificar_incidencies();
        modificar.setVisible(true);
        dispose();
    }//GEN-LAST:event_modificar_incidenciesActionPerformed

    private void consultar_incidenciesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar_incidenciesActionPerformed
        setVisible(false);
        Llistar_incidencies llistar = new Llistar_incidencies();
        llistar.setVisible(true);
        dispose();
    }//GEN-LAST:event_consultar_incidenciesActionPerformed

    private void alta_incidenciesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alta_incidenciesActionPerformed
        setVisible(false);
        Alta_incidencies alta = new Alta_incidencies();
        alta.setVisible(true);
        dispose();
    }//GEN-LAST:event_alta_incidenciesActionPerformed

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
            java.util.logging.Logger.getLogger(Incidencies_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Incidencies_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Incidencies_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Incidencies_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Incidencies_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alta_incidencies;
    private javax.swing.JButton baixa_incidencia;
    private javax.swing.JButton consultar_incidencies;
    private javax.swing.JButton enrere;
    private javax.swing.JButton informeIncidencies;
    private javax.swing.JButton modificar_incidencies;
    // End of variables declaration//GEN-END:variables
}
