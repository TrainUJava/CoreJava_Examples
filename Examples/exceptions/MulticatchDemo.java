class MultiCatchDemo 
{
	public static void main(String[] args) 
	{
	int l=args.length;
	int a[]=new int[l];
	int b=0;
	try
		{
		b=1/l;
		a[5]=15;
		}
	catch(ArithmeticException e)
		{System.out.println("Divide by Zero");}
	catch(ArrayIndexOutOfBoundsException e)
		{System.out.println("Array Size is not as per Required");}
	catch(NullPointerException e)
		{System.out.println("Null assignment");}
System.out.println("b="+b);
	}
}
