// Demo for this();

class Box {
private double l,b,h;
private String col = "colorless";

Box(){
l = -1;
b = -1;
h = -1;
}

Box( double l, double b, double h){
	this.l = l;
	this.b = b;
	this.h = h;
}

Box(double x){
l = x;
b = x;
h = x;
}

Box( double x, double y, double z, String c){
	this(x,y,z);
	col =c;
}


Box( double x, String c){
	this(x);
	col =c;
}

public double getVol(){
return l*b*h;
}
 public String getColor(){
return col;
}
}



class ThisDemo {

public static void main( String[] args){

Box b = new Box(10,20,30,"red");

//Box b = new Box(50,30,20);
System.out.println(" The Volume of BOx b = " + b.getVol());
System.out.println(" The color of BOx b = " + b.getColor());

Box b1 = new Box( 30,20,10,"RED");
System.out.println(" The Volume of BOx b1 = " + b1.getVol());
System.out.println(" The color of BOx b1 = " + b1.getColor());

Box b2 = new Box( 20,"Blue");

System.out.println(" The Volume of BOx b2 = " + b2.getVol());
System.out.println(" The color of BOx b2 = " + b2.getColor());

Box b3 = new Box( 20);

System.out.println(" The Volume of BOx b3 = " + b3.getVol());
System.out.println(" The color of BOx b3 = " + b3.getColor());


}
};
