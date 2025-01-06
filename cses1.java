import java.util.Scanner;
public class cses1 {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt();
        if(a<=0){
            System.out.println("enter a positive integer");
        }
        else{
            System.out.println("Sequence is:");
        

        while(a!=1){
            System.out.print(a+" ");
            if(a%2==0){
                a/=2;
            }
            else{
                a=3*a+1;
            }
        }
        System.out.print(a);
        
    }
}
}
