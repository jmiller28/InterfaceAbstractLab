package lab2;

/**
 *
 * Liskov Substitution principle can be used when the base class methods are the only methods used.
 * If the child class has methods not in the base class, an object declared from the base class will not have access to the child class methods
 */
public class Startup {
    public static void main(String[] args) {

        ProgrammingCourse course1 = new IntroToProgrammingCourse();
        course1.setCourseName("Intro To Programming");
        course1.setCourseNumber("152-135");
        course1.setCredits(2.0);
        System.out.println(course1.getCourseName());

        IntroJavaCourse course2 = new IntroJavaCourse();
        course2.setCourseName("Intro Java");
        course2.setCourseNumber("152-135");
        course2.setCredits(2.0);
        course2.setPrerequisites("Intro To Programming");
        System.out.println(course2.getCourseNumber());

        AdvancedJavaCourse course3 = new AdvancedJavaCourse();
        course3.setCourseName("Advanced Java");
        course3.setCourseNumber("152-135");
        course3.setCredits(2.0);
        course3.setPrerequisites("Intro To Java");
        System.out.println(course3.getPrerequisites());
    }
}
