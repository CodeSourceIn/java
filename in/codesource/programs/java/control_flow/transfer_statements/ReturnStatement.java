package in.codesource.programs.java.control_flow.transfer_statements;

public class ReturnStatement {
    public static void main(String [] args) {
        int a = 4;
        int b = 8;
        int c = maxFunction(a, b);
        System.out.println("Maximum Value = " + c);
        printMinFunction(a, b);
    }

    public static int maxFunction(int a1, int b1) {
        int max;
        if (a1 > b1)
            max = a1;
        else
            max = b1;
        return max;
    }

    public static void printMinFunction(int a1, int b1) {
        int min;
        if (a1 > b1)
            min = b1;
        else
            min = a1;
        System.out.println("Minimum Value = " + min);
        return;
    }
}
