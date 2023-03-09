package ch09;

public class CarExam {
    public static void main(String[] args) {
        Car car = new Car();
        Taxi taxi = new Taxi("model s", "RED", "tesla");
        Truck truck = new Truck("bongo", "BLUE", "kia");

        taxi.showInfo();
        truck.showInfo();

        System.out.println("===============");

        taxi.meterUp();
        taxi.meterDown();

        System.out.println("===============");

        truck.load();
        truck.offload();
    }
}
