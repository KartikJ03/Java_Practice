class studentfinal{
    String name;
    int rollnumber;
    int marks;

    void calculateGrade(){

        if (marks>=90){
            System.out.println("Grade = A");
        } else if (marks>=75) {
            System.out.println("Grade = B");
        } else if (marks>=60) {
            System.out.println("Grade = C");
        }else if(marks>=40){
            System.out.println("Grade = D");
        }else {
            System.out.println("Grade = F");
        }
    }
    void displayStudentDetails(){
        System.out.println("Name = "+name);
        System.out.println("Roll Number = "+rollnumber);
        System.out.println("Marks = "+marks);
    }
}
public class Revision_Practice_Test1 {
    public static void main(String [] args){
        studentfinal a = new studentfinal();
        a.name = "kartik";
        a.rollnumber = 27;
        a.marks = 92;
        a.displayStudentDetails();
        a.calculateGrade();
    }
}
