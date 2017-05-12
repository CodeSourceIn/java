package in.codesource.programs.java.operators_and_expressions;

public class RelationalOperators {
    public static void main(String [] args) {
        int a = 5;
        int b = 5;
        int c = 8;
        System.out.println(a + " is equal to " + b + " : " + (a == b));
        System.out.println(a + " is equal to " + c + " : " + (a == c));
        System.out.println(a + " is less than " + c + " : " + (a < c));
        System.out.println(a + " is not equal to " + b + " : " + (a != b));
        System.out.println(a + " is not equal to " + c + " : " + (a != c));
        System.out.println(a + " is greater than " + c + " : " + (a > c));
        System.out.println(a + " is less than or equal to " + c + " : " + (a <= c));
        System.out.println(a + " is greater than or equal to " + b + " : " + (a >= b));
        System.out.println(a + " is greater than or equal to " + c + " : " + (a >= c));
    }
}
