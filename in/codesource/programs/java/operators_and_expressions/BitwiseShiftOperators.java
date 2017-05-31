package in.codesource.programs.java.operators_and_expressions;

public class BitwiseShiftOperators {
    public static void main(String[] args) {
        int a = 37; /* 37 = 0010 0101 */
        int b = 13; /* 13 = 0000 1101 */
        int c = 0;

        c = a << 2; /* 148 = 1001 0100 */
        System.out.println(a + " << 2 = " + c);

        c = a >> 2; /* 9 = 0000 1001 */
        System.out.println(a + " >> 2  = " + c);

        c = a >>> 2; /* 9 = 0000 1001 */
        System.out.println(a + " >> 2  = " + c);

        a = 65536; /* 65536 = 0000 0000 0000 0001 0000 0000 0000 0000 */
        c = a >> 2; /* 16384 = 0000 0000 0000 0000 0100 0000 0000 0000 */
        System.out.println(a + " >> 2  = " + c);

        c = a >>> 2; /* 16384 = 0000 0000 0000 0000 0100 0000 0000 0000 */
        System.out.println(a + " >>> 2 = " + c);

        a = -65536; /* -65536 = 1111 1111 1111 1111 0000 0000 0000 0000 */
        c = a >> 2; /* -16384 = 1111 1111 1111 1111 1100 0000 0000 0000 */
        System.out.println(a + " >> 2  = " + c);

        c = a >>> 2; /* 9 = 0000 1001 */
        System.out.println(a + " >>> 2 = " + c);
    }
}
