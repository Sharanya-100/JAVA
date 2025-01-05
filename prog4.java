
public class prog4 {
    public static void main(String[] args) {
        
        char ch = 'B'; 

        if (Character.isLowerCase(ch)) {
            
            char upperCaseChar = Character.toUpperCase(ch);
            System.out.println("The uppercase of '" + ch + "' is: " + upperCaseChar);
        } else {
            
             char lowercasechar=Character.toLowerCase(ch);
             System.err.println("The lowercase of'"+ch+"' is: "+lowercasechar);
        }
    }
}
