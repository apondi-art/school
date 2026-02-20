package module;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
    final String className;
    private List<Student> students = new ArrayList<>();

    public ClassRoom(String className) { this.className = className; }

    public void addStudent(Student student) { students.add(student); }
    public void removeStudent(Student student) { students.remove(student); }
    public List<Student> getStudents() { return students; }
}