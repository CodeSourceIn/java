package in.codesource.programs.java.control_flow.iteration_statements;

public class ForLoopIncrementDecrement {
	public static void main(String[] args) {
		System.out.println("for loop - increment by 2");
		System.out.println("--------------------------");
		for(int i = 1; i <= 10; i += 2) {
			System.out.print(i + ", ");
		}
		System.out.println("\n");
		System.out.println("for loop - decrement by 2");
		System.out.println("--------------------------");
		for(int i = 10; i >= 1; i -= 2) {
			System.out.print(i + ", ");
		}
	}
}
