class Static
 {
	public static int i =10;
	public int j =20;

static
	{
		System.out.println(" This is static block...");
	}

	public  static void display()
		{
		System.out.println(" This is a  static method");
		}
};

//

class Static2Demo{

public static void main( String[] args){

System.out.println( "The value of i = " + Static.i);
Static s = new Static();
s.i = 40;
Static t = new Static();
System.out.println( "The value of j = " + t.j);

Static.display();
}
public  void display1(){
System.out.println(" This is a non static method");
}


};