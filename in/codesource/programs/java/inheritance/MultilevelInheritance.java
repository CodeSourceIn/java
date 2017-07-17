package in.codesource.programs.java.inheritance;

class classc {
    void subclass3() {
        System.out.println("class c");
    }
}

class classb extends classc {
    void subclass2() {
        System.out.println("class b");
    }
}

class classa extends classb {
    void subclass1() {
        System.out.println("class a");
    }
}

class MultilevelInheritance {
    public static void main(String args[]) {
        classa s1 = new classa();
        s1.subclass1();
        s1.subclass2();
        s1.subclass3();
    }
}
