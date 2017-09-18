public class StudentRecord {
// Instance variables
private String name;
private String address;
private int age;
private double mathGrade;
private double englishGrade;
private double scienceGrade;
private double average;
private static int studentCount;
/**
* Returns the name of the student (Accessor method)
*/
public String getName(){
return name;
}
/**
* Changes the name of the student (Mutator method)
*/
public void setName( String temp ){
name = temp;
}

/**
* Computes the average of the english, math and science
* grades (Accessor method)
*/
public double getAverage(){
double result = 0;
result = ( mathGrade+englishGrade+scienceGrade )/3;
return result;
}
/**
* returns the number of instances of StudentRecords
* (Accessor method)
*/
public static int getStudentCount(){
return studentCount;
}
}
