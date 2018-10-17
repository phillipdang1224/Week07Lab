package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import models.User;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDB {
    
    public int insert(User user) throws NotesDBException {
        return 0;
    }
    
    public int update(User user) throws NotesDBException {
        String preparedSQL = "UPDATE users SET"
                             + "    username = ?"
                             + "    password = ?"
                             + "    firstname = ?"
                             + "    lastname = ?"
                             + "    email = ?";
        PreparedStatement ps = connection.prepareStatement(preparedSQL);
        ps.setString(1, users);
        ps.setString(2, users);
        ps.setString(3, users);
        ps.setString(4, users);
        ps.executeUpdate();
    }
    
    public List<User> getAll() throws NotesDBException {
        return null;
    }
    
    public User getUser(String username) throws NotesDBException {
        return null;
    }
    
    public int delete(User user) throws NotesDBException {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        String preparedQuery = "DELETE FROM USERS"
                + "WHERE username = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(preparedQuery);
            ps.setString(1, user.getUsername());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pool.freeConnection(connection);
        }
        return 0;
    }
}
