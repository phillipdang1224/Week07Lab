package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
        PreparedStatement ps = connection.prepareStatement(preparedSQL);
        ps.setString(1, users.get());
        ps.setString(2, users.get());
        ps.setString(3, users.get());
        ps.setString(4, users.get());
        ps.executeUpdate();
        
        pool.freeConnection(connection);
    }

    public List<User> getAll() throws NotesDBException {
        return null;
    }

    public User getUser(String username) throws NotesDBException, SQLException{
        
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        Statement statement = null;
        try {
            statement = connection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet users = statement.executeQuery("SELECT * FROM users WHERE username = '" + username + "'");
        User user = new User (users.getString(1), users.getString(2),users.getString(3),users.getString(4),users.getString(5));

        pool.freeConnection(connection);
        return (user); 
    }
    }

    public int delete(User user) throws NotesDBException {
        return 0;
    }
}
