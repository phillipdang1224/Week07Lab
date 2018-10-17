package services;

import database.NotesDBException;
import java.sql.PreparedStatement;
import models.User;
import java.util.List;

public class UserService {
    Connec
    public User get(String username) throws Exception {
        return null;
    }

    public List<User> getAll() throws NotesDBException 
    {
        
        String preparedQuery =
                    "SELECT ?"
                +   ",      ?"
                +   ",      ?"
                +   ",      ?"
                +   "FROM   ?";
        PreparedStatement ps = connection.prepareStatement(preparedQuery);
        
        return null;
    }

    public int update(String username, String password) throws Exception {
        return 0;
    }

    public int delete(String username) throws Exception {
        return 0;
    }

    public int insert(String username, String password) throws Exception {
        return 0;
    }

}
