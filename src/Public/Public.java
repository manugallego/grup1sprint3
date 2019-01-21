/***
 * Classe principal on estan declarades variables relacionades amb les zones
 * @author Marcos
 */

package Public;

import ClassesPrincipals.Zona;
import ClassesPrincipals.ClasseClient;
import ClassesPrincipals.Incidencies;
import java.util.ArrayList;


public class Public {
    /*Arrays*/
    public static ArrayList<ClasseClient> arrayPersona = new java.util.ArrayList<ClasseClient>();   //array clients
    public static ArrayList<Incidencies> arrayIncidencies = new ArrayList<Incidencies>();           //array incidencies
    public static ArrayList <Zona> arrayZones = new ArrayList <Zona>();                             //array on es guarden les zones    
    
    
    public static ClasseClient usuari_incidencia;                               //Variable on guardarem l'usuari a l'hora de fer l'assignacio a l'incidencia
    public static Zona zona_indicencia;                                         //Variable on guardem la zona a l'hora de fer l'assignacio a l'incidencia  
    
    /*Comptadors per als ID*/
    public static int comptador_id_zona;                                        //comptador que s'incrementa al crear una zona i no disminueix quan es borra
    public static int comptador_incidencies_id;                                 //comptador que s'incrementa al crear una incidencia i no disminueix quan es borra
    
    /*booleans per saber si s'ha seleccionat l'usuari (per a actualitzar el text)*/
    public static boolean seleccio_user = false;
    public static boolean seleccio_zona = false;
}
