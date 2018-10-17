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
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();

        String preparedSQL = "UPDATE users SET"
                             + "    username = ?"
                             + "    password = ?"
                             + "    firstname = ?"
                             + "    lastname = ?"
                             + "    email = ?";
        int rowCount = 0;
        try {
            PreparedStatement ps = connection.prepareStatement(preparedSQL);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getFirstname());
            ps.setString(4, user.getLastname());
            ps.setString(5, user.getEmail());
            
            //returns 1 if has one row to update. returns 0 if no rows.
            rowCount = ps.executeUpdate();
        } catch (SQLException e) {
        }
        
        pool.freeConnection(connection);
        return rowCount;
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
