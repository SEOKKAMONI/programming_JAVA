package ch13;

import ch13.bank.KakaoBank;
import ch13.bank.WooriBank;

public class Employee {
    private String name;
    private int grade;
    private int wooriAccount;
    private int kookminAccount;
    private int kakaoAccount;

    public Employee(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public void saving(Object obj, int money) {
        if (obj instanceof WooriBank) {
            ((WooriBank) obj).saving(this.wooriAccount, money);
        } else if (obj instanceof KakaoBank) {
            ((KakaoBank) obj).saving(this.kakaoAccount, money);
        }
    }

    public boolean showMoney(Object obj) {
        if (obj instanceof WooriBank) {
            System.out.println("우리은행(" +wooriAccount+")의 예금현황 : "+ ((WooriBank) obj).getAccount(wooriAccount)+"원");
        } else if (obj instanceof KakaoBank) {
            System.out.println("카카오뱅크("+kakaoAccount+")의 예금현황 : "+((KakaoBank) obj).getAccount(kakaoAccount)+"원");
        }
        return false;
    }

    public void borrowMoney(Object obj, int money) {
        if (obj instanceof WooriBank) {
            //돈빌리고
            int borrow = ((WooriBank) obj).borrowMoney(this, money);
            //내 계좌에 저금
            ((WooriBank) obj).saving(wooriAccount, borrow);
            //등급 하락
            this.grade++;
        } else if (obj instanceof KakaoBank) {
            int borrow = ((KakaoBank) obj).borrowMoney(this, money);
            //내 계좌에 저금
            ((WooriBank) obj).saving(kakaoAccount, borrow);
        }
    }

    public void setAccount(Object obj) {
        if (obj instanceof WooriBank) {
            this.wooriAccount = ((WooriBank) obj).makeAccount();
        } else if (obj instanceof KakaoBank) {
            this.kakaoAccount = ((KakaoBank) obj).makeAccount();
        }
    }

    public int getWooriAccount() {
        return wooriAccount;
    }

    public void setWooriAccount(int wooriAccount) {
        this.wooriAccount = wooriAccount;
    }

    public int getKookminAccount() {
        return kookminAccount;
    }

    public void setKookminAccount(int kookminAccount) {
        this.kookminAccount = kookminAccount;
    }

    public int getKakaoAccount() {
        return kakaoAccount;
    }

    public void setKakaoAccount(int kakaoAccount) {
        this.kakaoAccount = kakaoAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
