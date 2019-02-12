package ClassesPrincipals;

/**
 * Classe amb els constructors, setters i getters dels objectes tipus
 * ClassePersona (persona)
 *
 * @author Ferran Climent
 */
public class ClassePersona {

    /* Atributs */
    private int id_usuari;
    private String nom;
    private String cognom1;
    private String cognom2;
    private String email;
    private String data_naixement;
    private String adreca;
    private String ciutat;
    private String provincia;
    private String codi_postal;
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
     *
     * @param nom
     * @param cognom1
     * @param cognom2
     */
    public ClassePersona(String nom, String cognom1, String cognom2, String email,
            String dataNaix, String adreca, String ciutat, String provincia,
            String cp, String tipusDoc, String numDoc, String sexe, String telefon) { //Costructor de classePersona amb un increment de num de persones
        numPersones++;
        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
        this.email = email;
        this.data_naixement = dataNaix;
        this.adreca = adreca;
        this.ciutat = ciutat;
        this.provincia = provincia;
        this.codi_postal = cp;
        this.tipus_document = tipusDoc;
        this.numero_document = numDoc;
        this.sexe = sexe;
        this.telefon = telefon;

        this.id_usuari = nextIdPersona;
        nextIdPersona++;
    }

    public int getId_usuari() {
        return id_usuari;
    }

    public void setId_usuari(int id_usuari) {
        this.id_usuari = id_usuari;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom1() {
        return cognom1;
    }

    public void setCognom1(String cognom1) {
        this.cognom1 = cognom1;
    }

    public String getCognom2() {
        return cognom2;
    }

    public void setCognom2(String cognom2) {
        this.cognom2 = cognom2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getData_naixement() {
        return data_naixement;
    }

    public void setData_naixement(String data_naixement) {
        this.data_naixement = data_naixement;
    }

    public String getAdreca() {
        return adreca;
    }

    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }

    public String getCiutat() {
        return ciutat;
    }

    public void setCiutat(String ciutat) {
        this.ciutat = ciutat;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCodi_postal() {
        return codi_postal;
    }

    public void setCodi_postal(String codi_postal) {
        this.codi_postal = codi_postal;
    }

    public String getTipus_document() {
        return tipus_document;
    }

    public void setTipus_document(String tipus_document) {
        this.tipus_document = tipus_document;
    }

    public String getNumero_document() {
        return numero_document;
    }

    public void setNumero_document(String numero_document) {
        this.numero_document = numero_document;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public static int getNextIdPersona() {
        return nextIdPersona;
    }

    public static void setNextIdPersona(int nextIdPersona) {
        ClassePersona.nextIdPersona = nextIdPersona;
    }

    public static int getNumPersones() {
        return numPersones;
    }

    public static void setNumPersones(int numPersones) {
        ClassePersona.numPersones = numPersones;
    }

}
