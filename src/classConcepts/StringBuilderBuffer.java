package classConcepts;

public class StringBuilderBuffer {

	
	
	public static void main(String[] args) {
	//string is immutable
		String sr = "Selenium";
		sr = "Web automation tool";
		System.out.println(sr);
	
		String sr1 = new String("Playwright");
        sr1 = "Platwright next gen";
        sr1.concat("this one is better");
        System.out.println(sr1);
        
        StringBuilder sr2 = new StringBuilder("omg");
        System.out.println(sr2);
        sr2.append("OMGpart2");
        sr2.equals(sr2);
        System.out.println(sr2);
	
	}
}




