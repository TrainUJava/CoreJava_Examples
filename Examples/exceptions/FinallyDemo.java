class FinallyDemo
{
	public static void main(String[] args)
	{
	int a=10;
	int b=10;
	try{
		int c=a/b;
System.out.println("after exception");

		}
//System.out.println("You Divided with Zero");

/*catch(ArithmeticException e)

	{
System.out.println(" In try You Divided with Zero");
//System.exit(0);
	}

catch (Exception e){
System.out.println(e);

}*/

finally{
System.out.println("Finally block executes");
}
	System.out.println("After Catch block normal code");
	}
}

