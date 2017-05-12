package in.codesource.programs.java.operators_and_expressions;

public class BinaryandShiftOperator {
    public static void main(String [] args) {
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

        c = a << 2; /* 148 = 1001 0100 */
        System.out.println(a + " << 2 = " + c);

        c = a >> 2; /* 9 = 0000 1001 */
        System.out.println(a + " >> 2  = " + c);

        c = a >>> 2; /* 9 = 0000 1001 */
        System.out.println(a + " >>> 2 = " + c);
    }
}
