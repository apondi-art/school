package module;


public class Principal extends Staff {
    private static final int MIN_ADMISSION_AGE = 10;

    public Principal(String name, int age, String id, String department) {
        super(name, age, id, department);
    }

    public Student admitApplicant(Applicant applicant) {
        if(applicant.getAge() >= MIN_ADMISSION_AGE) {
            return new Student(applicant.getName(), applicant.getAge(), applicant.getId());
        }
        return null;
    }

    public void expelStudent(ClassRoom classRoom, Student student) {
        classRoom.removeStudent(student);
    }

    @Override
    public void performDuties() {
        System.out.println("Managing the school.");
    }
}