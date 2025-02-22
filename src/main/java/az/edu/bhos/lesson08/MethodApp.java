package az.edu.bhos.lesson08;

public class MethodApp {

    public static void main(String[] args) {
        System.out.println(foo());
//        System.out.println(foo(3));
        System.out.println(Math.min(2, 3));
    }

    static int foo() {
        return 5;
    }

    static int foo(int x, int y) {
        return 5;
    }

    static int foo(String x, String y) {
        return 5;
    }

    static int foo(int x, double y, double z) {
        return 5;
    }

//    static int foo(int num) {
//        return num * 2 / 1;
//    }
//    static double foo(int num) {
//      return num * 2 / 1;
//    }
}
