public class Reverse_First_Word {
        public static void main(String [] args){
            String s1 = "Java Code";
            String []words = s1.split(" ");
            String rev = "";
            for (int i = words[0].length()-1; i>=0 ; i--){
                rev += words[0].charAt(i);
            }
            words[0] = rev;
            String result = String.join(" ", words);
            System.out.println(result);
        }
}
