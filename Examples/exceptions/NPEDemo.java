/* This Exception occurs when the object
is used without initializing it. 
This is run-time error*/
import java.awt.*;
public class NPEDemo
{
Button b;
public void display()
	{
	System.out.println(b.getLabel());
	}
public static void main(String[] args)
	{
	NPEDemo n = new NPEDemo();
	try
		{
		n.display();
		}
	catch(NullPointerException npe)
		{
		System.out.println("Pointing to Nothing");
		}
	}
}
