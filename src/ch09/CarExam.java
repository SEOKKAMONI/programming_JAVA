package ch09;

//형변환(업 캐스팅, 다운 캐스팅) : 상속관계에서만 가능
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

        System.out.println("=======형변환========");
        car = taxi;
        Taxi t = (Taxi) car;
        t.showInfo();

        //에러1
        //taxi = car;

        //에러2
        //taxi = truck;
    }
}
