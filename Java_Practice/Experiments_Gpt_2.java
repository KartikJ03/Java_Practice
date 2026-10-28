class Janvar{
    public void sound(){
        System.out.println("Animal Makes Sound");
    }
}
class kutta extends Janvar{
    @Override
    public void sound(){
        System.out.println("Dog Barks");
    }
}
public class Experiments_Gpt_2 {
    public static void main(String [] args){
        Janvar snowy = new kutta();
        snowy.sound();
    }
}
