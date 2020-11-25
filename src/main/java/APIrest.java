import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;

@Path("/Accueil")
@ApplicationPath("/API")
public class APIrest extends Application{
    @GET
    @Path("/etudiant")
    public String getEtudiant(){
        return "salut toi, etudiant";
    }


}
