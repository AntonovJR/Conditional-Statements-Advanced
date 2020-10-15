import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowerType = scanner.nextLine();
        int pieces = Integer.parseInt(scanner.nextLine());
        double budged = Double.parseDouble(scanner.nextLine());
        double discount = 0.0d;
        double price = 0.0d;

        switch (flowerType) {
            case "Roses":
                price = 5;
                discount = 1;
                if (pieces>80){
                    discount = 0.9;
                } break;
            case "Dahlias":
                price = 3.8;
                discount = 1;
                if (pieces>90) {
                    discount = 0.85;
                } break;
            case "Tulips":
                price = 2.8;
                discount = 1;
                if (pieces>80) {
                    discount = 0.85;
                } break;
            case "Narcissus":
                price = 3;
                discount = 1;
                if (pieces<120) {
                    discount = 1.15;
                } break;
            case "Gladiolus":
                price = 2.5;
                discount = 1;
                if (pieces<80) {
                    discount = 1.2;
                } break;

        }
        double total = price*pieces*discount;
        if (total>budged){
            System.out.printf("Not enough money, you need %.2f leva more.",Math.abs(total-budged));

        }else if (total<=budged){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",pieces,flowerType,(budged-total));
        }
    }
}
