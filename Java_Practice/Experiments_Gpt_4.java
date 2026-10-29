public class Experiments_Gpt_4 {
    static void main() {
        int a = 10;
        int b = 0;
        try {
            int c = a/b;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("Cannot Divide With Zero");
        }
        System.out.println("End of program");
    }

}
