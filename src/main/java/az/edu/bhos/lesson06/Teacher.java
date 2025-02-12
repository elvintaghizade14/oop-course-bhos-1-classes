package az.edu.bhos.lesson06;

import java.math.BigDecimal;

public class Teacher extends Human {

    private BigDecimal salary;

    public Teacher(String name, int age, String gender) {
        super(name, age, gender);
    }

    public Teacher(String name, int age, String gender, BigDecimal salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{name=%s,age=%d,gender=%s,salary=%s}".formatted(
                super.getName(),
                super.getAge(),
                super.getGender(),
                this.salary);
    }
}
