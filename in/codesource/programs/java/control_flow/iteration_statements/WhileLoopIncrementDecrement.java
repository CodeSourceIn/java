package in.codesource.programs.java.control_flow.iteration_statements;

public class WhileLoopIncrementDecrement {
	public static void main(String[] args) {
		System.out.println("while loop - increment by 2");
		System.out.println("---------------------------");
		int i=0;
		while(i < 10) {
			i+=2;
			System.out.print(i + ", ");
		}
		System.out.println("\n");
		System.out.println("while loop - decrement by 2");
		System.out.println("---------------------------");
		i=10;
		while(i >= 1) {
			System.out.print(i + ", ");
			i-=2;
		}
	}
}
