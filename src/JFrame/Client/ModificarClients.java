package JFrame.Client;

import Biblioteques.Auxiliar;
import Biblioteques.Cercadors;
import Biblioteques.Config;
import Public.Public;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Pantalla per a modificar les dades d'un client
 * @author Ferran Climent - DAW2 -2018
 */
public class ModificarClients extends javax.swing.JFrame {
    int posicioTaula [];                                                        //Array per la posicio de la fila que triem
    int posicio;
    String dades_antigues;                                                      //Dades que tenia el client abans de la modificacio
    
    
    /**
     * Creates new form ModificarClients1
     */
    public ModificarClients() throws IOException {
        initComponents();
        this.setLocationRelativeTo(null);
        jButton2.setEnabled(false);
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableModificar1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1ModificarNom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2ModificarCognom1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3ModificarCognom2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField4ModificarPasswd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField5ModificarTargeta = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1Seleccionar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jTableModificar1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nom", "Cognom1", "Cognom2", "Contrasenya", "Targeta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableModificar1);

        jLabel1.setText("Nom");

        jTextField1ModificarNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ModificarNomActionPerformed(evt);
            }
        });

        jLabel2.setText("Cognom1");

        jLabel3.setText("Cognom2");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Cercar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField4ModificarPasswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ModificarPasswdActionPerformed(evt);
            }
        });

        jLabel4.setText("Contrasenya");

        jLabel5.setText("Targeta");

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1Seleccionar.setText("Carregar");
        jButton1Seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1SeleccionarActionPerformed(evt);
            }
        });

        jButton4.setText("Enrere");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField3ModificarCognom2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(24, 24, 24)
                                .addComponent(jTextField2ModificarCognom1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1ModificarNom)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4ModificarPasswd)
                                    .addComponent(jTextField5ModificarTargeta)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1Seleccionar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1ModificarNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4ModificarPasswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2ModificarCognom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5ModificarTargeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3ModificarCognom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton1Seleccionar)
                    .addComponent(jButton4))
                .addGap(19, 19, 19))
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
     * Boto per a carregar les dades a modificar
     * @param evt 
     */
    private void jButton1SeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1SeleccionarActionPerformed
        try{
            getContentPane().add(jButton1Seleccionar);
            posicioTaula = jTableModificar1.getSelectedRows();  //Iguales la array de la posicio de la taula a les files seleccionades

            if(posicioTaula.length > 1) {  //Alerta per evitar errors de mes de una fila seleccionada
                JOptionPane.showMessageDialog(null,"Nomes pots seleccionar una fila");
            }else{
                Object client_aux = jTableModificar1.getValueAt(jTableModificar1.getSelectedRow(),0); //Agafar el valor del id de la taula
                System.out.println(client_aux);
                posicio = -1; //Posicio igualada a -1 per si no trobo cap objecte
                posicio = Cercadors.cercar_ID_client(posicio, client_aux);
                if (posicio == -1){ JOptionPane.showMessageDialog(null, "No s'ha pogut carregar"); }
                else{
                    jButton2.setEnabled(true);
                    jTextField1ModificarNom.setText(Public.arrayPersona.get(posicio).getNom()); // Introduir al texfield el NOM de la array 
                    jTextField2ModificarCognom1.setText(Public.arrayPersona.get(posicio).getCognom1()); // Introduir al texfield el COGNOM1 de la array 
                    jTextField3ModificarCognom2.setText(Public.arrayPersona.get(posicio).getCognom2()); // Introduir al texfield el COGNOM2 de la array 
                    jTextField4ModificarPasswd.setText(Public.arrayPersona.get(posicio).getPassword()); // Introduir al texfield el PASSWD de la array 
                    jTextField5ModificarTargeta.setText(Public.arrayPersona.get(posicio).getTargeta()); // Introduir al texfield el TARGETA de la array 
                    
                    
                    /*Guardem les dades antigues per escriure-les en els logs*/
                    dades_antigues = Public.arrayPersona.get(posicio).getNom() + " "
                        + Public.arrayPersona.get(posicio).getCognom1() + " " 
                        + Public.arrayPersona.get(posicio).getCognom2() + " "
                        + Public.arrayPersona.get(posicio).getTargeta();
                }

            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: " + e);
            Auxiliar.escriure_error("Error: " + e);             //Escribim l'error en el fitxer d'errors
        }
    }//GEN-LAST:event_jButton1SeleccionarActionPerformed
    /**
     * Boto per anar enrere
     * @param evt 
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        /*******************************************************************/
        MenuClients obj = null;
        try {
            obj = new MenuClients(); //creem la nova finestra MenuClients
        } catch (IOException ex) {
            Logger.getLogger(ModificarClients.class.getName()).log(Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        }
        obj.setVisible(true);                           //la fem visible
        dispose();                                      //eliminem la finestra actual
        /*******************************************************************/
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1ModificarNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ModificarNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ModificarNomActionPerformed

    private void jTextField4ModificarPasswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ModificarPasswdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ModificarPasswdActionPerformed
    /**
     * Boto per a aplicar els canvis
     * @param evt
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            if(!jTextField1ModificarNom.getText().isEmpty() && !jTextField2ModificarCognom1.getText().isEmpty() && !jTextField3ModificarCognom2.getText().isEmpty() 
                && !jTextField4ModificarPasswd.getText().isEmpty() && !jTextField5ModificarTargeta.getText().isEmpty()){
                Public.arrayPersona.get(posicio).setNom(jTextField1ModificarNom.getText()); //Guardar a l'array el nom introduit
                Public.arrayPersona.get(posicio).setCognom1(jTextField2ModificarCognom1.getText()); //Guardar a l'array el cognnom1 introduit
                Public.arrayPersona.get(posicio).setCognom2(jTextField3ModificarCognom2.getText()); //Guardar a l'array el cognom2 introduit
                Public.arrayPersona.get(posicio).setPassword(jTextField4ModificarPasswd.getText()); //Guardar a l'array el passwd introduit
                Public.arrayPersona.get(posicio).setTargeta(jTextField5ModificarTargeta.getText()); //Guardar a l'array el targeta introduit */

                /*Guardem les noves dades per escriure-les en el fitxer de logs*/
                String dades_noves = jTextField1ModificarNom.getText() + " "
                        + jTextField2ModificarCognom1.getText() + " "
                        + jTextField3ModificarCognom2.getText() + " "
                        + jTextField4ModificarPasswd.getText();
                
                DefaultTableModel model2 = (DefaultTableModel) jTableModificar1.getModel(); //Creem un nova taula i la igualem a la creada amb swing
                Auxiliar.actualitzar_taula_client(model2);

                /*Missatge de confirmacio*/
                JOptionPane.showMessageDialog(null,"Canvis aplicats");

                /*Buidem els jTextFields*/
                jTextField1.setText("");
                jTextField1ModificarNom.setText("");
                jTextField2ModificarCognom1.setText("");
                jTextField3ModificarCognom2.setText("");
                jTextField4ModificarPasswd.setText("");
                jTextField5ModificarTargeta.setText("");

                /*Imprimim en el fitxer de logs.txt*/
                String text_logs = "S'ha modificat el client " + dades_antigues +
                        " per " + dades_noves;
                Auxiliar.escriure_log(text_logs);
                
                jButton2.setEnabled(false);
            }
            else{JOptionPane.showMessageDialog(null, "Has d'omplir tots els camps");}                
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: " + e);
            Auxiliar.escriure_error("Error: " + e);             //Escribim l'error en el fitxer d'errors
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    /**
     * Boto per a fer una cerca
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel model2 = (DefaultTableModel) jTableModificar1.getModel(); //Creem un nova taula i la igualem a la creada amb swing
        String paraulaCercada2;
        paraulaCercada2 = jTextField1.getText();
        
        Cercadors.cerca_Client(model2, paraulaCercada2);
        
        if (Cercadors.cerca_Client(model2, paraulaCercada2) == false){
            /*Missatge d'avís*/
            JOptionPane.showMessageDialog(null,"No s'ha trobat cap resultat");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        DefaultTableModel model2 = (DefaultTableModel) jTableModificar1.getModel(); //Creem un nova taula i la igualem a la creada amb swing
        Auxiliar.actualitzar_taula_client(model2);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

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
            java.util.logging.Logger.getLogger(ModificarClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ModificarClients().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(ModificarClients.class.getName()).log(Level.SEVERE, null, ex);
                    Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1Seleccionar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableModificar1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField1ModificarNom;
    private javax.swing.JTextField jTextField2ModificarCognom1;
    private javax.swing.JTextField jTextField3ModificarCognom2;
    private javax.swing.JTextField jTextField4ModificarPasswd;
    private javax.swing.JTextField jTextField5ModificarTargeta;
    // End of variables declaration//GEN-END:variables
}
