package Constructors;
/**
 * Classe amb els constructors, setters i getters dels objectes tipus ClassePersona (persona)
 * @author Ferran Climent
 */
public class ClassePersona {
	/* Atributs */
    private String nom;
	private String cognom1;
	private String cognom2;
	private int idPersona;
	private String passwd;
	private static int nextIdPersona;
	private static int numPersones;
    
        /**
         * Constructor sense pas de parametres de classePersona
         */
	public ClassePersona() { 
    	numPersones++;
    	idPersona = nextIdPersona;
    	nextIdPersona++;
    }
    /**
     * Constructor de ClassePersona amb pas de parametres
     * @param nom
     * @param cognom1
     * @param cognom2
     * @param passwd 
     */
    public ClassePersona(String nom, String cognom1 , String cognom2, String passwd) { //Costructor de classePersona amb un increment de num de persones
    	numPersones++;
    	this.nom = nom;
    	this.cognom1 = cognom1;
    	this.cognom2 = cognom2;
    	this.passwd = passwd;
    	this.idPersona = nextIdPersona;
    	nextIdPersona++;
    }

	public String getNom() {
		return nom;
	}


	public void setNom(String n) {
		nom = n;
	}


	public String getCognom1() {
		return cognom1;
	}


	public void setCognom1(String c1) {
		cognom1 = c1;
	}


	public String getCognom2() {
		return cognom2;
	}


	public void setCognom2(String c2) {
		cognom2 = c2;
	}


	public int getIdPersona() {
		return idPersona;
	}


	public void setId(int i) {
		idPersona = i;
	}


	public String getPasswd() {
		return passwd;
	}


	public void setPasswd(String pwd) {
		passwd = pwd;
	}

	public static int getNumPersones() {
		return numPersones;
	}

	public static void setNumPersones(int numPersones) {
		ClassePersona.numPersones = numPersones;
	}

	


}

