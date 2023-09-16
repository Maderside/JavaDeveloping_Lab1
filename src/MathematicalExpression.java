/**
 * The MathematicalExpression class represents a mathematical expression, described in Lab1 document.
 */
class MathematicalExpression {

    /**
     * calculateExpression method calculates and returns the result of the required mathematical expression based on variables values
     *
     * @param n The upper limit of outer summation.
     * @param m The upper limit of inner summation.
     * @param a The lower limit of outer summation.
     * @param b The lower limit of inner summation.
     * @param C Constant value.
     * @return The result of calculation.
     */
    public static float calculateExpression(char n, char m, char a, char b, final char C) {
        float s = 0;      //final result of the calculation
        float subsum = 0;     //the result of inner summation

        for (char i = a; i <= n; i++) {      //loop for outer summation
            s += subsum;
            subsum = 0;
            for (char j = b; j <= m; j++) {      //loop for inner summation
                subsum += ((float) (i - j) / (float) (i + C));
            }
        }

        return s;
    }
}
