package Servlets_Interface;

import Servlet_Database_Agent.RemoveUser_JDBC;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RemoveUserInterfaceServlet")
public class RemoveUserInterfaceServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String[] list = new String[2];
        list[0] = request.getParameter("UserId");
        list[1] = request.getParameter("UserPeselNumber");

        if(list[0] != ""){
            try {
                if(RemoveUser_JDBC.removeUserByID(list[0])){
                    String info = "Usunięto pomyślnie!";
                    request.setAttribute("NULL_info", info);
                    request.getRequestDispatcher("removeUser.jsp").forward(request, response);
                }
                else{
                    String info = "Użytkownika nie ma w bazie danych";
                    request.setAttribute("NULL_info", info);
                    request.getRequestDispatcher("removeUser.jsp").forward(request, response);
                }
            } catch (Exception e) {
                String info = "Nieoczekiwany błąd: " + e;
                request.setAttribute("NULL_info", info);
                request.getRequestDispatcher("removeUser.jsp").forward(request, response);
            }
        }
        else if(list[1] != ""){
            try {
                if(RemoveUser_JDBC.removeUserByPesel(list[1])){
                    String info = "Usunięto pomyślnie!";
                    request.setAttribute("NULL_info", info);
                    request.getRequestDispatcher("removeUser.jsp").forward(request, response);
                }
                else{
                    String info = "Użytkownika nie ma w bazie danych";
                    request.setAttribute("NULL_info", info);
                    request.getRequestDispatcher("removeUser.jsp").forward(request, response);
                }
            }
            catch (Exception e) {
                String info = "Nieoczekiwany błąd: " + e;
                request.setAttribute("NULL_info", info);
                request.getRequestDispatcher("removeUser.jsp").forward(request, response);
            }
        }
        else{
            String info = "Pola nie mogą pozostać puste";
            request.setAttribute("NULL_info", info);
            request.getRequestDispatcher("removeUser.jsp").forward(request, response);
        }
    }
}
