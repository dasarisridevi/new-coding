import java.util.Scanner;

public class GCDandLCM {
    static int euclidGCD(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a != 0) {
            return a;
        } else {
            return b;
        }
    }

    static int calculateLCM(int a, int b) {
        return (a * b) / euclidGCD(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for two integers
        System.out.print("Enter the first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter the second integer: ");
        int b = sc.nextInt();

        // Calculating and displaying the GCD
        int gcdResult = euclidGCD(a, b);
        System.out.println("The Greatest Common Divisor (GCD) of " + a + " and " + b + " is: " + gcdResult);

        // Calculating and displaying the LCM
        int lcmResult = calculateLCM(a, b);
        System.out.println("The Least Common Multiple (LCM) of " + a + " and " + b + " is: " + lcmResult);

        // Closing the scanner
        sc.close();
    }
}
