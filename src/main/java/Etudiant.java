
public class Etudiant {
    private int id;
    private String lastName;
    private String firstName;
    private String birthdate;
    private String phoneNumber;

    
	/** 
	 * Récupère l'id de l'étudiant
	 * @return int identifiant unique d'un étudiant
	 */
	public int getId() {
		return id;
	}

	
	/** 
	 * Définition de l'id de létudiant
	 * @param id identifiant unique d'un étudiant
	 */
	public void setId(int id) {
		this.id = id;
	}

	
	/** 
	 * récupère le nom de l'étudiant
	 * @return Prénom de l'étudiant
	 */
	public String getFirstName() {
		return this.firstName;
	}

	
	/** 
	 * Définition du prénom de l'étudiant
	 * @param firstName prénom de l'étudiant
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
	/** 
	 * récupère le nom de l'étudiant
	 * @return Nom de l'étudiant
	 */
	public String getLastName() {
		return this.lastName;
	}

	
	/** 
	 * Définition du nom de l'étudiant
	 * @param lastName nom de l'étudiant
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	/** 
	 * récupère la date de naissance de l'étudiant 
	 * @return Date de naissance de l'étudiant
	 */
	public String getBirthdate() {
		return this.birthdate;
	}

	
	/** 
	 * Définition de la date de naissance de l'étudiant
	 * @param birthdate Date de naissance de l'étudiant
	 */
	public void setBirthDate(String birthdate) {
		this.birthdate = birthdate;
    }
    
    
	/** 
	 * récupère le numéro de téléphone de l'étudiant
	 * @return Téléphone de l'étudiant
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	
	/** 
	 * Définition du téléphone de l'étudiant
	 * @param phoneNumber Téléphone de l'étudiant
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
    }
	
	/** 
	* Constructeur de la classe Etudiant vide
	*/
    public Etudiant() {

	}

	 /** 
	 * Constructeur de la classe Etudiant qui permet la définition d'un étudiant à travers les paramètres suivant :
	 * @param id identifiant unique de l'etudiant par un numéro
	 * @param lastName nom de famille de l'étudiant
	 * @param firstname prenom de l'étudiant
	 * @param phoneNumber téléphone de l'étudiant
	 * @param birthdate date de naissance de l'étudiant
	 */
	public Etudiant(int id, String lastName, String firstName, String phoneNumber, String birthdate) {
		this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthdate = birthdate;
        this.phoneNumber = phoneNumber;
    }
}
