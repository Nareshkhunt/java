import java.util.Random;

/**
 * Created by User on 20/08/2017.
 */
public class RandomDemo1 {
    public static void main(String[] args) {
        for (int i=0;i<10;i++) {
            Random random = new Random();
            int result = random.nextInt();
            String email = "srikanth"+result+"@testmail.com";
            createUsers(email,"Password1");
        }
    }

    public static void createUsers(String email, String password1) {
        System.out.println(email+" "+password1);
    }
}
