package ch09;

public class Taxi extends Car{
    private int meter;

    public Taxi(String model, String color, String company) {
        super(model, color, company);
    }

    public void meterUp() {
        startCar();
        System.out.println("미터기를 올리다.");
    }
    public void meterDown() {
        System.out.println("미터기를 내리다.");
        stopCar();
    }

    @Override
    public void showInfo() {
        System.out.println("택시입니다.");
    }
}
