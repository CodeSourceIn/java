package in.codesource.programs.java.operators_and_expressions;

public class TernaryConditionalOperator {
    public static void main(String [] args) {
        int a, b;
        a = 10;
        System.out.println("Ternary Operator's condition true");
        System.out.println("---------------------------------");
        b = (a == 10) ? 0 : 1;
        System.out.println("Value of b is : " + b);
        a++;
        System.out.println("");
        System.out.println("Ternary Operator's condition false");
        System.out.println("----------------------------------");
        b = (a == 0) ? 0 : 1;
        System.out.println("Value of b is : " + b);
    }
}
