import java.util.Scanner;

public class Exceptions_Exe {
    public static void main(String [] args){
        int [] marks = new int [3] ;
        marks[0] = 10;
        marks[1] = 40;
        marks[2] = 30;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array index : ");
        int ind = sc.nextInt();

        System.out.print("Enter the number you want to divide with : ");
        int num = sc.nextInt();

        try{
            System.out.println("The value of array index is : "+marks[ind]);
            System.out.println("The value of array-value/number is : "+marks[ind]/num);
        }
        catch(ArithmeticException e){
            System.out.println("Can't divide with zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The index you are willing to retrieve is not available");
        }
        catch(Exception e){
            System.out.println("Some other exception occurred");
            System.out.println(e);
        }

    }
}
