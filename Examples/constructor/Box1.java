//Constructor2 Demo

public class Box1{
public double l, b, h;

public Box1( double l, double b, double h){

this.l =l;
this.b = b;
this.h = h;
}

public Box1( double l){
this.l = l;
b = l;
h = l;
}

public double getVol(){

return l*b*h;
}

public static void main( String[] args){

Box1 b = new Box1(30,20,10);

Box1 b1 = new Box1(30);
Box1 b11 = new Box1();
//Box1 b2 = new Box1(30,40);

System.out.println( "The volume of the Box is .." + b.getVol());

System.out.println( "The volume of the cube is .." + b1.getVol());
}
};


