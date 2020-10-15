import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine().toLowerCase();
        String day = scanner.nextLine().toLowerCase();
        double quantity = Double.parseDouble(scanner.nextLine());
        boolean isValidFruit = true;
        boolean isValidDay = true;
        double cost = 0.0d;


        if ("monday".equals(day) || "tuesday".equals(day) || "wednesday".equals(day) || "thursday".equals(day) || "friday".equals(day)) {

            if ("banana".equals(fruit)) {
                cost = 2.5;
            } else if ("apple".equals(fruit)) {
                cost = 1.2;
            } else if ("orange".equals(fruit)) {
                cost = 0.85;
            } else if ("grapefruit".equals(fruit)) {
                cost = 1.45;
            } else if ("kiwi".equals(fruit)) {
                cost = 2.7;
            } else if ("pineapple".equals(fruit)) {
                cost = 5.5;
            } else if ("grapes".equals(fruit)) {
                cost = 3.85;
            } else {
                isValidFruit = false;
            }
        } else if ("saturday".equals(day) || "sunday".equals(day)) {

            if ("banana".equals(fruit)) {
                cost = 2.7;
            } else if ("apple".equals(fruit)) {
                cost = 1.25;
            } else if ("orange".equals(fruit)) {
                cost = 0.90;
            } else if ("grapefruit".equals(fruit)) {
                cost = 1.60;
            } else if ("kiwi".equals(fruit)) {
                cost = 3;
            } else if ("pineapple".equals(fruit)) {
                cost = 5.6;
            } else if ("grapes".equals(fruit)) {
                cost = 4.2;
            } else {
                isValidFruit = false;
            }
        } else {
            isValidDay = false;
        }


        if (!isValidFruit || !isValidDay) {
            System.out.println("error");
        } else {

            cost = cost * quantity;
            System.out.printf("%.2f%n", cost);

        }
    }
}
