import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Account acc = new Account(100000.0);
//        Scanner scanner = new Scanner(System.in);

//
//        System.out.println("Please enter sum put");
//        double put = acc.putAmount(scanner.nextDouble());
//        System.out.println("Остаток: "+put);
//        System.out.println("Please enter sum take");
//        double take = acc.takeAmount(scanner.nextDouble());
//        System.out.println("Остаток: "+ take);

//        CreditAccount cr = new CreditAccount(10000.0, 100,300);
//        System.out.println("Введите сумму снятия с кредитного счета");
//        double creditPut = cr.takeAmount(scanner.nextDouble());
//        System.out.println("Остаток: " + creditPut);

        DepositAccount dep = new DepositAccount(1000000);
        double take = dep.takeAmount(100);
        System.out.println(take);
    }



    }

