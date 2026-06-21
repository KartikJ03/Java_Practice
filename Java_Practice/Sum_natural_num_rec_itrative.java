public class Sum_natural_num_rec_itrative {
    static int sumRec(int n){
        if (n<=0){
            return 0;
        }
        return n+sumRec(n-1);
    }
    static int sum(int n){
        int sum = 0;
        for (int i = 0 ; i<=n ; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String [] args){
        System.out.println(sum(6));
        System.out.println(sumRec(6));
    }
}
