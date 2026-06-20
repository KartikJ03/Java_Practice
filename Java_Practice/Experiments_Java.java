import java.util.Scanner;
public class Experiments_Java {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A String =  ");
        String s = sc.nextLine();
        String rev = "";
        for (int i = s.length()-1 ; i>=0 ; i--){
        rev += s.charAt(i);
        }
        System.out.println(rev);
        if (s.equalsIgnoreCase(rev)){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
    }
}
