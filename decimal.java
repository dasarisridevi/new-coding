import java.util.Scanner;
public class decimal{
    static void d2b(int n){
        int i=2;
        String res="";
        while(n<=1){
        int x=n%i;
        res=x+res;
        n=n/2;
        }
        
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        d2b(n);
    
        
    }
}