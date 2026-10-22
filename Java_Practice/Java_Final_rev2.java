
public class Java_Final_rev2 {
    static void main() {
                try {
                    System.out.println("A");

                    try {
                        System.out.println("B");
                        int result = 10 / 0;
                        System.out.println("C");
                    } catch (ArithmeticException e) {
                        System.out.println("D");
                    }

                    System.out.println("E");

                } catch (Exception e) {
                    System.out.println("F");
                }

                System.out.println("G");
            }
        }
