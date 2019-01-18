package JFrame;

import Biblioteques.Auxiliar;
import Biblioteques.ReadColor;
import Biblioteques.Registrar;
import Biblioteques.SaveColor;
import JFrame.Incidencia.Incidencies_menu;
import JFrame.Zona.Gestio_zones;
import JFrame.Client.MenuClients;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Pantalla principal del programa
 *
 * @author Marcos Zaballos, Ivan Morte, Ferran Climent.
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     *
     * @throws java.io.IOException
     */
    public Main() throws IOException {
        initComponents();

        this.setLocationRelativeTo(null);
        setTitle("Gestio del parc");

        if (ReadColor.arxiuConfig.exists()) {                                 // If per si existeix el color de fons al arxiu s'execute
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
        jLabel1 = new javax.swing.JLabel();
        clients = new javax.swing.JButton();
        zones = new javax.swing.JButton();
        incidencies = new javax.swing.JButton();
        incidencies1 = new javax.swing.JButton();
        sortir = new javax.swing.JButton();
        lletra = new javax.swing.JButton();
        fons = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Roboto Th", 0, 48)); // NOI18N
        jLabel1.setText("Gestio del parc");

        clients.setText("Clients");
        clients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientsActionPerformed(evt);
            }
        });

        zones.setText("Zones");
        zones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zonesActionPerformed(evt);
            }
        });

        incidencies.setText("Incidencies");
        incidencies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incidenciesActionPerformed(evt);
            }
        });

        incidencies1.setText("Dades Test");
        incidencies1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incidencies1ActionPerformed(evt);
            }
        });

        sortir.setText("Sortir");
        sortir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortirActionPerformed(evt);
            }
        });

        lletra.setText("Lletra");
        lletra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lletraActionPerformed(evt);
            }
        });

        fons.setText("Color de Fons");
        fons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fonsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(incidencies1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(incidencies, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zones, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clients, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(fons)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lletra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sortir)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(clients)
                .addGap(18, 18, 18)
                .addComponent(zones)
                .addGap(18, 18, 18)
                .addComponent(incidencies)
                .addGap(18, 18, 18)
                .addComponent(incidencies1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortir)
                    .addComponent(lletra)
                    .addComponent(fons))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Event del boto 'sortir' que tanca el programa
     *
     * @param evt
     */
    private void sortirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sortirActionPerformed
    /**
     * Boto que ens porta a la pantalla de gestio de clients
     *
     * @param evt
     */
    private void clientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientsActionPerformed
        MenuClients menu_client = null;
        try {
            menu_client = new MenuClients();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        menu_client.setVisible(true);
        dispose();
    }//GEN-LAST:event_clientsActionPerformed
    /**
     * Boto que ens porta a la pantalla de gestio de zones
     *
     * @param evt
     */
    private void zonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zonesActionPerformed
        Gestio_zones menu_zona = null;
        try {
            menu_zona = new Gestio_zones();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        menu_zona.setVisible(true);
        dispose();
    }//GEN-LAST:event_zonesActionPerformed
    /**
     * Boto que ens porta a la pantalla de gestio d'incidencies
     *
     * @param evt
     */
    private void incidenciesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incidenciesActionPerformed
        Incidencies_menu menu_incidencies = null;
        try {
            menu_incidencies = new Incidencies_menu();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        menu_incidencies.setVisible(true);
        dispose();
    }//GEN-LAST:event_incidenciesActionPerformed
    /**
     * Boto per a carregar zones i usuaris per a fer tests
     *
     * @param evt
     */
    private void incidencies1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incidencies1ActionPerformed
        Registrar.carregar_test();
    }//GEN-LAST:event_incidencies1ActionPerformed

    private void lletraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lletraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lletraActionPerformed

    private void fonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fonsActionPerformed
        SaveColor.colorFons(jPanel1);
    }//GEN-LAST:event_fonsActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    try {
                        new Main().setVisible(true);
                    } catch (IOException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clients;
    private javax.swing.JButton fons;
    private javax.swing.JButton incidencies;
    private javax.swing.JButton incidencies1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lletra;
    private javax.swing.JButton sortir;
    private javax.swing.JButton zones;
    // End of variables declaration//GEN-END:variables
}
