package app;

import module.*;

import java.util.Scanner;

public class SchoolApp {

    final Scanner scanner = new Scanner(System.in);
    final Principal principal = new Principal("Mrs Quinter", 50, "P001", "Admin");
    private ClassRoom classRoom = new ClassRoom("JSS1");
    private int idCounter = 1;

    public void start() {

        while(true) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> admitApplicant();
                case 2 -> addCourseToStudent();
                case 3 -> viewStudents();
                case 4 -> exitSystem();
                default -> System.out.println("Invalid option.");
            }
        }
    }

    private void showMenu() {
        System.out.println("\n==== SCHOOL SYSTEM ====");
        System.out.println("1. Admit Applicant");
        System.out.println("2. Add Course to Student");
        System.out.println("3. View Students");
        System.out.println("4. Exit");
        System.out.print("Select Option: ");
    }

    private String generateId() { return "ID" + (idCounter++); }

    private void admitApplicant() {
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        Applicant applicant = new Applicant(name, age, generateId());
        Student admitted = principal.admitApplicant(applicant);

        if(admitted != null) {
            classRoom.addStudent(admitted);
            System.out.println("Admission successful!");
        } else {
            System.out.println("Admission denied. Age too low.");
        }
    }

    private void addCourseToStudent() {
        if(classRoom.getStudents().isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        Student student = classRoom.getStudents().get(0);
        Course course = new Course("Mathematics", "MTH101");
        student.takeCourse(course);
        System.out.println("Course added to student.");
    }

    private void viewStudents() {
        if(classRoom.getStudents().isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        for(Student s : classRoom.getStudents()) {
            System.out.println("Student: " + s.getName());
        }
    }

    private void exitSystem() {
        System.out.println("Exiting system...");
        System.exit(0);
    }
}