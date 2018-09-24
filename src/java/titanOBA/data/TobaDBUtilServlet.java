package titanOBA.data;

import java.sql.*;
import titanOBA.*;

public class TobaDBUtilServlet {
    
    public static void closeStatement(Statement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void closePreparedStatement(Statement prepState) {
        try {
            if (prepState != null) {
                prepState.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void closeResultSet (ResultSet results) {
        try {
            if (results != null) {
                results.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}