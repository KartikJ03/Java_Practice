class circle1{
    int radius;

    circle1(int radius){
        this.radius = radius;
    }
    public void radius(){
        System.out.println("Radius = "+radius);
    }
   public double calculatearea(){
        return Math.PI*radius*radius;
    }
    public double calculatecercum(){
        return 2*Math.PI*radius;
    }
}

public class Java_test2 {
    public static void main(String [] args){
        circle1 c = new circle1(5);
        c.radius();
        System.out.println(c.calculatearea());
        System.out.println(c.calculatecercum());

    }
}
