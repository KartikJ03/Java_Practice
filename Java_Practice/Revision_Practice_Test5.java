abstract class shape14{
    abstract void calculateArea();
}
class circle14 extends shape14{
    int radius;
    circle14(int radius){
        this.radius = radius;
    }
    void calculateArea(){
        System.out.println("Area of circle will be = "+Math.PI*radius*radius);
    }
}
class rectangle14 extends shape14{
    int length;
    int width;
    rectangle14(int length, int width){
        this.length = length;
        this.width = width;
    }
    void calculateArea(){
        System.out.println("Area of Rectangle is = "+length*width);
    }
}
public class Revision_Practice_Test5 {
    public static void main(String [] args){
        circle14 c = new circle14(4);
        rectangle14 r = new rectangle14(2,4);
        c.calculateArea();
        r.calculateArea();
        System.out.println();
        shape14 s = new circle14(6);
        s.calculateArea();
        s = new rectangle14(12,24);
        s.calculateArea();
    }
}
