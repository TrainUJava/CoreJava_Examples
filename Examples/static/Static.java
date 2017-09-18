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
public static void main( String[] args){

System.out.println( "The value of before change i = " + i);
Static s = new Static();
s.i = 40;
s.j = 30;
Static t = new Static();
System.out.println( "The value of i after change = " + t.i);

System.out.println( "The value of j = " + t.j);

display();
}
public  void display1(){
System.out.println(" This is a non static method");
}


};

//end of class Static

