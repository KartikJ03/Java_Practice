import javax.xml.transform.Source;

public class Methods {
    static void foo(){
        System.out.println("Good Morning");
    }
    static void foo(int x){
        System.out.println("This method has parameter in it");
    }

    public static void main(String [] args){
    foo();
    foo(4);
    }
}
