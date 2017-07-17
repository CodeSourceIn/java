package in.codesource.programs.java.control_flow.transfer_statements;

public class LabeledBreakStatement {
    public static void main(String [] args) {
        String [][] country =
        { { "IND", "+91" }, { "SG", "+65" }, { "UK", "+44" }, { "US", "+1" } };
        String searchfor = "UK";
        String code;
        int i, j;
        boolean foundIt = false;
        System.out.println("Without Using Labeled Break Statement");
        System.out.println("=====================================");
        for ( i = 0; i < country.length; i++ ) {
            for ( j = 0; j < 1; j++ ) {
                if (country[i][j] == searchfor) {
                    code = country[i][1];
                    foundIt = true;
                    if (foundIt) {
                        System.out.println("country name : " + searchfor + "  country code : " + code);
                        break;
                    }
                }
            }
            System.out.println("searching...");
        }

        System.out.println("\nWith Using Labeled Break Statement");
        System.out.println("==================================");
        loop: for ( i = 0; i < country.length; i++ ) {
            for ( j = 0; j < 1; j++ ) {
                if (country[i][j] == searchfor) {
                    code = country[i][1];
                    foundIt = true;
                    if (foundIt) {
                        System.out.println("country name : " + searchfor + "  country code : " + code);
                        break loop;
                    }
                }
            }
            System.out.println("searching...");
        }
    }
}
