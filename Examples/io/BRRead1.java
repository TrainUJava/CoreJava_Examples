// Use a BufferedReader to read characters from the console.
import java.io.*;

class BRRead1 {
	
  public static void main(String args[]) 
    throws IOException
  {
    char c;
	int i=0;
	InputStreamReader isr =new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
    System.out.println("Enter characters, 'q' to quit.");

    // read characters
    do {
		 i = Integer.ParseInt( br.read());
      c = (char)i;
      System.out.print(c);
    } while(i != 3);
  }
}