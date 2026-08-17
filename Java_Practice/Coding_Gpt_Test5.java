import java.util.*;
public class Coding_Gpt_Test5 {
    public static void main(String [] args){
        int n = 1231;
        int reverse = 0;
        int original = n;
        while(n>0){
            int digit = n % 10;
            reverse = reverse *10 + digit;
            n = n/10;
        }
        if (original==reverse){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
