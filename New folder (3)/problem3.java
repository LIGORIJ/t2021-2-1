import java.util.Scanner;

public class NumberSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of 'a': ");
        int a = scanner.nextInt();

        for (int i = 1; i <= a; i += 2) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
