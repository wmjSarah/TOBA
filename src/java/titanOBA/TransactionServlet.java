/*©2018 Sarah Wilderman
Empty Transaction Servlet for Titan Online Banking*/
package titanOBA;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.*;
import titanOBA.data.AccountDB;
import titanOBA.Account;


public class TransactionServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException 
   {        
        HttpSession session = req.getSession();
        String url = "/Account_activity.jsp";
        String credit = req.getParameter("amount");
        
        if (credit == null) {
            url = "/Add_Funds,jsp";
        }
        else {
            //I sort of gave up here because I became lost again.
            url = "/index.jsp";
        }
        
        
    }
}
