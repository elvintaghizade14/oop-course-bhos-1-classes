package az.edu.bhos.lesson04;

public class StudentApp {

    public static void main(String[] args) {
        System.out.println(Student.TOTAL_USERS);

        Student aytac = new Student("Aytac", 96);
        System.out.println(aytac);
        System.out.println(Student.TOTAL_USERS);
        System.out.println(aytac.getName());
        aytac.setGrade(90);
        System.out.println(aytac);
//        System.out.println(aytac.grade);

        Student nazrin = new Student("Nazrin", 87);
        System.out.println(nazrin);
        System.out.println(Student.TOTAL_USERS);
    }
}
