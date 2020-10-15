import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine().toLowerCase();
        double days = Double.parseDouble(scanner.nextLine());
        double priceStudio = 0.0d;
        double priceApartment = 0.0d;
        double rentStudio = 0.0;
        double rentApartment = 0.0d;

        switch (month) {
            case "may":
            case "october":
                priceApartment = 65;
                priceStudio = 50;

                rentStudio = priceStudio * days;
                rentApartment = priceApartment * days;
                if (days > 14) {
                    rentStudio = priceStudio * days * 0.7;
                    rentApartment = priceApartment * days * 0.9;
                } else if (days > 7) {
                    rentStudio = priceStudio * days * 0.95;
                }
                break;
            case "june":
            case "september":
                priceApartment = 68.7;
                priceStudio = 75.2;

                rentStudio = priceStudio * days;
                rentApartment = priceApartment * days;
                if (days > 14) {
                    rentStudio = priceStudio * days * 0.8;
                    rentApartment = priceApartment * days * 0.9;
                }
                break;
            case "july":
            case "august":
                priceApartment = 77;
                priceStudio = 76;

                rentStudio = priceStudio * days;
                rentApartment = priceApartment * days;
                if (days > 14) {
                    rentApartment = priceApartment * days * 0.9;

                }
        }

        System.out.printf("Apartment: %.2f lv.", rentApartment);
        System.out.println("");
        System.out.printf("Studio: %.2f lv.", rentStudio);


    }
}
