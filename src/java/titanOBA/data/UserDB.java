/* User Database Class for TITAN Online Banking App
Copyright Sarah Wilderman, 2018
*/
package titanOBA.data;

import java.sql.*;
import titanOBA.*;


public class UserDB {
    
    public static int insert(User user) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection =  pool.getConnection();
        PreparedStatement ps = null;
        
        String query
                ="INSERT INTO USER (firstName, lastName, phone, address, city, state, zipcode, email, userName, password) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, user.getfirstName());
            ps.setString(2, user.getlastName());
            ps.setString(3, user.getPhone());
            ps.setString(4, user.getAddress());
            ps.setString(5, user.getCity());
            ps.setString(6, user.getState());
            ps.setString(7, user.getZipcode());
            ps.setString(9, user.getEmail());
            ps.setString(9, user.getUserName());
            ps.setString(10, user.getPassword());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            TobaDBUtilServlet.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
        
    }
    
    public static int update(User user) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        
        String query = "Update User SET "
                + "firstName = ?, "
                + "lastName = ?, "
                + "phone = ?, "
                + "address = ?, "
                + "city = ?, "
                + "state = ?, "
                + "zipcode = ?, "
                + "email = ?, "
                + "userName = ?, "
                + "password = ? "
                + "WHERE email = ?";
        
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, user.getfirstName());
            ps.setString(2, user.getlastName());
            ps.setString(3, user.getPhone());
            ps.setString(4, user.getAddress());
            ps.setString(5, user.getCity());
            ps.setString(6, user.getState());
            ps.setString(7, user.getZipcode());
            ps.setString(8, user.getEmail());
            ps.setString(9, user.getUserName());
            ps.setString(10, user.getPassword());
            
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            TobaDBUtilServlet.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
}
