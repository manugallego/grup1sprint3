
package JFrame.Incidencia;

import Biblioteques.Auxiliar;
import Biblioteques.Cercadors;
import JFrame.Client.*;
import javax.swing.table.DefaultTableModel;
import Public.Public;
import javax.swing.JOptionPane;


/**
 * Pantalla per a assignar un client a una incidencia
 * @author Marcos Zaballos
 */
public class Llistar_clients extends javax.swing.JFrame {
    int posicio;
    int elements[];
    /**
     * Creates new form ConsultarClients
     */
    public Llistar_clients() {
        initComponents();
        setTitle("Elegir client");
        this.setLocationRelativeTo(null);
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
        jTableConsultar1 = new javax.swing.JTable();
        jTextField1BuscarConsulta = new javax.swing.JTextField();
        jButton3BuscarConsulta = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("S2G1Consultar");

        jTableConsultar1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nom", "Cognom1", "Cognom2", "Targeta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableConsultar1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTableConsultar1FocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(jTableConsultar1);

        jTextField1BuscarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1BuscarConsultaActionPerformed(evt);
            }
        });

        jButton3BuscarConsulta.setText("Cerca");
        jButton3BuscarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3BuscarConsultaActionPerformed(evt);
            }
        });

        jButton1.setText("Seleccionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Enrere");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1BuscarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3BuscarConsulta)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1BuscarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3BuscarConsulta)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
     * Boto per anar enrere
     * @param evt 
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /*******************************************************************/
        MenuClients obj = new MenuClients(); 	//creem la nova finestra MenuClients
        obj.setVisible(true);                           //la fem visible
        dispose();                                      //eliminem la finestra actual
        /*******************************************************************/
    }//GEN-LAST:event_jButton2ActionPerformed
    /**
     * Boto per a fer una cerca
     * @param evt 
     */
    private void jButton3BuscarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3BuscarConsultaActionPerformed
        DefaultTableModel model1 = (DefaultTableModel) jTableConsultar1.getModel(); //Creem un nova taula i la igualem a la creada amb swing
	String paraulaCercada;
        paraulaCercada = jTextField1BuscarConsulta.getText();
        
        Cercadors.cerca_Client(model1, paraulaCercada);
        
        if (Cercadors.cerca_Client(model1, paraulaCercada) == false){
            /*Missatge d'avís*/
            JOptionPane.showMessageDialog(null,"No s'ha trobat cap resultat");
        }
    }//GEN-LAST:event_jButton3BuscarConsultaActionPerformed
    
    private void jTextField1BuscarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1BuscarConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1BuscarConsultaActionPerformed

    private void jTableConsultar1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTableConsultar1FocusGained
        DefaultTableModel model1 = (DefaultTableModel) jTableConsultar1.getModel(); //Creem un nova taula i la igualem a la creada amb swing
	Auxiliar.actualitzar_taula_client(model1); 
    }//GEN-LAST:event_jTableConsultar1FocusGained
    /**
     * Boto per a guardar l'usuari seleccionat
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        elements = jTableConsultar1.getSelectedRows();
        
        /*Comprovem si l'usuari ha seleccionat mes d'una fila de la taula i carreguem les dades*/
        if(elements.length > 1){
            JOptionPane.showMessageDialog(null,"Nomes pots seleccionar una fila");
        }else{
            Object usr_aux = jTableConsultar1.getValueAt(jTableConsultar1.getSelectedRow(), 0);
            posicio = -1;                                                       //variable amb la posicio de l'array
            
            posicio = Cercadors.cerca_ID_usuari(posicio, usr_aux);
            
            if(posicio == -1) JOptionPane.showMessageDialog(null,"No s'han pogut carregar les dades");
            else{
                Public.usuari_incidencia = Public.arrayPersona.get(posicio);
                
                Public.seleccio_user = true;
                dispose();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Llistar_clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Llistar_clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Llistar_clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Llistar_clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Llistar_clients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3BuscarConsulta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableConsultar1;
    private javax.swing.JTextField jTextField1BuscarConsulta;
    // End of variables declaration//GEN-END:variables
}
