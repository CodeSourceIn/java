package in.codesource.programs.java.declarations.arrays;

public class TwoDimensionalArrayUnequalColumns {
    public static void main(String[] args) {
        System.out.println("Two Dimensional Array Unequal Columns");
        int a[][] = new int[5][];
        a[0] = new int[3];
        a[1] = new int[5];
        a[2] = new int[4];
        a[3] = new int[6];
        a[4] = new int[2];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                a[i][j] = i + j + 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
                System.out.print(a[i][j] + " ");
            System.out.println("");
        }
    }
}
