public class Check_whether_a_array_is_sorted_or_Not {
    public static void main(String [] args){
        int [] num = {1,2,3,4,5};
        boolean isSorted = true;
        for (int i = 0 ; i< num.length-1 ; i++){
            if (num[i]>num[i+1]){
                isSorted = false;
                break;
            }
        }if (isSorted){
            System.out.println("The array is sorted");
        }else {
            System.out.println("The array is not sorted");
        }
    }
}
