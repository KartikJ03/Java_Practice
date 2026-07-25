public class Revision_2 {
    public static void main(String [] args){
        int [] marks = {91,64,74,84};
        boolean isSorted = true;
        for (int i = 0  ; i< marks.length-1 ; i++){
            if (marks[i]>marks[i+1]){
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
