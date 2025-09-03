package classConcepts;

public class SwitchCase {

	public static void main(String[] args) {
	
   int a=125; int b=178; int c =187; int d=07;
//    
//    if(a>b && a>c && a>d)
//    {
//    	System.out.println("A is greatest:" +a);
//    }
//    else if(b>c & b>d)
//    {
//    	System.out.println("B is greated:" +b);
//    }
//    else if(c>d)
//    {
//    	System.out.println("C is greated:" +c);
//    }
//    else
//    {
//    	System.out.println("D is greatest:"+d);
//    }

//	int f = -11;
//	
//	if(f>0) {
//		System.out.println("The number is positvie:"+f);
//	}
//	else 
//	{
//	 System.out.println("The number is negative:"+f);
//	}

    int ab =0;
    switch (a) {
	case 1:
		if (a>b && a>c && a>d);
		{
		  System.out.println("The number a is greatest:"+a);
		break;
		}
	case 2:
		if (b>c || b>d);
		{
		  System.out.println("The number b is greatest:"+b);
		break;
		}
	case 3:
		if (c>d);
		{
		  System.out.println("The number c is greatest:"+c);
		break;
		}		
	default:
		System.out.println("The number d is greatest:"+d);
		break;
	}
    

	}
}