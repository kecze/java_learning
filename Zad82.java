import java.time.temporal.ChronoUnit;
import java.time.LocalDate;

public class Zad82 {
    public static void main(String args[]) {
        int day = 29;
        int month = 11;
        int year = 2023;
        LocalDate currentDate = LocalDate.of(year, month, day);
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        long ileDni = ChronoUnit.DAYS.between(startDate, currentDate);
        System.out.println("Upłynęło " + ileDni + " dni.");
    }
}
