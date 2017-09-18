//this() Demo2;


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

public void getVol(){
double v=l*b*h;
if(v <0)System.out.println( "The Box is not constructed");else
System.out.println( "The Box is " + v+ "   "+col);
}
/*public String getColor()
{
return col;
}*/
}



class ConsDemo2 {

public static void main( String[] args){

Box b = new Box(50,30,20);

b.getVol();

Box b1 = new Box( 30,20,10,"RED");

b1.getVol();

Box b2 = new Box( 20,"Blue");

b2.getVol();
Box b3 = new Box( 20);

b3.getVol();
Box b4 = new Box();
b4.getVol();



}
};
