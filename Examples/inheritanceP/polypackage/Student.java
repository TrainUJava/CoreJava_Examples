package polypackage;

public class Student extends Person {

     private String hobby;

     public Student(){ 
        System.out.println("Inside Student:Constructor"); 
    }

     public Student (String name, String address){
        super(name, address);
        System.out.println("Inside Student:Constructor 2 receiving two parameters: " + name + ", " + address);
     }

     public String getHobby(){
          return hobby;
     }

     public void setHobby(String s){
          hobby = s;
     }

     // Override getName() method of the parent class
     public String getName(){
          System.out.println("Student: getName()");
          return "Passionate Student " + super.getName();
     }
}