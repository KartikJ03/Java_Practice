class Circle{
    int radius;
    public void setRadius(int r){
        radius = r;
    }
    public double area(){
        return (float)(Math.PI*radius*radius);
    }
    public double peri(){
        return (float)2*Math.PI*radius;
    }
}
public class Circle_Arean_Perimeter {
    public static void main(String [] args){
        Circle c1 = new Circle();
        c1.setRadius(5);
        System.out.println("The area will be = "+c1.area());
        System.out.println("The Perimeter will be = "+c1.peri());
    }
}
