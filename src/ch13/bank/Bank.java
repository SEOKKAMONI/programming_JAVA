package ch13.bank;

import ch13.Employee;

public interface Bank {
    //- 계좌번호 생성후 리턴
    int makeAccount();

    //- 계좌번호에 저금
    void saving(int account, int money);

    //- 저금된 돈 확인
    int getAccount(int account);

    //- 대출하기
    int borrowMoney(Employee employee, int money);
}
