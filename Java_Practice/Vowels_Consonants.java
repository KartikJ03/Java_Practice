public class Vowels_Consonants {
    public static void main(String [] args){
        String s = "Kartik";
        int vowels = 0;
        int consonants = 0;
        for (int i = 0 ; i<s.length() ; i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }else {
                consonants++;
            }
        }
        System.out.println("Number of Vowels = "+vowels);
        System.out.println("Number of Consonants = "+consonants);
    }
}
