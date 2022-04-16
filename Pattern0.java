import java.util.Scanner;

public class Pattern0 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // for(int row=1; row <= n; row++){
        //     //work
        //     System.out.println("*");

        //     //prepration
        //     System.out.println("\n"); 
        // }

        //while loop
        int row = 1;
        while(row <= n){
            System.out.print("*");

            System.out.print("\n");
            row = row+1;
        }
    }
}
