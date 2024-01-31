import java.util.Scanner;
public class prime{

    static boolean isprime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
            else{
                return true;
            }

        }
        return true;
    }
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        System.out.println(isprime(n));
    }
}