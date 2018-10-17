package models;

import database.ConnectionPool;
import database.NotesDBException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class User {
    
    public User getUser(String username) throws NotesDBException{
        
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        Statement statement = null;
        try {
            statement = connection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet users = statement.executeQuery("SELECT * FROM users WHERE username = " + username);
        User user = new User (users.getString(1), users.getString(2),users.getString(3),users.getString(4),users.getString(5));

    pool.freeConnection(connection);
        
        
        
        
        
        
        return (user); 
    }

}
