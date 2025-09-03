package classConcepts;

public class Exceptionhandling {
	String Name;
	public static void main(String[] args)
	{
		int x = 10;
		int v = 0;
		
		
       try 
       {
    	   System.out.println(x/v);
    	Exceptionhandling obj = new Exceptionhandling();
   		obj = null;
   		obj.Name = "Tom";
		
       }
       
       catch(Exception e){
    	   e.printStackTrace();
    	   System.out.println("Some exception");
       }
       
//	   catch(ArithmeticException e)
//       {
//		System.out.println("AC error is coming");
//		e.printStackTrace();
//       }
//       
//       catch(NullPointerException e)
//       {
//		System.out.println("NPE error is coming");
//		e.printStackTrace();
//       }
       
       System.out.println("Bye");
		
	}

}
