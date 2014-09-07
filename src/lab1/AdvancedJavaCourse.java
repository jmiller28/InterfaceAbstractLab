package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class AdvancedJavaCourse extends ProgrammingCourse {

     private String courseName;
     private String courseNumber;
     private double credits;
     private String prerequisites;
/*
    public AdvancedJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }

    
     public AdvancedJavaCourse(String courseName, String courseNumber) {
     this.setCourseName(courseName);
     this.setCourseNumber(courseNumber);
     }
   */ /*
     @Override
    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }
     
    
     public String getPrerequisites() {
     return prerequisites;
     }
     */

    @Override
    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    @Override
    public void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
   
     @Override
     public String getCourseName() {
     return courseName;
     }
 /*
     public void setCourseName(String courseName) {
     this.courseName = courseName;
     }

     public String getCourseNumber() {
     return courseNumber;
     }

     public void setCourseNumber(String courseNumber) {
     this.courseNumber = courseNumber;
     }
     */

    @Override
    public void setCourseName(String courseName) {
        //validation ges here
        this.courseName = courseName;
    }

    @Override
    public void setCourseNumber(String courseNumber) {
        //validation ges here
        this.courseNumber = courseNumber;
    }

}
