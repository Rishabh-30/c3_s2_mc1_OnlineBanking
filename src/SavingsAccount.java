import java.util.Random;

public class SavingsAccount {

    String accountHolderName;
    String accountStatus;
    double accountBalance;
    double money;
    //Random random = new Random();
    // long accountNumber = random.nextLong(1000000000000L);
    public SavingsAccount(String accountHolderName,String accountStatus,double accountBalance,double money) {
        this.accountBalance = accountBalance;
        //this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountStatus = accountStatus;
        this.money = money;
    }

    public double credit(double money) {
        accountBalance = accountBalance + money;
        System.out.println("After crediting $"+money+"in your account, Account Balance is : " + accountBalance);
        return accountBalance;
    }
    public double debit(double money) {
        accountBalance = accountBalance - money;
        System.out.println("After debiting $"+money+"in your account, Account Balance is : " + accountBalance);
        return  accountBalance;
    }
    public double retrieveBalance(double money) {
        System.out.println("current account balance is : " + accountBalance);
        return  accountBalance;
    }
}

