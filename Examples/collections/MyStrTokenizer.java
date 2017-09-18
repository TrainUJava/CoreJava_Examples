import java.util.*;
class MyStrTokenizer 
{
static String str="My name is S banerjee."+
"I am working in Javapoint as a Faculty."+
"I am residing at Tarnaka.";
public static void main(String[] args) throws Exception
	{
StringTokenizer st=
new StringTokenizer(str," ");
	int i=st.countTokens();
	System.out.println("count="+i);
	while(st.hasMoreTokens())
		{
		try
			{
			String key =st.nextToken();
			System.out.println(key);
			}
		catch(NoSuchElementException e){ }
		}
	}
}