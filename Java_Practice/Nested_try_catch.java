public class Nested_try_catch {
    public static void main(String [] args){
        try {
            System.out.println("Outer Start");

            try {
                System.out.println("Inner Start");

                int[] arr = {10, 20, 30};
                System.out.println(arr[5]);

                System.out.println("After Array");

            } catch (ArithmeticException e) {
                System.out.println("Inner Arithmetic Catch");
            }

            System.out.println("Outer End");

        } catch (Exception e) {
            System.out.println("Outer Exception Catch");
        }

        System.out.println("Program End");
    }
}
