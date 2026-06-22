// Not Understood Carefully Understand This

public class Find_Vowels_Con {
    public static void main(String [] args){
        String s = "Kartik Jawanjal";
        int vowels = 0;
        int con = 0;
        for (int i = 0 ; i<s.length() ; i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if (Character.isLetter(ch)){
                if (ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u'){
                    vowels++;
                }else {
                    con++;
                }
            }
        }
        System.out.println("Vowels = "+vowels);
        System.out.println("Consonants = "+con);
    }
}
