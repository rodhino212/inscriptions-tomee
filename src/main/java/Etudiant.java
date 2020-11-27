
public class Etudiant {
    private int id;
    private String lastName;
    private String firstName;
    private String birthdate;
    private String phoneNumber;

    
	/** 
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
	 * @return String Prénom de l'étudiant
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
	 * @return String Nom de l'étudiant
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
	 * @return String Date de naissance de l'étudiant
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
	 * @return String Téléphone de l'étudiant
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
	* Class constructor.
	*/
    public Etudiant() {

	}

	/** 
	 * class constructor qui permet la définition d'un étudiant
	 * @param id 
	 * @param lastName
	 * @param firstname
	 * @param phoneNumber
	 * @param birthdate
	 */
	public Etudiant(int id, String lastName, String firstName, String phoneNumber, String birthdate) {
		this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthdate = birthdate;
        this.phoneNumber = phoneNumber;
    }
}
