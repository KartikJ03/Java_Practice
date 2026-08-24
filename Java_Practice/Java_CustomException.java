import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return "I am a toString";
    }
    @Override
    public String getMessage(){
        return "Get Message";
    }
}
public class Java_CustomException {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a<10){
            try{
                throw new MyException();
            }
            catch (MyException e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished");
            }
        }else {
            System.out.println("End of Program");
        }

    }
}
