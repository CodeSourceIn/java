package in.codesource.programs.java.control_flow.iteration_statements;

public class ForLoopWithContinue {
	public static void main(String[] args) {
		System.out.println("Without continue statement in for loop");
		System.out.println("--------------------------------------");
		for(int i=1;i<=10;i++) {
			System.out.print(i+",");
		}
		System.out.println("\n");
		System.out.println("With continue statement in for loop");
		System.out.println("-----------------------------------");
		for(int i=1;i<=10;i++) {
			if(i == 5) {
				continue;
			}
			System.out.print(i+",");
		}
	}
}