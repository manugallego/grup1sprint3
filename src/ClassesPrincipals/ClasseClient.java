package ClassesPrincipals;

/**
 * Classe Client amb els constructors, setters i getters dels objectes tipus
 * ClasseClient
 *
 * @author Ferran Climent
 */
public class ClasseClient extends ClassePersona { //Classe en herencia de ClassePersona

    private String idClient;                                                //identificador del client
    private String tipusClient;                                             //tipus de client
    public String targeta;                                                  //dades de la targeta
    private static int nextIdClient;                                        //seguent id de client
    private static int numClients;                                          //numero de clients registrats

    /**
     * Constructor de ClasseClient sense pas de parametres
     */
    public ClasseClient() {
        super();
        numClients++;
        this.targeta = targeta;
        idClient = "ID_" + nextIdClient;
        nextIdClient++;
    }

    /**
     * Constructor de ClasseClient amb pas de parametres
     *
     * @param nom
     * @param cognom1
     * @param cognom2
     * @param passwd
     * @param targeta
     */
    /*public ClasseClient(String nom, String cognom1, String cognom2, String email, String passwd, String dataNaix ,String adreca,String ciutat,String provincia,String cp,String tipusDoc ,String numDoc,String sexe,String telefon,String targeta) { //Constructor de classeClient
		super(nom, cognom1, cognom2, email, passwd, dataNaix, adreca, ciutat, provincia, cp, tipusDoc, numDoc, sexe, telefon);
		this.targeta = targeta;
		this.idClient = "ID_" + nextIdClient;
		nextIdClient++;
	}*/

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getTipusClient() {
        return tipusClient;
    }

    public String getTargeta() {
        return targeta;
    }

    public void setTipusClient(String tipus) {
        tipusClient = tipus;
    }

    public void setTargeta(String targeta_client) {
        targeta = targeta_client;
    }

    public static int getNumClients() {
        return numClients;
    }

    public static void setNumClients(int numClients) {
        ClasseClient.numClients = numClients;
    }

    /**
     * Metode per a obtindre les dades d'un client
     *
     * @return String
     */
    @Override
    public String toString() { //ToString per mostrar el clients de l'array amb terminal
        return this.getId_usuari() + " " + this.getNom() + " " + this.getCognom1() + " " + this.getCognom2() + " " + this.getTargeta();
    }

}
