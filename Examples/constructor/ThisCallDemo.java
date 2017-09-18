class Box
{
	double l,b,h;
	String color;
	double weight;

	Box(double l,double b, double h)
	{
		this.l=l;
		this.b=b;
		this.h=h;
	}
	
	Box(double l,double b, double h,String c)
	{
		this(l,b,h);
		color=c;
	}
	
	Box(double l,double b, double h,String c, double wt)
	{
		this(l,b,h,c);
		weight=wt;
	}

	//other form of overloaded constructors can be defined here


	//method to calculate volume
	void getVolume()
	{
		System.out.println("Vol = "+(l*b*h));
	}

	void getColor(){
		System.out.println("The color = "+color);
	}

	void getWeight(){
		System.out.println("The Weight = "+weight);
	}
};

class ThisCallDemo
{
	public static void main(String[] args) 
	{
		Box b = new Box(30,20,10,"Red",12.5);
		b.getVolume();
		b.getColor();
		b.getWeight();
		System.out.println("Hello World!");
	}
}
