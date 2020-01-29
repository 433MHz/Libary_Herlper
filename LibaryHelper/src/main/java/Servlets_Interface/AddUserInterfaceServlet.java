package Servlets_Interface;

import Servlet_Database_Agent.AddUser_JDBC;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AddUserInterfaceServlet")
public class AddUserInterfaceServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        final String pesel_length = "99999999999";

        String[] list = new String[3];
        list[0] = request.getParameter("userName");
        list[1] = request.getParameter("userLastname");
        list[2] = request.getParameter("userPesel");

        try{
            Long.parseLong(list[2]);
        }
        catch (Exception ex){
            String info = "PESEL musi być liczbą!";
            request.setAttribute("NULL_info", info);
            request.getRequestDispatcher("addUser.jsp").forward(request, response);
        }

        if(list[0].equals("") || list[1].equals("") || list[2].equals("")){
            String info = "Żadne pole nie może pozostać puste!";
            request.setAttribute("NULL_info", info);
            request.getRequestDispatcher("addUser.jsp").forward(request, response);
        }

        else if(Long.parseLong(list[2]) < 0 || Long.parseLong(list[2]) > Long.parseLong(pesel_length)){
            String info = "Numer pesel może mieć do 11 znaków!";
            request.setAttribute("NULL_info", info);
            request.getRequestDispatcher("addUser.jsp").forward(request, response);
        }

        else{
            try {
                AddUser_JDBC.AddUser(list);
                String info = "Dodano pomyślnie!";
                request.setAttribute("NULL_info", info);
                request.getRequestDispatcher("addUser.jsp").forward(request, response);
            }

            catch (Exception e) {
                String info = "Nieoczekiwany błąd: " + e;
                request.setAttribute("NULL_info", info);
                request.getRequestDispatcher("addUser.jsp").forward(request, response);
            }
        }
    }
}
