package in.codesource.programs.java.control_flow.selection_statements;

public class IfthenIf {
	public static void main(String[] args) {
		int a=10;
		int b=5;
		if(a!=b) {
			if (a>b)
				System.out.println("A is bigger than B");
			else 
				System.out.println("B is bigger than A");
		}
		else {
			System.out.println("A is equal to B");
		}
	}
}