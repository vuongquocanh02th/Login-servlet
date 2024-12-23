package org.example.simplelogin;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HelloServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("user");
        String password = req.getParameter("pass");

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        if("admin".equals(username) && "admin".equals(password)){
            writer.println("<h1>Welcome "+username+" to website</h1>");
        }else {
            writer.println("<h1>Login Error</h1>");
        }
        writer.println("</html>");
    }
}
