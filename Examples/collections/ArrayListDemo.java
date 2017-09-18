import java.util.*;
class ArrayListDemo 
{
	public static void main(String[] args) 
	{
ArrayList a1=new ArrayList();
System.out.println("Initial size of al:"+a1.size());
	a1.add("J");
	a1.add("A");
	a1.add("V");
	a1.add("A");
	a1.add("P");
	a1.add("O");
	a1.add("I");
	a1.add("N");
	a1.add("T");
System.out.println("size After additions:"+a1.size());
System.out.println("Contents of al:"+a1);
	a1.remove("A");
	System.out.println("size After deletions of A:"+a1.size());
	a1.remove(2);
	a1.trimToSize();
System.out.println("size After deletions:"+a1.size());
System.out.println("contants of a1:"+a1);
	a1.add(0,"J");
	a1.add(3,"A");
	a1.add(0,"K");
	a1.add(0,new Integer(1000));
	a1.trimToSize();
System.out.println("The Element M is in the list:  "+a1.contains("M"));
System.out.println("size After additions:"+a1.size());
System.out.println("Contents of al:"+a1);
	Object ia[]=a1.toArray();
	String str = " ";
	for(int i=0;i<ia.length;i++)
	str+=ia[i];
	System.out.println(str);
	}
}
