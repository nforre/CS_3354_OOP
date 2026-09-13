// Journey Forrest, CS 3354, Fall 2026 

/**
 * A class of an individual student's first name, last name, major, and GPA
 */
public class Student {
    private String firstName;
    private String lastName;
    private String major;
    private double gpa;


    /** 
     * Sets the first name value of student class object
     * @param firstName First name of this student
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /** 
     * Returns the first name string of student class object
     * @return String 
     */
    public String getFirstName() {
        return firstName;
    }

    /** 
     * Sets the last name value of student class object
     * @param lastName Last name of this student
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /** 
     * Returns the last name string of student class object
     * @return String
     */
    public String getLastName() {
        return lastName;
    }

    /** 
     * Sets the major value of student class object
     * @param major The major of this student
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /** 
     * Returns the major string of student class object
     * @return String
     */
    public String getMajor() {
        return major;
    }

    /** 
     * Sets the GPA value of student class object
     * @param gpa The GPA of this student
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    /** 
     * Returns the GPA double of student class object
     * @return double
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * Constructs Student object with default values
     */
    public Student() {
        this("", "", "", 0.0);
    }

    /**
     * Constructs Student object with provided values
     * @param firstName first name of student (String)
     * @param lastName last name of student (String)
     * @param major major of student (String)
     * @param gpa GPA of student (double)
     */
    public Student(String firstName, String lastName, String major, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.gpa = gpa;
    }

    /** 
     * Main function that creates student objects and 
     * prints out student data from student class
     * @param args
     */
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("\nFirst name: " + student1.getFirstName());
        System.out.println("Last name: " + student1.getLastName());
        System.out.println("Major: " + student1.getMajor());
        System.out.println("GPA: " + student1.getGpa());
        Student student2 = new Student("Peter","Parker", "CS", 3.5);
        System.out.println("\nFirst name: " + student2.getFirstName());
        System.out.println("Last name: " + student2.getLastName());
        System.out.println("Major: " + student2.getMajor());
        System.out.println("GPA: " + student2.getGpa());
        // Creating 3rd student
        Student student3 = new Student("Journey", "Forrest", "Art History", 3.6);
        student3.setMajor("Applied Math");
        System.out.println("\nFirst name: " + student3.getFirstName());
        System.out.println("Last name: " + student3.getLastName());
        System.out.println("Major: " + student3.getMajor());
        System.out.println("GPA: " + student3.getGpa());

    }
}
