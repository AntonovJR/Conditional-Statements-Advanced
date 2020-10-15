import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double years = Double.parseDouble(scanner.nextLine());
        String sex = scanner.nextLine();

        switch (sex) {
            case "f":
                if (years >= 16) {
                    System.out.printf("Ms.");
                } else {
                    System.out.printf("Miss");
                }
                break;
            case "m":
                if (years >= 16) {
                    System.out.printf("Mr.");
                } else {
                    System.out.printf("Master");
                }
                break;

        }
    }
}
