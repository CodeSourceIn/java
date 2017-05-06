package in.codesource.programs.java.control_flow.iteration_statements;

public class WhileLoopWithContinue {
	public static void main(String[] args) {
		System.out.println("Without continue statement in while loop");
		System.out.println("----------------------------------------");
		int i=0;
		while(i<10) {
			i++;
			System.out.print(i+",");
		}
		System.out.println("\n");
		System.out.println("With continue statement in while loop");
		System.out.println("-------------------------------------");
		i=0;
		while(i<10) {
			i++;
			if(i == 5) 
				continue;
			System.out.print(i+",");
		}
	}
}