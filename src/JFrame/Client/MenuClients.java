package JFrame.Client;

import Biblioteques.Config;
import JFrame.Main;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Pantalla que mostra les diferents opcions de la gestio de clients
 *
 * @author FerranCliment - DAW2 - 2018
 */
public class MenuClients extends javax.swing.JFrame {

    /**
     * Creates new form MenuClients1
     */
    public MenuClients() throws IOException {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Gestio de clients");

        if (Config.arxiuConfig.exists()) {                                 // If per si existeix el color de fons al arxiu s'execute
            jPanel1.setBackground(Config.llegirColorFons());             //Implementar el color de fons al jPanel
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
        alta_client = new javax.swing.JButton();
        consultar_client = new javax.swing.JButton();
        modificar_client = new javax.swing.JButton();
        baixa_client = new javax.swing.JButton();
        enrere = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("S2G1GestioClients");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(204, 255, 204));

        alta_client.setText("Alta Client");
        alta_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alta_clientActionPerformed(evt);
            }
        });

        consultar_client.setText("Consultar Clients");
        consultar_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar_clientActionPerformed(evt);
            }
        });

        modificar_client.setText("Modificar Clients");
        modificar_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_clientActionPerformed(evt);
            }
        });

        baixa_client.setText("Baixa Client");
        baixa_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baixa_clientActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(baixa_client, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificar_client, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultar_client, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(enrere)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(alta_client, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(100, 100, 100)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(alta_client)
                .addGap(18, 18, 18)
                .addComponent(consultar_client)
                .addGap(18, 18, 18)
                .addComponent(modificar_client)
                .addGap(18, 18, 18)
                .addComponent(baixa_client)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Boto per anar a la pantalla de donat d'alta clients
     *
     * @param evt
     */
    private void alta_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alta_clientActionPerformed
        /**
         * ****************************************************************
         */
        AltaClients obj = null;
        try {
            obj = new AltaClients(); //creem la nova finestra AltaClients
        } catch (IOException ex) {
            Logger.getLogger(MenuClients.class.getName()).log(Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        }
        obj.setVisible(true);                   //la fem visible
        dispose();                              //eliminem la finestra actual
        /**
         * ****************************************************************
         */
    }//GEN-LAST:event_alta_clientActionPerformed
    /**
     * Boto per anar a la pantalla de baixa de clients
     *
     * @param evt
     */
    private void baixa_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baixa_clientActionPerformed
        /**
         * ****************************************************************
         */
        BaixaClients obj = null;
        try {
            obj = new BaixaClients(); //creem la nova finestra BaixaClients
        } catch (IOException ex) {
            Logger.getLogger(MenuClients.class.getName()).log(Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        }
        obj.setVisible(true);                           //la fem visible
        dispose();                                      //eliminem la finestra actual
        /**
         * ****************************************************************
         */
    }//GEN-LAST:event_baixa_clientActionPerformed
    /**
     * Boto per anar a la pantalla de consultar clients
     *
     * @param evt
     */
    private void consultar_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar_clientActionPerformed
        /**
         * ****************************************************************
         */
        ConsultarClients obj = null;
        try {
            obj = new ConsultarClients(); //creem la nova finestra ConsultarClients
        } catch (IOException ex) {
            Logger.getLogger(MenuClients.class.getName()).log(Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        }
        obj.setVisible(true);                           //la fem visible
        dispose();                                      //eliminem la finestra actual
        /**
         * ****************************************************************
         */

    }//GEN-LAST:event_consultar_clientActionPerformed
    /**
     * Boto per anar a la pantalla de modificar clients
     *
     * @param evt
     */
    private void modificar_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_clientActionPerformed

        /**
         * ****************************************************************
         */
        ModificarClients obj = null;
        try {
            obj = new ModificarClients(); //creem la nova finestra ModificarClients
        } catch (IOException ex) {
            Logger.getLogger(MenuClients.class.getName()).log(Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        }
        obj.setVisible(true);                           //la fem visible
        dispose();                                      //eliminem la finestra actual
        /**
         * ****************************************************************
         */
    }//GEN-LAST:event_modificar_clientActionPerformed
    /**
     * Boto per anar enrere
     *
     * @param evt
     */
    private void enrereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrereActionPerformed
        Main principal = null;
        try {
            principal = new Main();
        } catch (IOException ex) {
            Logger.getLogger(MenuClients.class.getName()).log(Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
            
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
            java.util.logging.Logger.getLogger(MenuClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MenuClients().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MenuClients.class.getName()).log(Level.SEVERE, null, ex);
                    Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alta_client;
    private javax.swing.JButton baixa_client;
    private javax.swing.JButton consultar_client;
    private javax.swing.JButton enrere;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modificar_client;
    // End of variables declaration//GEN-END:variables
}
