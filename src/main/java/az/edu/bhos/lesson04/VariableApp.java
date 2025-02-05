package az.edu.bhos.lesson04;

import java.util.Scanner;

public class VariableApp {

    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        int num = new Scanner(System.in).nextInt();

        if (num % 2 == 0) {
            String fullName; //declare
            boolean isEven = true;
            System.out.println(isEven);
            fullName = "Elvin Taghizade"; // in"Elvin Taghizade"it
            String email = "elvin@gmail.com";
            String[] split = fullName.split(" ");
            String[] fullName2 = new Scanner(System.in).nextLine().split(" ");
            for (String s : fullName2) {
                System.out.print(s);
            }
            System.out.println(fullName2);
        } else {
            boolean isOdd = true;
            System.out.println(isOdd);
        }
//        isEven

        System.out.println(num * 2);
    }

//    num
}
