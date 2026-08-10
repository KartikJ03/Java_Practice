interface basicAnimal{
    void eat();
    void sleep();
}
class monkey{
    void jump(){
        System.out.println("Jumping....");
    }
    void bite(){
        System.out.println("biting....");
    }
}
class human extends monkey implements basicAnimal{
        void speak(){
            System.out.println("Speaking....");
        }
        @Override
    public void eat() {
        System.out.println("eating");
    }
    @Override
    public void sleep() {
        System.out.println("Sleep");
    }
}
public class Abstract_Practice_Set3 {
    public static void main(String [] args){
        basicAnimal haryy = new human();
        haryy.sleep();
    }
}
