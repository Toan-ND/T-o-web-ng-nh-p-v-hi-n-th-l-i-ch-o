import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "test_login", urlPatterns = "/login")
public class test_login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password= request.getParameter("password");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        if ("admin".equals(username) && "123456".equals(password)){
            writer.println("<hl>Welcome" + username+ "to Website of ToanBoss </hl>");
        }
        else {writer.println("<hl> Login error </hl>");
            writer.println("</html>");}
    }
}
