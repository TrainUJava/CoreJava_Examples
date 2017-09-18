// Access Modifiers

class  CustomerInfo
{
	private String name;
	private int customerId;
	private int contactNo;
	private String address;

	public void setName(String name)
	{
		this.name=name;
	}

	public void setCustomerId(int id)
	{
		customerId=id;
	}
	public void setContactNo(int ph)
	{
		contactNo=ph;
	}
	public void setAddress(String ad)
	{
		address=ad;
	}

	
	public void getInfo()
	{
		System.out.println(customerId+" "+name+" "+address+" "+contactNo);

	}
	public static void main(String[] args) 
	{
		CustomerInfo ct=new CustomerInfo();

		//iF THE VARIABLES ARE DECLARED private THEN THEY CANNOT BE
		//ACCESSED BY THE "dot" OPERATOR
		/*ct.name="Ravikiran";
		ct.customerId=1234;
		ct.contactNo=55446688;
		ct.address="Hyderabad";*/

		//Public methods to change the values of private Variables
		ct.setName("Ravikiran");
		ct.setCustomerId(1234);
		ct.setContactNo(55446688);
		ct.setAddress("Hyderabad");
		ct.getInfo();//call the method to display info.
	}
}
