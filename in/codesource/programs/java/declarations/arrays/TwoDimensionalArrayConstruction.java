package in.codesource.programs.java.declarations.arrays;

public class TwoDimensionalArrayConstruction {
    public static void main(String [] args) {
        System.out.println("Two Dimensional Array Construction-Int");
        int a[][];
        a = new int [2] [2];
        for ( int i = 0; i < 2; i++ ) {
            for ( int j = 0; j < 2; j++ ) {
                System.out.print("a[" + i + "][" + j + "] = " + a[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("\nTwo Dimensional Array Construction-Float");
        float b[][];
        b = new float [2] [2];
        for ( int i = 0; i < 2; i++ ) {
            for ( int j = 0; j < 2; j++ ) {
                System.out.print("b[" + i + "][" + j + "] = " + b[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("\nTwo Dimensional Array Construction-Char");
        char c[][];
        c = new char [2] [2];
        for ( int i = 0; i < 2; i++ ) {
            for ( int j = 0; j < 2; j++ ) {
                System.out.print("c[" + i + "][" + j + "] = " + c[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("\nTwo Dimensional Array Construction-String");
        String d[][];
        d = new String [2] [2];
        for ( int i = 0; i < 2; i++ ) {
            for ( int j = 0; j < 2; j++ ) {
                System.out.print("d[" + i + "][" + j + "] = " + d[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
