com.core.java.example;
import java.util.*;
class PolicyDetails 
{
	private String name;
	private String address;
	private long policyNo;
	private double sumAssured;
	private double premiumAmt;
	private int age;

	PolicyDetails (String name,String address,long policyNo,double sumAssured,
				double premiumAmt,int age)
	{
	this.name=name;
	this.address=address;
	this.policyNo=policyNo;
	this.sumAssured=sumAssured;
	this.premiumAmt=premiumAmt;
	this.age=age;
	}//end of constructor

	public long getPolicyNo()
	{
		return policyNo;
	}
	public String getName()
	{
		return name;
	}
	public double getSumAssured()
	{
		return sumAssured;
	}
	public double getPremiumAmt()
	{
		return premiumAmt;
	}

	public int getAge()
	{
		return age;
	}


	//set methods
	public void setPolicyNo(long pn)
	{
		policyNo=pn;
	}

	public void setName(String n)
	{
		name=n;
	}
	public void setAddress(String ad)
	{
		address=ad;
	}
	public void setSumAssured(double sa)
	{
		sumAssured=sa;
	}
	public void setPremiumAmt(double pa)
	{
		premiumAmt=pa;
	}
	public void setAge(int a)
	{
		age=a;
	}

//display the information of the policy holder

public void showDetails()
	{
	System.out.println("Name		:"+name+'\n'+
					   "Policy No	:"+policyNo+'\n'+
					   "Age			:"+age+'\n'+
					"Sum Assured	:"	+sumAssured+'\n'+
					"Prem Amount	 :"	+premiumAmt+'\n');
	}
	public static void main(String[] args) 
	{
		Vector v=new Vector(2,2);
		v.add(new PolicyDetails("RaviKiran","Hyderabad",1666582,200000,5200,25));
		v.add(new PolicyDetails("Rahul Menon","Vizag",166567,200000,5200,23));
		v.add(new PolicyDetails("Sri Krishna","Nellore",1666582,300000,6200,27));
		v.add(new PolicyDetails("Rajesh","Hyderabad",1666582,400000,7200,28));
		v.add(new PolicyDetails("Madhusudan","Secunderabad",1666582,400000,7200,23));
		v.add(new PolicyDetails("Nagarjuna","Vijayavada",1666582,200000,5200,22));
		v.add(new PolicyDetails("Rajesh","Hyderabad",1666582,400000,7200,28));

		Iterator it= v.iterator();
		while(it.hasNext())
		{
			Object o= it.next();
			PolicyDetails pd =(PolicyDetails)o;
			String s =pd.getName();
				if (args[0].equalsIgnoreCase(s))
			pd.showDetails();
		}
	}
}
