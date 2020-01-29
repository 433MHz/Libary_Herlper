package Servlet_Database_Agent;
import Date_Storage_Objects.Users_Storage;

import java.util.List;

public class RemoveUser_JDBC extends JDBC{

    public static boolean removeUserByID(String id) throws Exception {
        if(checkIfUserExistByID(id)){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean removeUserByPesel(String pesel) throws Exception{
        if(checkIfuserExistByPesel(pesel)){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean checkIfUserExistByID(String id) throws Exception {
        System.out.println(id);
        List list = executeQuerry("SELECT * FROM `users` WHERE id = " + id);
        Users_Storage users_storage = (Users_Storage) list.get(0);
        if(String.valueOf(users_storage.getId()) != ""){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean checkIfuserExistByPesel(String pesel) throws Exception {
        List list = executeQuerry("SELECT pesel_number FROM `users` WHERE pesel_number = " + pesel);
        Users_Storage users_storage = (Users_Storage) list.get(0);
        if(String.valueOf(users_storage.getId()) != ""){
            return true;
        }
        else{
            return false;
        }
    }
}
