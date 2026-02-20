package module;


import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private List<Course> courses = new ArrayList<>();

    public Student(String name, int age, String id) {
        super(name, age, id);
    }

    public void takeCourse(Course course) {
        courses.add(course);
    }

    public List<Course> getCourses() {
        return courses;
    }
}
