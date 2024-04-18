package banking;

public class Account {
    private double blance;

    public Account(double init_blance){
        blance = init_blance;
    }

    public double getBlance(){
        return blance;
    }

    public double deposit(double add){
        blance = blance+add;
        return add;
    }

    public double withdraw(double sub){
        blance = blance-sub;
        return sub;
    }
}
