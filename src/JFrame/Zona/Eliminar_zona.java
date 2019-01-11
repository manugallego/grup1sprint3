package JFrame.Zona;

import Biblioteques.Auxiliar;
import Biblioteques.Cercadors;
import Public.Public;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Classe del jFrame d'eliminar zones
 * @author Marcos
 */
public class Eliminar_zona extends javax.swing.JFrame {
    
    int elements [];                                                            //array per guardar la posicio de l'element seleccionat en la taula
    int posicio;                                                                //variable per a guardar la posicio d'una zona
    public Eliminar_zona() {
        initComponents();
        setTitle("Baixa zona");
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

        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton3.setText("Enrere");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

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

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Segur que vols eliminar?");

        jButton1.setText("Sí");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setText("Cercar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)))
                        .addGap(40, 40, 40)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Boto per anar enrere
     * @param evt 
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Gestio_zones gestio = new Gestio_zones();
        gestio.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusGained
        
    }//GEN-LAST:event_jTable1FocusGained
    /**
     * Quan la finestra s'obri omplim la taula
     * @param evt 
     */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        /*Carreguem els valors de l'array en la taula*/
        DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
        Auxiliar.actualitzar_taula_zona(tabla);
        
        /*la confirmació de l'eliminació comença invisible*/
        jLabel1.setVisible(false);
        jButton1.setVisible(false);
    }//GEN-LAST:event_formWindowOpened
    /**
     * Boto per eliminar (necessita confirmacio)
     * @param evt 
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        elements = jTable1.getSelectedRows();
        
        /*Comprovem si l'usuari ha seleccionat una fila de la taula*/
        if(elements.length == 0){
            JOptionPane.showMessageDialog(null,"Has de seleccionar una fila");
        }
        else if(elements.length > 1){
            JOptionPane.showMessageDialog(null,"Nomes pots seleccionar una fila");
        }else{
            /*fem visible la confirmacio*/
            jLabel1.setVisible(true);
            jButton1.setVisible(true);
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * Boto per a confirmar l'eliminacio
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        elements = jTable1.getSelectedRows();                                   //carreguem en elements la fila de la taula seleccionada
        
        /*Comprovem si l'usuari ha seleccionat mes d'una fila de la taula i carreguem les dades*/
        if(elements.length > 1){
            JOptionPane.showMessageDialog(null,"Nomes pots seleccionar una fila");
        }else{
            Object zona_aux = jTable1.getValueAt(jTable1.getSelectedRow(), 0);
            posicio = -1;                                                       //variable amb la posicio de l'array
            
            posicio = Cercadors.cerca_ID_zona(posicio, zona_aux);
            
            if(posicio == -1) JOptionPane.showMessageDialog(null,"No s'ha pogut borrar la zona");
            else{
                Public.arrayZones.remove(posicio);                             //eliminem la zona
        
                /*fem invisible la confirmacio*/
                jLabel1.setVisible(false);
                jButton1.setVisible(false);

                //Actualitzem els valor de la taula
                DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
                Auxiliar.actualitzar_taula_zona(tabla);
                //Obrir la finestra de confirmacio 
                JOptionPane.showMessageDialog(null,"Zona eliminada");
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * Boto per a fer una cerca
     * @param evt 
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        /*Codi per a fer la cerca_Zona*/
        String busqueda = jTextField1.getText();                                //variable per guardar la busqueda
        DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
        
        Cercadors.cerca_Zona(tabla, busqueda);
        
        if (Cercadors.cerca_Zona(tabla, busqueda) == false){
            /*Missatge d'avís*/
            JOptionPane.showMessageDialog(null,"No s'ha trobat cap resultat");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Eliminar_zona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eliminar_zona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eliminar_zona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eliminar_zona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eliminar_zona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
