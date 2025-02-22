package az.edu.bhos.lesson08;

public class VehicleApp {

    public static void main(String[] args) {
        Bmw bmw = new Bmw();
        bmw.start();

        Byd byd = new Byd();
        byd.start();

        Tractor tractor = new Tractor();
        tractor.start();
    }
}
