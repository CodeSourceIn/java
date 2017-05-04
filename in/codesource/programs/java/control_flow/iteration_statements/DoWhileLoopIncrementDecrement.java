package in.codesource.programs.java.control_flow.iteration_statements;

public class DoWhileLoopIncrementDecrement {
	public static void main(String args[]) {
		int i=1;
		System.out.println("Simple do while loop - increment by 2");
		System.out.println("-------------------------------------");
		do {
			System.out.print(i + ", ");
			i+=2;
		}while(i<=10);
		i=10;
		System.out.println("\n");
		System.out.println("Simple do while loop - decrement by 2");
		System.out.println("-------------------------------------");
		do {
			System.out.print(i + ", ");
			i-=2;
		}while(i>=1);
	}
}
