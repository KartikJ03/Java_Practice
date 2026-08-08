interface Shape1{
    void calculateArea();
}
class Circle3 implements Shape1{
    double radius;
    Circle3(double radius){
        this.radius = radius;
    }
    public void calculateArea(){
        int area = (int) (Math.PI*radius*radius);
        System.out.println("Area of circle = "+area);
    }
}
class Rectangle implements Shape1{
    double length;
    double width;
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public void calculateArea(){
        int area = (int) (length*width);
        System.out.println("Area of rectangle is = "+area);
    }
}
public class Java_Gpt_Test_Abs_5 {
    public static void main(String [] args){
        Shape1 s = new Circle3(5);
        s.calculateArea();
        s = new Rectangle(10,4);
        s.calculateArea();
    }
}
