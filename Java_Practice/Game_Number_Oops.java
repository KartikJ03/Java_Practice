
import java.util.Scanner;
import java.util.Random;
class GuessTheNumber{
    int UserIn;
    int CompIn;
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    public GuessTheNumber(){
        CompIn = r.nextInt(100)+1;
    }
    void takesUserInput(){
        System.out.print("Enter a number between 1-100 = ");
        UserIn = sc.nextInt();
    }
    void CheckGuess(){
        if (CompIn==UserIn){
            System.out.println("Correct");
        } else if (CompIn>UserIn) {
            System.out.println("Too low because computer choose = "+CompIn);
        } else if (CompIn<UserIn) {
            System.out.println("Too high because computer choose = "+CompIn);
        }
    }
}
public class Game_Number_Oops {
    public static void main(String [] args){
     GuessTheNumber game1 = new GuessTheNumber();
     game1.takesUserInput();
     game1.CheckGuess();
    }
}
