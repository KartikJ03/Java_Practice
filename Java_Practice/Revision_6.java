public class Revision_6 {
    public static void main(String [] args){
        String s = "Java Code";
        String [] words = s.split(" ");
        String rev = "";
        for (int i = words[0].length()-1; i>=0 ; i-- ){
            rev = rev + words[0].charAt(i);
        }
        words[0] = rev;
        String result = String.join(" ",words);
        System.out.println(result);

    }
}
