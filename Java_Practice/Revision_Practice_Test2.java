class Majdoor{
    String name;
    int id;
    int salary;

    Majdoor(String name,  int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displayDetails(){
        System.out.println("Name = "+name);
        System.out.println("ID = "+id);
        System.out.println("Monthly Salary = "+salary);
    }
    void calculateAnnualSalary(){
        int annualSalary = salary * 12;
        System.out.println("Annual Salary = "+annualSalary);
    }
}
public class Revision_Practice_Test2 {
    public static void main(String [] args){
    Majdoor A = new Majdoor("Kartik", 27, 10000);
    A.displayDetails();
    A.calculateAnnualSalary();

    }
}
