package ch10;

//추상클래스
//최대 탑승인원과 최대 적재량을 강제하기
public abstract class Ship {
    public abstract int maxPassengers();
    public abstract int maxLuggage();

    public void startShip() {
        System.out.println("배가 출항합니다.");
    }
}
