package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String aname, int aStudentId, int anumberOfCredits, double agpa){
        this.name = aname;
        this.studentId = aStudentId;
        this.numberOfCredits = anumberOfCredits;
        this.gpa = agpa;
    }

    public Student(){
        this.name = "Default";
        this.studentId = -1;
        this.numberOfCredits = 0;
        this.gpa = 0;
    }

    public boolean equals(Student person){
        if (person == this){
            return true;
        }

        if (person == null){
            return false;
        }

        if (person.getClass() != getClass()){
            return false;
        }

        Student theStudent = (Student) person;
        return theStudent.getStudentId() == getStudentId();
    }

    public String toString(){
        return this.getGradeLevel() + ": " + name + " (Credits: " + numberOfCredits + ", GPA: " + gpa + ")";
    }

    public String getName(){
       return name;
    }

    public void setName(String aname){
        name = aname;
    }

    public int getStudentId(){
        return studentId;
    }

    public void setStudentId(int nextId){
        studentId = nextId;
    }

    public int getNumberOfCredits(){
        return numberOfCredits;
    }

    public void setNumberOfCredits(int aNumberOfCredits){
        numberOfCredits = aNumberOfCredits;
    }

    public double getGpa(){
        return gpa;
    }

    public void setGpa(double newGpa){
        gpa = newGpa;
    }

    public String getGradeLevel(){
        String gradeLevel = "";

        if (this.numberOfCredits <= 29){
            gradeLevel = "Freshman";
        } else if(this.numberOfCredits <= 59){
            gradeLevel = "Sophomore";
        } else if(this.numberOfCredits <= 89){
            gradeLevel = "Junior";
        } else if(this.numberOfCredits > 90){
            gradeLevel = "Senior";
        }

        return gradeLevel;
    }

    public void addGrade(int numCourseCredits, double classGrade){
        double currentQualityScore = this.gpa * this.numberOfCredits;
        double newClassQualityScore = classGrade * numCourseCredits;
        double totalQualityScore = currentQualityScore + newClassQualityScore;

        this.numberOfCredits += numCourseCredits;
        double newGpa = totalQualityScore / numberOfCredits;

        this.gpa = newGpa;
    }
}