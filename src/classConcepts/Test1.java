package classConcepts;

public class Test1 {

	String Name;
	int id;
	String workplace;
	Boolean IsPermanent;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test1 obj = new Test1();
		obj.Name = "Ami";
		obj.id = 1001;
		obj.workplace = "Mindspace";
		obj.IsPermanent = true;
		
		System.out.println(obj.Name + " " + obj.id + " " + obj.workplace + " " + obj.IsPermanent);
	
		Test1 obj1 = new Test1();
		obj1.Name = "Kapil";
		obj1.id = 1002;
		obj1.workplace = "Powai";
		obj1.IsPermanent = false;
		
		System.out.println(obj1.Name + " " + obj1.id + " " + obj1.workplace + " " + obj1.IsPermanent);
	
//		obj = obj1;
//		System.out.println("-------------");
//		System.out.println(obj.Name + " " + obj.workplace + " " + obj.id + " " + obj.IsPermanent);
//		System.out.println(obj1.Name + " " + obj1.id + " " + obj1.workplace + " " + obj1.IsPermanent);
		
		Test1 obj2= new Test1();
		obj2.Name = "Krishiv";
		obj2.id = 1003;
		obj2.workplace = "Andheri";
		obj2.IsPermanent = true;
		
		System.out.println(obj2.Name + " " + obj2.id + " " + obj2.workplace + " " + obj2.IsPermanent);
		
		Test1 obj3 = new Test1();
		obj3.Name = "Brishti";
		obj3.id = 1003;
		obj3.workplace = "Germany";
		obj3.IsPermanent = false;
		
		System.out.println(obj3.Name + " " + obj3.id + " " + obj3.workplace + " " + obj3.IsPermanent);
		
//	    obj = obj1 = obj2 = obj3;
	    
//	    System.out.println("--------");
	    
//	    System.out.println(obj.Name + " " + obj.id + " " + obj.workplace + " " + obj.IsPermanent);
//	    System.out.println(obj1.Name + " " + obj1.id + " " + obj1.workplace + " " + obj1.IsPermanent);
//	    System.out.println(obj2.Name + " " + obj2.id + " " + obj2.workplace + " " + obj2.IsPermanent);
//	    System.out.println(obj3.Name + " " + obj3.id + " " + obj3.workplace + " " + obj3.IsPermanent);
		
//	    System.out.println("-------");
//	    obj = obj1;
		
//	    System.out.println(obj.Name + " " + obj.id + " " + obj.workplace + " " + obj.IsPermanent);
//	    System.out.println(obj1.Name + " " + obj1.id + " " + obj1.workplace + " " + obj1.IsPermanent);
//	    System.out.println(obj2.Name + " " + obj2.id + " " + obj2.workplace + " " + obj2.IsPermanent);
//	    System.out.println(obj3.Name + " " + obj3.id + " " + obj3.workplace + " " + obj3.IsPermanent);
		
//	    System.out.println("-------");
//	    obj3 = obj;
//		
//	    System.out.println(obj.Name + " " + obj.id + " " + obj.workplace + " " + obj.IsPermanent);
//	    System.out.println(obj1.Name + " " + obj1.id + " " + obj1.workplace + " " + obj1.IsPermanent);
//	    System.out.println(obj2.Name + " " + obj2.id + " " + obj2.workplace + " " + obj2.IsPermanent);
//	    System.out.println(obj3.Name + " " + obj3.id + " " + obj3.workplace + " " + obj3.IsPermanent);
//		
		int i = 12;
		if (i%2 ==0)
		{
			
			
			System.out.println("This is even number");
		}
		else
		{
			
			
			System.out.println("This is odd number");
		}
		
	}

	}
