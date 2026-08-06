abstract class parent{
    public void warm(){
        System.out.println("Hello");
    }
    abstract public void greet();
}
class child extends parent{
    @Override
    public void greet(){
        System.out.println("This is the abstract method implemented in child class");
    }
}
public class Java_Abstract_1 {
    public static void main(String [] args){
        child c = new child();
        c.greet();
        c.warm();

    }
}
