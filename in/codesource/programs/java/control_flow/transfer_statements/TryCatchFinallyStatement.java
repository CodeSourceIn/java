package in.codesource.programs.java.control_flow.transfer_statements;

public class TryCatchFinallyStatement {
    public static void main(String args[]) {
        try {
            int number;
            number = 5 / 0;
            System.out.println("Exception");
        }
        catch (Exception e) {
            System.out.println("Warning Exception");
        }
        finally {
            System.out.println("Insert Finally Section");
        }
    }
}
