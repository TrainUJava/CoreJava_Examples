package personpackage;

public class Student extends Person {

     private String hobby;

     public Student(){ 
        System.out.println("Inside Student:Constructor"); 
    }

     public String getHobby(){
          return hobby;
     }

     public void setHobby(String s){
          hobby = s;
     }
}
