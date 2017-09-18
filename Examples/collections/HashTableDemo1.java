import java.util.*;
class HashTableDemo1 
{
	public static void main(String[] args) 
	{
    Hashtable numbers = new Hashtable();
    numbers.put("one", new Integer(1));
    numbers.put("two", new Integer(2));
    numbers.put("three", new Integer(3));
	numbers.put("four", new Integer(3));
	numbers.put("two",new Integer(5));
	Integer i =(Integer)numbers.get("two");
	System.out.println(i.intValue());
      
	  Enumeration e=numbers.elements();
	 while(e.hasMoreElements())
		{
	System.out.println(e.nextElement()+" "+"\n");
		}
	 }
	}