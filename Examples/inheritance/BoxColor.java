//inheritance Demo

class BoxColor extends Box{
private String color = "colorless";
BoxColor( double l,double b, double h, String c){
super(l,b,h);
color = c;
}

BoxColor( double l, String c){
super(l);
color = c;
}

public String getColor(){
return color;
}
/*public double getVol(){
System.out.println(" The sub class getVol() Exeduted");
return super.getVol();
}
*/

public static void main( String[] args){
BoxColor bc = new BoxColor(20,"red");
//BoxColor b = new BoxColor();

System.out.println(" The Volume of the Box is ..." + bc.getVol());
System.out.println(" The color of the box is " + bc.getColor());

}
};
