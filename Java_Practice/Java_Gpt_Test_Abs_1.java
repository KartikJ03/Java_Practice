abstract class Shape{
    String color;
    public Shape(String c){
        this.color = c;
    }
    abstract double area();
    void displayColor(){
        System.out.println("Color = "+color);
    }
}
class Circle2 extends Shape{
    int radius;
    public Circle2(String color, int radius){
        super(color);
        this.radius = radius;
    }
    double area(){
        return Math.PI*radius*radius;
    }
}

public class Java_Gpt_Test_Abs_1 {
    public static void main(String [] args){
    Circle2 c = new Circle2("red", 4);
    c.displayColor();
        System.out.println(c.area());
    }
}
