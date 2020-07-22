package org.launchcode.java.demos.lsn3classes1.school;

import java.util.ArrayList;
import org.launchcode.java.demos.lsn3classes1.Student;

public class Course {
    public ArrayList<Student> studentsTakingCourse;
    public static int numCredits = 3;
    public static int numCreditsToTake = 3;
    public static double minimumGpa = 2.0;
    public String description;

    public void addStudentToList(Student studentVariable){
        studentsTakingCourse.add(studentVariable);
    }

    public ArrayList<Student> getStudentRoster(){
        return this.studentsTakingCourse;
    }

    public String toString(){
        return "This course is about " + description + ". It requires a minimum GPA of " + minimumGpa + " and gives " + numCredits + " number of credits.";
    }

    public boolean equals(Course lecture){
        if (lecture == this){
            return true;
        }

        if (lecture == null){
            return false;
        }

        if (lecture.getClass() != getClass()){
            return false;
        }

        Course exampleClass = (Course) lecture;
        return exampleClass.description == lecture.description;
    }
}
