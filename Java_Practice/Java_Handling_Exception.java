public class Java_Handling_Exception  {
    public static void main(String [] args){
        int a = 1000;
        int b = 0;

        try {
            int c = a/b;
            System.out.println("The Result is = "+c);
        }
        catch (Exception e){
            System.out.println("We failed to devide Reason: ");
            System.out.println(e);
        }
        System.out.println("End Of Program");
    }
}
