package site.services;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/helloworld")
public class UserService {

    @GET
    @Path("/saywhat.{mediatype}")
    @Produces({MediaType.APPLICATION_JSON})
    public String loginStatus() {
        return "Hello Darwin";
    }

}

