package in.codesource.programs.java.declarations.arrays;

public class SingleDimensionalArray {
    public static void main(String[] args) {
        int a[] = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[3] = 30;
        a[4] = 40;
        System.out.println("Single Dimensional Array");
        System.out.println("------------------------");
        for (int i = 0; i < a.length; i++)
            System.out.println("a[" + i + "] = " + a[i]);
    }
}
