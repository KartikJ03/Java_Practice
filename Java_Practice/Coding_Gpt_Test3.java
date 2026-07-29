class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
class Student2 extends Person{
    String course;
    Student2(String name, int age, String course){
        super(name,age);
        this.course = course;
    }
    @Override
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Course : "+course);
    }
}
public class Coding_Gpt_Test3 {
    public static void main(String [] args){
        Student2 student = new Student2("Kartik", 22, "Maths");
        student.display();
    }
}
