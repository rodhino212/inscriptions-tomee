import java.util.ArrayList;
import javax.faces.bean.ManagedBean;



@ManagedBean(name="manager")
public class ManagerBean{

    private String version = "1.0-SNAPSHOT";

	public ArrayList<Etudiant> studentList;
	
	public ArrayList<Etudiant>getStudentList(){

		studentList = new ArrayList<>();
		studentList.add(new Etudiant(0,"Léo","freddy","0696445232","01/12/1998"));

		return studentList;

	}

    public String getVersion() {
        return version;
    }

/*	*/

    
}