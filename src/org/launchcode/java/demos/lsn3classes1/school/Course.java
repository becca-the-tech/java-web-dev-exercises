package org.launchcode.java.demos.lsn3classes1.school;

import java.util.ArrayList;
import org.launchcode.java.demos.lsn3classes1.Student;

public class Course {
    public ArrayList<Student> studentsTakingCourse;
    public static int numCredits = 3;
    public static int numCreditsToTake = 3;
    public static double minimumGpa = 2.0;

    public void addStudentToList(Student studentVariable){
        studentsTakingCourse.add(studentVariable);
    }

    public ArrayList<Student> getStudentRoster(){
        return this.studentsTakingCourse;
    }

}
