public class Test_git5 {
    public static void main(String [] args){
        int []num = {9,2,3,4,5,6,7};
        boolean isSorted = true;
        for (int i = 0 ; i<num.length-1 ; i++){
            if (num[i]>num[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("Sorted");
        }else {
            System.out.println("Not Sorted");
        }
    }
}
