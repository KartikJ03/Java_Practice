public class Java_Coding_Test1 {
    public static void main(String [] args){
        int [] numbers = {10,45,23,89,12,67};
        int max = numbers[0];
        for(int element: numbers){
            if (max<element){
                max = element;
            }
        }
        System.out.println("Largest Element = "+max);
    }
}
