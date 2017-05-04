package in.codesource.programs.java.control_flow.iteration_statements;

public class SimpleWhileLoop {
	public static void main(String[] args) {
		System.out.println("Simple while loop - increment");
		System.out.println("-----------------------------");
		int i=0;
		while(i < 10) {
			i++;
			System.out.print(i + ", ");
		}
		System.out.println("\n");
		System.out.println("Simple while loop - decrement");
		System.out.println("-----------------------------");
		i=10;
		while(i >= 1) {
			System.out.print(i + ", ");
			i--;
		}
	}
}
