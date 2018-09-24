/* Account Database Class for TITAN Online Banking App
Copyright Sarah Wilderman, 2018
*/
package titanOBA.data;

import java.sql.*;
import titanOBA.*;

public class AccountDB {
    
    public static int insert(Account account) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection =  pool.getConnection();
        PreparedStatement ps = null;
        
        String query
                ="INSERT INTO ACCOUNT (Account, Balance) "
                + "VALUES (?, ?)";
        
        try {
            ps = connection.prepareStatement(query);
            ps.setObject(1, account.getUser());
            ps.setDouble(2, account.getBalance());

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
