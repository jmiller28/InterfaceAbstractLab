package lab1;

public class Startup {

    public static void main(String[] args) {

        ProgrammingCourse course1 = new IntroToProgrammingCourse();
        course1.setCourseName("Intro To Programming");
        course1.setCourseNumber("152-135");
        course1.setCredits(2.0);
        System.out.println("Course Name: " + course1.getCourseName() + ", Course Number: " + course1.getCourseNumber() + ", Course Credits: " + course1.getCredits());

        IntroJavaCourse course2 = new IntroJavaCourse();
        course2.setCourseName("Intro Java");
        course2.setCourseNumber("152-135");
        course2.setCredits(4.0);
        course2.setPrerequisites("Intro To Programming");
        System.out.println("Course Name: " + course2.getCourseName() + ", Course Number: " + course2.getCourseNumber() + ", Course Credits: " + course2.getCredits() + ", Course Prerequisites: " + course2.getPrerequisites());

        AdvancedJavaCourse course3 = new AdvancedJavaCourse();
        course3.setCourseName("Advanced Java");
        course3.setCourseNumber("152-135");
        course3.setCredits(4.0);
        course3.setPrerequisites("Intro To Java");
        System.out.println("Course Name: " + course3.getCourseName() + ", Course Number: " + course3.getCourseNumber() + ", Course Credits: " + course3.getCredits() + ", Course Prerequisites: " + course3.getPrerequisites());
    }

}
