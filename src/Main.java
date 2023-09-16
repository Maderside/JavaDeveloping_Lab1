import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final char C = '1';
        float res=0;      //variable for storing the result of calculation

        Scanner sc = new Scanner(System.in);
        System.out.println("1-type values manually / 2-use predefined values");
        short inp = sc.nextShort();

        //Checking if value typed by person is 1 or 2
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
        }
        System.out.print("The result of calculation is " + res);
    }
}
