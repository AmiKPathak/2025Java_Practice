package classConcepts;

public class StaticMethod {

	public void getMail()
	{
		System.out.println("This is non static method");
	}
	
	public static void sendMail()
	{
		System.out.println("This is static method");
	}
		
	public static void main(String[] args) {
		
     StaticMethod e1 = new StaticMethod();
     e1.getMail();
     sendMail();
     StaticMethod.sendMail();
     
    
	}

}
