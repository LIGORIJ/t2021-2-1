
import java.util.Scanner;


public class Calculator{

public double add(double c,double d)
{
return c + d;
}
public double subract(double c,double d)
{
return c - d;
}
public double multiply(double c,double d)
{
return c * d;
}
public double divide(double c, double d) {
        if (d != 0) {
            return c / d;
        } else {
            throw new ArithmeticException("Error: Division by zero is not allowed.");
        }
    }


public static void main(String[] args){
 
Calculator calci = new Calculator();

Scanner sc = new Scanner(System.in);

System.out.print("Enter the value of 'a': ");
 double a = sc.nextDouble();

 System.out.print("Enter the value of 'b': ");
   double b = sc.nextDouble();

System.out.print("Enter the type of operation (+, -, *, /): ");
        String operation = sc.next();

        double result;

        switch (operation) {
            case "+":
                result = calci.add(a, b);
                System.out.println("Result: " + result);
                break;
            case "-":
                result = calci.subract(a, b);
                System.out.println("Result: " + result);
                break;
            case "*":
                result = calci.multiply(a, b);
                System.out.println("Result: " + result);
                break;
            case "/":
               try {
                    result = calci.divide(a, b);
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid operation!");
        }

    }
}



