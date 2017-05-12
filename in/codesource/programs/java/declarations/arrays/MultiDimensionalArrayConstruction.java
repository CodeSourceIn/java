package in.codesource.programs.java.declarations.arrays;

public class MultiDimensionalArrayConstruction {
    public static void main(String [] args) {
        int a[][][];
        a = new int [3] [3] [3];
        for ( int i = 0; i < a.length; i++ ) {
            for ( int j = 0; j < a[i].length; j++ ) {
                for ( int k = 0; k < a[j].length; k++ ) {
                    a[i][j][k] = i + j + k;
                }
            }
        }
        System.out.println("Muti-Dimensional Array Construction");
        System.out.println("-----------------------------------");
        for ( int i = 0; i < a.length; i++ ) {
            for ( int j = 0; j < a[i].length; j++ ) {
                for ( int k = 0; k < a[j].length; k++ ) {
                    System.out.print("a[" + i + "][" + j + "][" + k + "] = " + a[i][j][k] + "\t\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
