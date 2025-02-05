package az.edu.bhos.lesson04;

public class Student {

    static int TOTAL_USERS = 0;

    private String name;
    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
        TOTAL_USERS++;
    }

    public String getName() {
        return name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "{name='%s', grade=%s}".formatted(name, grade);
    }
}
