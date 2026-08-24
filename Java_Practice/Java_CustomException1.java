import java.util.Scanner;

class InvalidAgeException extends Exception{
    public String getMessage(){
        return "You are not eligible. Age Must Be 18 or Above ";
    }
}
class Java_CustomException1{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age = ");
        int age = sc.nextInt();

        if(age<18){
            try{
                throw new InvalidAgeException();

            }
            catch(InvalidAgeException e){
                System.out.println(e.getMessage());

            }

        }else{
            System.out.println("You are eligible");
        }

    }
}

