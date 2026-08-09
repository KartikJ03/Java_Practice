interface S1{
    void meth1();
    void meth2();
}
interface S2 extends S1{
    void meth3();
    void meth4();
}
class final1 implements S2{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    };
    public void meth4(){
        System.out.println("meth4");
    }
}
public class Self_Abs {
    public static void main (String [] args){
        final1 f = new final1();
        f.meth1();
    }
}
