package in.codesource.programs.java.declarations.arrays;

public class TwoDimensionalArrayIncreasingColumns {
    public static void main(String[] args) {
        System.out.println("Two Dimensional Array with Increasing Column Size");
        int a[][] = new int[5][];
        for (int i = 0; i < a.length; i++)
            a[i] = new int[i + 1];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                a[i][j] = i + j + 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}
