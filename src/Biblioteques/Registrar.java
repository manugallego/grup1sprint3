package Biblioteques;

import ClassesPrincipals.ClasseClient;
import ClassesPrincipals.Incidencies;
import ClassesPrincipals.Zona;
import Public.Public;

/**
 * Classe on estan les funcions utilitzades per a afegir elements en els arrays
 *
 * @author Marcos Zaballos, Ivan Morte, Ferran Climent
 */
public class Registrar {

    /**
     * Metode per a registrar una nova incidencia en l'array d'incidencies
     *
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
     * Metode per donar d'alta a les persones a l'array, passar per valor
     * l'array i les diferents variables
     *
     * @param nom
     * @param cognom1
     * @param cognom2
     * @param passwd
     * @param targeta
     */
    public static void registrar_client(String nom, String cognom1, String cognom2, String email,String dataNaix, String adreca,
            String ciutat, String provincia, String cp, String tipusDoc, String numDoc, String sexe, String telefon, String targeta) {
           
        ClasseClient c = new ClasseClient();
        c.setNom(nom);
        c.setCognom1(cognom1);
        c.setCognom2(cognom2);
        c.setEmail(email);
        c.setData_naixement(dataNaix);
        c.setAdreca(adreca);
        c.setCiutat(ciutat);
        c.setProvincia(provincia);
        c.setCodi_postal(cp);
        c.setTipus_document(tipusDoc);
        c.setNumero_document(numDoc);
        c.setSexe(sexe);
        c.setTelefon(telefon);
        c.setTargeta(targeta);
        
        Public.arrayPersona.add(c); //Afegir a la array list les variables
    }

    /**
     * Metode per a afegir un element en l'array arrayZones
     *
     * @param nom
     * @param superficie
     * @param aforament
     */
    public static void registrar_zona(String nom) {
        Public.arrayZones.add(new Zona(nom));
    }

    /**
     * Metode per inserir dades de test en els arrays
     */
    public static void carregar_test() {
        /*ZONES*/
        /* Lavabos B1 */
        Public.arrayZones.add(new Zona("Lavabos B1"));
        /* Asia */
        Public.arrayZones.add(new Zona("Asia"));
        /* Hotel */
        Public.arrayZones.add(new Zona("Hotel"));
        /* Mexico */
        Public.arrayZones.add(new Zona("Mexico"));
        /* Mediterrani */
        Public.arrayZones.add(new Zona("Mediterrani"));
        
        /*USUARIS*/
        /*Public.arrayPersona.add(new ClasseClient("Paco", "Gutierrez", "Salvador", "", "45254156"));
        Public.arrayPersona.add(new ClasseClient("Maria", "Pascual", "Pincho", "", "355765"));
        Public.arrayPersona.add(new ClasseClient("Fran", "Hernandez", "Blasco", "", "56434556"));
        Public.arrayPersona.add(new ClasseClient("Alba", "Chapo", "Pascual", "", "23443222"));
        Public.arrayPersona.add(new ClasseClient("Pascual", "Santos", "Silvestre", "", "343242225"));
        Public.arrayPersona.add(new ClasseClient("Ramon", "Cajal", "Gutierrez", "", "33888227"));*/
        
        /*INCIDENCIES*/
        registrar_incidencia("Lavabos bruts", "Els lavabos estan bruts", "Lavabos B1", "Paco Gutierrez Salvador", "1/12/2018");
        registrar_incidencia("Pel en menjar", "Hi habia un pel en el meu menjar", "Asia", "Alba Chapo Pascual", "30/11/2018");
        registrar_incidencia("Espill trencat", "Hi ha un espill del lavabo trencat", "Mexico", "Ramon Cajal Gutierrez", "30/11/2018");
    }

}
