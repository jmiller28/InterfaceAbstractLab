package lab1;

public class Startup {

    public static void main(String[] args) {

        ProgrammingCourse course1 = new IntroToProgrammingCourse();
        course1.setCourseName("Intro To Programming");
        course1.setCourseNumber("152-135");
        course1.setCredits(2.0);
        course1.setPrerequisites("None");
        System.out.println(course1.getCapitalizedCourseName());

        ProgrammingCourse course2 = new IntroJavaCourse();
        course2.setCourseName("Intro Java");
        course2.setCourseNumber("152-135");
        course2.setCredits(2.0);
        course2.setPrerequisites("Intro To Programming");
        System.out.println(course2.getCapitalizedCourseName());

        ProgrammingCourse course3 = new AdvancedJavaCourse();
        course3.setCourseName("Advanced Java");
        course3.setCourseNumber("152-135");
        course3.setCredits(2.0);
        course3.setPrerequisites("Intro To Java");
        System.out.println(course3.getCapitalizedCourseName());
    }

}
