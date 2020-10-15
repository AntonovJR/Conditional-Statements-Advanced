import java.util.Scanner;

public class PointInTheFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = Integer.parseInt(scanner.nextLine());
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        if ((x >= 0 && x <= h * 3 && y == 0)
              || (y >= 0 && y <= h && x == 0)
              || (y == h && x >= 0 && x <= h)
               || (x == h && y >= h && y <= h * 4)
               || (y == h * 4 && x >= h && x <= h * 2)
            || (x == h * 2 && y >= h && y <= h * 4)
                || (y == h && x >= h * 2 && x <= h * 3)
                || (x == h * 3 && y >= 0 && y <= h)) {
            System.out.println("border");
        } else if (x < 0 || y < 0
                || x > h * 3 || y > h * 4
                || (x < h && y > h && y <= h * 4)
                || (x > h * 2 && y > h && y <= h * 4)) {
            System.out.println("outside");
        } else {
            System.out.println("inside");
        }
    }
}