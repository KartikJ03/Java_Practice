import java.util.Scanner;
public class Java_Error_Exceptions {
    public static void main(String [] args){
        // Here are some error demo

        // Syntax Error
        // int a = 5 --> Error : No Semicolon
        // a = 5; --> Error : a not declared

        //Logical Error

        for(int i = 1 ; i<5 ; i++){
            System.out.println(2*i+1);
        }
        /*This will be a logical error because it does not have desired outcome that
        we want prime numbers*/

        // Runtime Error

        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is "+1000/k);

        // This will throw a runtime error if we put 0 in the input
        // Arithmetic Exception
    }
}
