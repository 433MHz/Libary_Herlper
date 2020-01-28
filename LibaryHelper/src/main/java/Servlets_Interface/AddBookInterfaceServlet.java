package Servlets_Interface;

import Servlet_Database_Agent.AddBook_JDBC;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AddBookInterfaceServlet")
public class AddBookInterfaceServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String[] list = new String[6];
        list[0] = request.getParameter("BookTitle");
        list[1] = request.getParameter("BookAuthorFirstname");
        list[2] = request.getParameter("BookAuthorLastname");
        list[3] = request.getParameter("BookPrinter");
        list[4] = request.getParameter("PublishYear");
        list[5] = request.getParameter("isbnNumber");

        for(int i = 0; i<5; i++){
            System.out.println(list[i]);
        }

        if (list[0].equals("") || list[1] == null || list[2] == null || list[3] == null || list[4] == null || list[5] == null){
            String info = "Żadne pole nie może pozostać puste!";
            request.setAttribute("NULL_info", info);
            request.getRequestDispatcher("addBook.jsp").forward(request, response);
        }
        else {
            try {
                AddBook_JDBC.AddBook(list);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
