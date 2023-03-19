package ch13;

import ch13.bank.BankOfKorea;
import ch13.bank.KakaoBank;
import ch13.bank.WooriBank;

public class BankExam {
    public static void main(String[] args) {
        //기준금리 정하기 위해 한국은행 객체 생성
        BankOfKorea bankOfKorea = BankOfKorea.getInstance();
        //시중 은행 생성
        WooriBank wooriBank = WooriBank.getInstance();
        KakaoBank kakaoBank = KakaoBank.getInstance();
        //근로자 생성
        Employee choi = new Employee("choi", 1);

        //기준금리 설정
        bankOfKorea.setBaseRate(3.5f);
//        System.out.println(WooriBank.getRate());
//        System.out.println(KakaoBank.getRate());

        //계좌생성, object 매개변수를 통해 하나의 메소드로 줄임
        choi.setWooriAccount(wooriBank.makeAccount());
        choi.setAccount(kakaoBank);
        System.out.println(choi.getWooriAccount());
        System.out.println(choi.getKakaoAccount());

        System.out.println("===============");

        choi.saving(wooriBank, 5000);
        choi.saving(kakaoBank, 5000);
        choi.saving(wooriBank, 10000);
        choi.showMoney(wooriBank);
        choi.showMoney(kakaoBank);

        System.out.println("===============");

        choi.borrowMoney(wooriBank, 10000);
        choi.showMoney(wooriBank);
        System.out.println(WooriBank.getMoney());
        System.out.println("현재 "+choi.getName()+"님의 신용등급은 "+choi.getGrade()+"등급 입니다.");

    }
}
