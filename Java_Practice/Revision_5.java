class circle4{
    int radius;
    circle4(int radius){
        this.radius = radius;
    }
    double area(){
        return Math.PI*radius*radius;
    }
}
public class Revision_5 {
    public static void main(String [] args){
        circle4 c = new circle4(4);
        System.out.println(c.area());
    }
}
