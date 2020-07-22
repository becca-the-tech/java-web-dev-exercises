package org.launchcode.java.demos.lsn3classes1;

import org.launchcode.java.demos.lsn3classes1.school.Course;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
            Student alexa = new Student("Alexa", 123, 100, 4.0);
            Student becca = new Student("Becca", 312, 1000, 3.01);

            becca.setStudentId(123);
            System.out.println(alexa.getName());

            Student other = alexa;

//            alexa.setNumberOfCredits(100);
//            alexa.setGpa(4.0);

            System.out.println(becca.toString());

            Course bio = new Course();
            bio.description = "Marine Science";
            bio.numCredits = 4;

            Course marine = bio;
            System.out.println(bio.equals(marine));

            System.out.println(bio.toString());

            System.out.println(alexa.getGpa());
            alexa.addGrade(3,3);
            System.out.println(alexa.getGpa());


            System.out.println(alexa.toString());

            System.out.println(becca.equals(alexa));
    }
}
