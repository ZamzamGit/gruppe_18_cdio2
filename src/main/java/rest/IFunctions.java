package rest;

import java.util.List;

public interface IFunctions {

    boolean addUser(User user);
    boolean deleteUser(int userid);
    boolean editUser(User user);
    User findUser(int userId);
    List<User> getUsers();

}
