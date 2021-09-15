package exercises.ch4.school;

public class Student {

    public static void main(String[] args) {
        Student myself = new Student("kyle", 1, 1, 4.0);
    }

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
    }

    public String getGradeLevel() {
        if(numberOfCredits <= 29) {
            return "freshman";
        } else if (numberOfCredits <= 59) {
            return "sophomore";
        } else if (numberOfCredits <= 89) {
            return "junior";
        } else {
            return "senior";
        }
        // Determine the grade level of the student based on numberOfCredits
    }

    /* getters and setters omitted */
    public String getName() {return this.name;};

    public void setName(String name) { this.name = name; }

    public int getStudentId() { return this.studentId; }

    private void setStudentId(int studentId) {this.studentId = studentId; };

    public int getNumberOfCredits() { return this.numberOfCredits; }

    public void setNumberOfCredits(int numberOfCredits) { this.numberOfCredits = numberOfCredits; }

    public double getGpa() {return this.gpa; }

    public void setGpa(double gpa) { this.gpa = gpa; }
}