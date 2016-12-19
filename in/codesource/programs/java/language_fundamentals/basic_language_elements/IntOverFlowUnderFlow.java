package in.codesource.programs.java.language_fundamentals.basic_language_elements;

public class IntOverFlowUnderFlow {
	public static void main(String[] args) {
		System.out.println("int data type overflow");
		System.out.println(2147483647 + 0);
		System.out.println(2147483647 + 1);
		System.out.println(2147483647 + 2);
		System.out.println(Integer.MAX_VALUE + 3);
		System.out.println("int data type underflow");
		System.out.println(-2147483648 - 0);
		System.out.println(-2147483648 - 1);
		System.out.println(-2147483648 - 2);
		System.out.println(Integer.MIN_VALUE- 3);
	}
}
