package in.codesource.programs.java.operators_and_expressions;

public class UnaryOperators {
    public static void main(String [] args) {
        int i = 5;
        System.out.println("Before i++ value:" + i);
        System.out.println("During i++ value:" + (i++));
        System.out.println("After i++ value:" + i);

        System.out.println("\nBefore ++i value:" + i);
        System.out.println("During ++i value:" + (++i));
        System.out.println("After ++i value:" + i);

        System.out.println("\nBefore i-- value:" + i);
        System.out.println("During i-- value:" + (i--));
        System.out.println("After i-- value:" + i);

        System.out.println("\nBefore --i value:" + i);
        System.out.println("During --i value:" + (--i));
        System.out.println("After --i value:" + i);

        System.out.println("\nBefore +i value:" + i);
        System.out.println("During +i value:" + (+i));

        System.out.println("\nBefore -i value:" + i);
        System.out.println("During -i value:" + (-i));

        System.out.println("\nBefore ~i value:" + i);
        System.out.println("During ~i value:" + ~i);
        System.out.println("After ~i value:" + i);
    }
}