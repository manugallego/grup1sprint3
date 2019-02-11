package JFrame.Incidencia;

import Biblioteques.Auxiliar;
import Biblioteques.Cercadors;
import Biblioteques.Config;
import ClassesPrincipals.Incidencies;
import Public.Public;
import java.awt.Color;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Pantalla per a donar de baixa incicendies
 *
 * @author ivan
 */
public class Suprimir_incidencies extends javax.swing.JFrame {

    /**
     * Creates new form Suprimir_incidencies
     */
    int elements[];//guarda la posicio que a fet click el usuari
    int posicio;

    public Suprimir_incidencies() {
        initComponents();
        setTitle("Baixa incidencia");
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
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Segur que vols eliminar?");

        jButton4.setText("Sí");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton3.setText("Cercar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Enrere");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * carregar dades del array a la taula
     *
     * @param evt
     */
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
        tabla.setRowCount(0);
        Iterator<Incidencies> iterando = Public.arrayIncidencies.iterator();

        while (iterando.hasNext()) {
            Incidencies incidencia_aux = iterando.next();
            tabla.addRow(new Object[]{incidencia_aux.getid(),
                incidencia_aux.gettitolIncidencia(),
                incidencia_aux.getdescripcioIncidencia(),
                incidencia_aux.getlloc(),
                incidencia_aux.getuser(),
                incidencia_aux.getdate()
            });
        }    }//GEN-LAST:event_formWindowGainedFocus
    /**
     * Boto per anar enrere
     *
     * @param evt
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        Incidencies_menu menu = new Incidencies_menu();
        menu.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * suprimir la incidencia (necessita confirmacio)
     *
     * @param evt
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        elements = jTable1.getSelectedRows();

        /*Comprovem si l'usuari ha seleccionat una fila de la taula*/
        if (elements.length == 0) {
            JOptionPane.showMessageDialog(null, "Has de seleccionar una fila");
        } else if (elements.length > 1) {
            JOptionPane.showMessageDialog(null, "Nomes pots seleccionar una fila");
        } else {
            /*fem visible la confirmacio*/
            jLabel1.setVisible(true);
            jButton4.setVisible(true);

        }


    }//GEN-LAST:event_jButton2ActionPerformed
    /**
     * Boto per a fer una cerca
     *
     * @param evt
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();

        String paraulaCercada;
        paraulaCercada = this.jTextField1.getText();//guarda les dades del text field a una variable pera despres guardarla al array

        Cercadors.cercar_incidencia(tabla, paraulaCercada);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    /**
     * Boto de confirmacio
     *
     * @param evt
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        elements = jTable1.getSelectedRows();                                   //carreguem en elements la fila de la taula seleccionada

        /*Comprovem si l'usuari ha seleccionat mes d'una fila de la taula i carreguem les dades*/
        if (elements.length > 1) {
            JOptionPane.showMessageDialog(null, "Nomes pots seleccionar una fila");
        } else {
            Object inc_aux = jTable1.getValueAt(jTable1.getSelectedRow(), 0);
            posicio = -1;                                                       //variable amb la posicio de l'array

            posicio = Cercadors.cerca_ID_zona(posicio, inc_aux);

            if (posicio == -1) {
                JOptionPane.showMessageDialog(null, "No s'ha pogut borrar la zona");
            } else {
                Public.arrayIncidencies.remove(posicio);


                /*fem invisible la confirmacio*/
                jLabel1.setVisible(false);
                jButton4.setVisible(false);

                //Actualitzem els valor de la taula
                DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
                //Funcions.actualitzar_taula_zona(tabla);
                //Obrir la finestra de confirmacio
                JOptionPane.showMessageDialog(null, "Zona eliminada");
            }
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        /*la confirmació de l'eliminació comença invisible*/
        jLabel1.setVisible(false);
        jButton4.setVisible(false);        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Suprimir_incidencies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Suprimir_incidencies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Suprimir_incidencies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Suprimir_incidencies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Suprimir_incidencies().setVisible(true);
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
