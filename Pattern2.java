import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = 1;

        //rows
        int row = 1;
        while(row <= n){
            //work
            int cst = 1;
            while(cst <= nst){
                System.out.print("*");
                cst++;
            }
            ///prep
            System.out.print("\n");
            nst = nst+1;
            row = row+1;
        }
    }
}
