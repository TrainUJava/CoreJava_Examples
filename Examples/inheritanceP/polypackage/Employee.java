package polypackage;

public class Employee extends Person {

     private String hobby;

     public Employee(){ 
        System.out.println("Inside Employee:Constructor"); 
    }

     public Employee(String name, String address){
        super(name, address);
        System.out.println("Inside Employee:Constructor 2 receiving two parameters: " + name + ", " + address);
     }

     public String getHobby(){
          return hobby;
     }

     public void setHobby(String s){
          hobby = s;
     }

     // Override getName() method of the parent class
     public String getName(){
          System.out.println("Employee: getName()");
          return "Not so Passionate  Employee " + super.getName();
     }
}