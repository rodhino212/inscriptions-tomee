
public class Formation {
    private int id;
    private String name;
    private String duree;



    
    /** 
     * récupère l'id d'une formation
     * @return Retour de l'idenfiant unique d'une formation
     */
    public int getId() {
        return id;
    }



    
    /** 
     * définition de l'identifiant unique de la formation
     * @param id identifiant unique de la formation 
     */
    public void setId(int id) {
        this.id = id;
    }



    
    /** 
     * récupère le nom d'une formation
     * @return Retour du nom d'une formation
     */
    public String getName() {
        return name;
    }



    
    /** 
     * définition du nom de la formation
     * @param name nom de la formation qui permet l'identification de la formation par un nom
     */
    public void setName(String name) {
        this.name = name;
    }



    
    /** 
     * récupère la durée d'une formation
     * @return Retour de la durée d'une formation
     */
    public String getDuree() {
        return duree;
    }



    
    /** 
     * définition de la durée d'une formation
     * @param duree durée de la formation représente le temps d'étude de la formation
     */
    public void setDuree(String duree) {
        this.duree = duree;
    }



     /** 
	 * Constructeur de la classe Formation qui permet la définition d'une formation à travers les paramètres suivant :
	 * @param id identifiant unique d'une formation par un numéro
	 * @param name nom d'une formation qui permet l'identification de la formation par un nom
	 * @param duree duree d'une formation qui représente le temps d'étude de la formation
	 */
    public Formation(int id, String name, String duree) {
        this.id = id;
        this.name = name;
        this.duree = duree;
    }
}
