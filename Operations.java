
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = (int) Double.parseDouble(scanner.nextLine());
        int b = (int) Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        BigDecimal result = new BigDecimal("0.00");
        String output= "";
        DecimalFormat intFormatter = new DecimalFormat("0");
        if (b==0&& (operator.equals("/")||operator.equals("%"))){
            System.out.println(String.format("Cannot divide %d by zero", a));
        }else if (operator.equals("/")) {
            result = new BigDecimal(a).divide(new BigDecimal(b), 2, RoundingMode.HALF_UP);
            System.out.println(String.format("%d %s %d = %s", a, operator, b, result));
        }else if(operator.equals("%")) {
            result = new BigDecimal(a).remainder(new BigDecimal(b));
            System.out.println(String.format("%d %s %d = %s", a, operator, b, intFormatter.format(result)));
            }else{
            switch(operator){
                case "+":
                    result = new BigDecimal(a+b);
                    break;
                case "-":
                    result = new BigDecimal(a-b);
                    break;
                case "*":
                    result = new BigDecimal(a*b);
                    break;
            }
            System.out.println(String.format("%d %s %d = %s - %s", a, operator, b, intFormatter.format(result), result.intValueExact()%2==0?"even" : "odd"));

        }
        }
}
