package rest;
import java.util.ArrayList;
import java.util.List;

public class UserFunction implements IFunctions{

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(20, "Fadl", "FM", "240300-0473", "fadl123", "Laborant"));
    }

    @Override
    public boolean addUser(User user) {
        User u = findUser(user.getId());
        if(u == null) {
            users.add(user);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteUser(int userid) {
        User user = findUser(userid);
        if(user != null) {
            users.remove(user);
            return true;
        }
        return false;
    }

    @Override
    public boolean editUser(User user) {
        User u = findUser(user.getId());
        if(u == null) {
            return false;
        }
        u.setUserName(user.getUserName());
        u.setIni(user.getIni());
        u.setPassword(user.getPassword());
        return true;
    }

    @Override
    public User findUser(int userId) {
        for (User user: users) {
            if(user.getId() == userId) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> getUsers() {
        return users;
    }
}
