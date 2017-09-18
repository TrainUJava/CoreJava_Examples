
public class MyArithException
{
/* This pogram explains us about exception
raised due to Arithmetic operation*/
	public static void main(String[] args) 
	{
		try
		{
		int a=args.length;
		int b=20;
		int x[]={1,2,3,4,5};
		int c=b/a;
		x[40]=30;
		System.out.println("c=" + c);
		}
		catch(ArithmeticException a)
		{
		System.out.println(" denominator must not be ZERO");
		//a.printStackTrace();
		//System.out.println("Error is "+a);
		}
		catch(ArrayIndexOutOfBoundsException o)
		{
		System.out.println("exception="+o);
		}
	System.out.println("hello, this is normal code");
	}
}
