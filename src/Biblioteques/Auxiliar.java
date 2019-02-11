package Biblioteques;

import ClassesPrincipals.*;
import Public.Public;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Classe amb metodes que s'utilitzen en el programa
 *
 * @author Marcos Zaballos, Ferran Climent, Ivan Morte
 */
public class Auxiliar {

    final public static String DATE_FORMAT = "dd/MM/yyyy"; //Constant on guardem el format de la data

    /*Metodes per a omplir les taules*/
    /**
     * Metode per a carregar les dades de l'array en una taula
     *
     * @param tabla
     */
    public static void actualitzar_taula_zona(DefaultTableModel tabla) {
        tabla.setRowCount(0);                                                   //buidem la taula en cas de que ja hi haguin dades
        Iterator<Zona> it = Public.arrayZones.iterator();

        while (it.hasNext()) {
            /*carreguem les dades en la taula*/
            Zona zona_aux = it.next();                                          //variable auxiliar per a carregar les zones que tenim en l'iterador
            tabla.addRow(new Object[]{zona_aux.getID(), zona_aux.getNom()});
        }
    }

    /**
     * Metode per carregar les dades de l'array de client en una taula
     *
     * @param model1
     */
    public static void actualitzar_taula_client(DefaultTableModel model1) {
        model1.setRowCount(0); //Contador per a reiniciar la taula cada cop
        Iterator<ClasseClient> it = Public.arrayPersona.iterator(); //Iterator del tipus classe client igualat a l'arraylist
        while (it.hasNext()) {
            //While per recorrer l'array
            ClasseClient client_aux = it.next(); //Crear un objecte del iterador classeclient igualat al itnext per cambiar les columnes de la taula.
            model1.addRow(new Object[]{client_aux.getIdClient(), client_aux.getNom(), client_aux.getCognom1(), client_aux.getCognom2(), client_aux.getTargeta()}); //Plenar la taula
        }
    }
    
        /**
     * Metode per carregar les dades de l'array de client en una taula
     *
     * @param model1
     */
    public static void actualitzar_taula_incidencies(DefaultTableModel model1) {
        model1.setRowCount(0); //Contador per a reiniciar la taula cada cop
        Iterator<Incidencies> it = Public.arrayIncidencies.iterator();
        while (it.hasNext()) {
            //While per recorrer l'array
            Incidencies incidencia_aux = it.next(); //Crear un objecte del iterador classeclient igualat al itnext per cambiar les columnes de la taula.
            model1.addRow(new Object[]{incidencia_aux.gettitolIncidencia(), incidencia_aux.getdescripcioIncidencia(), incidencia_aux.getlloc(), incidencia_aux.getuser(), incidencia_aux.getdate()}); //Plenar la taula
        }
    }

    /**
     * Metode per a escriure els canvis en el fitxer de logs
     *
     * @param text
     */
    public static void escriure_log(String text) {
        Date datahora = new Date();

        text = "[" + datahora + "]" + " - " + text;
        String fitxerOut = "./logs/syslog.log";
        File fitxer_sortida = new File(fitxerOut);
        fitxer_sortida.getParentFile().mkdirs();

        try {
            PrintStream escriptor = new PrintStream(fitxer_sortida);

            escriptor.println(text);

        } catch (FileNotFoundException e) {
            Auxiliar.escriure_error("Error: " + e);             //Escribim l'error en el fitxer d'errors
        }
    }

    /**
     * Metode per escriure els errors en el fitxer d'errors
     *
     * @param text
     */
    public static void escriure_error(String text) {
        Date datahora = new Date();

        text = "[" + datahora + "]" + " - " + text;
        String fitxerOut = "./logs/error.log";
        File fitxer_sortida = new File(fitxerOut);
        fitxer_sortida.getParentFile().mkdirs();

        try {
            PrintStream escriptor = new PrintStream(fitxer_sortida);

            escriptor.println(text);

        } catch (FileNotFoundException e) {
            Auxiliar.escriure_error("Error: " + e);     //Escribim l'error en el fitxer d'errors
        }
    }

    /**
     * Funció guardarInforme Imprimeix tot el array de Habitacions en un arxiu
     * de text
     *
     */
    public static void guardarInformeIncidencies() {
        Calendar calendari = Calendar.getInstance();
        String dia = Integer.toString(calendari.get(Calendar.DATE));
        String mes = Integer.toString(calendari.get(Calendar.MONTH) + 1);
        String any = Integer.toString(calendari.get(Calendar.YEAR));

        try {
            if (Public.arrayIncidencies.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hi ha incidències!");
            } else {
                String fitxerOut = "./informes/InformeIncidencies-" + dia + '-' + mes + '-' + any + ".csv";
                File fitxer_sortida = new File(fitxerOut);
                fitxer_sortida.getParentFile().mkdirs();
                PrintStream escriptor = new PrintStream(fitxer_sortida);
                Iterator<Incidencies> itIncidencia = Public.arrayIncidencies.iterator();
                while (itIncidencia.hasNext()) {
                    escriptor.println(itIncidencia.next());
                }
                escriptor.close();
                JOptionPane.showMessageDialog(null, "S'ha generat un arxiu CSV!");
            }
        } catch (FileNotFoundException e) {
            Auxiliar.escriure_error("Error: " + e);
        }
    }

    /**
     * Funció isDateValid: Comprova si una data té un format igual a dd/MM/yyyy
     *
     * @param date
     * @return true si és vàlida, false en cas contrari
     */
    public static boolean isDateValid(String date) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
            sdf.setLenient(false);
            sdf.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

}
