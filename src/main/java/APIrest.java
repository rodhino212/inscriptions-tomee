import java.time.Year;
import java.util.Arrays;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Application;

@Path("/Accueil")
public class APIrest extends Application{

    private List<Etudiant> studentList = Arrays
    .asList(new Etudiant[] { new Etudiant(0, "Léo", "Freddy", "0696445232", "01/12/1998"),
            new Etudiant(1, "Dilio", "Medhy", "0696324587", "04/11/1997"),
            new Etudiant(2, "Gilgan", "Therry", "0696458526", "01/12/1999"),
            new Etudiant(3, "Matthieu", "Vickcy", "0696354789", "10/05/1998"),
            new Etudiant(4, "Thierney", "Dilan", "0696654819", "27/02/1998") });

    @GET
    @Path("/etudiants")
	public List<Etudiant> getStudentList() {
		return studentList;
    }
    
    @GET
    @Path("/etudiant/{id}")
	public Etudiant getStudent(@PathParam("id") int StudentId) {
        return studentList.get(StudentId);
    }


    private List<Formation> formationList = Arrays.asList(new Formation[] { new Formation(0, "Licence COM", "2 ans"),
    new Formation(1, "Licence math", "3 ans"), new Formation(2, "Licence de lettres", "4 ans"),
    new Formation(3, "Licence info", "1 ans"), new Formation(4, "Licence langue", "2 ans")

});


@GET
@Path("/formations")
public List<Formation> getFormationList() {
    return formationList;
}

@GET
@Path("/formation/{id}")
public Formation getFormation(@PathParam("id") int FormationId) {
    return formationList.get(FormationId);
}



private Year y = Year.now();
private Year t = Year.of(2017);
private Year f = Year.of(2018);
private Year d = Year.of(2019);

private List<Promotion> promotionList = Arrays.asList(
        new Promotion[] { new Promotion(y, formationList.get(0).getName(), studentList.get(0).getFirstName()),
                new Promotion(d, formationList.get(1).getName(), studentList.get(1).getFirstName()),
                new Promotion(f, formationList.get(2).getName(), studentList.get(2).getFirstName()),
                new Promotion(d, formationList.get(3).getName(), studentList.get(3).getFirstName()),
                new Promotion(t, formationList.get(4).getName(), studentList.get(4).getFirstName())

        }

);


@GET
@Path("/promotions")
public List<Promotion> getPromotionList() {
    return promotionList;
}

@GET
@Path("/promotion/{id}")
public Promotion getPromotion(@PathParam("id") int PromotionId) {
    return promotionList.get(PromotionId);
}

}
