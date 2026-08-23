import java.util.Scanner;
public class Java_Handling_Exception_1 {
    public static void main(String [] args){
       int [] marks = new int [3];
       marks[0] = 7;
       marks[1] = 56;
       marks[2] = 6;

       Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array index: ");
        int ind = sc.nextInt();

        System.out.print("Enter the number which you want to divide the value with: ");
        int number = sc.nextInt();

        try{
            System.out.println("The value at array index is : "+marks[ind]);
            System.out.println("The result for the divide values are : "+marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occured");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException ocuured");
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println("Some exception occured");
            System.out.println(e);
        }
    }
}
