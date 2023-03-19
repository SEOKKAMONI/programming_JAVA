package ch13.bank;

public class BankOfKorea {
    private static BankOfKorea instance = new BankOfKorea();
    private float baseRate;

    private BankOfKorea() {
    }

    public static BankOfKorea getInstance() {
        if (instance == null) {
            instance = new BankOfKorea();
        }
        return instance;
    }

    public float getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(float baseRate) {
        this.baseRate = baseRate;
        WooriBank.setRate(baseRate);
        KakaoBank.setRate(baseRate);
    }
}
