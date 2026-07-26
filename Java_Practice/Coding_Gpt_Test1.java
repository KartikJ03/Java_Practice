class Student1{
    String name;
    int rollNumber;
    String course;
    int marks;

    Student1(String name, int rollNumber, String course, int marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
        this.marks = marks;
    }
    void displayDetails(){
        System.out.println("Name        = "+name);
        System.out.println("Roll Number = "+rollNumber);
        System.out.println("Course      = "+course);
        System.out.println("Marks       = "+marks);
    }
    void isPassed(){
        if (marks>=40){
            System.out.println("Result      = Pass");
        }else{
            System.out.println("Result      = Fail");
        }
    }
}
public class Coding_Gpt_Test1 {
    public static void main(String [] args){
        Student1 s1 = new Student1("Kartik", 101, "Maths", 55);
        Student1 s2 = new Student1("Lokesh", 102, "Maths", 33);
        Student1 s3 = new Student1("Ankit", 103, "Maths", 67);
        s1.displayDetails();
        s1.isPassed();
        System.out.println();
        s2.displayDetails();
        s2.isPassed();
        System.out.println();
        s3.displayDetails();
        s3.isPassed();

    }
}
