/*
 * Menu del programa per a navegar entre els diferents opcions del programa
 *
 * @author ivan
 */
package JFrame.Incidencia;

import Biblioteques.ReadColor;
import JFrame.Incidencia.Suprimir_incidencies;
import JFrame.Incidencia.Llistar_incidencies;
import JFrame.Incidencia.Modificar_incidencies;
import JFrame.Incidencia.Alta_incidencies;
import JFrame.Main;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Incidencies_menu extends javax.swing.JFrame {

    /**
     * Creates new form Incidencies_menu
     */
    public Incidencies_menu() throws IOException {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Gestio d'incidencies");
        
        if (ReadColor.colorFons.exists()) {                                 // If per si existeix el color de fons al arxiu s'execute
            jPanel1.setBackground(ReadColor.llegirColorFons());             //Implementar el color de fons al jPanel
        }
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
        alta_incidencies = new javax.swing.JButton();
        consultar_incidencies = new javax.swing.JButton();
        modificar_incidencies = new javax.swing.JButton();
        baixa_incidencia = new javax.swing.JButton();
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
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(baixa_incidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(modificar_incidencies, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(alta_incidencies, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(consultar_incidencies, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)))
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(enrere)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(alta_incidencies)
                .addGap(18, 18, 18)
                .addComponent(consultar_incidencies)
                .addGap(18, 18, 18)
                .addComponent(modificar_incidencies)
                .addGap(18, 18, 18)
                .addComponent(baixa_incidencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
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
 * Anar a alta
 * @param evt 
 */
    private void alta_incidenciesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alta_incidenciesActionPerformed
         setVisible(false);
         Alta_incidencies alta = null;
        try {
            alta = new Alta_incidencies();
        } catch (IOException ex) {
            Logger.getLogger(Incidencies_menu.class.getName()).log(Level.SEVERE, null, ex);
        }
         alta.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_alta_incidenciesActionPerformed
/**
 * Anar a llistar
 * @param evt 
 */

    private void consultar_incidenciesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar_incidenciesActionPerformed
         setVisible(false);
         Llistar_incidencies llistar = null;
        try {
            llistar = new Llistar_incidencies();
        } catch (IOException ex) {
            Logger.getLogger(Incidencies_menu.class.getName()).log(Level.SEVERE, null, ex);
        }
         llistar.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_consultar_incidenciesActionPerformed
/**
 * Anar a modificar
 * @param evt 
 */

    private void modificar_incidenciesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_incidenciesActionPerformed
        setVisible(false);
        Modificar_incidencies modificar = null;
        try {
            modificar = new Modificar_incidencies();
        } catch (IOException ex) {
            Logger.getLogger(Incidencies_menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        modificar.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_modificar_incidenciesActionPerformed

/**
 * Anar a suprimir
 * @param evt 
 */

    private void baixa_incidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baixa_incidenciaActionPerformed
        setVisible(false);
        Suprimir_incidencies suprimir = null;
        try {
            suprimir = new Suprimir_incidencies();
        } catch (IOException ex) {
            Logger.getLogger(Incidencies_menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        suprimir.setVisible(true);
    }//GEN-LAST:event_baixa_incidenciaActionPerformed
    /**
     * Boto per anar enrere
     * @param evt 
     */
    private void enrereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrereActionPerformed
        Main principal = null;
        try {
            principal = new Main();
        } catch (IOException ex) {
            Logger.getLogger(Incidencies_menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_enrereActionPerformed

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
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Incidencies_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Incidencies_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Incidencies_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Incidencies_menu().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Incidencies_menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alta_incidencies;
    private javax.swing.JButton baixa_incidencia;
    private javax.swing.JButton consultar_incidencies;
    private javax.swing.JButton enrere;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modificar_incidencies;
    // End of variables declaration//GEN-END:variables
}
