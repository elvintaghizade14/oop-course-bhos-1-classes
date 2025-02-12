package az.edu.bhos.lesson06;

public class Human {

    private final String name;
    private final int age;
    private final String gender;

    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Human{name='%s', age=%d, gender='%s'}"
                .formatted(name, age, gender);
    }
}
