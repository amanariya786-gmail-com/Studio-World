package javaMethods;
import java.util.Scanner;
public class cotVowel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(count(s));

    }
    public static int count(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                count++;
            }
        }
        return count;
    }
}
