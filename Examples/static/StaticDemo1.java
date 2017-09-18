//Static Demo - calling static methods of other class

class StaticDemo1{
public static void main( String[] args){
StaticDemo s1 = new StaticDemo();
StaticDemo s2 = new StaticDemo();

int c = StaticDemo.add(2,3);
System.out.println(" The sum is ....." + c);

s1.i = 30;
System.out.println(" The changed value of i is ..."+s2.i);
}
};