import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/interfaceNavigation")
public class MainMenuInterface extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String site = "mainmenu.jsp";

        switch (Integer.parseInt(request.getParameter("MainMenuInterfaceButtons"))){
            case 1:
                site = "addUser.jsp";
                break;

            case 2:
                site = "removeUser.jsp";
                break;

            case 3:
                site = "editUser.jsp";
                break;

            case 4:
                site = "checkUser.jsp";
                break;

            case 5:
                site = "checkBook.jsp";
                break;

            case 6:
                site = "editBooks.jsp";
                break;

            case 7:
                site = "addBook.jsp";
                break;

            case 8:
                site = "removeBook.jsp";
                break;

            case 9:
                site = "logout.jsp";
                break;
        }

        request.getRequestDispatcher(site).forward(request, response);
    }
}
