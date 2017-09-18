import java.util.*;
class PropertiesDemo 
{
	public static void main(String[] args) 
	{
Properties capitals = new Properties();
String str;
capitals.put("Andhrapradesh","Hyderabad");
capitals.put("Tamilnadu","Chennai");
capitals.put("Karnataka","Bangalore");
capitals.put("Kerala","Trivendram");
Set states=capitals.keySet();
	Iterator i=states.iterator();
		while(i.hasNext())
		{
		str=(String)i.next();
System.out.println("the capital of "
+str+" is "+capitals.get(str));
		}
	}
}