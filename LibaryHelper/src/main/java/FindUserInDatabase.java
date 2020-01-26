public class FindUserInDatabase {


    public static boolean findUser(String login, String password){

        if(DatabaseEmulation.getLogin().equals(login) && DatabaseEmulation.getPassword().equals(password)){
            return true;
        }
        else {
            return false;
        }
    }
}
