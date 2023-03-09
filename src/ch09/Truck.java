package ch09;

public class Truck extends Car{
    private int ton;

    public Truck(String model, String color, String company) {
        super(model, color, company);
    }

    public void load() {
        System.out.println("짐을 싣다.");
        startCar();
    }

    public void offload() {
        stopCar();
        System.out.println("짐을 내리다.");
    }
}
