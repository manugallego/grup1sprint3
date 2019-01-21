package Biblioteques;

import ClassesPrincipals.ClasseClient;
import ClassesPrincipals.Incidencies;
import ClassesPrincipals.Zona;
import Public.Public;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

/**
 * Classe on estan les funcions utilitzades per a la cerca
 * @author Marcos Zaballos, Ivan Morte, Ferran Climent
 */
public class Cercadors {

    /** Metode que busca i retorna l'ID (serveix per a eliminar i modificar)
     * @param posicio
     * @param zona_aux
     * @return posicio
     */
    public static int cerca_ID_usuari(int posicio, Object zona_aux) {
        boolean trobat = false; //boolean per a deixar de buscar quan es troba l'ID
        int i = 0;
        /*Recorrem l'array buscant l'ID*/
        Iterator<ClasseClient> it = Public.arrayPersona.iterator();
        
        while (it.hasNext() && !trobat){
            ClasseClient client_aux = it.next();        //Crear un objecte del iterador classeclient igualat al itnext per cambiar les columnes de la taula.
            if (client_aux.getIdClient().equals(zona_aux)) {
                posicio = i;
                trobat = true;
            }
            ++i;
        }
        /*for (int i = 0; i < Public.arrayPersona.size() && trobat == false; ++i) {
            if (Public.arrayPersona.get(i).getIdClient().equals(zona_aux)) {
                posicio = i;
                trobat = true;
            }
        }*/
        return posicio;
    }

    /**
     * Metode per a cercar el ID d'un client
     * @param posicio
     * @param client_aux
     * @return
     */
    public static int cercar_ID_client(int posicio, Object client_aux) {
        boolean buscador = false;
        int i = 0;
        
        Iterator<ClasseClient> it = Public.arrayPersona.iterator();
        
        while (it.hasNext() && !buscador){
            ClasseClient client_it = it.next();        //Crear un objecte del iterador classeclient igualat al itnext per cambiar les columnes de la taula.
            if (client_it.getIdClient().equals(client_aux)) {
                posicio = i;
                buscador = true;
            }
            ++i;
        }
        /*for (int i = 0; i < Public.arrayPersona.size() && buscador == false; i++) {
            System.out.println(Public.arrayPersona.get(i).getIdClient());
            if (Public.arrayPersona.get(i).getIdClient().equals(client_aux)) {
                posicio = i;
                buscador = true;
            }
        }*/
        return posicio;
    }

    /** Metode per a realitzar una cerca_Zona en l'array de zones
     * @param tabla
     * @param busqueda
     * @return trobat
     */
    public static boolean cerca_Zona(DefaultTableModel tabla, String busqueda) {
        boolean trobat = false; //boolean per comprovar si s'ha trobat algun resultat
        tabla.setRowCount(0); //buidem la taula en cas de que ja hi haguin dades
        Iterator<Zona> it = Public.arrayZones.iterator();
        while (it.hasNext()) {
            Zona zona_aux = it.next();
            String arrayTot = zona_aux.toString();
            if (arrayTot.indexOf(busqueda) != -1) {
                //SUSTITUIR POR busqueda.equalsIgnoreCase(variable)                                   //variable auxiliar per a carregar les zones que tenim en l'iterador
                tabla.addRow(new Object[]{zona_aux.getID(), zona_aux.getNom()});
                trobat = true;
            }
        }
        if (!trobat) {
            Auxiliar.actualitzar_taula_zona(tabla); //carreguem totes les dades en la taula
        }
        return trobat;
        /*con indexOf se puede buscar si ha encontrado una cadena de caracteres en un string,
        retorna >=0 si lo encuentra y -1 si no lo encuentra if (       indexOf(consulta)>=0){...}
         */
    }

    /** Metode per a realitzar una cerca d'un client en l'array de clients
     * @param tabla
     * @param busqueda
     * @return trobat
     */
    public static boolean cerca_Client(DefaultTableModel tabla, String busqueda) {
        boolean trobat = false; //boolean per comprovar si s'ha trobat algun resultat
        tabla.setRowCount(0); //buidem la taula en cas de que ja hi haguin dades
        Iterator<ClasseClient> it = Public.arrayPersona.iterator();
        while (it.hasNext()) {
            ClasseClient client_aux = it.next();
            String arrayTot = client_aux.toString();
            if (arrayTot.indexOf(busqueda) != -1) {
                tabla.addRow(new Object[]{client_aux.getIdClient(), client_aux.getNom(), client_aux.getCognom1(), client_aux.getCognom2(), client_aux.getTargeta()}); //Plenar la taula
                trobat = true;
            }
        }
        if (!trobat) {
            Auxiliar.actualitzar_taula_client(tabla); //carreguem totes les dades en la taula
        }
        return trobat;
        /*con indexOf se puede buscar si ha encontrado una cadena de caracteres en un string,
        retorna >=0 si lo encuentra y -1 si no lo encuentra if (       indexOf(consulta)>=0){...}
         */
    }

    /**
     * Metode per a cercar el id d'una incidencia
     * @param posicio
     * @param incidencia_aux
     * @return posicio
     */
    public static int cerca_ID_incidencia(int posicio, Object incidencia_aux) {
        boolean cercador = false;
        int i = 0;
        
        Iterator<Incidencies> it = Public.arrayIncidencies.iterator();
        while (it.hasNext() && !cercador) {
            Incidencies incidencia_it = it.next();
            if (incidencia_it.getid().equals(incidencia_aux)) {
                posicio = i;
                cercador = true;
            }
            ++i;
        }
        /*for (int i = 0; i < Public.arrayIncidencies.size() && cercador == false; i++) {
            if (Public.arrayIncidencies.get(i).getid().equals(incidencia_aux)) {
                posicio = i;
                cercador = true;
            }
        }*/
        return posicio;
    }

    /** Metode que busca i retorna l'ID d'una zona (serveix per a eliminar i modificar)
     * @param posicio
     * @param zona_aux
     * @return posicio
     */
    public static int cerca_ID_zona(int posicio, Object zona_aux) {
        boolean trobat = false; //boolean per a deixar de buscar quan es troba l'ID
        int i = 0;
        
        Iterator<Zona> it = Public.arrayZones.iterator();
        /*Recorrem l'array buscant l'ID*/
        while (it.hasNext() && !trobat) {
            Zona zona_it = it.next();
            if (zona_it.getID().equals(zona_aux)) {
                posicio = i;
                trobat = true;
            }
            ++i;
        }
        
        /*for (int i = 0; i < Public.arrayZones.size() && trobat == false; ++i) {
            if (Public.arrayZones.get(i).getID().equals(zona_aux)) {
                posicio = i;
                trobat = true;
            }
        }*/
        return posicio;
    }

    /**
     * Metode per a fer una cerca en les incidencies
     * @param tabla
     * @param buscando 
     */
    public static void cercar_incidencia(DefaultTableModel tabla, String buscando) {
        boolean cercador;
        tabla.setRowCount(0); //contador de taules
        Iterator<Incidencies> iterando = Public.arrayIncidencies.iterator(); //iterador
        while (iterando.hasNext()) {
            //recore
            Incidencies incidencia_aux = iterando.next(); //per que no cambie de apartat
            if (incidencia_aux.toString().contains(buscando.toLowerCase())) {
                //ignorar minicuscules
                cercador = true; //cambiar boolean a se ha trobat
                tabla.addRow(new Object[]{incidencia_aux.getid(), incidencia_aux.gettitolIncidencia(), incidencia_aux.getdescripcioIncidencia(), incidencia_aux.getlloc(), incidencia_aux.getuser(), incidencia_aux.getdate()}); //imprimir la taula en les dades del array
            } else if (incidencia_aux.toString().contains(buscando.toUpperCase())) {
                //sino esta en miniscules que ignore mayuscules
                cercador = true; //cambiar boolean a se ha trobat
                tabla.addRow(new Object[]{incidencia_aux.getid(), incidencia_aux.gettitolIncidencia(), incidencia_aux.getdescripcioIncidencia(), incidencia_aux.getlloc(), incidencia_aux.getuser(), incidencia_aux.getdate()}); //imprimir la taua en les dades del array
            } else if (incidencia_aux.toString().contains(buscando)) {
                //sino esta en miniscules que ignore mayuscules
                cercador = true; //cambiar boolean a se ha trobat
                tabla.addRow(new Object[]{incidencia_aux.getid(), incidencia_aux.gettitolIncidencia(), incidencia_aux.getdescripcioIncidencia(), incidencia_aux.getlloc(), incidencia_aux.getuser(), incidencia_aux.getdate()});
            } //imprimir la taua en les dades del array
            else {
                System.out.println(" no trobat"); //no se ha trobat
            }
        }
    }
    
}
