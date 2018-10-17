package database;

import java.sql.PreparedStatement;
import models.User;
import java.util.List;

public class UserDB {

    public int insert(User user) throws NotesDBException {
        return 0;
    }

    public int update(User user) throws NotesDBException {
        String preparedSQL = "UPDATE users SET";
        PreparedStatement ps = connection.prepareStatement(preparedSQL);
        ps.setString(1, );
        ps.setString(2, );
        ps.setString(3, );
        ps.setString(4, );
        ps.executeUpdate();
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
