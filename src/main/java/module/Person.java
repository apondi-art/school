package module;


public abstract class Person {
    final String name;
    final int age;
    final String id;

    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getId() { return id; }
}