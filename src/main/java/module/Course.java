package module;


public class Course {
    final String courseName;
    final String courseCode;
    Teacher teacher;

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public void assignTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Teacher getTeacher() { return teacher; }
    public String getCourseName() { return courseName; }
}
