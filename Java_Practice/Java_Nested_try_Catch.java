import java.util.InputMismatchException;
import java.util.Scanner;
public class Java_Nested_try_Catch {
    public static void main(String [] args){
        int [] marks = new int [3];
        marks[0] = 65;
        marks[1] = 54;
        marks[2] = 45;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        while(flag){
        System.out.print("Enter a index to display : ");
        int ind = sc.nextInt();
            try {
                System.out.println("This a nested try catch explanation code");
                try {
                    System.out.println("The Entered Index Is = " + marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Please enter a valid index");
                    System.out.println("This is in the nested catch");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number");
            } catch (Exception e) {
                System.out.println("Some Other Exception Occurred");
            }
        }
        System.out.println("End of program");

    }
}
