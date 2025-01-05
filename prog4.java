
public class prog4 {
    public static void main(String[] args) {
        
        char ch = 'B'; 

        if (Character.isLowerCase(ch)) {
            
            char upperCaseChar = Character.toUpperCase(ch);
            System.out.println("The uppercase of '" + ch + "' is: " + upperCaseChar);
        } else {
            
            System.out.println("'" + ch + "' is not a lowercase letter.");
        }
    }
}
