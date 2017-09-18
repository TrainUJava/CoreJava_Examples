package personpackage;

public class Person {

     private String name;
     private String address;

     public Person(){ 
        System.out.println("Inside Person:Constructor"); 
     }

     public Person (String name, String address){
        System.out.println("Inside Person:Constructor 2 receiving two parameters: " + name + ", " + address);
        this.name = name;
        this.address = address;
     }

     public String getName(){
          System.out.println("Person: getName()");
          return name;
     }

     public void setName(String s){
          name = s;
     }

     public String getAddress(){
          return address;
     }

     public void setAddress(String s){
          address = s;
     }
}
