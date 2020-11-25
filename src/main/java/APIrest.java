import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/Accueil")
public class APIrest extends Application{
   /* @GET
    @Path("/etudiant")
    public String getEtudiant(){
        return "salut toi, etudiant";
    }*/

    @Context
    private HttpServletRequest request;
    @Context 
    private HttpServletResponse response;

    /**
     * This method uses the injected request/response in the PaymentServiceRest class
     * @return
     * @throws IOException
     */
    @GET
    @Path("/etudiant")
    @Produces("text/html")
    public Response method1() throws IOException {
        String myJsfPage = "/student/student.xhtml";
        String contextPath = request.getContextPath();
        response.sendRedirect(contextPath + myJsfPage);
        return Response.status(Status.ACCEPTED).build();
    }


}
