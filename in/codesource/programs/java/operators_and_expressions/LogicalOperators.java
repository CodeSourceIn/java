package in.codesource.programs.java.operators_and_expressions;

public class LogicalOperators {
    public static void main(String [] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        boolean d = true;

        System.out.println("'&&' operator");
        System.out.println("-------------");
        System.out.println("true && true = " + (true && true));
        System.out.println("true && false = " + (true && false));
        System.out.println("false && true = " + (false && true));
        System.out.println("\n'||' operator");
        System.out.println("-------------");
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("\n'!' operator");
        System.out.println("-------------");
        System.out.println("! true = " + (!true));
        System.out.println("! false = " + (!false));
        System.out.println();
        System.out.println("a>=b && a>=c :" + (a >= b && a >= c));
        System.out.println("a>=b || b>=c :" + (a >= b && b >= c));
        System.out.println("c>a && d :" + (c > a && d));
        System.out.println("!d :" + (!d));
    }
}
