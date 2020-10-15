import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine().toLowerCase();
        double trade = Double.parseDouble(scanner.nextLine());
        boolean isValidCity = true;
        boolean isValidTrade = true;
        double commision = 0.0;
        if ("sofia".equals(city)) {
            if (trade > 0 && trade <= 500) {
                commision = 0.05;
            } else if (trade >= 500 && trade <= 1000) {
                commision = 0.07;
            } else if (trade >= 1000 && trade <= 10000) {
                commision = 0.08;
            } else if (trade > 10000) {
                commision = 0.12;
            } else {
                isValidTrade = false;
            }
        } else if ("varna".equals(city)) {
            if (trade > 0 && trade <= 500) {
                commision = 0.045;
            } else if (trade >= 500 && trade <= 1000) {
                commision = 0.075;
            } else if (trade >= 1000 && trade <= 10000) {
                commision = 0.10;
            } else if (trade > 10000) {
                commision = 0.13;
            } else {
                isValidTrade = false;
            }
        } else if ("plovdiv".equals(city)) {
            if (trade > 0 && trade <= 500) {
                commision = 0.055;
            } else if (trade >= 500 && trade <= 1000) {
                commision = 0.08;
            } else if (trade >= 1000 && trade <= 10000) {
                commision = 0.12;
            } else if (trade > 10000) {
                commision = 0.145;
            } else {
                isValidTrade = false;
            }
        } else {
            isValidCity = false;
        }

        if (!isValidCity || !isValidTrade) {
            System.out.println("error");
        } else {

            double result = commision * trade;
            System.out.printf("%.2f%n", result);

        }
    }
}