import java.util.Scanner;

public class DivBy5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                System.out.println(i + " " + "Is divisible by 5");
            } else {
                System.out.println(i + " " + "Is NOT divisible by 5!");
            }
        }
    }
}
