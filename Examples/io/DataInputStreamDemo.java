import java.io.*;
class DataInputStreamDemo 
{
	public static void main(String[] args) throws Exception
	{
		DataInputStream in = new DataInputStream(new
            BufferedInputStream(new FileInputStream("data.dat")));

		double price;
		int unit;
		String desc;
		double total = 0.0;

		try {
			while (true) {
				price = in.readDouble();
				unit = in.readInt();
				desc = in.readUTF();
				System.out.format("You ordered %d units of %s at $%.2f%n",
                unit, desc, price);
				 total += unit * price;
			}
			} catch (EOFException e) {
				}
		System.out.println("Hello World!");
	}
}
