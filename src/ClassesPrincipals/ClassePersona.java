package ClassesPrincipals;
/**
 * Classe amb els constructors, setters i getters dels objectes tipus ClassePersona (persona)
 * @author Ferran Climent
 */
public class ClassePersona {
	/* Atributs */
        private int id_usuari;
        private String nom;
	private String cognom1;
	private String cognom2;
	private String email;
	private String password;
        private String data_naixement;
        private String adreca;
        private String ciutat;
        private String provincia;
        private int codi_postal;
        private String tipus_document;
        private String numero_document;
        private String sexe;
        private String telefon;
        
        
	private static int nextIdPersona;
	private static int numPersones;
    
        /**
         * Constructor sense pas de parametres de classePersona
         */
	public ClassePersona() { 
    	numPersones++;
    	id_usuari = nextIdPersona;
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
    	this.password = passwd;
    	this.id_usuari = nextIdPersona;
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


	public int getId_usuari() {
		return id_usuari;
	}


	public void setId(int i) {
		id_usuari = i;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String pwd) {
		password = pwd;
	}

	public static int getNumPersones() {
		return numPersones;
	}

	public static void setNumPersones(int numPersones) {
		ClassePersona.numPersones = numPersones;
	}

	


}

