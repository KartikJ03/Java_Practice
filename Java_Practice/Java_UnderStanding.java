class Animal5 {
    String name = "Animal";

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog5 extends Animal5 {
    String name = "Dog";

    @Override
    void sound() {
        System.out.println("Dog sound");
    }
}

public class Java_UnderStanding {
    public static void main(String[] args) {
        Animal5 a = new Dog5();

        System.out.println(a.name);
        a.sound();
    }
}

