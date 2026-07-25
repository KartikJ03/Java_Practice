class Student{
    String name;
    int rollNumber;
    String course;
    double marks;

    //Method for displaying details
    public void displayDetails(){
        System.out.println("Name = "+name);
        System.out.println("Roll Number = "+rollNumber);
        System.out.println("Course = "+course);
        System.out.println("Marks = "+marks);
    }
    public void isPassed(){
        if (marks>40){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
    }
}
public class Gpt_Test1 {
    public static void main(String [] args){

        Student k1 = new Student();
        Student A1 = new Student();

        // Student 1
        A1.marks = 50;
        A1.name = "Ankit";
        A1.course = "Maths";
        A1.rollNumber = 1;

        // Student 2
        k1.marks = 32;
        k1.name = "Kartik";
        k1.course = "Maths";
        k1.rollNumber = 2;

        A1.displayDetails();
        k1.displayDetails();

        A1.isPassed();
        k1.isPassed();


    }
}
