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

        final String maxISBNLenght = "9999999999999";


        String[] list = new String[6];
        list[0] = request.getParameter("BookTitle");
        list[1] = request.getParameter("BookAuthorFirstname");
        list[2] = request.getParameter("BookAuthorLastname");
        list[3] = request.getParameter("BookPrinter");
        list[4] = request.getParameter("PublishYear");
        list[5] = request.getParameter("isbnNumber");

        try{
            Integer.parseInt(list[4]);
        }
        catch (Exception ex){
            String info = "Rok musi być liczbą!";
            request.setAttribute("NULL_info", info);
            request.getRequestDispatcher("addBook.jsp").forward(request, response);
        }

        try{
            Long.parseLong(list[5]);
        }
        catch (Exception ex){
            String info = "ISBN musi być liczbą!";
            request.setAttribute("NULL_info", info);
            request.getRequestDispatcher("addBook.jsp").forward(request, response);
        }

        if (list[0].equals("") || list[1].equals("") || list[2].equals("") || list[3].equals("") || list[4].equals("") || list[5].equals("")){
            String info = "Żadne pole nie może pozostać puste!";
            request.setAttribute("NULL_info", info);
            request.getRequestDispatcher("addBook.jsp").forward(request, response);
        }

        else if (Integer.parseInt(list[4]) < 0 || Integer.parseInt(list[4]) > 3000) {
                String info = "Rok musi być między rokiem 0 a rokiem 3000";
                request.setAttribute("NULL_info", info);
                request.getRequestDispatcher("addBook.jsp").forward(request, response);
            }

        else if(Long.parseLong(list[5]) < 0 || Long.parseLong(list[5]) > Long.parseLong(maxISBNLenght)){
            String info = "Numer ISBN może mieć maksymalnie 13 cyfr!";
            request.setAttribute("NULL_info", info);
            request.getRequestDispatcher("addBook.jsp").forward(request, response);
        }

        else {
            try {
                AddBook_JDBC.AddBook(list);
                String info = "Dodano pomyślnie!";
                request.setAttribute("NULL_info", info);
                request.getRequestDispatcher("addBook.jsp").forward(request, response);
            } catch (Exception e) {
                String info = "Nieoczekiwany błąd: " + e;
                request.setAttribute("NULL_info", info);
                request.getRequestDispatcher("addBook.jsp").forward(request, response);
            }
        }
    }
}
