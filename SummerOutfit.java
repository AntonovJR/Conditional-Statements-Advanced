import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degrees = Integer.parseInt(scanner.nextLine());
        String dayPart = scanner.nextLine().toLowerCase();
        String outfit = "";
        String shoes = "";
        if ("morning".equals(dayPart)) {
            if (degrees <= 18) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else if (degrees > 18 && degrees <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
        }
        else if ("afternoon".equals(dayPart)) {
            if (degrees <= 18) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }

            else if (degrees > 18 && degrees <= 24) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
            else {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }
        } else {
            outfit = "Shirt";
            shoes = "Moccasins";

        }

        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
    }
}
