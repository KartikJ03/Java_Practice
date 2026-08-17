public class Java_Coding_Test2 {
    public static void main(String [] args){
        String s  = "Hello World";
        int vowels = 0;
        for (int i = 0 ; i<s.length() ; i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }
        }
        System.out.println(vowels);
    }
}
