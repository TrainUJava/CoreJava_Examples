import java.io.*;
class DirListing
{
	public static void main(String[] args) 
	{
		File dir = new File(System.getProperty("user.dir"));
		if (dir.isDirectory())
		{
			System.out.println("Directory of "+dir);
			String[] list = dir.list();
			for (int i=0;i<list.length;i++ )
			{
				System.out.println("\t"+list[i]);
			}
		}
		System.out.println("--End of list--");
	}
}
