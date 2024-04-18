package banking;

public class TestBanking {
    public static void main(String[] args) {
        Account a =new Account(500);
        System.out.println("Creating an account with a "+a.getBlance()+" balance");
        System.out.println("Withdraw "+a.withdraw(150));
        System.out.println("Deposit " + a.deposit(22.50));
        System.out.println("Withdraw " + a.withdraw(47.62));
        System.out.println("The account has a balance of " + a.getBlance());
    }
}
