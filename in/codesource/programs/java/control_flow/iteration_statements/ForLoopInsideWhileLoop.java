package in.codesource.programs.java.control_flow.iteration_statements;

public class ForLoopInsideWhileLoop {
	public static void main(String[] args){
		System.out.println("For Loop Inside While Loop");
		System.out.println("--------------------------\n\n");
		int i=0;
		while(i < 9) {
			i++;
			for(int j=1;j<=i;j++)
				System.out.print(j + " ");
			System.out.println();
		}
	}
}
