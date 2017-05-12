package in.codesource.programs.java.operators_and_expressions;

public class AssignmentOperators {
    public static void main(String [] args) {
        int a = 5;
        int b = 10;
        int c = 0;

        System.out.println("      Assignment Operators");
        System.out.println("---------------------------------");

        c = a + b;
        System.out.println("c = " + a + "+" + b + " \t= " + c); /* 5 + 10 = 15 */

        a = 10;
        c = 15;
        c /= a;
        System.out.println(c + " /= " + a + " \t= " + c); /* 15 / 10 = 1 */

        a = 10;
        c = 15;
        c %= a;
        System.out.println(c + " %= " + a + " \t= " + c); /* 15 % 10 = 5 */

        c <<= 2;
        System.out.println(c + " <<= 2 \t= " + c); /* 5*(2*2) = 20 */

        c >>= 2;
        System.out.println(c + " >>= 2 \t= " + c); /* 20/(2*2) = 5 */

        c >>= 2;
        System.out.println(c + " >>= 2 \t= " + c); /* 5*(2*2) = 1 */

        c += a;
        System.out.println(c + " += a  \t= " + c); /* 1 + 10 = 11 */

        c -= a;
        System.out.println(c + " -= a  \t= " + c); /* 11 - 10 = 1 */

        c *= a;
        System.out.println(c + " *= a  \t= " + c); /* 1 * 10 = 10 */

        c &= a;
        System.out.println(c + " &= a  \t= " + c); /* 1 & 1 = 10 */

        c ^= a;
        System.out.println(c + " ^= a  \t= " + c); /* 10 ^ 10 = 0 */

        c |= a;
        System.out.println(c + " |= a  \t= " + c); /* 0 | 10 = 10 */
    }
}
