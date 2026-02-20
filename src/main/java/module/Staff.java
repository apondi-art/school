package module;

public abstract class Staff extends Person {
    final String department;

    public Staff(String name, int age, String id, String department) {
        super(name, age, id);
        this.department = department;
    }

    public String getDepartment() { return department; }

    public abstract void performDuties();
}