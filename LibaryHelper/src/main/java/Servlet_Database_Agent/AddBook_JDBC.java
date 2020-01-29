package Servlet_Database_Agent;

public class AddBook_JDBC extends JDBC {


    public static void AddBook(String[] list) throws Exception{


            JDBC.executeUpdate("INSERT INTO books VALUES("
                    + "NULL, "
                    + "'" + list[0] + "', "
                    + "'" + list[1] + "', "
                    + "'" + list[2] + "', "
                    + "'" + list[3] + "', "
                    + "'" + list[4] + "', "
                    + "'" + list[5] + "', "
                    + "CURDATE()"
                    + ")"
            );
        }
    }

