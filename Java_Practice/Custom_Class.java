class employee{
    int Emp_ID; // This are attributes
    String Emp_Name;
    int salary;
   public void displaying_details(){   // this is the method or behavior
        System.out.println("My ID is = "+Emp_ID);
        System.out.println("My Name is = "+Emp_Name);
    }
    public int getSalary(){
       return salary;
    }

}
public class Custom_Class {
    public static void main(String [] args){
        employee kartik = new employee(); // Instantiating a new Employee Object
        employee john = new employee(); // Instantiating a new Employee Object
        // Setting Attributes
        kartik.Emp_ID = 12;
        kartik.Emp_Name = "Kartik Jawanjal";
        kartik.salary = 12000;
        int salary = kartik.getSalary();
        // Printing the properties or attributes
        kartik.displaying_details();
        System.out.println("The salary is = "+salary);


        john.Emp_ID = 13;
        john.Emp_Name = "John";
        john.salary = 45000;


        john.displaying_details();

    }
}
