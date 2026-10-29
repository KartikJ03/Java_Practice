class karmchari{
    private String name;
    private double salary;

    karmchari(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public void displayDetails(){
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
    }
    public void increaseSalary(double percentage){
        double inc_salary = salary*percentage/100;
        salary = salary+inc_salary;
    }
}
public class Experiments_Gpt_6 {
    public static void main(String [] args){
        karmchari E1 = new karmchari("Rahul", 30000);
        E1.increaseSalary(10);
        E1.displayDetails();
    }
}
