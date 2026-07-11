class Human {
    void speak() {
        System.out.println("Speaks a language");
    }

    void Nationality() {
        System.out.println("Country Which he lives in");
    }
}
    class Boy1 extends Human{
        void speak(){
            System.out.println("Hindi");
        }
        void Nationality(){
            System.out.println("Indian");
        }
    }
    class Boy2 extends Human{
        void speak(){
            System.out.println("English");
        }

        @Override
        void Nationality() {
            System.out.println("American");
        }
    }

public class Practice_One {
    public static void main(String [] args){
        Boy1 A = new Boy1();
        A.Nationality();
        A.speak();
        System.out.println();
        Boy2 B = new Boy2();
        B.Nationality();
        B.speak();
    }
}
