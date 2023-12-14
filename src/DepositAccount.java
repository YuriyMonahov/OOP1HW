import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static java.time.LocalDate.*;

public class DepositAccount extends Account {
    public DepositAccount(double balance) {
        super(balance);
    }

    @Override
    public double takeAmount(double sumTake) {
        LocalDate now = LocalDate.now();
        LocalDate today = LocalDate.now().minusDays(30);
        long monthBetweenTodayAndNow = ChronoUnit.MONTHS.between(today, now);
        if (monthBetweenTodayAndNow < 1) {
            return super.takeAmount(sumTake);
        } else {
            return 0;
        }
    }
}








