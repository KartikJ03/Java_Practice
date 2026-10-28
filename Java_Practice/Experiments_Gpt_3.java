abstract class Shape3{
    abstract double calculateArea();
}
class circle3 extends Shape3{
    double radius;
    circle3(int radius){
        this.radius = radius;
    }
    @Override
    double calculateArea(){
        return Math.PI*radius*radius;
    }
}
public class Experiments_Gpt_3 {
    static void main() {
        circle3 c = new circle3(5);
        System.out.println(c.calculateArea());
    }
}
