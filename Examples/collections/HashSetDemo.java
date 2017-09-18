import java.util.*;
class HashSetDemo{
public static void main( String[] args){
HashSet hs = new HashSet();
hs.add("A");
hs.add("B");
hs.add("A");
hs.add(new Integer(5));
hs.add(new Double(6.6));
System.out.println(hs);
}
};