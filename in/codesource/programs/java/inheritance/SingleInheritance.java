package in.codesource.programs.java.inheritance;

class Calculation {
    int c;

    public void addition(int a, int b) {
        c = a + b;
        System.out.println("The sum of the given numbers a and b:" + c);
    }
}

public class SingleInheritance extends Calculation {
    public static void main(String [] args) {
        int a = 10, b = 40;
        SingleInheritance s1 = new SingleInheritance();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        s1.addition(a, b);
    }
}
