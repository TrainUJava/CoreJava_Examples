public class StringDemo1{

public static void main( String[] args){

char[] ch ={'a','b','c','d','e','f','g'};

String s1 = new String( ch,2,4);
String s2 = new String(ch);
String s3 = new String("This is java point at ameerpet");
String s4 = new String(s3);

System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
System.out.println(s4);



String s5 = " I like javapoint at Ameerpet the most";

System.out.println(s4.charAt(3));
System.out.println(s4.length());
System.out.println(s4.substring(2));
System.out.println(s4.substring(8,12));
System.out.println(s4.startsWith("This"));
System.out.println(s4.startsWith("java"));
System.out.println(s4.endsWith("pet"));
System.out.println(s2.replace('d','j'));
System.out.println(s4.indexOf('a'));
System.out.println(s4.indexOf('a',12));
System.out.println(s4.lastIndexOf('a'));
System.out.println(s4.lastIndexOf('a',12));
System.out.println(s4.equals(s3));
System.out.println(s4.equals(s5));


}
}