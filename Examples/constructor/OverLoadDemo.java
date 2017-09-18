class OverLoadDemo
{
	String name;
	public void info()
	{
		System.out.println("Sorry no information is available..");
	}

	public String info(String name)
	{
		this.name=name;
		return " The Customer is  "+ name;
	}

	public void info(String n,int id)
	{
		System.out.println("The Customer is "+n+" and his ID is  "+id);
	}

	public static void main(String[] args) 
	{
		OverLoadDemo od = new OverLoadDemo();
		od.info();
		System.out.println(od.info("Ravikiran"));
		od.info("Rajiv",1234);
	}
	
}
