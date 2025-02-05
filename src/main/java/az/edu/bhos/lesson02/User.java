package az.edu.bhos.lesson02;

public class User {

    String name;
    String gender;
    int age;

    public User() {
    }

    public User(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String breath(String breath) {
        return "CO2";
    }

    public void death() {
        // User dead!
    }

    @Override
    public String toString() {
        return "User{name='%s', gender='%s', age=%d}".formatted(name, gender, age);
    }
}
