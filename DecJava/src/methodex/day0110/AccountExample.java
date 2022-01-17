package methodex.day0110;

import java.util.Scanner;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		Scanner s = new Scanner(System.in);
		boolean flag = true;
		
		while(flag) {
			System.out.println("==============================");
			System.out.println("1.예금 | 2.출금 | 3.조회 | 4.종료");
			System.out.println("==============================");
			System.out.print("선택 > ");
			
			int menu = s.nextInt();
			
			if(menu == 1) {
				System.out.print("예금액 > ");
				int money = s.nextInt();
				account.deposit(money);
			}else if(menu == 2) {
				System.out.print("출금액 > ");
				int money = s.nextInt();
				account.withdraw(money);
			}else if(menu == 3) {
				System.out.println("잔액 > "+account.getBalance());
			}else {
				System.out.println("프로그램 종료");
				flag = false;
			}
		}//while
		s.close();
	}

}
