class Animal{
    String name;
    public Animal(String name){
        this.name = name;
    }
    void eat(){
        System.out.println(name+" is eating");
    }

}
class Dog extends Animal{
    String breed;
    Dog(String name, String breed){
        super(name);
        this.breed = breed;
    }
    void bark(){
        System.out.println(name+" is barking.");
    }
    void breed(){
        System.out.println("The Breed is "+breed);
    }
}

public class Experiment_Daily_1 {
    public static void main(String [] args){
        Dog d = new Dog("Snowy", "Labrador");
        d.eat();
        d.bark();
        d.breed();


    }
}

