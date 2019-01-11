
package Biblioteques;

import Constructors.ClasseClient;
import Constructors.Incidencies;
import Constructors.Zona;
import Public.Public;

/**
 *  Classe on estan les funcions utilitzades per a afegir elements en els arrays
 * @author Marcos Zaballos, Ivan Morte, Ferran Climent
 */
public class Registrar {

    /**
     * Metode per a registrar una nova incidencia en l'array d'incidencies
     * @param titolIncidencia
     * @param descripcioIncidencia
     * @param lloc
     * @param user
     * @param date
     */
    public static void registrar_incidencia(String titolIncidencia, String descripcioIncidencia, String lloc, String user, String date) {
        Public.arrayIncidencies.add(new Incidencies(titolIncidencia, descripcioIncidencia, lloc, user, date)); //afegir les dades a l'array incidencies
    }

    /**
     * Metode per donar d'alta a les persones a l'array, passar per valor l'array i les diferents variables
     * @param nom
     * @param cognom1
     * @param cognom2
     * @param passwd
     * @param targeta
     */
    public static void registrar_client(String nom, String cognom1, String cognom2, String passwd, String targeta) {
        Public.arrayPersona.add(new ClasseClient(nom, cognom1, cognom2, passwd, targeta)); //Afegir a la array list les variables
    }

    /**
     * Metode per a afegir un element en l'array arrayZones
     * @param nom
     * @param superficie
     * @param aforament
     */
    public static void registrar_zona(String nom, double superficie, int aforament) {
        Public.arrayZones.add(new Zona(nom, superficie, aforament));
    }

    /**
     * Metode per inserir dades de test en els arrays
     */
    public static void carregar_test() {
        /*ZONES*/
        /* Lavabos B1 */
        Public.arrayZones.add(new Zona("Lavabos B1", 5.2, 10));
        /* Asia */
        Public.arrayZones.add(new Zona("Asia", 200.5, 20));
        /* Hotel */
        Public.arrayZones.add(new Zona("Hotel", 300, 2000));
        /* Mexico */
        Public.arrayZones.add(new Zona("Mexico", 350, 1500));
        /* Mediterrani */
        Public.arrayZones.add(new Zona("Mediterrani", 620, 5500));
        /*USUARIS*/
        Public.arrayPersona.add(new ClasseClient("Paco", "Gutierrez", "Salvador", "abc11", "45254156"));
        Public.arrayPersona.add(new ClasseClient("Maria", "Pascual", "Pincho", "pass2", "355765"));
        Public.arrayPersona.add(new ClasseClient("Fran", "Hernandez", "Blasco", "alumne1", "56434556"));
        Public.arrayPersona.add(new ClasseClient("Alba", "Chapo", "Pascual", "22234", "23443222"));
        Public.arrayPersona.add(new ClasseClient("Pascual", "Santos", "Silvestre", "455gd3", "343242225"));
        Public.arrayPersona.add(new ClasseClient("Ramon", "Cajal", "Gutierrez", "2kjh34", "33888227"));
        /*INCIDENCIES*/
        registrar_incidencia("Lavabos bruts", "Els lavabos estan bruts", "Lavabos B1", "Paco Gutierrez Salvador", "1/12/2018");
        registrar_incidencia("Pel en menjar", "Hi habia un pel en el meu menjar", "Asia", "Alba Chapo Pascual", "30/11/2018");
        registrar_incidencia("Espill trencat", "Hi ha un espill del lavabo trencat", "Mexico", "Ramon Cajal Gutierrez", "30/11/2018");
    }
    
}
