package JFrame.Incidencia;

import Biblioteques.Auxiliar;
import Biblioteques.Cercadors;
import Biblioteques.Config;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

/**
 * Pantalla per a mostrar les incidencies
 *
 * @author ivan
 */
public class Llistar_incidencies extends javax.swing.JFrame {

    /**
     * Creates new form Llistar_incidencies
     */
    public Llistar_incidencies() {
        initComponents();
        setTitle("Consultar incidencia");
        this.setLocationRelativeTo(null);

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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Enrere = new javax.swing.JButton();
        BuscarIncidencia = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "titol", "Descripcio", "zona", "user", "data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

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

        Enrere.setText("Enrere");
        Enrere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnrereActionPerformed(evt);
            }
        });

        BuscarIncidencia.setText("Cerca");
        BuscarIncidencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarIncidenciaActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BuscarIncidencia)
                        .addGap(248, 248, 248)
                        .addComponent(Enrere))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarIncidencia)
                    .addComponent(Enrere))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained

    }//GEN-LAST:event_formFocusGained

    /**
     * Boto per anar enrere
     *
     * @param evt
     */
    private void EnrereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnrereActionPerformed
        setVisible(false);
        Incidencies_menu menu = new Incidencies_menu();
        dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_EnrereActionPerformed

   /**
     * Boto per a cercar
     *
     * @param evt
     */
    private void BuscarIncidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarIncidenciaActionPerformed

        DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
        String paraulaCercada;
        paraulaCercada = this.jTextField1.getText();//guarda les dades del text field a una variable pera despres guardarla al array
        Cercadors.cercar_incidencia(tabla, paraulaCercada);

        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarIncidenciaActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

//GEN-FIRST:event_jTable1FocusGained
    private void jTable1FocusGained(java.awt.event.FocusEvent evt) {                                            
        // TODO add your handling code here:
    }   
//GEN-LAST:event_jTable1FocusGained

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
            java.util.logging.Logger.getLogger(Llistar_incidencies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Llistar_incidencies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Llistar_incidencies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Llistar_incidencies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Llistar_incidencies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarIncidencia;
    private javax.swing.JButton Enrere;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
