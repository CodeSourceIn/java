package in.codesource.programs.java.declarations.arrays;

public class TwoDimensionalArrayUnequalColumns {
    public static void main(String [] args) {
        System.out.println("Two Dimensional Array Unequal Columns");
        int a[][] = new int [3] [];
        a[0] = new int [2];
        a[1] = new int [2];
        a[2] = new int [2];
        for ( int i = 0; i < 3; i++ ) {
            for ( int j = 0; j < 2; j++ ) {
                System.out.print("a[" + i + "][" + j + "] = " + a[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
