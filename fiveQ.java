package NumSytm;

import java.util.Scanner;

public class fiveQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        int k = sc.nextInt();
        System.out.println(five(m, k));
    }

    public static double five(double m, int k) {
        int decimal_m = (int) m;
        double fractional_m = m - decimal_m;
        int deci_bny = 0;
        int pw = 1;
        while (decimal_m != 0) {
            int rem = decimal_m % 2;
            deci_bny += rem * pw;
            pw *= 10;
            decimal_m /= 2;

        }
        String s = Integer.toString(deci_bny) + ".";

        while (k > 0 && fractional_m != 0) {
            fractional_m *= 2;

            int digit = (int) fractional_m;
            s += digit;

            fractional_m = fractional_m - digit;
            k--;
        }
        return (deci_bny);
    }
}
