package in.codesource.programs.java.declarations.arrays;

public class ArrayOperations {
    public static void main(String [] args) {
        int a[] = { 5, 3, 6 };
        int b[] = { 1, 3, 4 };
        for ( int i = 0; i < a.length; i++ ) {
            System.out.print("a[" + i + "] = " + a[i]);
            System.out.print("\tb[" + i + "] = " + b[i]);
            System.out.println();
        }
        System.out.println("\nArray Operations");
        System.out.println("----------------");
        for ( int i = 0; i < a.length; i++ ) {
            System.out.println();
            System.out.print("a[" + i + "] + b[" + i + "] = " + (a[i] + b[i]) + " ");
            System.out.print("\t\t a[" + i + "] - b[" + i + "] = " + (a[i] - b[i]));
        }
    }
}
