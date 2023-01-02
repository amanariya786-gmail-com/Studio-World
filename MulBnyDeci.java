package NumSytm;

import java.util.Scanner;

public class MulBnyDeci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(multiply(m, n));

    }

    public static int multiply(int m, int n) {
        int decinum = 0;
        int pw = 1;
        while (n != 0) {
            int rem = n % 2;
            decinum += rem * pw;
            pw *= 2;
            n /= 10;
        }
        return (m * decinum);
    }
}
