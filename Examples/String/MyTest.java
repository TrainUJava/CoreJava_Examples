public class MyTest 
{
	public static void main(String[] args) 
	{
	String s1="abc";
	String s2=new String("abc");
	String s3=s2;
	if(s2==s1)
		System.out.println("equals");
	else
		System.out.println("not equals");
	if(s2.equals(s1))
		System.out.println("equals");
	else
		System.out.println("not equals");
	
	}
}
