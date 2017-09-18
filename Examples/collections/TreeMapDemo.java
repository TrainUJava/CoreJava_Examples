import java.util.*;

class TreeMapDemo  
{
	public static void main(String[] args) 
	{
		TreeMap hm = new TreeMap();
		hm.put("shantanu", new Double(5000));
		hm.put("Sajid", new Double(3000.50));
		hm.put("Obul Reddy", new Double(500.90));
		hm.put("Manjula", new Double(4000.50));
		hm.put("Rajender",new Double(400.86));

		Set s = hm.entrySet();
		//Set s = hm.keySet();
		Iterator itr = s.iterator();
		while (itr.hasNext())
		{
			Map.Entry m =(Map.Entry)itr.next();
			System.out.print( m.getKey()+" : ");
			System.out.println( m.getValue());
			//System.out.println(hm.get(itr.next()));
			
		}

		double balance = ((Double)hm.get("shantanu")).doubleValue();
		hm.put("shantanu",new Double(balance+3000));
		System.out.print("shantanu's new Balance is..");
		System.out.println(hm.get("shantanu"));
		//System.out.println(hm);
	}
}
