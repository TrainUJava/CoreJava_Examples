
class StaticDemo {
public static int i = 10;
public int j = 20;

public static int add( int a, int b)
	{
		return a+b;
	}

	static {
		System.out.println(" The value of j is ..");
		}


//main method

public static void main( String[] args)
	{
	i = 20;
	System.out.println(" The changed value of i is = " +i);
	 int c = add(2,3);
	System.out.println(" The sum is ..." + c);
	StaticDemo s = new StaticDemo();
	System.out.println(" The value of j is .." +s.j);
	}
};