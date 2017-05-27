package in.codesource.programs.java.declarations.arrays;

public class MatrixMultiplication {
    public static void main(String [] args) {
        int a[][];
        int b[][];
        int c[][];
        a = new int [3] [3];
        b = new int [3] [3];
        c = new int [3] [3];
        System.out.println("Array a");
        System.out.println("-------");
        for ( int i = 0; i < a.length; i++ ) {
            for ( int j = 0; j < a[i].length; j++ ) {
                a[i][j] = i + j + 1;
                System.out.print(a[i][j] + " \t");
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("Array b");
        System.out.println("-------");
        for ( int i = 0; i < b.length; i++ ) {
            for ( int j = 0; j < b[i].length; j++ ) {
                b[i][j] = i + j;
                System.out.print(b[i][j] + " \t");
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("Array c");
        System.out.println("-------");
        for ( int i = 0; i < c.length; i++ ) {
            for ( int j = 0; j < c[i].length; j++ ) {
                for ( int k = 0; k < c[j].length; k++ ) {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
                System.out.print(c[i][j] + " \t");
            }
            System.out.println();
        }
    }
}
