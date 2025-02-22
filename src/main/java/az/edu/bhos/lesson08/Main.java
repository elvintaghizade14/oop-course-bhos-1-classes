package az.edu.bhos.lesson08;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Human human = new Human("A", 18, "M");
        System.out.println(human);

        Teacher teacher1 = new Teacher("Elvin", 29, "AH");
        System.out.println(teacher1);

        Teacher teacher2 = new Teacher("Elvin2", 18, "WB", BigDecimal.ONE);
        System.out.println(teacher2);

        Student student1 = new Student("Murad", 19, "A");
        System.out.println(student1);

        System.out.println(0.2 + 0.2 + 0.2); // 0.6
    }
}
