import java.util.Scanner;

    public class BankAccount {
        double pinInput;
        String username;

        public BankAccount (double pinInput) {
            Scanner reader = new Scanner(System.in);
            System.out.println("Enter your username: ");
            String yourUser = reader.nextLine();
            System.out.println(yourUser);
            System.out.println("Enter your password: ");
            String yourPass = reader.nextLine();
            System.out.println(yourPass);

            if (yourUser.equals("ANIMELORD9999") && yourPass.equals("password123")){
                System.out.println("Access granted!");
            }

        }

    }

