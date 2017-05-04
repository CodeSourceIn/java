package in.codesource.programs.java.control_flow.iteration_statements;

import java.util.ArrayList;
public class EnhancedForLoopUsingCollections {
	public static void main ( String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add( new Integer(1) );
		number.add( new Integer(2) );
		number.add( new Integer(3) );
		number.add( new Integer(4) );
		number.add( new Integer(5) );
		ArrayList<String> names = new ArrayList<String>();
		names.add( new String("Raja") );
		names.add( new String("Kumar") );
		names.add( new String("Aravinth") );
		System.out.println("Numbers are ");
		for ( Integer num : number )
			System.out.print( num + ", " );
		System.out.println();
		System.out.println("\nNames are ");
		for ( String name : names )
			System.out.print( name + ", " );
	}
}
