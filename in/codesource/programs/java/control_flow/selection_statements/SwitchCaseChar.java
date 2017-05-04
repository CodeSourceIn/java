package in.codesource.programs.java.control_flow.selection_statements;

public class SwitchCaseChar {
	public static void main(String[] args) {
		int i=0;
		char [] alpha={'A','B','C','D'};  
		System.out.println("character values are ");
		while(i<4) {
			switch(alpha[i]) {  
			case 'A':
				System.out.println("A");
				break;  
			case 'B': 
				System.out.println("B");
				break;  
			case 'C': 
				System.out.println("C");
				break;  
			default:
				System.out.println("Not in A, B and C");  
			}
			i++;
		}
	}
}
