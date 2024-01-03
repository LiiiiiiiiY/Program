package TestBank;

public class Bank {
    private static int id = 1000;
    private int pwd;
    private double balace;
    private double interestRate;
    private double minBalace = 10;

    Bank(int pwd,double balace){
        id = id + 1;
        this.pwd = pwd;
        this.balace = balace;
        if(this.balace>=3000.0)this.interestRate = 0.038;
        else if(this.balace>=2000.0)this.interestRate = 0.031;
        else this.interestRate = 0.023;
    }

    void output(){
        System.out.printf("Bank [id=%d, pwd=%d, balace=%.1f, interestRate=%.3f, minBalace=%.1f]\n",
                id,this.pwd,this.balace,this.interestRate,this.minBalace);
    }
}
