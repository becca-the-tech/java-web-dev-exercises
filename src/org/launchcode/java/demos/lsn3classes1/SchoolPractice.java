package org.launchcode.java.demos.lsn3classes1;

import org.launchcode.java.demos.lsn3classes1.school.Course;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
            Student alexa = new Student ();
            Student becca = new Student();

            becca.setStudentId(312);
            alexa.setName("Alexa");
            System.out.println(alexa.getName());
            System.out.println(becca.getStudentId());

            Course bio = new Course();
            bio.addStudentToList(alexa);
            bio.addStudentToList(becca);
            System.out.println(bio.getStudentRoster());
    }
}
