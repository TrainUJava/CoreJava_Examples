class Student
{
	String name;
	int rollNo;
	String address;
  Student( String s, int n,String a)
	{
	  name =s;
	  rollNo=n;
	  address=a;
	}

	Student()
	{
		System.out.println(" Sorry!!! no info for the student...");
	}
	void info()
	{
		System.out.println("Name =  "+name+"\n"+
										"Roll No= "+rollNo+"\n"+
										"Address = "+address);
	}
};
class  StudentDemo
{
	public static void main(String[] args) 
	{
		Student john = new Student( "John",123,"Hyderabad");
		/*john.name="John";
		john.rollNo=1234;
		john.address ="javaPoint";*/
		john.info();

		Student maria = new Student("Maria",234,"Secunderabad");
		maria.info();

		Student s = new Student();
		System.out.println("Hello World!");
	}
}
