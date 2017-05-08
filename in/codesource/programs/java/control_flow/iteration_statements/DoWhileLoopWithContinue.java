package in.codesource.programs.java.control_flow.iteration_statements;

public class DoWhileLoopWithContinue {
	public static void main(String[] args) {
		System.out.println("Without continue statement in do while loop");
		System.out.println("-------------------------------------------");
		int i=0;
		do {
			i++;
			System.out.print(i+",");
		}while(i<10);
		System.out.println("\n");
		System.out.println("With continue statement in do while loop");
		System.out.println("----------------------------------------");
		i=0;
		do {
			i++;
			if(i == 5) 
				continue;
			System.out.print(i+",");
		}while(i<10);
	}
}
