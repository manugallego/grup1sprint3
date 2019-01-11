package Constructors;

import Public.Public;

/**
 * Classe amb els constructors,setters i getters dels objectes tipus Zona
 * @author Marcos Zaballos
 */
public class Zona {
    /* Atributs */
    private String id_zona;                                                          //variable per a identificar una zona
    private String nom;                                                         //nom d'una zona

    /**
     * Constructor de Zona sense pas de parametres
     */
    public Zona(){
        ++Public.comptador_id_zona;
        nom = "";
        superficie=0;
        aforament=0;
        id_zona = "ID_" + Public.comptador_id_zona;

    }
    /**
     * Constructor de zona amb pas de parametres
     * @param nom
     * @param superficie
     * @param aforament
     */
    public Zona(String nom){
        ++Public.comptador_id_zona;
        this.nom = nom;
        this.superficie = superficie;
        this.aforament = aforament;
        id_zona = "ID_" + Public.comptador_id_zona;
    }

    /* GETTERS */
    public String getNom(){
        return nom;
    }

    public String getID(){
        return id_zona;
    }

    /* SETTERS */
    public void setNom(String n){
        nom = n;
    }

    /* METODES  */

    /**
     * toString que retorna les dades de la zona
     * @return
     */
    @Override
    public String toString(){
        //return id + " " + nom +" "+ aforament +" "+ superficie;
        return id_zona + " " + nom + " " + aforament + " " + superficie;
    }
}
