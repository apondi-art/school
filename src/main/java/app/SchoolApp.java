package app;


import module.*;

import java.util.Scanner;

public class SchoolApp {

    private final Scanner scanner = new Scanner(System.in);
    private final Principal principal = new Principal("Mrs Quinter", 50, "P001", "Admin");
    private final ClassRoom classRoom = new ClassRoom("JSS1");
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
        System.out.println("3. View Students & Courses");
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
            System.out.println("Admission successful for " + admitted.getName() + "!");
        } else {
            System.out.println("Admission denied. Age too low.");
        }
    }

    private void addCourseToStudent() {
        if(classRoom.getStudents().isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        // Let user choose student
        System.out.println("Select a student to add a course:");
        for(int i = 0; i < classRoom.getStudents().size(); i++) {
            System.out.println((i+1) + ". " + classRoom.getStudents().get(i).getName());
        }
        int index = scanner.nextInt() - 1;
        scanner.nextLine();
        if(index < 0 || index >= classRoom.getStudents().size()) {
            System.out.println("Invalid selection.");
            return;
        }
        Student student = classRoom.getStudents().get(index);

        // Enter course details
        System.out.print("Enter Course Name: ");
        String courseName = scanner.nextLine();
        System.out.print("Enter Course Code: ");
        String courseCode = scanner.nextLine();

        Course course = new Course(courseName, courseCode);
        student.takeCourse(course);

        System.out.println("Course " + course + " added to student " + student.getName() + "!");
    }

    private void viewStudents() {
        if(classRoom.getStudents().isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for(Student s : classRoom.getStudents()) {
            System.out.println("\nStudent: " + s.getName());
            if(s.getCourses().isEmpty()) {
                System.out.println("  No courses enrolled.");
            } else {
                System.out.println("  Courses:");
                for(Course c : s.getCourses()) {
                    System.out.println("    - " + c);
                }
            }
        }
    }

    private void exitSystem() {
        System.out.println("Exiting system...");
        System.exit(0);
    }
}