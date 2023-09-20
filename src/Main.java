import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        final char C = '1';     //Constant value
        float res;      //variable for storing the result of calculation

        Scanner sc = new Scanner(System.in);
        System.out.println("1-type values manually / 2-use predefined values");

        short inp;

        //Exception handling
        try{
            inp = sc.nextShort();
        }
        catch (InputMismatchException exc){     //If the number typed by user is not a short int
            System.out.println("Incorrect input value, number should be either 1 or 2");
            return;
        }

        //Checking if value typed by user is 1 or 2
        switch (inp){
            case 1:
                System.out.println("Type n:");
                char n = sc.next().charAt(0);
                System.out.println("Type m:");
                char m = sc.next().charAt(0);
                System.out.println("Type a:");
                char a = sc.next().charAt(0);
                System.out.println("Type b:");
                char b = sc.next().charAt(0);

                res = MathematicalExpression.calculateExpression(n, m, a, b, C);
                break;
            case 2:
                res = MathematicalExpression.calculateExpression('z','x', 'v', 'a', C);
                break;
            default:
                System.out.println("Incorrect input value, number should be either 1 or 2");
                return;
        }
        System.out.print("The result of calculation is " + res);
    }
}