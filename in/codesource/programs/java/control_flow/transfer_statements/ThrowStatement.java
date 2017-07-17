package in.codesource.programs.java.control_flow.transfer_statements;

public class ThrowStatement {
    static void validate() throws Exception {
        Exception e = new Exception();
        System.out.println("Throw the Exception");
        throw e;
    }

    public static void main(String args[]) {
        try {
            ThrowStatement.validate();
        }
        catch (Exception e) {
            System.out.println("Catch the Exception");
        }
    }
}
