package in.codesource.programs.java.operators_and_expressions;

public class BitwiseLogicalOperators {
    public static void main(String[] args) {
        int a = 37; /* 37 = 0010 0101 */
        int b = 13; /* 13 = 0000 1101 */
        int c = 0;

        c = a & b; /* 5 = 0000 0101 */
        System.out.println(a + " & " + b + " = " + c);

        c = a | b; /* 45 = 0010 1101 */
        System.out.println(a + " |" + b + " = " + c);

        c = a ^ b; /* 40 = 0010 1000 */
        System.out.println(a + " ^ " + b + " = " + c);

        c = ~a; /*-38 = 1101 1010 */
        System.out.println("~" + a + " = " + c);
<<<<<<< HEAD:in/codesource/programs/java/operators_and_expressions/BinaryandShiftOperator.java

        c = a << 2; /* 148 = 1001 0100 */
        System.out.println(a + " << 2 = " + c);

        c = 22 >> 2; /* 9 = 0000 1001 */
        System.out.println(a + " >> 2  = " + c);

        c = 22 >>> 2; /* 9 = 0000 1001 */
        System.out.println(a + " >>> 2 = " + c);
=======
>>>>>>> 7d70388413d874b55078a23b1eb5b35a5d0b0f1b:in/codesource/programs/java/operators_and_expressions/BitwiseLogicalOperators.java
    }
}
