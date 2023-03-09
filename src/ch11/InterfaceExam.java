package ch11;

public class InterfaceExam {
    public static void main(String[] args) {
        Sound tv = new TV();
        Sound radio = new Radio();

        tv.soundUp();
        tv.soundUp();

        radio.soundUp();
        radio.soundUp();

        //자료형을 Sound로 했기 때문에
        //인터페이스에서 정의하지 않은 메소드는 사용할 수 없음
        tv.showInfo();
        radio.showInfo();
    }
}
