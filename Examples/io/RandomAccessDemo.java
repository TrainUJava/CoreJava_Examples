import java.io.*;
class RandomAccessDemo 
{
	//RandomAccessFile r;
	
	public static void main(String[] args) throws Exception
	{
		RandomAccessDemo  rd = new RandomAccessDemo();
		RandomAccessFile raf= new RandomAccessFile("abc.txt", "r");

rd.print(40, raf);
rd.print(20,raf);
rd.print(10,raf);
rd.print(50,raf);
	}

	public static void print( int n, RandomAccessFile r) throws Exception
		{
		
RandomAccessFile rf =r ;
		 System.out.println  ("\n\n\n printing from "               + n + " \n\n\n");
        rf.seek(n);

        int x;

        while ( ( x = rf.read() ) != -1 ) {

            System.out.print( (char)(x) );
        }

}
}