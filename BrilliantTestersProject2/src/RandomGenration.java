import java.util.Random;

public class RandomGenration {
    public static void main(String[] args) {
            Random random = new Random();

            int result = random.nextInt(); //generate random numbers
            String email = "srikanth"+result+"@testmail.com";
            createUsers(email,"Password1");
        }


    public static void createUsers(String email, String password1) {
        System.out.println(email+" "+password1);
    }

}
