package database;

import java.sql.*;

public class ConnectionPool {

    private ConnectionPool() {

    }

    public static synchronized ConnectionPool getInstance() {
        return null;
    }

    public Connection getConnection() {
        return null;
    }

    public void freeConnection(Connection c) {
        
    }
    
    public int delete(String username){
        String preparedQuery = "DELETE FROM USERS"
                              + "WHERE user = ?";
        PreparedStatement ps = connection.prepareStatement(preparedQuery);
        ps.setString(1,username);
        ps.executeUpdate();
        
    }
}