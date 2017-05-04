package in.codesource.programs.java.control_flow.iteration_statements;

public class SimpleForLoop {
	public static void main(String[] args) {
		System.out.println("Simple for loop - increment");
		System.out.println("---------------------------");
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + ", ");
		}
		System.out.println("\n");
		System.out.println("Simple for loop - decrement");
		System.out.println("---------------------------");
		for(int i = 10; i >= 1; i--) {
			System.out.print(i + ", ");
		}
	}
}
