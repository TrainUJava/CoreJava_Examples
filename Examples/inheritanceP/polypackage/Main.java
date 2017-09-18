package polypackage;

public class Main {
    public static void main( String[] args ) {
        Person  ref;
        Student studentObject = new Student("Sang", "1 Dreamland");
        Employee employeeObject = new Employee("Young", "2 Dreamland");
        
        ref = studentObject; //Person ref. points to a
        // Student object
        
        //getName of Student class is called
        String temp1=ref.getName();
        System.out.println( temp1 );
        
        ref = employeeObject; //Person ref. points to an
        // Employee object
        
        //getName of Employee class is called
        String temp2 = ref.getName();
        System.out.println( temp2 );
    }
}
