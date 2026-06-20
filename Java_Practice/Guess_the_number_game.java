// not understood
import java.util.Scanner;
import java.util.Random;

public class Guess_the_number_game{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        int compInput = rn.nextInt(100)+1;
        int userInput;
        int count = 0;
        while (true){
            System.out.print("Enter Your Number = ");
            userInput = sc.nextInt();
            if (compInput>userInput){
                System.out.println("Your Guess is too low");
            } else if (compInput<userInput) {
                System.out.println("Your Guess is too high");
            }else {
                System.out.println("Guessed it correct");
                break;
            }
            count++;
        }
        System.out.println("Secret Number = "+compInput);
    }
}