class Employee_Google{
    void calculate_Salary(){
        System.out.println("Employee Salary Calculation");
    }
}
class Developer extends Employee_Google{
    @Override
    void calculate_Salary(){
        System.out.println("Developer Salary");
    }
}
public class Java_Final_rev1 {
    public static void main(String [] args){
        Employee_Google a = new Developer();
        a.calculate_Salary();
    }
}
