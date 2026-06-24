public class Reversing_array {
    public static void main(String [] args){
        int [] marks = {24,25,26,27,28};
        int temp;
        int l = marks.length;
        for(int i = 0 ; i<Math.floorDiv(l,2); i++){
            temp  = marks[i];
            marks[i] = marks[l-1-i];
            marks[l-1-i]  = temp;
        }
        System.out.println(marks);
        for (int element: marks){
            System.out.println(element + " ");
        }
    }
}
