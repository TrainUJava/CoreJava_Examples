import java.io.*;
class DataOutputStreamDemo 
{
	public static void main(String[] args) throws Exception
	{
		 double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
		 int[] units = { 12, 8, 13, 29, 50 };
		 String[] descs = { "Java T-shirt",
        "Java Mug",
        "Duke Juggling Dolls",
        "Java Pin",
        "Java Key Chain" };
		DataOutputStream out = new DataOutputStream(new
            BufferedOutputStream(new FileOutputStream("data.dat")));

		for (int i = 0; i < prices.length; i ++) {
		out.writeDouble(prices[i]);
		out.writeInt(units[i]);
		out.writeUTF(descs[i]);
		}
		out.flush();
		out.close();

		
	}
}
