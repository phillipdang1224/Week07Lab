package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import models.User;
import java.util.List;

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

    public User getUser(String username) throws NotesDBException {
        return null;
    }

    public int delete(User user) throws NotesDBException {
        return 0;
    }
}
