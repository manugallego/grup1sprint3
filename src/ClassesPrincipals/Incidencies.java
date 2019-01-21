package ClassesPrincipals;

import Public.Public;

/**
 * Classe amb el constructor,setters i getters dels objectes tipus incidencies
 *
 * @author ivan
 */
public class Incidencies {

    private String titolIncidencia;                                             //titol de la incidencia
    private String descripcioIncidencia;                                        //descripcio de l'incidencia
    private String lloc;                                                        //zona on ocorre l'incidencia
    private String date;                                                        //data de l'incidencia
    private String estat;                                                       //estat de la incidencia
    private String user;                                                        // usuari que a inserit la incidencia
    private String id;                                                          //identificatiu de la incidencia

    /**
     * Constructor de Incidencies sense pas de parametres
     */
    public Incidencies() {
        ++Public.comptador_incidencies_id;
        titolIncidencia = "";
        descripcioIncidencia = "";
        lloc = "";
        date = "";
        estat = "";
        user = "";
        id = "ID_" + Public.comptador_incidencies_id;
    }

    /**
     * Constructor de Incidencies amb pas de parametres
     *
     * @param n1
     * @param n2
     * @param n3
     * @param n4
     * @param n5
     */
    public Incidencies(String n1, String n2, String n3, String n4, String n5) {
        ++Public.comptador_incidencies_id;
        titolIncidencia = n1;
        descripcioIncidencia = n2;
        lloc = n3;
        user = n4;
        date = n5;
        id = "ID_" + Public.comptador_incidencies_id;
    }

    public String gettitolIncidencia() {
        return titolIncidencia;
    }

    public String getdescripcioIncidencia() {
        return descripcioIncidencia;
    }

    public String getlloc() {
        return lloc;
    }

    public String getdate() {
        return date;
    }

    public String getestat() {
        return estat;
    }

    public String getuser() {
        return user;
    }

    public String getid() {
        return id;
    }

    public void settitolIncidencia(String t) {
        this.titolIncidencia = t;
    }

    public void setdescripcioIncidencia(String i) {
        this.descripcioIncidencia = i;
    }

    public void setlloc(String l) {
        this.lloc = l;
    }

    public void setdate(String d) {
        this.date = d;
    }

    public void setuser(String u) {
        this.user = u;
    }

    public void setestat(String e) {
        this.estat = e;
    }

    public void setid(String p) {
        this.id = p;
    }

    /**
     * Metode per a obtindre totes les dades d'una incidencia
     *
     * @return String "titolIncidencia+" "+descripcioIncidencia+" "+lloc+"
     * "+date+" "+user"
     */
    @Override
    public String toString() {
        String incidencia = titolIncidencia + ", " + descripcioIncidencia + ", " + lloc + ", " + date + ", " + user;
        return incidencia;
    }

}
