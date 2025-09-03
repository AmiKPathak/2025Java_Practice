package classConcepts;

public class StaticMethod1 {

	public static void main(String a[]) {
		System.out.println("this is my main method");
		StaticMethod1.main(10);
	}
	
	
	public static void main(int a[], String b[]) {
		System.out.println("main "+ a);
	}
	
	public static void main(int a) {
		System.out.println("hi main "+ a);
	}
	
	public static void main(int a, int b) {
		System.out.println("main "+ a+b);
	}
	
	public static void main(int a, String b) {
		System.out.println("main "+ a+b);
	}
	
}
