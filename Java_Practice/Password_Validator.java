class PasswordValidator{

    boolean isValid(String password){
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        if (password.length() < 8){
            return false;
        }
        for (int i = 0 ; i <= password.length()-1 ; i++){
            char ch = password.charAt(i);
            if (ch >='A' && ch <='Z'){
                hasUppercase = true;
            }
            if ( ch >='a' && ch <='z'){
                hasLowercase = true;
            }
            if (ch >= '0' && ch <= '9'){
                hasDigit = true;
            }
        }
        return hasUppercase && hasLowercase && hasDigit;
    }
}
public class Password_Validator {
    public static void main(String [] args){
        PasswordValidator p = new PasswordValidator();
        System.out.println(p.isValid("Kartik2003"));
    }
}
