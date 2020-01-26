import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/interfaceNavigation")
public class MainMenuInterface extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response){
        System.out.println(request.getParameter("MainMenuInterfaceButtons"));
    }
}
