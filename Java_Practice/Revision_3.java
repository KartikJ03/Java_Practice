import java.util.Scanner;
public class Revision_3 {
    public static void main(String [] args){
        int [] student = {1,2,3,4,5,6};
        boolean isInArray = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check = ");
        int n = sc.nextInt();

        for (int i = 0 ; i< student.length-1 ; i++){
            if (n==i){
                isInArray = true;
            }
        }
        if (isInArray){
            System.out.println("Present");
        }else {
            System.out.println("Not Present");
        }
    }
}
