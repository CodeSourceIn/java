package in.codesource.programs.java.control_flow.transfer_statements;

public class UnlabeledBreakStatement {
    public static void main(String [] args) {
        System.out.println("For Loop Without break");
        System.out.println("----------------------");
        for ( int i = 1; i <= 10; i++ ) {
            System.out.print(i + ",");
        }
        System.out.println();
        System.out.println("\nFor Loop With break");
        System.out.println("-------------------");
        for ( int i = 1; i <= 10; i++ ) {
            System.out.print(i + ",");
            if (i == 5)
                break;
        }
    }
}
