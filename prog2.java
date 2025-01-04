import java.util.Scanner;
public class prog2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a charecter:");
        char x=sc.next().charAt(0);

        if((x>='a'&& x<='z') || (x>='A' && x<='Z')){
               System.out.println("Alphabate");
        }
        else if(x>='0'&& x<='9'){
            System.out.println("Digit");
        }

        else{
            System.err.println("Special Charecter");
        }
          sc.close();
    }
}
