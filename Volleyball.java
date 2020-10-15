import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine().toLowerCase();
        double holidays = Double.parseDouble(scanner.nextLine());
        double weekends = Double.parseDouble(scanner.nextLine());

        double weekendSofia = (48 - weekends) * (3.0 / 4.0);
        double holidaysPlay = holidays * (2.0 / 3.0);
        double playedDays = weekendSofia + holidaysPlay + weekends;

        if ("leap".equalsIgnoreCase(year)) {
            playedDays = playedDays * 1.15;
        }

            System.out.printf("%.0f", Math.floor(playedDays));


    }
}