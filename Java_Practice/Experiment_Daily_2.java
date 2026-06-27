class Animal1 {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog1 extends Animal1 {
    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal1{
    @Override
    void sound() {
        System.out.println("Cat Meows");
            }
        }
public class Experiment_Daily_2 {
    public static void main(String []args){
        Dog1 d = new Dog1();
        Cat c = new Cat();
        d.sound();
        c.sound();
    }
}
