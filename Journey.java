import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine().toLowerCase();

        if (budget<=100){
            if ("summer".equals(season)){
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Camp - %.2f", budget*0.3);
            }else {
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Hotel - %.2f", budget*0.7);
            }
        }else if(budget<=1000){
            if ("summer".equals(season)){
                System.out.println("Somewhere in Balkans");
                System.out.printf("Camp - %.2f", budget*0.4);
            }else {
                System.out.println("Somewhere in Balkans");
                System.out.printf("Hotel - %.2f", budget*0.8);
            }
        }else{
                System.out.println("Somewhere in Europe");
                System.out.printf("Hotel - %.2f", budget*0.9);

        }


    }
}
