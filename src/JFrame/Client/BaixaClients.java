package JFrame.Client;
import Biblioteques.Auxiliar;
import Biblioteques.Cercadors;
import Biblioteques.Config;
import Public.Public;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Pantalla per eliminar clients
 *
 * @author Ferran Climent - DAW2 - 2018
 */
public class BaixaClients extends javax.swing.JFrame {

    int posicioTaulaBaixa[];
    int posicio;

    /**
     * Creates new form BaixaClients1
     */
    public BaixaClients() {
        initComponents();
        setTitle("Eliminar usuaris");
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
        jTable1Baixa = new javax.swing.JTable();
        textoConfirmacion = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        Cercar = new javax.swing.JButton();
        Confirmar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Enrere = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("S2G1BaixaClients");
        setBackground(new java.awt.Color(204, 255, 204));
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

        jTable1Baixa.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1Baixa);

        textoConfirmacion.setText("Segur que vols eliminar?");

        Cercar.setText("Cercar");
        Cercar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CercarActionPerformed(evt);
            }
        });

        Confirmar.setText("Sí");
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Enrere.setText("Enrere");
        Enrere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnrereActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoConfirmacion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Cercar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(Eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Enrere)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoConfirmacion)
                    .addComponent(Confirmar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cercar)
                    .addComponent(Eliminar)
                    .addComponent(Enrere))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Boto per anar enrere
     *
     * @param evt
     */
    private void EnrereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnrereActionPerformed
        /**
         * ****************************************************************
         */
        MenuClients obj = new MenuClients(); //creem la nova finestra MenuClients
        obj.setVisible(true);                           //la fem visible
        dispose();                                      //eliminem la finestra actual
        /**
         * ****************************************************************
         */
    }//GEN-LAST:event_EnrereActionPerformed
    /**
     * Boto per eliminar client (requereix confirmacio)
     *
     * @param evt
     */
    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        posicioTaulaBaixa = jTable1Baixa.getSelectedRows();
        /*Comprovem si l'usuari ha seleccionat una fila de la taula*/
        if (posicioTaulaBaixa.length == 0) {
            JOptionPane.showMessageDialog(null, "Has de seleccionar una fila");
        } else if (posicioTaulaBaixa.length > 1) {
            JOptionPane.showMessageDialog(null, "Nomes pots seleccionar una fila");
        } else {
            Object client_aux = jTable1Baixa.getValueAt(jTable1Baixa.getSelectedRow(), 0); //Agafar el valor del id de la taula
            System.out.println(client_aux);
            posicio = -1; //Posicio igualada a -1 per si no trobo cap objecte
            posicio = Cercadors.cercar_ID_client(posicio, client_aux);
            Confirmar.setVisible(true);
            textoConfirmacion.setText("Segur que vols eliminar: " + Public.arrayPersona.get(posicio).getNom()+"?");
            textoConfirmacion.setVisible(true);


        }
    }//GEN-LAST:event_EliminarActionPerformed
    /**
     * Boto per a fer una cerca
     *
     * @param evt
     */
    private void CercarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CercarActionPerformed
        DefaultTableModel model3 = (DefaultTableModel) jTable1Baixa.getModel(); //Creem un nova taula i la igualem a la creada amb swing
        String paraulaCercada1;
        paraulaCercada1 = jTextField1.getText();

        Cercadors.cerca_Client(model3, paraulaCercada1);
         Confirmar.setVisible(false);
         textoConfirmacion.setVisible(false);
        if (Cercadors.cerca_Client(model3, paraulaCercada1) == false) {
            /*Missatge d'avís*/
            JOptionPane.showMessageDialog(null, "No s'ha trobat cap resultat");
        }
    }//GEN-LAST:event_CercarActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        DefaultTableModel model2 = (DefaultTableModel) jTable1Baixa.getModel(); //Creem un nova taula i la igualem a la creada amb swing
        Auxiliar.actualitzar_taula_client(model2);
    }//GEN-LAST:event_formWindowGainedFocus
    /**
     * Boto per a confirmar la baixa del client
     *
     * @param evt
     */
    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        getContentPane().add(Eliminar);
        posicioTaulaBaixa = jTable1Baixa.getSelectedRows();

        String nom_client;

        if (posicioTaulaBaixa.length > 1) {  //Alerta per evitar errors de mes de una fila seleccionada
            JOptionPane.showMessageDialog(null, "Nomes pots seleccionar una fila");
        } else {
            Object client_aux = jTable1Baixa.getValueAt(jTable1Baixa.getSelectedRow(), 0); //Agafar el valor del id de la taula
            System.out.println(client_aux);
            posicio = -1; //Posicio igualada a -1 per si no trobo cap objecte
            posicio = Cercadors.cercar_ID_client(posicio, client_aux);
            if (posicio == -1) {
                JOptionPane.showMessageDialog(null, "No s'ha pogut carregar");
            } else {
                nom_client = Public.arrayPersona.get(posicio).getNom() + " "
                        + Public.arrayPersona.get(posicio).getCognom1() + " "
                        + Public.arrayPersona.get(posicio).getCognom2();

                Public.arrayPersona.remove(posicio);

                //Obrir la finestra de confirmacio
                JOptionPane.showMessageDialog(null, "Client" + nom_client +" eliminat");

                /*Imprimim en el fitxer de logs.txt*/
                String text_logs = "S'ha eliminat el client " + nom_client;
                Auxiliar.escriure_log(text_logs);
            }

        }
        DefaultTableModel model2 = (DefaultTableModel) jTable1Baixa.getModel(); //Creem un nova taula i la igualem a la creada amb swing
        Auxiliar.actualitzar_taula_client(model2);
        /*tornem a fer invisible la confirmacio*/
        Confirmar.setVisible(false);
        textoConfirmacion.setVisible(false);
    }//GEN-LAST:event_ConfirmarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        /*Inicialitzem la confirmacio de la baixa en invisible*/
        Confirmar.setVisible(false);
        textoConfirmacion.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void jTable1BaixaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1BaixaFocusLost
        Confirmar.setVisible(false);
        textoConfirmacion.setVisible(false);
    }//GEN-LAST:event_jTable1BaixaFocusLost

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
            java.util.logging.Logger.getLogger(BaixaClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaixaClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaixaClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaixaClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            Auxiliar.escriure_error("Error: " + ex);             //Escribim l'error en el fitxer d'errors
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaixaClients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cercar;
    private javax.swing.JButton Confirmar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Enrere;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1Baixa;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel textoConfirmacion;
    // End of variables declaration//GEN-END:variables
}
