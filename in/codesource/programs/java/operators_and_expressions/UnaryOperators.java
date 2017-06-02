package in.codesource.programs.java.operators_and_expressions;

public class UnaryOperators {
    public static void main(String[] args) {
        int i = 5, j = -5;
        boolean k = true;
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

        i = 5;
        j = -10;
        System.out.println("\n i value:" + i);
        System.out.println(" +i value:" + (+i));

        System.out.println("\n j value:" + j);
        System.out.println(" +j value:" + (+j));

        System.out.println("\n i value:" + i);
        System.out.println(" -i value:" + (-i));

        System.out.println("\n j value:" + j);
        System.out.println(" -j value:" + (-j));

        System.out.println("\n k value:" + k);
        System.out.println(" !k value:" + (!k));
    }
}
