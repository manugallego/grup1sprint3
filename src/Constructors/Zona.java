package Constructors;

import Public.Public;

/**
 * Classe amb els constructors,setters i getters dels objectes tipus Zona
 * @author Marcos Zaballos
 */
public class Zona {
    /* Atributs */
    private String id;                                                          //variable per a identificar una zona
    private String nom;                                                         //nom d'una zona
    private double superficie;                                                  //superficie que te la zona
    private int aforament;                                                      //aforament de la zona

    /**
     * Constructor de Zona sense pas de parametres
     */
    public Zona(){
        ++Public.comptador_id_zona;
        nom = "";
        superficie=0;
        aforament=0;
        id = "ID_" + Public.comptador_id_zona;
        
    }
    /**
     * Constructor de zona amb pas de parametres
     * @param nom
     * @param superficie
     * @param aforament 
     */
    public Zona(String nom, double superficie, int aforament){
        ++Public.comptador_id_zona;
        this.nom = nom;
        this.superficie = superficie;
        this.aforament = aforament;
        id = "ID_" + Public.comptador_id_zona;
    }

    /* GETTERS */
    public String getNom(){
        return nom;
    }

    public double getSuperficie(){
        return superficie;
    }

    public int getAforament(){
        return aforament;
    }
    
    public String getID(){
        return id;
    }

    /* SETTERS */
    public void setNom(String n){
        nom = n;
    }

    public void setSuperficie(double n){
        superficie = n;
    }

    public void setAforament(int n){
        aforament = n;
    }

    /* METODES  */
    public void augmentaAforament(int n){
        aforament += n;
    }
    
    /**
     * toString que retorna les dades de la zona
     * @return 
     */
    @Override
    public String toString(){
        //return id + " " + nom +" "+ aforament +" "+ superficie;
        return id + " " + nom + " " + aforament + " " + superficie;
    }
}
