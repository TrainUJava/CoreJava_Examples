class SbDemo{
public static void main(String[] args){

String s = "I like java point the most";

StringBuffer sb1 = new StringBuffer(s);
StringBuffer sb2 = new StringBuffer();

System.out.println(" The Capacity of Sb1 = " + 	sb1.capacity());
System.out.println(" The length Sb1 = " + 	sb1.length());
System.out.println(" The Capacity of Sb2 = " + 	sb2.capacity());
sb1.setLength(20);

System.out.println(sb1);
sb1.setLength(42);
System.out.println(sb1);
sb1.setLength(20);
sb1.append("e").append(" most");
System.out.println(sb1);
sb1.deleteCharAt(7);
System.out.println(sb1);
sb1.delete(7,15);
System.out.println(sb1);
sb1.insert(7,"java");
System.out.println(sb1);
sb1.deleteCharAt(11);
System.out.println(sb1);
System.out.println(sb1);
String s1 =sb1.substring(7,11);
System.out.println(s1);
//System.out.println(sb1);
//System.out.println(s);
sb1.reverse();
System.out.println(sb1);






}
}
