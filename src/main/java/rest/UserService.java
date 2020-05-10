package rest;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("endusers")
public class UserService {

    private UserFunction function = new UserFunction();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean addUser(User user) {
        return function.addUser(user);
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getAllUsers() {
        return function.getUsers();
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public User findUser(@PathParam("id") int id) {
        return function.findUser(id);
    }
    @DELETE
    public boolean deleteUser(User user) {
        return function.deleteUser(user.getId());
    }
    @PUT
    public boolean editUser(User user) {
        return function.editUser(user);
    }
}
