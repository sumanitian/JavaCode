import java.util.Scanner;

public class FibN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int a = 0;
        int b = 1;

        int counter = 1;
        while(counter <= n+1) {
            System.out.println(a);
            int sum = a+b;
            a = b;
            b = sum;

            counter++;
        }
    }
}
