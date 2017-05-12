package in.codesource.programs.java.declarations.arrays;

public class TwoDimensionalArrayIncreasingColumns {
    public static void main(String [] args) {
        System.out.println("Two Dimensional Array Increasing Column Size");
        int a[][] = new int [5] [];
        a[0] = new int [1];
        a[1] = new int [2];
        a[2] = new int [3];
        a[3] = new int [4];
        a[4] = new int [5];
        for ( int i = 0; i < 5; i++ ) {
            for ( int j = 0, k = 1; j < i + 1; j++, k++ ) {
                a[i][j] = k;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

}
