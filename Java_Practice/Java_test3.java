class Animal2{
    String name;
    public Animal2(String name){
        this.name = name;
    }
   public void eat(){
       System.out.println(name+" is eating");
   }
}
class dog1 extends Animal2{
    String breed;
    public dog1(String name, String breed){
        super(name);
        this.breed = breed;
    }
    public void bark(){
        System.out.println(name+" is barking");
    }
    public void displayBreed(){
        System.out.println("Breed: "+breed);
    }
}
class Cat1 extends Animal2{
    public Cat1(String name){
        super(name);
        this.name = name;
    }
    public void meow(){
        System.out.println(name+" is meowing");
    }
}

public class Java_test3 {
    public static void main(String [] args){
        dog1 d = new dog1("Snowy", "Labrador");
        d.displayBreed();
        d.eat();
        d.bark();
        Cat1 c = new Cat1("kitty");
        c.meow();

    }
}
