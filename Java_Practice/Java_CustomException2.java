class NegativeRadiusException extends Exception{
    public String getMessage(){
        return "Radius cannot be negative";
    }
}
public class Java_CustomException2 {
    public static double area(int r) throws NegativeRadiusException{
        if (r<0){

                throw new NegativeRadiusException();
        }
        double result =  Math.PI*r*r;
        return result;
    }
    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String [] args){
        try {
            int div = divide(8,4);
            System.out.println(div);
        } catch (Exception e) {
            System.out.println("This will throw a arithmetic exception ");
        }
        try {
            double re = area(-1);
            System.out.println(re);
        } catch (NegativeRadiusException e) {
            System.out.println(e);
        }
    }
}
