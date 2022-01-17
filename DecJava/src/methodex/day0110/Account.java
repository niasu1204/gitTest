package methodex.day0110;

public class Account {
	int balance;

	void deposit(int money) {
		if (balance + money > 1000000) {
			System.out.println("최대 백만원까지만 예금할 수 있습니다.");
		} else {
			balance += money;
			System.out.println(money + "원이 입금되었습니다.");
		}
	}

	void withdraw(int money) {
		if (balance - money < 0) {
			System.out.println("잔액이 부족합니다.");
		} else {
			balance -= money;
			System.out.println(money + "원이 출금되었습니다.");
		}
	}

	int getBalance() {
		return balance;
	}

}
