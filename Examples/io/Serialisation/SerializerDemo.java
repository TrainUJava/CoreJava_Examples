import java.io.*;
class  SerializerDemo
{
	public static void main(String[] args) throws Exception
	{
		Email e = new Email("abc@yahoo.com","xyz@gmail.com","Hello, this IO Stream");
		System.out.println("Before Serialization info is");
		e.getMail();

		FileOutputStream fos = new FileOutputStream("Email.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		oos.flush();
		oos.close();
		System.out.println(" The Object is Serialized...");
	}
}
