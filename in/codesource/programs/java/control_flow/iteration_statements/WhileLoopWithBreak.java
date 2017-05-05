package in.codesource.programs.java.control_flow.iteration_statements;

public class WhileLoopWithBreak {
	public static void main(String[] args) {
		System.out.println("Without break statement in while loop");
		System.out.println("-------------------------------------");
		int i=1;
		while(i<=10) {
			System.out.print(i+",");
			i++;
		}
		System.out.println("\n");
		System.out.println("With break statement in while loop");
		System.out.println("----------------------------------");
		i=1;
		while(i<=10) {
			if(i == 5) {
				break;
			}
			System.out.print(i+",");
			i++;
		}
	}
}
