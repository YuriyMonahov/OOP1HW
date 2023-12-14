public class CreditAccount extends Account{

    public CreditAccount(double balance) {
        super(balance);
    }



    @Override
    public double takeAmount(double sumTake) {
        double comission = sumTake + (sumTake/100);
        double a = getBalance() - comission;
        return a;
    }


}

