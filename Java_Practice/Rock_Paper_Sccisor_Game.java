import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Sccisor_Game {
    public static void main(String [] args){
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int comp_in = r.nextInt(3);
        System.out.println("0 = Rock\n1 = Paper\n2 = Sccisor");
        System.out.print("Enter your number = ");
        int user_in = sc.nextInt();
        if (user_in<0 || user_in>2){
            System.out.println("invalid Input");
            return;
        }
        else if (comp_in==user_in){
            System.out.println("Draw");
        } else if (comp_in==0 && user_in==1 || comp_in==2 && user_in==0 || comp_in==1 && user_in==2){
            System.out.println("You Win");
        }else {
            System.out.println("Computer Wins");
        }
        System.out.println("Computer input = "+comp_in);
    }
}
