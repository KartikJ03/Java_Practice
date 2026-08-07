abstract class Animal3 {
    abstract void sound();
}

class Dog3 extends Animal3 {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

class Cat3 extends Animal3 {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}
public class Java_Gpt_Test_Abs_3 {
    public static void main(String [] args){
        Animal3 B = new Dog3();
        B.sound();
        B = new Cat3();
        B.sound();

    }
}
