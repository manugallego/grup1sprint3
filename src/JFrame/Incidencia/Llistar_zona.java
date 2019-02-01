package JFrame.Incidencia;

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
 * Pantalla per assignar una zona en una incidencia
 * @author Marcos Zaballos
 */
public class Llistar_zona extends javax.swing.JFrame {
    int elements[];                                                             //variable que guarda l'element seleccionat
    int posicio;                                                                //variable per a saber la posicio de l'element en l'array
    public Llistar_zona() {
        initComponents();
        setTitle("Elegir zona");
        this.setLocationRelativeTo(null);
        
        if (Config.arxiuConfig.exists()) {
            try {
                jPanel1.setBackground(Config.llegirColorFons());             //Implementar el color de fons al jPanel
            } catch (IOException ex) {
                Auxiliar.escriure_error("Error: "+ex);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nom", "Superficie", "Aforament"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable1FocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
        }
        jTable1.getAccessibleContext().setAccessibleName("");

        jButton1.setText("Cercar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Seleccionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Enrere");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(29, 29, 29)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Botó per anar enrere (finestra principal)
     * @param evt 
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Alta_incidencies alta = new Alta_incidencies();
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
    /**
     * Carreguem les dades quan la taula gana focus (quan s'obri la finestra)
     * @param evt 
     */
    private void jTable1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusGained
        //DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
        //Funcions.actualitzar_taula_zona(tabla);
    }//GEN-LAST:event_jTable1FocusGained
    /**
     * Botó per filtrar la busqueda
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String busqueda = jTextField1.getText();                                //variable per guardar la busqueda
        DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
        
        Cercadors.cerca_Zona(tabla, busqueda);
        
        if (Cercadors.cerca_Zona(tabla, busqueda) == false){
            /*Missatge d'avís*/
            JOptionPane.showMessageDialog(null,"No s'ha trobat cap resultat");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * Boto per a guardar la zona seleccionada
     * @param evt 
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        elements = jTable1.getSelectedRows();
        
        /*Comprovem si l'usuari ha seleccionat mes d'una fila de la taula i carreguem les dades*/
        if(elements.length > 1){
            JOptionPane.showMessageDialog(null,"Nomes pots seleccionar una fila");
        }else{
            Object zona_aux = jTable1.getValueAt(jTable1.getSelectedRow(), 0);
            posicio = -1;                                                       //variable amb la posicio de l'array
            
            posicio = Cercadors.cerca_ID_zona(posicio, zona_aux);
            
            if(posicio == -1) JOptionPane.showMessageDialog(null,"No s'han pogut carregar les dades");
            else{
                Public.zona_indicencia = Public.arrayZones.get(posicio);
                System.out.println(Public.zona_indicencia);
                
                Public.seleccio_zona = true;
                dispose();
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
        Auxiliar.actualitzar_taula_zona(tabla);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Llistar_zona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Llistar_zona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Llistar_zona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Llistar_zona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Llistar_zona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
