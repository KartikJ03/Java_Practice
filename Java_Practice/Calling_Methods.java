public class Calling_Methods {
    static int logic(int x, int y){
        if(x>y){
            int z = x+y;
            System.out.println(z);
        }
            return x*y;

    }
    public static void main(String [] args){
        int a = 4;
        int b = 6;
        System.out.println(logic(8,4));
    }
}
