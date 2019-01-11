package JFrame.Incidencia;

import Biblioteques.Cercadors;
import Constructors.Incidencies;
import Public.Public;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Pantalla per a modificar les dades d'una incidencia
 * @author ivan morte
 */
public class Modificar_incidencies extends javax.swing.JFrame {

    /**
     * Creates new form Modificar_incidencies
     */
    
    int elements[];//guarda la posicio que a fet click el usuari
    int posicio;
    boolean carregar = false;                                                   //boolean per a actualitzar el text de la zona i usuari
    public Modificar_incidencies() {
        initComponents();
        setTitle("Modificar incidencies");
        this.setLocationRelativeTo(null);
        /*Els camps de text de la zona i l'usuari els inicialitzem invisibles*/
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        /*Asignem el valor false als booleans per a seleccionar zona/usuari*/
        Public.seleccio_zona = false;
        Public.seleccio_user = true;
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titol", "Descripcio", "Zona", "User", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Carregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Titol");

        jLabel2.setText("Descripcio");

        jLabel5.setText("Data");

        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Cercar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Seleccionar zona");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Seleccionar usuari");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel6.setText("Zona");

        jLabel7.setText("Usuari");

        jButton2.setText("Enrere");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jLabel7))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
    }//GEN-LAST:event_jTable1MouseClicked
/**
 * carrega les dades del array al jtext field
 * @param evt 
 */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        carregar = true;
        jButton3.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jLabel6.setVisible(true);
        jLabel7.setVisible(true);
        

        getContentPane().add(jButton1);
        elements = jTable1.getSelectedRows();
        if(elements.length > 1){
            JOptionPane.showMessageDialog(null,"Massa opcions selecionades");
        }else{
            Object incidencies_aux = jTable1.getValueAt(jTable1.getSelectedRow(), 0);//indicencies_aux guarda el valor del ID de la incidencia, que en la taula es troba en la fila 'selectedRow' i columna 0
            posicio = -1;//posicio -1 per si no troba res
            //if(){
            posicio = Cercadors.cerca_ID_incidencia(posicio, incidencies_aux);
            if(posicio == -1){
                JOptionPane.showMessageDialog(null, "No s'ha trobat");
            }else{
                jTextField1.setText(Public.arrayIncidencies.get(posicio).gettitolIncidencia());
                jTextField2.setText(Public.arrayIncidencies.get(posicio).getdescripcioIncidencia());
                jLabel6.setText(Public.arrayIncidencies.get(posicio).getlloc());
                jLabel7.setText(Public.arrayIncidencies.get(posicio).getuser());
                jTextField5.setText(Public.arrayIncidencies.get(posicio).getdate());
            }
        }
        jLabel6.setText("Has seleccionat "+Public.arrayIncidencies.get(posicio).getlloc());
        jLabel7.setText("Has seleccionat "+Public.arrayIncidencies.get(posicio).getuser());
        //jLabel7.setText("Has seleccionat "+Public.usuari_incidencia.getNom() + " " + Public.usuari_incidencia.getCognom1()
                //+ " " + Public.usuari_incidencia.getCognom2()); 
        
    }//GEN-LAST:event_jButton1ActionPerformed
/**
 * Boto per a confirmar la modificacio
 * @param evt 
 */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Public.arrayIncidencies.get(posicio).settitolIncidencia(jTextField1.getText());
       Public.arrayIncidencies.get(posicio).setdescripcioIncidencia(jTextField2.getText());
       Public.arrayIncidencies.get(posicio).setlloc(Public.zona_indicencia.getNom());
       Public.arrayIncidencies.get(posicio).setuser(Public.usuari_incidencia.getNom() + 
            " " + Public.usuari_incidencia.getCognom1() + " " + Public.usuari_incidencia.getCognom2());
       Public.arrayIncidencies.get(posicio).setdate(jTextField5.getText());
       
       DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
       tabla.setRowCount(0);
       
       
       Iterator<Incidencies> iterando = Public.arrayIncidencies.iterator();
       while(iterando.hasNext()){
           Incidencies incidencia_aux = iterando.next();
           tabla.addRow(new Object[]{incidencia_aux.getid(),
               incidencia_aux.gettitolIncidencia(),
               incidencia_aux.getdescripcioIncidencia(),
               incidencia_aux.getlloc(),
               incidencia_aux.getuser(),
               incidencia_aux.getdate()
           });
        }
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField5.setText("");
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jButton3.setEnabled(false);
        jButton6.setEnabled(false);
        jButton5.setEnabled(false);
        DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
        tabla.setRowCount(0);
         Iterator<Incidencies> iterando = Public.arrayIncidencies.iterator();
         
       while(iterando.hasNext()){
           Incidencies incidencia_aux = iterando.next();
           tabla.addRow(new Object[]{incidencia_aux.getid(),
               incidencia_aux.gettitolIncidencia(),
               incidencia_aux.getdescripcioIncidencia(),
               incidencia_aux.getlloc(),
               incidencia_aux.getuser(),
               incidencia_aux.getdate()
           });
           
        }
        System.out.println(Public.arrayIncidencies.isEmpty());  
    }//GEN-LAST:event_formWindowOpened
    /**
     * Boto per a fer una cerca
     * @param evt 
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
        String paraulaCercada;
        paraulaCercada = this.jTextField6.getText();//guarda les dades del text field a una variable pera despres guardarla al array
        Cercadors.cercar_incidencia(tabla, paraulaCercada);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed
    /**
     * Boto per a assignar una zona a una incidencia
     * @param evt 
     */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Llistar_zona llistar = new Llistar_zona();
        llistar.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed
    /**
     * Boto per assignar un usuari a una incidencia
     * @param evt 
     */
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Llistar_clients llistar = new Llistar_clients();
        llistar.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed
    /**
     * Accio quan la finestra obte 'focus'
     * @param evt 
     */
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        System.out.println(Public.seleccio_zona);
        if (Public.seleccio_zona){
            jLabel6.setText("Has seleccionat "+Public.zona_indicencia.getNom());
        }
        System.out.println(Public.seleccio_user);
        if (Public.seleccio_user){
            jLabel7.setText("Has seleccionat "+Public.usuari_incidencia.getNom() + " " + Public.usuari_incidencia.getCognom1()
                         + " " + Public.usuari_incidencia.getCognom2());
        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained
    /**
     * Boto per anar enrere
     * @param evt 
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        Incidencies_menu menu = new Incidencies_menu();
        menu.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Modificar_incidencies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar_incidencies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar_incidencies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar_incidencies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar_incidencies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
