package in.codesource.programs.java.control_flow.transfer_statements;

public class LabeledContinueStatement {
    public static void main(String [] args) {
        System.out.println("Unlabeled Continue Statement");
        System.out.println("============================");
        for ( int j = 0; j < 3; j++ ) {
            System.out.println("\nouter for loop " + j);
            for ( int i = 0; i < 3; i++ ) {
                System.out.println("inner for loop " + i);
                if (i == j) {
                    continue;
                }
            }
        }

        System.out.println("\nLabeled Continue Statement");
        System.out.println("==========================");
        loop: for ( int j = 0; j < 3; j++ ) {
            System.out.println("\nouter for loop " + j);
            for ( int i = 0; i < 3; i++ ) {
                System.out.println("inner for loop " + i);
                if (i == j) {
                    continue loop;
                }
            }
        }
    }
}
