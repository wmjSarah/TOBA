package titanOBA;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewCustomerServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException 
    {        
        String url= "/index.html";
        
        String toggle = req.getParameter("toggle");
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String phone = req.getParameter("phone");
        String address = req.getParameter("address");
        String city = req.getParameter("city");
        String state = req.getParameter("state");
        String zipcode = req.getParameter("zipcode");
        String email = req.getParameter("email");
        
        String message = "";
        
        if ((toggle.equals("yes")) && (firstName == null || lastName == null || phone == null || address == null ||
                city == null || state == null || zipcode == null || email == null ||
                firstName.isEmpty() || lastName.isEmpty() || phone.isEmpty() || address.isEmpty() ||
                city.isEmpty() || state.isEmpty() ||zipcode.isEmpty() || email.isEmpty())) {
            message = "Please make sure you have filled out all text fields.";
            url = "/New_customer.jsp";
        }
        
        else  if (toggle.equals("yes")) {
            res.sendRedirect("Success.html");
        }
        req.setAttribute("message", message);
        getServletContext().getRequestDispatcher(url).forward(req,res);
        
    }
    
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        doPost(req, res);
    }
    
    
}
