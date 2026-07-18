public class Test_git4 {
    public static void main(String [] args){
        // find max number in an array
        int []marks = {12,34,54,56,67,23};
        int max = marks[0];
        for (int i = 1 ; i< marks.length ; i++){
            if (marks[i]>max){
                max = marks[i];
            }
        }
        System.out.println(max);
    }
}
