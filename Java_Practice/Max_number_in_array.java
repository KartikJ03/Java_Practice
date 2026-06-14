public class Max_number_in_array {
    public static void main(String [] args){
        int [] num = {23,45,34,32,97};
        int max = num[0];
        for (int i = 0 ; i< num.length ; i++){
            if (num[i]>max){
                max = num[i];
            }
        }
        System.out.println(max);
    }
}
