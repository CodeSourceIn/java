package in.codesource.programs.java.declarations.arrays;

import java.util.Scanner;

public class AdvancedArrayMatrix {
    public static void main(String [] args) {
        AdvancedArrayMatrix s = new AdvancedArrayMatrix();
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the rows:");
        int rows = obj.nextInt();
        System.out.println("enter the coloums:");
        int coloums = obj.nextInt();
        int a[][] = new int [rows] [coloums];
        int b[][] = new int [rows] [coloums];
        int c[][] = new int [rows] [coloums];
        for ( int i = 0; i < rows; i++ ) {
            for ( int j = 0; j < coloums; j++ ) {
                System.out.println("a[" + i + "][" + j + "] = ");
                a[i][j] = obj.nextInt();
            }
            System.out.println();
        }
        for ( int i = 0; i < rows; i++ ) {
            for ( int j = 0; j < coloums; j++ ) {
                System.out.println("b[" + i + "][" + j + "] = ");
                b[i][j] = obj.nextInt();
            }
            System.out.println();
        }
        System.out.println("Array 'a'");
        System.out.println("---------");
        int k = 0;
        for ( int i = 0; i < rows; i++ ) {
            while (k < rows) {
                System.out.print("\tcol[" + k + "]");
                k++;
            }
            System.out.println("");
            System.out.print("row[" + i + "]");
            for ( int j = 0; j < coloums; j++ ) {
                System.out.print("\t " + a[i][j]);
            }
        }
        System.out.println("\n");
        System.out.println("Array 'b'");
        System.out.println("---------");
        k = 0;
        for ( int i = 0; i < rows; i++ ) {
            while (k < rows) {
                System.out.print("\tcol[" + k + "]");
                k++;
            }
            System.out.println("");
            System.out.print("row[" + i + "]");
            for ( int j = 0; j < coloums; j++ ) {
                System.out.print("\t " + b[i][j]);
            }
        }
        System.out.println("\n");
        k = 0;
        System.out
                .println("Enter any one Calculation method value:\n1)Addition\n2)Subtraction\n3)Multiplication\n4)Division");
        int value = obj.nextInt();
        switch (value)
        {
        case 1:
            System.out.println("You are selected Addition method\n");
            System.out.println("Array 'c'");
            System.out.println("---------");
            for ( int i = 0; i < rows; i++ ) {
                while (k < rows) {
                    System.out.print("\tcol[" + k + "]");
                    k++;
                }
                System.out.println("");
                System.out.print("row[" + i + "]");
                for ( int j = 0; j < coloums; j++ ) {
                    c[i][j] = a[i][j] + b[i][j];
                    System.out.print("\t " + c[i][j]);
                }
            }
            break;

        case 2:
            System.out.println("You are selected Subtraction method\n");
            System.out.println("Array 'c'");
            System.out.println("---------");
            for ( int i = 0; i < rows; i++ ) {
                while (k < rows) {
                    System.out.print("\tcol[" + k + "]");
                    k++;
                }
                System.out.println("");
                System.out.print("row[" + i + "]");
                for ( int j = 0; j < coloums; j++ ) {
                    c[i][j] = a[i][j] - b[i][j];
                    System.out.print("\t " + c[i][j]);
                }
            }
            break;

        case 3:
            System.out.println("You are selected Multiplication method\n");
            System.out.println("Array 'c'");
            System.out.println("---------");
            for ( int i = 0; i < rows; i++ ) {
                while (k < rows) {
                    System.out.print("\tcol[" + k + "]");
                    k++;
                }
                System.out.println("");
                System.out.print("row[" + i + "]");
                for ( int j = 0; j < coloums; j++ ) {
                    c[i][j] = a[i][j] * b[i][j];
                    System.out.print("\t " + c[i][j]);
                }
            }
            break;

        case 4:
            System.out.println("You are selected Division method\n");
            System.out.println("Array 'c'");
            System.out.println("---------");
            for ( int i = 0; i < rows; i++ ) {
                while (k < rows) {
                    System.out.print("\tcol[" + k + "]");
                    k++;
                }
                System.out.println("");
                System.out.print("row[" + i + "]");
                for ( int j = 0; j < coloums; j++ ) {
                    c[i][j] = a[i][j] / b[i][j];
                    System.out.print("\t " + c[i][j]);
                }
            }

        default:
            System.out.println("you are enterd wrong input");
        }
    }
}
