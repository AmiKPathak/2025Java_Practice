package classConcepts;

public class Staticclass {
	
	
	public void m1() {
	System.out.println("thie is m1 mothod");
};

    public void m2(int a) {
	System.out.println("this is m2 method" + a);
	
	
}
    public void m3() {
	System.out.println("this is m3 method");
}

    public static void main(String[] args) {
	Staticclass c1 = new Staticclass();
	c1.m1();
	c1.m2(5);
	
	}

}