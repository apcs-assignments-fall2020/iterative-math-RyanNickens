import java.util.Scanner;

public class MyMain {
    
    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        //This code prints out a very long double, but is still functioning code
        double y = x;
        double z = 1.0;
        double e = 0.000001; 
        while (y - z > e) { 
            y = (y + z) / 2; 
            z = x / y; 
        } 
        return y; 
        //return -1;
    }

    // Calculates the factorial of a number
    public static double factorial(int x) {
        int fact=1; 
        int i = 1; 
        int number=x;  
        for(i=1;i<=number;i++){    
            fact=fact*i;    
        }    
        return fact; 
    }  
    

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        double e = 1;
        double y = 1;
        for(int i = 1; i < 50; i++) {
            e = e + 1/(double)(factorial(i));
            if (Math.E -e < 0.00001) {
                break;
            }
            if (Math.E + 0.00001 == e) {
                break;
            }
            else {
                y = 1; //useless else statement
            }
        }
        return e;   
        //return -1;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a positive number!");
        double x = scan.nextDouble();
        System.out.println("The square root of " + x + " is apporximately: " + babylonian(x));
        System.out.println("The value of e is roughly: " + calculateE());


        scan.close();
    }
}
