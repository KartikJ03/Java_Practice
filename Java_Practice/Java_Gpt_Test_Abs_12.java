interface Shape2{
    double calculateArea();
    double calculatePerimeter();
}
class Circle5 implements Shape2{
    double radius;
    public Circle5
            (double radius){
        this.radius = radius;
    }
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
    public double calculatePerimeter(){
        return 2*Math.PI*radius;
    }
}
class Rectangle1 implements Shape2{
    double length;
    double width;
    public Rectangle1(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double calculateArea(){
        return length*width;
    }
    public double calculatePerimeter(){
        return 2*(length+width);
    }
}
class Square1 implements Shape2{
    double side;
    public Square1(double side){
        this.side = side;
    }
    public double calculateArea(){
        return side*side;
    }
    public double calculatePerimeter(){
        return 4*side;
    }
}
public class Java_Gpt_Test_Abs_12 {
    public static void main(String [] args){
        Shape2 [] shapes = {new Circle5(5), new Rectangle1(2,4), new Square1(5)};
        for (Shape2 shape: shapes){
            System.out.println(shape.calculateArea());
            System.out.println(shape.calculatePerimeter());
        }
    }
}
