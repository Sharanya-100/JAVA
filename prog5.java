import java.util.Scanner;
public class prog5 {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Provide the color code:");
        char code=sc.next().charAt(0);
        switch (code) {
            case 'W' -> System.out.println("White");
            case 'B' -> System.out.println("Blue");
            case 'G' -> System.out.println("Green");
            case 'Y' -> System.out.println("Yellow");
            case 'R' -> System.out.println("Red");
            case 'O' -> System.out.println("Orange");
            default -> System.out.println("Inavlid color code!");
        }
        
        }
    }

