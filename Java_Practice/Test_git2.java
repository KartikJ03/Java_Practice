public class Test_git2 {
    static int fibonacci_rev(int n){
        if (n==0 || n==1){
            return n;
        }
        return fibonacci_rev(n-1)+fibonacci_rev(n-2);
    }
    public static void main(String [] args){
        int n = 5;
        for (int i = 0 ; i<=n ; i++){
            System.out.print(fibonacci_rev(i));
        }
    }
}
