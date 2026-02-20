package module;


public class Teacher extends Staff {
    public Teacher(String name, int age, String id, String department) {
        super(name, age, id, department);
    }

    public void teachCourse(Course course) {
        course.assignTeacher(this);
    }

    @Override
    public void performDuties() {
        System.out.println("Teaching students.");
    }
}