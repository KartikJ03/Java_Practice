class Employee{
    private int id;
    private String name;
    private int salary;
    Employee(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary<0){
            System.out.println("Invalid");
        }
        this.salary = salary;
    }
    void displayingdetails(){
        System.out.println("Id = "+id);
        System.out.println("Name = "+name);
        System.out.println("Salary = "+salary);
    }
}
public class Java_test1 {
    public static void main(String []args){
        Employee a = new Employee(45, "Kartik", 45000);
        a.displayingdetails();
        System.out.println();
        Employee b = new Employee(46, "aakash", 40000);
        b.displayingdetails();
        System.out.println();
        Employee c = new Employee(45, "vinit", 50000);
        c.displayingdetails();



    }
}
