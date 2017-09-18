/* This program explains multiple catch blocks */

public class MyOtherException 
	{
	public static void main(String[] args) 
		{
			try
				{
				int a=args.length;
				int b=20;
				int c=b/a;
				int x[]={1,2,3};
				x[10]=10;
				System.out.println("c=" + c);
				}
			catch(ArithmeticException a)
				{
				System.out.println(" denominator must not be ZERO");
				System.out.println("Error is "+a);
				}
			catch(ArrayIndexOutOfBoundsException a)
				{
				System.out.println(" Index you mensioned is not in the bounds");
				System.out.println("Error is "+a);
				}
			catch(Exception e){}

		}
}
