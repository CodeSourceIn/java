package in.codesource.programs.java.declarations.arrays;

import java.util.Scanner;

public class AdvancedArrayMatrix {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter num of rows:");
        int rows = obj.nextInt();
        System.out.println("enter num of columns:");
        int cols = obj.nextInt();
        int a[][] = new int[rows][cols];
        int b[][] = new int[rows][cols];
        int c[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("a[" + i + "][" + j + "] = ");
                a[i][j] = obj.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("b[" + i + "][" + j + "] = ");
                b[i][j] = obj.nextInt();
            }
            System.out.println();
        }
        System.out.println("Array 'a'");
        System.out.println("---------");
        int k = 0;
        for (int i = 0; i < rows; i++) {
            while (k < rows) {
                System.out.print("\tcol[" + k + "]");
                k++;
            }
            System.out.println("");
            System.out.print("row[" + i + "]");
            for (int j = 0; j < cols; j++) {
                System.out.print("\t " + a[i][j]);
            }
        }
        System.out.println("\n");
        System.out.println("Array 'b'");
        System.out.println("---------");
        k = 0;
        for (int i = 0; i < rows; i++) {
            while (k < rows) {
                System.out.print("\tcol[" + k + "]");
                k++;
            }
            System.out.println("");
            System.out.print("row[" + i + "]");
            for (int j = 0; j < cols; j++) {
                System.out.print("\t " + b[i][j]);
            }
        }
        System.out.println("\n");
        k = 0;
        System.out.println("Choose any one Calculation:\n1)Addition\n2)Subtraction\n3)Multiplication\n4)Division");
        int value = obj.nextInt();
        switch (value) {
        case 1:
            System.out.println("You have selected Addition\n");
            System.out.println("Array 'c'");
            System.out.println("---------");
            for (int i = 0; i < rows; i++) {
                while (k < rows) {
                    System.out.print("\tcol[" + k + "]");
                    k++;
                }
                System.out.println("");
                System.out.print("row[" + i + "]");
                for (int j = 0; j < cols; j++) {
                    c[i][j] = a[i][j] + b[i][j];
                    System.out.print("\t " + c[i][j]);
                }
            }
            break;

        case 2:
            System.out.println("You have selected Subtraction\n");
            System.out.println("Array 'c'");
            System.out.println("---------");
            for (int i = 0; i < rows; i++) {
                while (k < rows) {
                    System.out.print("\tcol[" + k + "]");
                    k++;
                }
                System.out.println("");
                System.out.print("row[" + i + "]");
                for (int j = 0; j < cols; j++) {
                    c[i][j] = a[i][j] - b[i][j];
                    System.out.print("\t " + c[i][j]);
                }
            }
            break;

        case 3:
            System.out.println("You have selected Multiplication\n");
            System.out.println("Array 'c'");
            System.out.println("---------");
            for (int i = 0; i < rows; i++) {
                while (k < rows) {
                    System.out.print("\tcol[" + k + "]");
                    k++;
                }
                System.out.println("");
                System.out.print("row[" + i + "]");
                for (int j = 0; j < cols; j++) {
                    c[i][j] = a[i][j] * b[i][j];
                    System.out.print("\t " + c[i][j]);
                }
            }
            break;

        case 4:
            System.out.println("You have selected Division\n");
            System.out.println("Array 'c'");
            System.out.println("---------");
            for (int i = 0; i < rows; i++) {
                while (k < cols) {
                    System.out.print("\tcol[" + k + "]");
                    k++;
                }
                System.out.println("");
                System.out.print("row[" + i + "]");
                for (int j = 0; j < cols; j++) {
                    c[i][j] = a[i][j] / b[i][j];
                    System.out.print("\t " + c[i][j]);
                }
            }
            break;

        default:
            System.out.println("You have given a wrong input!");
        }
    }
}
