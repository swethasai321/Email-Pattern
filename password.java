package emailpassword;
import java.util.Scanner;

public class password {


    public static void main(String[] args) {
        String email = null;
        String password = null;
        Boolean password_valid = false;
        Boolean email_valid = false;

        try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter your email: ");
            email = input.nextLine();

            System.out.println("Enter your passsword: ");
            password = input.nextLine();
             //email matchers
		}
             if (email.matches("[\\w]+@[\\w]+\\.[a-zA-Z]{2,3}"))
                email_valid = true;
            else
                email_valid = false;

            //password validation
            if ((password.matches(".[^\\w\\s].")) &&
            
                    (password.matches(".[a-zA-Z].")) &&
                    
                    (password.matches(".[0-9].")) &&
                    
                    (password.length() >= 8))
                password_valid = true;
            else
                password_valid = false;

            if(password_valid && email_valid) {
                System.out.println(" Welcome User!!");
            }
            else if (!email_valid && !password_valid) {
                    System.out.println(" Re-enter your email: ");
               
            }
            else {

            	System.out.println("email & password is wrong");
        }

    }
}



