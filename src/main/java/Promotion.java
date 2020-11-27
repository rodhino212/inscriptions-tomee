import java.time.Year;

public class Promotion {
    private Year annee;
    private String form;
    private String etud;



    
    /** 
     * récupère l'année d'une promotion
     * 
     * @return retourne l'année de la promotion
     */
    public Year getAnnee(){
    return annee;
    }



    
    /** 
     * définition de l'année d'une promotion
     * 
     * @param annee correspond à l'année d'une promotion
     */
    public void setAnnee (Year annee){ 
        this.annee = annee; 
    }



    
    /** 
     * récupère le nom de la formation
     * 
     * @return retoune le nom de la formation
     */
    public String getForm() {
        return form;
    }



    
    /** 
     * définition du nom de la formation
     * 
     * @param form correspond au nom d'une formation
     */
    public void setForm(String form) {
        this.form = form;
    }



    
    /** 
     * récupère le prénom d'un étudiant
     * 
     * @return retourne le prenom de l'etudiant
     */
    public String getEtud() {
        return etud;
    }



    
    /** 
     * définition du prénom d'un étudiant
     * 
     * @param etud correspond au prénom de l'étudiant qui permettra de savoir quel étudiant fait partie de cette promotion
     */
    public void setEtud(String etud) {
        this.etud = etud;
    }


    /** 
	 * Constructeur de la classe Promotion qui permet la définition d'un étudiant à travers les paramètres suivant :
     * 
	 * @param annee Annee de la promotion identifie l'année de la formation
	 * @param form nom de la formation représente la formation
	 * @param etud prenom de l'étudiant présent dans la formation
	 */
    public Promotion(Year annee, String form, String etud) {
        this.annee = annee;
        this.form = form;
        this.etud = etud;
    }

}
