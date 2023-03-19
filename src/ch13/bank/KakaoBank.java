package ch13.bank;

import ch13.Employee;

import java.util.HashMap;

public class KakaoBank implements Bank{
    private static KakaoBank instance = new KakaoBank();
    private static int account;
    private static float rate;
    private static int money;
    private static HashMap<Integer, Integer> store = new HashMap<>();

    private KakaoBank() {
        this.account = 2000;
        this.rate = BankOfKorea.getInstance().getBaseRate()+2.5F;
        this.money = 150000000;
    }

    public static KakaoBank getInstance() {
        if (instance == null) {
            instance = new KakaoBank();
        }
        return instance;
    }

    @Override
    public int makeAccount() {
        return ++account;
    }

    @Override
    public void saving(int account, int money) {
        if (store.get(account) != null) {
            money += store.get(account);
        }
        store.put(account, money);
    }

    @Override
    public int getAccount(int account) {
        if (store.get(account) == null) {
            return 0;
        }
        return store.get(account);
    }

    @Override
    public int borrowMoney(Employee employee, int money) {
        if (employee.getGrade() > 3) {
            System.out.println("신용등급 3등급 이하만 대출이 가능합니다.");
            return 0;
        }
        if (this.money < money) {
            System.out.println("은행 자금이 모자랍니다.");
            return 0;
        }
        this.money -= money;
        System.out.println("카카오뱅크에서 "+money+"원을 대출합니다. 금리는 "+rate+"% 입니다." +
                "연간 이자는 "+ money*rate/100+"원 입니다.");
        return money;
    }

    public static float getRate() {
        return rate;
    }

    public static void setRate(float rate) {
        KakaoBank.rate = rate+2.5F;
    }
}
