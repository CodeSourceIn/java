package in.codesource.programs.java.control_flow.iteration_statements;

public class NestedForLoop {
	public static  void main(String[] args) {
		System.out.println("	Nested For Loop");
		System.out.println("-----------------------------------\n\n");
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
