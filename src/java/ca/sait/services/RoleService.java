package ca.sait.services;

import ca.sait.dataaccess.RoleDB;
import ca.sait.models.Role;
import java.util.List;

public class RoleService {
    
    public List<Role> getAll() throws Exception {
        RoleDB roleDB = new RoleDB();
        List<Role> roles = roleDB.getAll();
        return roles;
    }
    
}
