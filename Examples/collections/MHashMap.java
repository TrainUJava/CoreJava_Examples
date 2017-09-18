import java.util.*;

class MHashMap 
{
	public static void main(String[] args) 
	{
		Map m = new HashMap();
		for(int i=0;i<args.length;i++)
		{
			Integer noTimes = (Integer)m.get(args[i]);
			if (noTimes==null)
			{
				m.put(args[i],new Integer(1));
			}
			else {
				m.put(args[i], new Integer(noTimes.intValue()+1));
			}
		}
		System.out.println(m.size()+ "Distinct words detected...");
		System.out.println(m);
	}
}
