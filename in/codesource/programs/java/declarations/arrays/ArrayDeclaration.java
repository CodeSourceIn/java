package in.codesource.programs.java.declarations.arrays;

public class ArrayDeclaration {
	public static void main(String[] args) {
		float a[];
		a = new float[5];
		a[0]=10.0f;
		a[1]=20.0f;  
		a[3]=30.0f;  
		a[4]=40.0f;   
		System.out.println();
		System.out.println("Array Declaration - float");  
		System.out.println("------------------------");   
		for(int i=0;i<a.length;i++)
			System.out.println("a[" + i + "] = " + a[i]); 

		char b[];
		b = new char[5];
		b[0]='A';
		b[1]='B';  
		b[2]='C';  
		b[3]='D';   
		System.out.println();
		System.out.println("Array Declaration - char");  
		System.out.println("-----------------------");   
		for(int i=0;i<b.length;i++)
			System.out.println("b[" + i + "] = " + b[i]); 

		String[] c;
		c = new String[5];
		c[0]="C#";
		c[2]="Java";  
		c[3]="C++";  
		c[4]="Oracle";   
		System.out.println();
		System.out.println("Array Declaration - string");  
		System.out.println("-------------------------");   
		for(int i=0;i<c.length;i++)
			System.out.println("c[" + i + "] = " + c[i]); 
	}
}
