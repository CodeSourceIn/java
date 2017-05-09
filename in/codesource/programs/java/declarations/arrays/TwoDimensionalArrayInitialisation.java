package in.codesource.programs.java.declarations.arrays;

public class TwoDimensionalArrayInitialisation {
    public static void main(String [] args) {
        int a[][] = {
                { 1, 10 },
                { 2, 20 },
                { 3, 30 },
                { 4, 40 },
                { 5, 50 }
        };
        System.out.println("Two Dimensional Array");
        System.out.println("------------------------");
        for ( int i = 0; i < 5; i++ ) {
            for ( int j = 0; j < 2; j++ ) {
                System.out.println("a[" + i + "][" + j + "] = " + a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
