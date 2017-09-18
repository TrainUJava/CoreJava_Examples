import java.io.*;

public class SerializationDemo {
  public static void main(String args[]) {
    
    // Object serialization
    try {
      PolicyInfo pi = new PolicyInfo("Chiru",12345,55446677,345678);
	  System.out.println('\n'+"The Object info before Serialisation..."+'\n');
      pi.custInfo();
      FileOutputStream fos = new FileOutputStream("serial.ser");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(pi);
      oos.flush();
      oos.close();
    }
    catch(Exception e) {
      System.out.println("Exception during serialization: " + e);
      System.exit(0);
    }

    // Object deserialization
    try {
      PolicyInfo pi1;
      FileInputStream fis = new FileInputStream("serial.ser");
      ObjectInputStream ois = new ObjectInputStream(fis);
      Object o = ois.readObject();
	  pi1 = (PolicyInfo)o;
	  ois.close();
	  //System.out.println( o instanceof MyClass);
	  System.out.println('\n'+"The Object info after Deserialisation..."+'\n');
      pi1.custInfo();
    }
    catch(Exception e) {
      System.out.println("Exception during deserialization: " + e);
      System.exit(0);
    }
  }
}



class PolicyInfo implements Serializable
{	//Declare instance variables(fields)
	String name;
	int customerId;
	int contactNo;
	int policyNo;
	
	//Constructor for the class

	PolicyInfo(String name,int id,int contactNo,int policyNo)
	{
		this.name=name;
		customerId=id;
		this.contactNo=contactNo;
		this.policyNo=policyNo;
	}
	

	public void custInfo()
	{
		System.out.println("Policy No      :  "+policyNo);
		System.out.println("Name           :  "+name);
		System.out.println("ID             :  "+customerId);
		System.out.println("COntact No     :  "+contactNo);
	}
}