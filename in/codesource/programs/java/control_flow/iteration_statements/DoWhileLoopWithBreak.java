package in.codesource.programs.java.control_flow.iteration_statements;

public class DoWhileLoopWithBreak {
	public static void main(String[] args) {
		System.out.println("Without break statement in do while loop");
		System.out.println("----------------------------------------");
		for(int i=1;i<=10;i++) {
			System.out.print(i+",");
		}
		System.out.println("\n");
		System.out.println("With break statement in do while loop");
		System.out.println("-------------------------------------");
		for(int i=1;i<=10;i++) {
			if(i == 5) {
				break;
			}
			System.out.print(i+",");
		}
	}
}
