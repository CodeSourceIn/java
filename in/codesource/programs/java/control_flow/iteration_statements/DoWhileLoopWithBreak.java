package in.codesource.programs.java.control_flow.iteration_statements;

public class DoWhileLoopWithBreak {
	public static void main(String[] args) {
		System.out.println("Without break statement in do while loop");
		System.out.println("----------------------------------------");
		int i=1;
		do {
			System.out.print(i+",");
			i++;
		}while(i<=10);
		System.out.println("\n");
		System.out.println("With break statement in do while loop");
		System.out.println("-------------------------------------");
		i=1;
		do {
			if(i == 5) {
				break;
			}
			System.out.print(i+",");
			i++;
		}while(i<=10);
	}
}
