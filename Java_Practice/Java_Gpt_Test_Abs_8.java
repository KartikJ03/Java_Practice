interface Emplyoee1{
    void work();
    double calculateSalary();
}
class FullTimeEmployee implements Emplyoee1{
    String name;
    double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary){
        this.name = name;
        this.monthlySalary = monthlySalary;
    }
    public void work(){
        System.out.println(name+" is working full-time");
    }
    public double calculateSalary(){
        return monthlySalary;
    }
}
class PartTimeEmployee implements Emplyoee1{
    String name;
    double hoursWorked;
    double hourlyRate;

    public PartTimeEmployee(String name, double hoursWorked, double hourlyRate){
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    public void work(){
        System.out.println(name+" is working part-time");
    }
    public double calculateSalary(){
        return hoursWorked*hourlyRate;
    }
}
public class Java_Gpt_Test_Abs_8 {
    public static void main(String [] args){
        Emplyoee1 e = new FullTimeEmployee("Kartik", 50000);
        e.work();
        System.out.println(e.calculateSalary());
        System.out.println();
        // Part Time
        e = new PartTimeEmployee("Rahul", 80, 300);
        e.work();
        System.out.println(e.calculateSalary());
    }
}
