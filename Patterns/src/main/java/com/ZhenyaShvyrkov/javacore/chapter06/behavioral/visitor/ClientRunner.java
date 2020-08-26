package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.visitor;

public class ClientRunner {

    public static void main(String[] args) {
        UniversityProject universityProject = new UniversityProject();
        Student smartStudent = new SmartStudent("Antony", 21, 300);
        universityProject.accept(smartStudent);

        Student badStudent = new BadStudent("John", 42, 120);
        universityProject.accept(badStudent);
    }
}
