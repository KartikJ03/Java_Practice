import java.util.Scanner;

class elementNotFoundException extends Exception{
    @Override
    public String toString(){
        return "Element Not found";
    }
    public String getMessage(){
        return "Element not found in the array";
    }
}
public class Exception_Practice {
    public static void main(String [] args){
        int []marks = {40,18,20,67,65};
        boolean isInArray = false;

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number = ");
        int userInput = sc.nextInt();


        for (int element: marks){
                if (userInput == element) {
                    isInArray = true;
                    break;
                }
        }
        try {
            if (!isInArray){
                throw new elementNotFoundException();
            }
            System.out.println("Present");
        }
        catch (elementNotFoundException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This will be the finally block which will always be running");
        }
    }
}
