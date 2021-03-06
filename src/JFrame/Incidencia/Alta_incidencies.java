package JFrame.Incidencia;

import Biblioteques.*;
import Public.Public;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Pantalla per a donar d'alta incidencies
 *
 * @author Grup 1: Evaldas Casas
 */
public class Alta_incidencies extends javax.swing.JFrame {

    public Alta_incidencies() {
        initComponents();
        setTitle("Alta incidencia");
        this.setLocationRelativeTo(null);
        jDateChooser1.setDateFormatString(Auxiliar.DATE_FORMAT);

        Public.usuari_incidencia = null;    //ens asegurem de que la variable no guarda un usuari d'una assignacio anterior
        Public.zona_indicencia = null;      //ens asegurem de que la variable no guarda una zona d'una assignacio anterior
        System.out.println(Public.usuari_incidencia + " - " + Public.zona_indicencia);
        Color bg_color = Config.parseColor();           //variable per guardar el color
        getContentPane().setBackground(bg_color);       //aplicar el color al background
        /* Canviem la tipografia a la que hi ha en l'arxiu de gui.conf */
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

        Enrere = new javax.swing.JButton();
        Continuar = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SeleccionarZona = new javax.swing.JButton();
        SeleccionarUsuari = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

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

        Enrere.setText("Enrere");
        Enrere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnrereActionPerformed(evt);
            }
        });

        Continuar.setText("Continuar");
        Continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinuarActionPerformed(evt);
            }
        });

        jLabel1.setText("Titol");

        jLabel2.setText("Descripcio");

        jLabel5.setText("Data");

        SeleccionarZona.setText("Seleccionar zona");
        SeleccionarZona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarZonaActionPerformed(evt);
            }
        });

        SeleccionarUsuari.setText("Seleccionar usuari");
        SeleccionarUsuari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarUsuariActionPerformed(evt);
            }
        });

        jLabel6.setText("No has seleccionat cap usuari");

        jLabel3.setText("No has seleccionat cap zona");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SeleccionarUsuari, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SeleccionarZona, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(98, 98, 98)
                                .addComponent(Continuar)
                                .addGap(18, 18, 18)
                                .addComponent(Enrere))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel2))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SeleccionarZona)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SeleccionarUsuari)
                    .addComponent(jLabel6)
                    .addComponent(Continuar)
                    .addComponent(Enrere))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Boto per anar enrere
     *
     * @param evt
     */
    private void EnrereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnrereActionPerformed
        setVisible(false);
        Incidencies_menu menu = new Incidencies_menu();
        menu.setVisible(true);
    }//GEN-LAST:event_EnrereActionPerformed

    /**
     * crida a la funcio alta per a introduir les incidencies al array i
     * comprova si estan buits el jtext field
     *
     * @param evt
     */
    private void ContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinuarActionPerformed
        try {
            if (jTextField1.getText().equals("") || jTextField2.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Falten dades per omplir les dades ");
            } else {

                String nomIncidencia = this.jTextField1.getText();  //guarda les dades del text field a una variable pera despres guardarla al array

                String descIncidencia = this.jTextField2.getText();

                String zonaIncidencia = Public.zona_indicencia.getNom();

                String usuIncidencia = Public.usuari_incidencia.getNom() + " " + Public.usuari_incidencia.getCognom1()
                        + " " + Public.usuari_incidencia.getCognom2();

                String dataIncidencia = ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText();

                if (Auxiliar.isDateValid(dataIncidencia)) {
                    Registrar.registrar_incidencia(nomIncidencia, descIncidencia, zonaIncidencia, usuIncidencia, dataIncidencia);

                    /* Imprimim en el fitxer de syslog.log */
                    String incidencia_log = nomIncidencia + " " + descIncidencia + " " + zonaIncidencia + " "+usuIncidencia+ " "+dataIncidencia;
                    String text_logs = "S'ha creat la incidència: " + incidencia_log;
                    Auxiliar.escriure_log(text_logs);

                    JOptionPane.showMessageDialog(null, "Incidencia introduida correctament");
                    //jLabel3.setText("No has seleccionat cap zona");
                    //jLabel6.setText("No has seleccionat cap usuari");
                    jTextField1.setText("");    //buidar el camp de títol
                    jTextField2.setText("");    //buidar el camp de descripció
                    jDateChooser1.setCalendar(null);   //buidar el camp de data

                    Incidencies_menu menu = new Incidencies_menu();
                    this.setVisible(false);
                    menu.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Error: Introdueix una data valida");
                }

                /* DEBUG 
                for (int i = 0; i < Public.arrayIncidencies.size(); i++) {
                    System.out.println(Public.arrayIncidencies.get(i).gettitolIncidencia());
                    System.out.println(Public.arrayIncidencies.get(i).getdescripcioIncidencia());
                    System.out.println(Public.arrayIncidencies.get(i).getlloc());
                    System.out.println(Public.arrayIncidencies.get(i).getuser());
                    System.out.println(Public.arrayIncidencies.get(i).getdate());
                }*/
            }
        } catch (Exception e) {
            Auxiliar.escriure_error("Error: " + e);
        }

    }//GEN-LAST:event_ContinuarActionPerformed

    /**
     * Boto que porta a una finestra on podem seleccionar una zona
     *
     * @param evt
     */
    private void SeleccionarZonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarZonaActionPerformed
        Llistar_zona llistar = new Llistar_zona();
        llistar.setVisible(true);
    }//GEN-LAST:event_SeleccionarZonaActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained

    }//GEN-LAST:event_formFocusGained

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        try {
            if (Public.seleccio_zona) {
                jLabel3.setText("Has seleccionat " + Public.zona_indicencia.getNom());
            }

            if (Public.seleccio_user) {
                jLabel6.setText("Has seleccionat " + Public.usuari_incidencia.getNom() + " " + Public.usuari_incidencia.getCognom1()
                        + " " + Public.usuari_incidencia.getCognom2());
            }
        } catch (Exception e) {
            Auxiliar.escriure_error("Error: " + e);
        }
    }//GEN-LAST:event_formWindowGainedFocus

    /**
     * Boto que porta a una finestra on podem seleccionar un usuari
     *
     * @param evt
     */
    private void SeleccionarUsuariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarUsuariActionPerformed
        Llistar_clients llistar = new Llistar_clients();
        llistar.setVisible(true);
    }//GEN-LAST:event_SeleccionarUsuariActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jLabel3.setText("No has seleccionat cap zona");
        jLabel6.setText("No has seleccionat cap usuari");
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
            java.util.logging.Logger.getLogger(Alta_incidencies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alta_incidencies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alta_incidencies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alta_incidencies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alta_incidencies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Continuar;
    private javax.swing.JButton Enrere;
    private javax.swing.JButton SeleccionarUsuari;
    private javax.swing.JButton SeleccionarZona;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
