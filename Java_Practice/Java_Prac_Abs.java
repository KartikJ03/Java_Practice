abstract class animal{
    animal(){
        System.out.println("Animal Constructor");
    }
}
class dog extends animal{
    dog(){
        System.out.println("Dog Constructor");
    }
}

public class Java_Prac_Abs {
    public static void main(String [] args){
    dog d = new dog();
    }
}
