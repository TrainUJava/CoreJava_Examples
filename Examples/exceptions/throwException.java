 /* this Exception occurs when we are calling a method 
which is throwing exception*/
public class throwException 
{
	public void threw()
		{
		throw new ArithmeticException("Divide");
		}
		
	public static void main(String[] args) 
	{
	throwException te=new throwException();
	te.threw();
	}
}
