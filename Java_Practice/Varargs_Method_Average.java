public class Varargs_Method_Average {
    static int average(int ...arr){
        if (arr.length==0){
            return 0;
        }
        int total = 0;
        for (int element: arr){
            total += element;
        }
        int avg = total/arr.length;
        return avg;
    }
    public static void main(String [] args){
        System.out.println("The Average Is = "+average(1,2,3,4,5));

    }
}
