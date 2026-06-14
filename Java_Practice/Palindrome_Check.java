import java.util.Scanner;
public class Palindrome_Check {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you word = ");
        String user = sc.nextLine();

        String rev = "";
        for (int i = user.length()-1 ; i>=0 ; i--){
            rev += user.charAt(i);
        }
        if (user.equalsIgnoreCase(rev)){
            System.out.println("The word is palindrome");
        }else {
            System.out.println("The word is not palindrome");
        }
    }
}
