import java.util.Scanner;
public class Student_Percentage {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of s1 = ");
        int s1 = sc.nextInt();
        System.out.print("Enter marks of s2 = ");
        int s2 = sc.nextInt();
        System.out.print("Enter marks of s3 = ");
        int s3 = sc.nextInt();
        System.out.print("Enter marks of s4 = ");
        int s4 = sc.nextInt();
        System.out.print("Enter marks of s5 = ");
        int s5 = sc.nextInt();
        int total = s1+s2+s3+s4+s5;
        System.out.println("Your total marks are = "+ total);
        float percentage = (total/500f)*100;
        System.out.printf("Your percentage are = %f",percentage );
        System.out.println();
        if (percentage<=33){
            System.out.println("Better luck next time");
        }else {
            System.out.println("Promoted");
        }
        }

    }

