class Circle1{
    int radius;
    Circle1(int r){
        this.radius = r;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
}
class Cylinder1 extends Circle1{
    int height;
    Cylinder1(int r,int h){
        super(r);
        this.height = h;
    }
    public double area(){
        return 2*Math.PI*radius*height+2*Math.PI*radius*radius;
    }
}
public class Practice_Set1 {
    public static void main(String [] args){
        Circle1 obj = new Circle1(4);
        System.out.println(obj.area());
    }
}
