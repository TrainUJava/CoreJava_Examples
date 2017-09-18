import java.io.*;

public class Email implements Serializable
{
	private String to;
	private String from;
	private String message;

	public Email(String t, String f, String m)
	{
		to=t;
		from=f;
		message=m;
	}

public void getMail()
	{
	System.out.println(to+"  "+from+"  "+message);
	}
};