public class Fibonacci_Series {
    static int fibonacci(int n){
        if (n<=1){
            return n;
        }
        return n = fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String [] args){
        int n = 16;
        for (int i = 0 ; i<n ; i++){
            System.out.println(fibonacci(i)+" ");
        }
    }
}
