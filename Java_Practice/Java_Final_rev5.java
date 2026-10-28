
public class Java_Final_rev5 {
    public static void main(String [] args){
        String s1 = "MaDaM";
        String rev = "";
        for (int i = s1.length()-1 ; i >= 0  ; i--){
            rev = rev + s1.charAt(i);
        }
        if (s1.equalsIgnoreCase(rev)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
