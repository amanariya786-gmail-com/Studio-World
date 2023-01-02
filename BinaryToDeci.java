package NumSytm;
import  java.util.Scanner;

public class BinaryToDeci {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(decimal(n));

    }
    public static int decimal(int n){
        int decimalnum = 0;
        int pw = 1;
        while(n != 0)
        {
            int rem = n % 2;
            decimalnum += rem * pw;
            pw *= 2;
            n /= 10;
        }
        return decimalnum;
    }
}
