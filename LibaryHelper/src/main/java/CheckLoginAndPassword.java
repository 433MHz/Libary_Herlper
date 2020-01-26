import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/loginProcessing")
public class CheckLoginAndPassword extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if(FindUserInDatabase.findUser(request.getParameter("loginTextInIndex"),
                request.getParameter("passwordTextInIndex"))){                                           //If user exist redirect to mainmenu.jsp
                    request.setAttribute("login", request.getParameter("loginTextInIndex"));
                    request.setAttribute("password", request.getParameter("passwordTextInIndex"));
                    request.getRequestDispatcher("mainmenu.jsp").forward(request, response);
        }
        else{                                                                                               //If not redirect to index.jsp
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }
}
