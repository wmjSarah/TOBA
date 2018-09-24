/*©2018 Sarah Wilderman
New Customer Registration Servlet for Titan Online Banking*/
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
import titanOBA.data.*;



public class NewCustomerServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException 
    {        
        HttpSession session = req.getSession();
        
        
        //Declare Variables
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
        
        //Validate User Inputs in Data Fields
        if ((toggle.equals("yes")) && (firstName == null || lastName == null || phone == null || address == null ||
                city == null || state == null || zipcode == null || email == null ||
                firstName.isEmpty() || lastName.isEmpty() || phone.isEmpty() || address.isEmpty() ||
                city.isEmpty() || state.isEmpty() ||zipcode.isEmpty() || email.isEmpty())) {
            message = "Please make sure you have filled out all text fields.";
            url = "/New_customer.jsp";
        }
        
        //Add user and account to database
        else{
            User user = new User(firstName, lastName, phone, address, city, state, zipcode, email, (lastName+zipcode), "welcome1");
            Account account = new Account(25.00, user);
            session.setAttribute("user", user);
            url = "/Success.jsp";
            UserDB.insert(user);
            AccountDB.insert(account);
        }
        req.setAttribute("message", message);
        getServletContext().getRequestDispatcher(url).forward(req,res);
   
        
    }
    
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        doPost(req, res);
    }
    
}
