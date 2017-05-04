package in.codesource.programs.java.control_flow.iteration_statements;

public class SimpleDoWhileLoop {
	public static void main(String args[]) {
		int i=1;
		System.out.println("Simple do while loop - increment");
		System.out.println("--------------------------------");
		do {
			System.out.print(i + ", ");
			i++;
		}while(i<=10);
		i=10;
		System.out.println("\n");
		System.out.println("Simple do while loop - decrement");
		System.out.println("--------------------------------");
		do {
			System.out.print(i + ", ");
			i--;
		}while(i>=1);
	}
}
