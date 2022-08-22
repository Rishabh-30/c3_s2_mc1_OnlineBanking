import java.util.Random;
import java.util.Scanner;

public class SavingsAccountImpl {
    public static void main(String[] args) {
        SavingsAccount object = new SavingsAccount("Ramesh", "Active", 450.55, 400.00);
        System.out.println("Account Holders name : " + object.accountHolderName);
        System.out.println("Account Status : " + object.accountStatus);
        System.out.println("Account Balance : " + object.accountBalance);
        String num = "123456789";
        int length = 12;
        char[] accountNumber = new char[length];
        Random r = new Random();
        for(int i = 0; i < length; i++){
            accountNumber[i]=num.charAt(r.nextInt(num.length()));
        }
        System.out.println("Account Number is:"+new String(accountNumber));
        System.out.println("Money you want to credit or debit : " + object.money);
        object.credit(object.money);
        object.debit(object.money);
        object.retrieveBalance(object.money);
    }
}
