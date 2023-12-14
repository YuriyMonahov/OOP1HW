public class Account {

    private double balance;
;

    public Account(double balance) {
        this.balance = balance;
    }
    public double putAmount(double sumPut){
        balance+= sumPut;
        return balance;
}

    public double takeAmount(double sumTake) {
        if (sumTake > balance) {
            return 0;
        } else {
            return balance -= sumTake;
        }
    }

    public double getBalance() {
        return balance;
    }


}

