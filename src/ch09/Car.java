package ch09;

//상속!
//메소드 오버라이딩
public class Car {
    private String model;
    private String color;
    private String company;
    protected int speed;

    public Car() {}
    public Car(String model, String color, String company) {
        this.model = model;
        this.color = color;
        this.company = company;
    }

    public void speedUp() {
        System.out.println("속도를 올리다.");
        speed+=10;
    }

    public void speedDown() {
        if (speed == 0) {
            System.out.println("정지한 생태입니다.");
            return;
        }
        speed-=10;
        System.out.println("속도를 내리다.");
    }

    public void startCar() {
        if (speed == 0) {
            System.out.println("출발합니다.");
            speedUp();
        }
    }

    public void stopCar() {
        while (speed != 0) {
            speedDown();
        }
        System.out.println("정지합니다.");
    }

    public void showInfo() {
        System.out.println("차종은 "+model+"이고, 색깔은 " + color + "이고, 제조사는 " + company + "입니다.");
    }
}
