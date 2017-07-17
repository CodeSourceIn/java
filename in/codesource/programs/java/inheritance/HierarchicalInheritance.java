package in.codesource.programs.java.inheritance;

class Category {
    void water() {
        System.out.println("water...");
    }
}

class Sky extends Category {
    void rain() {
        System.out.print("rain ");
    }
}

class Earth extends Category {
    void sea() {
        System.out.print("sea ");
    }
}

class HierarchicalInheritance {
    public static void main(String args[]) {
        Earth e = new Earth();
        e.sea();
        e.water();
        System.out.println();
        Sky s = new Sky();
        s.rain();
        s.water();
    }
}
