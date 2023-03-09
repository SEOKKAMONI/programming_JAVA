package ch10;

public class AbstractExam {
    public static void main(String[] args) {
        MyShip myShip = new MyShip("동해선");

        System.out.println(myShip.getName()+"의 최대 탑승 인원수는 "+myShip.maxPassengers()+
                "명 이고, 최대 적재량은 " + myShip.maxLuggage() + "kg 입니다.");
        myShip.startShip();
    }
}
