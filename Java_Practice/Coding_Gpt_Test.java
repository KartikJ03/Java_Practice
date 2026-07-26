class Emplyoee{
    String name;
    int id;
    double salary;

    void setDetails(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displayDetails(){
        System.out.println("Emplyoee Details");
        System.out.println("-----------------");
        System.out.println("Name   : "+ name);
        System.out.println("ID     : "+id);
        System.out.println("Salary : "+salary);
    }
}
public class Coding_Gpt_Test {
    public static void main(String [] args){
        Emplyoee E1 = new Emplyoee();
        E1.setDetails("Kartik", 101, 50000);
        Emplyoee E2 = new Emplyoee();
        E2.setDetails("Lokesh",102, 60000);
        E1.displayDetails();
        System.out.println(" ");
        E2.displayDetails();
    }
}
