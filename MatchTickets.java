import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String type = scanner.nextLine().toLowerCase();
        int people = (int) Double.parseDouble(scanner.nextLine());
        double priceTicket = 0.0d;
        double priceTransport = 0.0d;

        if (type.equals("vip")) {
            priceTicket = 499.99;
        } else {
            priceTicket = 249.99;
        }

        if (people < 5) {
            priceTransport = budget * 0.75;
        } else if (people >= 5 && people < 10) {
            priceTransport = budget * 0.60;
        } else if (people >= 10 && people < 25) {
            priceTransport = budget * 0.50;
        } else if (people >= 25 && people < 50) {
            priceTransport = budget * 0.40;
        } else if(people >= 50){
            priceTransport = budget * 0.25;
        }

        double total = people*priceTicket+priceTransport;
        if (total>budget){
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget-total));
        }else{
            System.out.printf("Yes! You have %.2f leva left.", budget-total);
        }


    }
}
