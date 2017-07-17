package in.codesource.programs.java.control_flow.transfer_statements;

public class UnlabeledContinueStatement {
    public static void main(String [] args) {
        System.out.println("For Loop Without Continue");
        System.out.println("-------------------------");
        for ( int i = 1; i <= 10; i++ ) {
            System.out.print(i + ",");
        }
        System.out.println();
        System.out.println("\nFor Loop With Continue");
        System.out.println("----------------------");
        for ( int i = 1; i <= 10; i++ ) {
            if ((i % 2) == 0)
                continue;
            System.out.print(i + ",");
        }
    }
}
