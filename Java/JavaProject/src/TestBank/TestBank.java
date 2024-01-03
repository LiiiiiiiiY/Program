package TestBank;

public class TestBank {
    public static void main(String[] args) {
        Bank bank1 = new Bank(123,1000);
        bank1.output();
        Bank bank2 = new Bank(456,2000);
        bank2.output();
        Bank bank3 = new Bank(789,5000);
        bank3.output();
    }
}
