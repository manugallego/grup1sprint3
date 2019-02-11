package JFrame.Client;

import Biblioteques.Auxiliar;
import Biblioteques.Config;
import JFrame.Main;
import java.awt.Color;

/**
 * Pantalla que mostra les diferents opcions de la gestio de clients
 *
 * @author FerranCliment - DAW2 - 2018
 */
public class MenuClients extends javax.swing.JFrame {

    /**
     * Creates new form MenuClients1
     */
    public MenuClients() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Gestio de clients");

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

        enrere = new javax.swing.JButton();
        baixa_client = new javax.swing.JButton();
        modificar_client = new javax.swing.JButton();
        consultar_client = new javax.swing.JButton();
        alta_client = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("S2G1GestioClients");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(204, 255, 204));

        enrere.setText("Enrere");
        enrere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrereActionPerformed(evt);
            }
        });

        baixa_client.setText("Baixa Client");
        baixa_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baixa_clientActionPerformed(evt);
            }
        });

        modificar_client.setText("Modificar Clients");
        modificar_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_clientActionPerformed(evt);
            }
        });

        consultar_client.setText("Consultar Clients");
        consultar_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar_clientActionPerformed(evt);
            }
        });

        alta_client.setText("Alta Client");
        alta_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alta_clientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(enrere)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(baixa_client, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modificar_client, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(consultar_client, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alta_client, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(105, 105, 105))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(alta_client)
                .addGap(18, 18, 18)
                .addComponent(consultar_client)
                .addGap(18, 18, 18)
                .addComponent(modificar_client)
                .addGap(18, 18, 18)
                .addComponent(baixa_client)
                .addGap(34, 34, 34)
                .addComponent(enrere)
                .addContainerGap())
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
        AltaClients obj = new AltaClients(); //creem la nova finestra AltaClients
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
        BaixaClients obj = new BaixaClients(); //creem la nova finestra BaixaClients
        obj.setVisible(true);                           //la fem visible
        //dispose();                                      //eliminem la finestra actual
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
        ConsultarClients obj = new ConsultarClients(); //creem la nova finestra ConsultarClients
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
        ModificarClients obj = new ModificarClients(); //creem la nova finestra ModificarClients
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
        Main principal = new Main();
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuClients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alta_client;
    private javax.swing.JButton baixa_client;
    private javax.swing.JButton consultar_client;
    private javax.swing.JButton enrere;
    private javax.swing.JButton modificar_client;
    // End of variables declaration//GEN-END:variables
}
