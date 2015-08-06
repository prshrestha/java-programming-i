
public class Accounts {

    public static void main(String[] args) {
        double transfer = 100.0;
        Account Matt = new Account("Matt's account", 1000.0);
        Account myAccount = new Account("My account", 0.0);
        Matt.withdrawal(transfer);
        myAccount.deposit(transfer);

        System.out.println(Matt.toString());
        System.out.println(myAccount.toString());
    }
}
