package az.edu.bhos.lesson08;

public class StringApp {

    public static void main(String[] args) {
        String name = "Elvin Taghizade";

        System.out.println(name);
        String[] splitedNames = name.split(" ");
        System.out.println(splitedNames);
        for (String splitedName : splitedNames) {
            System.out.println(splitedName);
        }

        System.err.println(name.replace("Elvin", "taghizade"));
    }
}
