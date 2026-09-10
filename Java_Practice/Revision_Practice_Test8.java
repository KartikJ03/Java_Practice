abstract class Emp{
    String name;
    int id;
    int salary;
    abstract void displayDetails();
    abstract void calculateBonus();
}
class developer extends Emp{
    developer(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displayDetails(){
        System.out.println("DEVELOPER");
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("Salary : "+salary);
    }

    @Override
    void calculateBonus() {
        double Bonus = salary*0.10;
        double actualSalary = Bonus+salary;
        System.out.println("Bonus Added = "+Bonus);
        System.out.println("Salary With Bonus = "+actualSalary);
    }
}
class Manager extends Emp{
    Manager(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displayDetails(){
        System.out.println("MANAGER");
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("Salary : "+salary);
    }

    @Override
    void calculateBonus() {
        double Bonus = salary*0.20;
        double actualSalary = Bonus+salary;
        System.out.println("Bonus Added = "+Bonus);
        System.out.println("Salary With Bonus = "+actualSalary);
    }
}
public class Revision_Practice_Test8 {
    public static void main(String [] args){

        Emp e = new developer("Lokesh", 12, 50000);
        e.displayDetails();
        e.calculateBonus();
        System.out.println();
        e = new Manager("Ankit Saha", 01, 70000);
        e.displayDetails();
        e.calculateBonus();

    }
}
