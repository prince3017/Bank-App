
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ,pass,balance to create an account");

        //crate user
        String name = sc.next();
        String password = sc.next();
        double balance = sc.nextDouble();

        SBIUser user = new SBIUser(name,balance,password);
        System.out.println("the new Acount No:" + user.getAccountNo());

        //addd amt
        String message = user.addMoney(1000);
        System.out.println(message);

        //paisa nikal
        System.out.println("paisa kitna chahiye");
        int money = sc.nextInt();
        System.out.println("pass dal");
        String pass = sc.next();
        System.out.println(user.withdrawMoney(money,pass));

        ///rate of interest
        System.out.println("RateOfInterest:"+user.calculateInterest(10));

        System.out.println("This is change");
    }
}