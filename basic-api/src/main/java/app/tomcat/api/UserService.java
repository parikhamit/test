package app.tomcat.api;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by nhristov on 1/14/14.
 * Added comments
 */
public interface UserService {
    @Path("users")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    String listUsers();

    @Path("user/{id}")
    @DELETE
    @Produces({MediaType.APPLICATION_JSON})
    String deleteUser(@PathParam("id") String id);

}
