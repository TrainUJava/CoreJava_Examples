public class  NestedTry
{
	public static void main(String[] args) 
	{
	try
		{
		int a=args.length;
		int b=40/a;
		System.out.println("a="+a);
		if(a==1) a=a/(a-a);
			try
				{
				if(a==2)
					{
					int x[]={1,2,3,4,5};
					x[20]=43;
					}
				}
		catch(ArithmeticException ae)
			{
			System.out.println("error:"+ae);
			}

			}	// end of inner try block
	catch(ArrayIndexOutOfBoundsException aio)
				{
		System.out.println("error:"+aio);
				}

		}
	}

