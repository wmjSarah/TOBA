
package titanOBA;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        String userName = req.getParameter("userName");
        String passWord = req.getParameter("passWord");
        String url = "/Account_activity.html";
        
        if (userName.equals("jsmith@toba.com") && (passWord.equals("letmein"))) {
            getServletContext().getRequestDispatcher(url).forward(req, resp);
        }
        else {
            url = "/Login_failure.html";
            getServletContext().getRequestDispatcher(url).forward(req, resp);
        }
        
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException 
    {
        {
            doPost(req, resp);
        }
    }
}
