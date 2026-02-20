package module;


public class Applicant extends Person {
    public Applicant(String name, int age, String id) {
        super(name, age, id);
    }

    public void apply() {
        System.out.println("Application submitted.");
    }
}
