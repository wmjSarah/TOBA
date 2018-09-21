package titanOBA;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import titanOBA.User;

public class PasswordResetServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException
    {
        HttpSession session = req.getSession();
        
        String oldPass = req.getParameter("oldPass");
        String newPass = req.getParameter("newPass");
        String url = "/password_reset.jsp";
        
        User user = (User) session.getAttribute("user");
        
        user.setPassword(newPass);
        url = "/Account_activity.jsp";
        getServletContext().getRequestDispatcher(url).forward(req,res);
        
    }
}