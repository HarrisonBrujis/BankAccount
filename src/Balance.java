import java.util.Scanner;

public class Balance {
    double money;
    String withdrawal;
    String deposit;
    String change;

    public Balance(double money, String withdrawl, String deposit, String change){
        double money = 1.50;
        Scanner reader = new Scanner(System.in);
        System.out.println("Would you like to make a withdrawal or deposit? (enter w for withdrawal and d for deposit)");
        String change = reader.nextLine();
        System.out.println(change)


    }


}
