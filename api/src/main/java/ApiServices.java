import javax.annotation.security.PermitAll;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/test")
public class ApiServices {
    @OPTIONS
    @Path("/")
    @PermitAll
    public Response handle() {

        return Response.status(Response.Status.NO_CONTENT)
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods", "POST")
                .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
                .allow("OPTIONS").build();
    }

    @POST
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getAMTService(String request) {
        String response = "{welcome: 'chathuranga'}";//processor.processWebRequest(request);

        //return Response.status(Response.Status.OK).entity(response).build();
        System.out.println("new request");
        return Response.status(Response.Status.OK)
                .entity(response)

                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods", "POST")
                .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
                .build();
    }
}
