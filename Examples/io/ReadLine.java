import java.io.*;

class ReadLine
{
	public static void main(String[] args) throws IOException
		
	{
		BufferedReader br=new BufferedReader(
			new InputStreamReader(System.in));

		System.out.println("Enter Your First name...");
		String s1=br.readLine();
		System.out.println("Enter Your last  name...");
		String s2=br.readLine();

		System.out.println("Hello ..."+s1+" "+s2);

	}
}
