package JFrame.Client;

import Biblioteques.Auxiliar;
import Biblioteques.Cercadors;
import Biblioteques.Config;
import Public.Public;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Pantalla per a modificar les dades d'un client
 *
 * @author Ferran Climent - DAW2 -2018
 */
public class ModificarClients extends javax.swing.JFrame {

    int posicioTaula[];                                                        //Array per la posicio de la fila que triem
    int posicio;
    String dades_antigues;                                                      //Dades que tenia el client abans de la modificacio

    /**
     * Creates new form ModificarClients1
     */
    public ModificarClients() {
        initComponents();
        this.setLocationRelativeTo(null);
        Modificar.setEnabled(false);
        if (Public.arrayPersona.isEmpty()) {
            Carregar.setEnabled(false);
        }

        if (Config.arxiuConfig.exists()) {
            jPanel1.setBackground(Config.parseColor());             //Implementar el color de fons al jPanel
        }
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableModificar1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        ModificarNom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ModificarCognom1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ModificarCognom2 = new javax.swing.JTextField();
        CercarField = new javax.swing.JTextField();
        Cercar = new javax.swing.JButton();
        ModificarEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Modificar = new javax.swing.JButton();
        Carregar = new javax.swing.JButton();
        Enrere = new javax.swing.JButton();
        ModificarDataNaix = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ModificarAdreca = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ModificarCiutat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ModificarProvincia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ModificarCP = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ModificarNumDoc = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ModificarTelefon = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        ModificarTargeta = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        ModificarSexe = new javax.swing.JComboBox<>();
        ModificarTipusDoc = new javax.swing.JComboBox<>();

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
        jScrollPane1.setViewportView(jTableModificar1);

        jLabel1.setText("Nom");

        ModificarNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarNomActionPerformed(evt);
            }
        });

        jLabel2.setText("Cognom1");

        jLabel3.setText("Cognom2");

        CercarField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CercarFieldActionPerformed(evt);
            }
        });

        Cercar.setText("Cercar");
        Cercar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CercarActionPerformed(evt);
            }
        });

        ModificarEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarEmailActionPerformed(evt);
            }
        });

        jLabel4.setText("Email");

        jLabel5.setText("Sexe");

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        Carregar.setText("Carregar");
        Carregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarregarActionPerformed(evt);
            }
        });

        Enrere.setText("Enrere");
        Enrere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnrereActionPerformed(evt);
            }
        });

        ModificarDataNaix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarDataNaixActionPerformed(evt);
            }
        });

        jLabel6.setText("Data Naix.");

        ModificarAdreca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarAdrecaActionPerformed(evt);
            }
        });

        jLabel7.setText("Adereça");

        ModificarCiutat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarCiutatActionPerformed(evt);
            }
        });

        jLabel8.setText("Ciutat");

        jLabel9.setText("Provincia");

        jLabel10.setText("CP");

        jLabel11.setText("Tipus Doc");

        jLabel12.setText("Num Doc");

        jLabel13.setText("Telèfon");

        jLabel14.setText("Targeta");

        ModificarSexe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Home", "Dona" }));
        ModificarSexe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarSexeActionPerformed(evt);
            }
        });

        ModificarTipusDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NIF", "NIE" }));
        ModificarTipusDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarTipusDocActionPerformed(evt);
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CercarField, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(Cercar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ModificarCiutat)
                                    .addComponent(ModificarAdreca)
                                    .addComponent(ModificarNom)
                                    .addComponent(ModificarDataNaix)
                                    .addComponent(ModificarEmail)
                                    .addComponent(ModificarCognom2)
                                    .addComponent(ModificarCognom1))))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(Modificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Carregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addComponent(Enrere))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ModificarTelefon)
                                    .addComponent(ModificarTargeta)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ModificarProvincia)
                                    .addComponent(ModificarNumDoc)
                                    .addComponent(ModificarCP)
                                    .addComponent(ModificarSexe, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ModificarTipusDoc, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
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
                    .addComponent(ModificarNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(ModificarProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ModificarCognom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(ModificarCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ModificarCognom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(ModificarTipusDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModificarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel12)
                    .addComponent(ModificarNumDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModificarDataNaix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(ModificarSexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModificarAdreca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel13)
                    .addComponent(ModificarTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModificarCiutat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel14)
                    .addComponent(ModificarTargeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CercarField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cercar)
                    .addComponent(Modificar)
                    .addComponent(Carregar)
                    .addComponent(Enrere))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Boto per a carregar les dades a modificar
     *
     * @param evt
     */
    private void CarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarregarActionPerformed
        try {
            getContentPane().add(Carregar);
            posicioTaula = jTableModificar1.getSelectedRows();  //Iguales la array de la posicio de la taula a les files seleccionades

            if (posicioTaula.length > 1) {  //Alerta per evitar errors de mes de una fila seleccionada
                JOptionPane.showMessageDialog(null, "Nomes pots seleccionar una fila");
            } else {
                Object client_aux = jTableModificar1.getValueAt(jTableModificar1.getSelectedRow(), 0); //Agafar el valor del id de la taula
                System.out.println(client_aux);
                posicio = -1; //Posicio igualada a -1 per si no trobo cap objecte
                posicio = Cercadors.cercar_ID_client(posicio, client_aux);
                if (posicio == -1) {
                    JOptionPane.showMessageDialog(null, "No s'ha pogut carregar");
                } else {
                    Modificar.setEnabled(true);
                    ModificarNom.setText(Public.arrayPersona.get(posicio).getNom()); // Introduir al texfield el NOM de la array 
                    ModificarCognom1.setText(Public.arrayPersona.get(posicio).getCognom1()); // Introduir al texfield el COGNOM1 de la array 
                    ModificarCognom2.setText(Public.arrayPersona.get(posicio).getCognom2()); // Introduir al texfield el COGNOM2 de la array
                    ModificarEmail.setText(Public.arrayPersona.get(posicio).getEmail());
                    ModificarDataNaix.setText(Public.arrayPersona.get(posicio).getData_naixement()); // Introduir al texfield el PASSWD de la array
                    ModificarAdreca.setText(Public.arrayPersona.get(posicio).getAdreca());
                    ModificarCiutat.setText(Public.arrayPersona.get(posicio).getCiutat());
                    ModificarProvincia.setText(Public.arrayPersona.get(posicio).getProvincia());
                    ModificarCP.setText(Public.arrayPersona.get(posicio).getCodi_postal());
                    ModificarTipusDoc.setSelectedItem(Public.arrayPersona.get(posicio).getTipus_document());
                    ModificarNumDoc.setText(Public.arrayPersona.get(posicio).getNumero_document());
                    ModificarSexe.setSelectedItem(Public.arrayPersona.get(posicio).getSexe());
                    ModificarTelefon.setText(Public.arrayPersona.get(posicio).getTelefon());
                    ModificarTargeta.setText(Public.arrayPersona.get(posicio).getTargeta()); // Introduir al texfield el TARGETA de la array 

                    /*Guardem les dades antigues per escriure-les en els logs*/
                    dades_antigues = Public.arrayPersona.get(posicio).getNom() + " "
                            + Public.arrayPersona.get(posicio).getCognom1() + " "
                            + Public.arrayPersona.get(posicio).getCognom2() + " "
                            + Public.arrayPersona.get(posicio).getEmail() + " "
                            + Public.arrayPersona.get(posicio).getData_naixement() + " "
                            + Public.arrayPersona.get(posicio).getAdreca() + " "
                            + Public.arrayPersona.get(posicio).getCiutat() + " "
                            + Public.arrayPersona.get(posicio).getProvincia() + " "
                            + Public.arrayPersona.get(posicio).getCodi_postal() + " "
                            + Public.arrayPersona.get(posicio).getTipus_document() + " "
                            + Public.arrayPersona.get(posicio).getNumero_document() + " "
                            + Public.arrayPersona.get(posicio).getSexe() + " "
                            + Public.arrayPersona.get(posicio).getTelefon() + " "
                            + Public.arrayPersona.get(posicio).getTargeta();
                }

            }
        } catch (Exception e) {
            Auxiliar.escriure_error("Error: " + e);             //Escribim l'error en el fitxer d'errors
        }
    }//GEN-LAST:event_CarregarActionPerformed
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

    private void ModificarNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarNomActionPerformed

    private void ModificarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarEmailActionPerformed
    /**
     * Boto per a aplicar els canvis
     *
     * @param evt
     */
    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        try {
            if (!ModificarNom.getText().isEmpty() && !ModificarCognom1.getText().isEmpty() && !ModificarCognom2.getText().isEmpty()
                    && !ModificarEmail.getText().isEmpty() && !ModificarDataNaix.getText().isEmpty() && !ModificarAdreca.getText().isEmpty()
                    && !ModificarCiutat.getText().isEmpty() && !ModificarProvincia.getText().isEmpty() && !ModificarCP.getText().isEmpty()
                    && !ModificarNumDoc.getText().isEmpty() && !ModificarTelefon.getText().isEmpty() && !ModificarTargeta.getText().isEmpty()) {
                Public.arrayPersona.get(posicio).setNom(ModificarNom.getText()); //Guardar a l'array el nom introduit
                Public.arrayPersona.get(posicio).setCognom1(ModificarCognom1.getText()); //Guardar a l'array el cognnom1 introduit
                Public.arrayPersona.get(posicio).setCognom2(ModificarCognom2.getText()); //Guardar a l'array el cognom2 introduit
                Public.arrayPersona.get(posicio).setEmail(ModificarEmail.getText()); //Guardar a l'array el passwd introduit
                Public.arrayPersona.get(posicio).setData_naixement(ModificarDataNaix.getText());
                Public.arrayPersona.get(posicio).setAdreca(ModificarAdreca.getText());
                Public.arrayPersona.get(posicio).setCiutat(ModificarCiutat.getText());
                Public.arrayPersona.get(posicio).setProvincia(ModificarProvincia.getText());
                Public.arrayPersona.get(posicio).setCodi_postal(ModificarCP.getText());
                Public.arrayPersona.get(posicio).setTipus_document(ModificarTipusDoc.getSelectedItem().toString());
                Public.arrayPersona.get(posicio).setNumero_document(ModificarNumDoc.getText());
                Public.arrayPersona.get(posicio).setSexe(ModificarSexe.getSelectedItem().toString());
                Public.arrayPersona.get(posicio).setTelefon(ModificarTelefon.getText());
                Public.arrayPersona.get(posicio).setTargeta(ModificarTargeta.getText()); //Guardar a l'array el targeta introduit */

                /*Guardem les noves dades per escriure-les en el fitxer de logs*/
                String dades_noves = ModificarNom.getText() + " "
                        + ModificarCognom1.getText() + " "
                        + ModificarCognom2.getText() + " "
                        + ModificarEmail.getText() + " "
                        + ModificarDataNaix.getText() + " "
                        + ModificarAdreca.getText() + " "
                        + ModificarCiutat.getText() + " "
                        + ModificarProvincia.getText() + " "
                        + ModificarCP.getText() + " "
                        + ModificarNumDoc.getText() + " "
                        + ModificarTelefon.getText() + " "
                        + ModificarTargeta.getText();

                DefaultTableModel model2 = (DefaultTableModel) jTableModificar1.getModel(); //Creem un nova taula i la igualem a la creada amb swing
                Auxiliar.actualitzar_taula_client(model2);

                /*Missatge de confirmacio*/
                JOptionPane.showMessageDialog(null, "Canvis aplicats");

                /*Buidem els jTextFields*/
                CercarField.setText("");
                ModificarNom.setText("");
                ModificarCognom1.setText("");
                ModificarCognom2.setText("");
                ModificarEmail.setText("");
                ModificarDataNaix.setText("");
                ModificarAdreca.setText("");
                ModificarCiutat.setText("");
                ModificarProvincia.setText("");
                ModificarCP.setText("");
                ModificarNumDoc.setText("");
                ModificarTelefon.setText("");
                ModificarTargeta.setText("");

                /*Imprimim en el fitxer de logs.txt*/
                String text_logs = "S'ha modificat el client " + dades_antigues
                        + " per " + dades_noves;
                Auxiliar.escriure_log(text_logs);

                Modificar.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "Has d'omplir tots els camps");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
            Auxiliar.escriure_error("Error: " + e);             //Escribim l'error en el fitxer d'errors
        }
    }//GEN-LAST:event_ModificarActionPerformed

    private void CercarFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CercarFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CercarFieldActionPerformed
    /**
     * Boto per a fer una cerca
     *
     * @param evt
     */
    private void CercarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CercarActionPerformed
        DefaultTableModel model2 = (DefaultTableModel) jTableModificar1.getModel(); //Creem un nova taula i la igualem a la creada amb swing
        String paraulaCercada2;
        paraulaCercada2 = CercarField.getText();

        Cercadors.cerca_Client(model2, paraulaCercada2);

        if (Cercadors.cerca_Client(model2, paraulaCercada2) == false) {
            /*Missatge d'avís*/
            JOptionPane.showMessageDialog(null, "No s'ha trobat cap resultat");
        }
    }//GEN-LAST:event_CercarActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        DefaultTableModel model2 = (DefaultTableModel) jTableModificar1.getModel(); //Creem un nova taula i la igualem a la creada amb swing
        Auxiliar.actualitzar_taula_client(model2);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

    private void ModificarDataNaixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarDataNaixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarDataNaixActionPerformed

    private void ModificarAdrecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarAdrecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarAdrecaActionPerformed

    private void ModificarCiutatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarCiutatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarCiutatActionPerformed

    private void ModificarSexeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarSexeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarSexeActionPerformed

    private void ModificarTipusDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarTipusDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarTipusDocActionPerformed

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
                new ModificarClients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Carregar;
    private javax.swing.JButton Cercar;
    private javax.swing.JTextField CercarField;
    private javax.swing.JButton Enrere;
    private javax.swing.JButton Modificar;
    private javax.swing.JTextField ModificarAdreca;
    private javax.swing.JTextField ModificarCP;
    private javax.swing.JTextField ModificarCiutat;
    private javax.swing.JTextField ModificarCognom1;
    private javax.swing.JTextField ModificarCognom2;
    private javax.swing.JTextField ModificarDataNaix;
    private javax.swing.JTextField ModificarEmail;
    private javax.swing.JTextField ModificarNom;
    private javax.swing.JTextField ModificarNumDoc;
    private javax.swing.JTextField ModificarProvincia;
    private javax.swing.JComboBox<String> ModificarSexe;
    private javax.swing.JTextField ModificarTargeta;
    private javax.swing.JTextField ModificarTelefon;
    private javax.swing.JComboBox<String> ModificarTipusDoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableModificar1;
    // End of variables declaration//GEN-END:variables
}
