import java.util.Scanner;

public class AnybaseToDecimal {
     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         int snum = scn.nextInt();
         int sb = scn.nextInt();

         int res = anybaseToDecimal(snum, sb);
         System.out.println(res);
     }
     public static int anybaseToDecimal(int snum, int sb) {
        int ans = 0; 
        int multiplier = 1;
         while(snum != 0){
             int rem = snum % 10;
             ans = ans + (rem * multiplier);
             multiplier = multiplier * sb;
             snum = snum / 10;
         }
         return ans;
     }
}
