package in.codesource.programs.java.control_flow.iteration_statements;

public class EnhancedForLoopUsingArray {
	public static void main ( String[] args) {
		int number[]={1,2,3,4,5};
		String names[]={"Raja","Kumar","Aravinth"};
		System.out.println("Numbers are ");
		for ( int num : number )
			System.out.print( num + ", " );
		System.out.println();
		System.out.println("\nNames are");
		for ( String name : names )
			System.out.print( name + ", " );
	}
}
