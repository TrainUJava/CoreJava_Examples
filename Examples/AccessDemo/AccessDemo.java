class Access
{
	private int i=20;
	public int j=30;
			int k = 40;
	
	private int f1()
	{
		i++;
		return i;
	}

	public int f2()
	{
		i++;
		return i;
	}

	int f3()
	{
		i++;
		return i;
	}

	public int f4()
	{
		int l= f1();
		//System.out.println(l);
		return l;
	}
		
};
class AccessDemo  
{
	public static void main(String[] args) 
	{
		Access a= new Access();
		//System.out.println(a.f1());
		System.out.println(a.f2());
		System.out.println(a.f3());
		System.out.println(a.f4());

		//System.out.println(a.i);
		System.out.println(a.j);
		System.out.println(a.k);
	}
}
