 /*This Code was written for understanding packages which was written in VS-Code
 with Terminal Usage (javac \--\.java and java \--\) How diffrent packages and access
Modifiers works*/

class Calculator{
    public void Calculator(){
        System.out.println("I am a calculator");
    }
}
class Sccalculator extends Calculator{
    public void sccalculator(){
        System.out.println("I am a scientific calculaotr");
    }
}
class HybridCalculator extends Sccalculator{
    public void hybridcalculator(){
        System.out.println("I am a hybrid calculator");
    }
}
public class Java_Packages_1 {
    public static void main(String [] args){
        HybridCalculator h = new HybridCalculator();
        h.Calculator();
        h.sccalculator();
        h.hybridcalculator();
        System.out.println("I am the main method");
    }
}
