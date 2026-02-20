package module;

public class NonAcademicStaff extends Staff {

    public NonAcademicStaff(String name, int age, String id, String department) {
        super(name, age, id, department);
    }

    public void cleanEnvironment() {
        System.out.println("Cleaning school environment.");
    }

    @Override
    public void performDuties() {
        System.out.println("Performing non-academic duties.");
    }
}