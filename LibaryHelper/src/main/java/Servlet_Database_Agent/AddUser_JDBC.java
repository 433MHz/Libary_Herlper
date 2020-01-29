package Servlet_Database_Agent;

public class AddUser_JDBC extends JDBC{


    public static void AddUser(String[] list) throws Exception{


        JDBC.executeUpdate("INSERT INTO users VALUES("
                + "NULL, "
                + "'" + list[0] + "', "
                + "'" + list[1] + "', "
                + "'" + list[2] + "', "
                + "CURDATE()"
                + ")"
        );
    }
}
