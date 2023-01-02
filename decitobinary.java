package deciTobainary;

import java.util.Scanner;

class decitobinary {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int decinum= sc.nextInt();
        int ans= 0;
        int power = 1;
        while(decinum > 0){
            int parity = decinum % 2;
            ans += (parity * power);
            power *= 10;
            decinum /= 2;

        }
        System.out.println(ans);
         }
}
