
import java.util.Scanner;

public class NumberSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of 'n': ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int num = (2 * i) - 1;
            System.out.print(num + " ");
        }
    }
}
