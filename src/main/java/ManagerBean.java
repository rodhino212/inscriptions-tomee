import java.lang.reflect.Array;
import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;



@Named("manager")
@RequestScoped  
@Deprecated
public class ManagerBean{

	private String version = "1.0-SNAPSHOT";

	private List<Etudiant> studentList = Arrays.asList(
		new Etudiant[]{
		new Etudiant(0,"Léo","Freddy","0696445232","01/12/1998"),
		new Etudiant(1,"Dilio","Medhy","0696324587","04/11/1997"),
		new Etudiant(2,"Gilgan","Therry","0696458526","01/12/1999"),
		new Etudiant(3,"Matthieu","Vickcy","0696354789","10/05/1998"),
		new Etudiant(4,"Thierney","Dilan","0696654819","27/02/1998")
		});

	public List<Etudiant>getStudentList(){
		return studentList;
	}
	
	/*public ArrayList<Etudiant> studentList;
	
	public ArrayList<Etudiant>getStudentList(){

		studentList = new ArrayList<>();
		studentList.add(new Etudiant(0,"Léo","Freddy","0696445232","01/12/1998"));
		studentList.add(new Etudiant(1,"Dilio","Medhy","0696324587","04/11/1997"));
		studentList.add(new Etudiant(2,"Gilgan","Therry","0696458526","01/12/1999"));
		studentList.add(new Etudiant(3,"Matthieu","Vickcy","0696354789","10/05/1998"));
		studentList.add(new Etudiant(4,"Thierney","Dilan","0696654819","27/02/1998"));

		return studentList;

	}*/

	public List<Formation> formationList = Arrays.asList(
	new Formation[]{
		new Formation(0,"Licence COM","2 ans"),
		new Formation(1,"Licence math","3 ans"),
		new Formation(2,"Licence de lettres","4 ans"),
		new Formation(3,"Licence info","1 ans"),
		new Formation(4,"Licence langue","2 ans")

	});

	public List<Formation>getformationList(){

		return formationList;
	}

	/*public ArrayList<Formation> formationList;
	
	public ArrayList<Formation>getFormationList(){

		formationList = new ArrayList<>();
		formationList.add(new Formation(0,"Licence COM","2 ans"));
		formationList.add(new Formation(1,"Licence math","3 ans"));
		formationList.add(new Formation(2,"Licence de lettres","4 ans"));
		formationList.add(new Formation(3,"Licence info","1 ans"));
		formationList.add(new Formation(4,"Licence langue","2 ans"));

		return formationList;

	}*/


	public Year y = Year.now();
	public Year t = Year.of(2017);
	public Year f = Year.of(2018);
	public Year d = Year.of(2019);

/*	public ArrayList<Promotion> promotionList;

	public ArrayList<Promotion>getPromotionList(){
			//String o = formationList.get(0).getName();

		promotionList = new ArrayList<>();
		promotionList.add(new Promotion(y,"Licence COM","Freddy"));
		promotionList.add(new Promotion(t,"Licence math","Jeanne"));
		promotionList.add(new Promotion(f,"Licence de lettres","Chris"));
		promotionList.add(new Promotion(d,"Licence info","Paulo")); 
		return promotionList;
	}*/

	private List<Promotion> promotionList = Arrays.asList(
		new Promotion[] {
			new Promotion (y,formationList.get(0).getName(),studentList.get(0).getFirstName()),
			new Promotion (d,formationList.get(1).getName(),studentList.get(1).getFirstName()),
			new Promotion (f,formationList.get(2).getName(),studentList.get(2).getFirstName()),
			new Promotion (d,formationList.get(3).getName(),studentList.get(3).getFirstName()),
			new Promotion (t,formationList.get(4).getName(),studentList.get(4).getFirstName())

		}

	);

	public List<Promotion>getpromotionList(){
		return promotionList;
	}

    public String getVersion() {
        return version;
	}
	
/*	*/

}

