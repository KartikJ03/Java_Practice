class Animal14{
    void makeSound(){
        System.out.println("Animal makes sound");
    }
}
class dog14 extends Animal14{
    @Override
    void makeSound(){
        System.out.println("Dog Barks");
    }
}
class cat14 extends Animal14{
    @Override
    void makeSound(){
        System.out.println("Cats meows");
    }
}
public class Revision_Practice_Test4 {
    public static void main(String [] args){
        dog14 d = new dog14();
        cat14 c = new cat14();
        d.makeSound();
        c.makeSound();
        System.out.println();
        Animal14 A = new dog14();
        A.makeSound();
        A = new cat14();
        A.makeSound();
    }
}
