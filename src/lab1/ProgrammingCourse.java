package lab1;

public abstract class ProgrammingCourse {

    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
/*
    public ProgrammingCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }
 */
    public String getCapitalizedCourseName() {
        return getCourseName().toUpperCase();
    }
    public String getCourseName() {
        return courseName;
    }

    public abstract void setCourseName(String courseName);

    public String getCourseNumber() {
        return courseNumber;
    }

    public abstract void setCourseNumber(String courseNumber);

    public double getCredits() {
        return credits;
    }

    public abstract void setCredits(double credits);

    public String getPrerequisites() {
        return prerequisites;
    }

    public abstract void setPrerequisites(String prerequisites);

}
