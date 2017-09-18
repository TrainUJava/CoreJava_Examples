import java.io.*;
class DeSerializerDemo 
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis = new FileInputStream("Email.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o = ois.readObject();
		System.out.println(o.getClass().getName());
		Email mail = (Email)o;
		mail.getMail();
		System.out.println("Hello World!");
	}
}
