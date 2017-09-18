import java.io.*;

class BRRead {
  public static void main(String args[]) 
    throws IOException
  {
    char c;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter characters, 'q' to quit.");

    // read characters
    do {
		int i =  br.read();
      c = (char)i;
      System.out.print(c);
    } while(c != 'q');
  }
}