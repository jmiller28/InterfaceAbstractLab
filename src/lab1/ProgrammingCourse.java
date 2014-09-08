package lab1;

public abstract class ProgrammingCourse {

    private String courseName;
    private String courseNumber;
    private double credits;


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

}
