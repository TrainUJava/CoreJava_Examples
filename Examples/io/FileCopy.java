import java.io.*;
class FileCopy
{
	public static void main( String[] args) throws Exception{

		int c;
		FileInputStream fin = new FileInputStream("file.txt");
		FileOutputStream fout = new FileOutputStream("mnp.txt");

		do{
			c = fin.read();
			fout.write(c);
		}while(c!=-1);
		fin.close();
		fout.close();
	}
};