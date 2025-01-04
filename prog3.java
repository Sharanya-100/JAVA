import java.util.*;
public class prog3 {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Gender:");
        String gender=sc.next(); 
        System.out.println("Enter the age:");
        int age=sc.nextInt();

        if(gender.equalsIgnoreCase("female") && age>=1 && age<=58){
            System.out.println("The percentage of interest is:8.2%");
        }
        else if( age>=59 && age<=100){
            System.out.println("The percentage of interest is:9.2%");
        }
        else if(gender.equalsIgnoreCase("male") && age>=1 && age<=59){
            System.out.println("the percentage of interest is:0.45%");
        }
        else if(age>=59 && age<=100){
            System.out.println("the percentage of interest is:10.5%");
        }

        else{
               System.out.println("Please provide valid age and gender.!");
        }

        sc.close();

    }
}
