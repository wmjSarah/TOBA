/*©2018 Sarah Wilderman
Login Servlet for Titan Online Banking*/
package titanOBA;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
        String userName = req.getParameter("userName");
        String passWord = req.getParameter("passWord");
        String url = "/Account_activity.jsp";
        
        if (userName.equals(user.getUserName()) && (passWord.equals(user.getPassword()))) {
            getServletContext().getRequestDispatcher(url).forward(req, resp);
        }
        else {
            url = "/Login_failure.jsp";
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
