import java.util.*;
class HashTableDemo 
{
	public static void main(String[] args) 
	{
    Hashtable numbers = new Hashtable();
    numbers.put("one", new Integer(1));
    numbers.put("two", new Integer(2));
    numbers.put("three", new Integer(3));
//To retrieve a number, use the following code: 
     Integer n = (Integer)numbers.get("two");
	int x= n.intValue();
	x+=5;
	numbers.put("two",new Integer(x)); 
     n = (Integer)numbers.get("two");
	 if (n != null)
         System.out.println("two = " + n);
	 Enumeration e=numbers.elements();
	 while(e.hasMoreElements())
		{
	System.out.println(e.nextElement()+" "+"\n");
		}
	 }
	}