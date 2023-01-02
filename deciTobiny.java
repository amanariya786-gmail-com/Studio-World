package NumSytm;

import java.util.Scanner;

public class deciTobiny {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(binary(n));
    }
    public static int binary(int n){
        int binarynum = 0;
        int pw = 1;
        while(n!=0){
            int rem = n % 2;
            binarynum += rem * pw;
            pw *= 10;
            n /= 2;
        }
        return binarynum;
    }
}
