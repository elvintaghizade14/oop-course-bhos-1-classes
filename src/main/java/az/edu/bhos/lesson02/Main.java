package az.edu.bhos.lesson02;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        System.out.println(1/0);
        User user1 = new User();
        System.out.println(user1);
        User cavid1 = new User("Cavid", "MALE", 19);
        User cavid2 = new User("Cavid", "MALE", 19);
        System.out.println(cavid1);
        System.out.println(cavid2);

        if (cavid1 == cavid2) {
            System.out.println("cavid1 and Cavid2 are the same");
        } else {
            System.out.println("cavid1 and Cavid2 are not the same");
        }
        if (cavid1.equals(cavid2)) {
            System.out.println("cavid1 and Cavid2 are the same");
        }
    }
}
