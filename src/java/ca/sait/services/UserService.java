package ca.sait.services;

import ca.sait.dataaccess.UserDB;
import ca.sait.models.Role;
import ca.sait.models.User;
import java.util.List;

public class UserService {
    UserDB userDB = new UserDB();
    
    public User get(String email) throws Exception {
        User user = this.userDB.get(email);
        return user;
    }
    
    public List<User> getAll() throws Exception{

        List<User> users = userDB.getAll();

        return users;
    }
    
    public boolean insert(String email, boolean active, String firstName, String lastName, String password, Role role) throws Exception {
        User user = new User(email, active, firstName, lastName, password, role);
        return this.userDB.insert(user);
    }
    public boolean delete(String email) throws Exception {
        User user = this.get(email);
       
        return this.userDB.delete(user);
    }
}
