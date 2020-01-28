package Servlet_Database_Agent;

import Date_Storage_Objects.Admins_Storage;
import Date_Storage_Objects.Books_Storage;
import Date_Storage_Objects.Borrows_Storage;
import Date_Storage_Objects.Users_Storage;

import java.awt.print.Book;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBC {

    final private static String url = "jdbc:mysql://localhost:3306/baza_danych_biblioteka";
    final private static String username = "root";
    final private static String password = "";
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    private static Statement statement;
    private static ResultSet resultSet;

    private static void StartConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
    }

    private static void CloseConnection() throws Exception{
        if(resultSet != null && resultSet.isClosed() == false){
            resultSet.close();
        }
        if(preparedStatement != null && preparedStatement.isClosed() == false) {
            preparedStatement.close();
        }
        if(statement != null && statement.isClosed() == false) {
            statement.close();
        }
        if(connection != null && connection.isClosed() == false) {
            connection.close();
        }

    }




    protected static void executeUpdate(String querry) throws Exception{        //Adding values to database
        StartConnection();
        preparedStatement = connection.prepareStatement(querry);
        preparedStatement.executeUpdate();
        CloseConnection();
    }

    protected static List executeQuerry(String querry) throws Exception{        //Getting values from database
        StartConnection();
        resultSet = statement.executeQuery(querry);
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();          //Take name of table and safe to String tablName
        String tableName = resultSetMetaData.getTableName(1);

        if(tableName.equals("admini")){
            List<Admins_Storage> list = new ArrayList<Admins_Storage>();

            while(resultSet.next()){
                Admins_Storage admins_storage = new Admins_Storage();
                admins_storage.setId(resultSet.getInt(1));
                admins_storage.setLogin(resultSet.getString(2));
                admins_storage.setPassword(resultSet.getString(3));
                list.add(admins_storage);
            }
            CloseConnection();
            return list;
        }

        else if(tableName.equals("books")){
            List<Books_Storage> list = new ArrayList<Books_Storage>();

            while(resultSet.next()){
                Books_Storage books_storage = new Books_Storage();
                books_storage.setId(resultSet.getInt(1));
                books_storage.setTitle(resultSet.getString(2));
                books_storage.setAuthor_first_name(resultSet.getString(3));
                books_storage.setAuthor_last_name(resultSet.getString(4));
                books_storage.setPrinter(resultSet.getString(5));
                books_storage.setCreate_year(resultSet.getString(6));
                books_storage.setISBN_number(resultSet.getInt(7));
                books_storage.setAdded_date(resultSet.getString(8));
                list.add(books_storage);
            }
            CloseConnection();
            return list;
        }

        else if(tableName.equals("borrows")){
            List<Borrows_Storage> list = new ArrayList<Borrows_Storage>();
            while(resultSet.next()){
                Borrows_Storage borrows_storage = new Borrows_Storage();
                borrows_storage.setId(resultSet.getInt(1));
                borrows_storage.setUser_id(resultSet.getInt(2));
                borrows_storage.setBook_id(resultSet.getInt(3));
                borrows_storage.setReturnDate(resultSet.getString(4));
                list.add(borrows_storage);
            }
            CloseConnection();
            return list;
        }

        else if(tableName.equals("users")){
            List<Users_Storage> list = new ArrayList<Users_Storage>();
            while(resultSet.next()){
                Users_Storage users_storage = new Users_Storage();
                users_storage.setId(resultSet.getInt(1));
                users_storage.setFirst_name(resultSet.getString(2));
                users_storage.setLast_name(resultSet.getString(3));
                users_storage.setPESEL_number(resultSet.getInt(4));
                users_storage.setAdded_date(resultSet.getString(5));
                list.add(users_storage);
            }
            CloseConnection();
            return list;
        }
        CloseConnection();
        return null;
    }
}
