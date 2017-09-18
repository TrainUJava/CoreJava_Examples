//Inheritance2 Demo

public class BoxWeight extends Box1{
 double weight;

public BoxWeight( double x, double y, double z, double w){
super(x,y,z);
weight = w;
}
public BoxWeight( double x, double w){
super(x);
weight = w;
}
public double getVol(){
System.out.println(" The Vol. of the Box is...");
//super.getVol();
return super.l*super.b*super.h;
}

public static void main( String[] args){

BoxWeight bw = new BoxWeight(30,20,10,5.6);

BoxWeight bw1 = new BoxWeight(30,5.6);

bw.getVol();

/*System.out.println( "The volume of the Box is .." + bw.getVol());*/
System.out.println( "The Weight of the Box is .." + bw.weight);

/*System.out.println( "The volume of the cube is .." + bw1.getVol());*/
bw1.getVol();

System.out.println( "The weight of the Box is .." + bw1.weight);

}
}