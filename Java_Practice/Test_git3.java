import java.util.Scanner;
public class Test_git3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = "";
        for (int i = s.length()-1 ; i>=0 ; i--){
            rev+=s.charAt(i);
        }
        if (s.equalsIgnoreCase(rev)){
            System.out.println("palindrom");
        }else {

            System.out.println("Not palindrome");
        }
    }
}
