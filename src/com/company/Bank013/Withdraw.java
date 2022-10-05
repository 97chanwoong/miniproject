package com.company.Bank013;

import java.util.Scanner;

public class Withdraw implements Bank_Controller{

	public Withdraw() {
		super();
	}

	@Override
	public void exec(Bank_v6 user1) {
		 double balance2=0;
			Scanner scanner = new Scanner(System.in);
			String id2 = "";
			String pass2 = "";
			System.out.println("====출금 계좌정보 입력====");
			System.out.print("*ID : ");
			id2 = scanner.next();
			System.out.print("*PASS : ");
			pass2 = scanner.next();
			if (user1.getId().equals(id2) && user1.getPass().equals(pass2)) {
				System.out.print("입금액 : ");
				balance2=scanner.nextDouble();
				user1.setBalance(user1.getBalance()-balance2);
			} else{
				System.out.println("계좌 정보가 없습니다.");
			}
	}
	
}