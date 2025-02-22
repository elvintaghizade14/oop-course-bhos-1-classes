package az.edu.bhos.lesson08;

import java.math.BigDecimal;

public class Student extends Human {

    private BigDecimal scholarship;

    public Student(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String toString() {
        return "{name=%s,age=%d,gender=%s,scholarship=%s}".formatted(
                super.getName(),
                super.getAge(),
                super.getGender(),
                this.scholarship);
    }
}
