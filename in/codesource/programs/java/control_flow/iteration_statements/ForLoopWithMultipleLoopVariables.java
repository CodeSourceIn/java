package in.codesource.programs.java.control_flow.iteration_statements;

public class ForLoopWithMultipleLoopVariables {
	public static void main(String[] args) {
	for(int i=1,j=10;(i<=10)&&(j>=1);i++,j--)
		System.out.println(i+"\t"+j);
	}
}
