// passing Objects as arguments to a method
//javapoint computers;

class Meth{
int a =10;
int b= 20;

public void changeValue( Meth o){

o.a = o.a+10;
o.b = o.b*2;
System.out.println(" Inside change value" + "  a = "+a+
		"  b = " +b);
}
};

class PassObj{

public static void main(String[] args){


Meth m = new Meth();
System.out.println("Before Call to changeValue()"+
		"  a = "+m.a+"  b = " +m.b);
m.changeValue(m);

System.out.println("Before Call to changeValue()"+
		"  a = "+m.a+"  b = " +m.b);
}
};

