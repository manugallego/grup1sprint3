package Biblioteques;

import Constructors.ClasseClient;
import Constructors.Zona;
import Public.Public;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
/**
 * Classe amb metodes que s'utilitzen en el programa
 * @author Marcos Zaballos, Ferran Climent, Ivan Morte
 */
public class Auxiliar {
    /*Metodes per a omplir les taules*/
    /**
     * Metode per a carregar les dades de l'array en una taula
     * @param tabla*/
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
    
}