
public class Etudiant {
    private int id;
    private String lastName;
    private String firstName;
    private String birthdate;
    private String phoneNumber;

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthdate() {
		return this.birthdate;
	}

	public void setBirthDate(String birthdate) {
		this.birthdate = birthdate;
    }
    
    public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
    }
    
    public Etudiant() {

	}

	public Etudiant(int id, String lastName, String firstName, String phoneNumber, String birthdate) {
		this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthdate = birthdate;
        this.phoneNumber = phoneNumber;
    }
}
