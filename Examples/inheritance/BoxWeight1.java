class BoxWeight1 extends BoxColor
{
private double weight;
BoxWeight1(double l,double b,double h,String c,double w)
{
super(l,b,h,c);
weight=w;
}
BoxWeight1(double l,String c,double w)
{
super(l,c);
weight=w;
}

public double getWeight(){
return weight;
}

public static void main(String[] args){
BoxWeight1 bw = new BoxWeight1(10,20,5,"blue",5.6);
System.out.println("The Volume   =  "+bw.getVol());

System.out.println("The Color   =  "+bw.getColor());
System.out.println("The Weight  =  "+bw.getWeight());
}

};