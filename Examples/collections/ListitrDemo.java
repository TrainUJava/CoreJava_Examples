import java.util.*;
class ListitrDemo 
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();

		a.add("A");
		a.add("B");
		a.add("C");
		a.add("D");
		a.add("E");
		a.add("F");

		ListIterator l = a.listIterator(a.size());

		while(l.hasPrevious())
		{
		System.out.println(l.previous());
		}
	}
}
