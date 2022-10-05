package com.company.Bank014;

import java.util.Scanner;

public class Withdraw2 implements Bank_Controller2{

	public Withdraw2() {
		super();
	}

	@Override
	public void exec(Bank_v7[] users) {
		Scanner scanner = new Scanner(System.in);
		int usernum = -1;
		String id2 = "";
		String pass2 = "";
		String result = "";
		double balance2=0;
		System.out.println("======회원 정보 확인======");
		System.out.print("ID : ");
		id2 = scanner.next();
		System.out.print("PASS : ");
		pass2 = scanner.next();
		for (int j = 0; j < users.length; j++) { if (id2.equals(users[j].getId())) { usernum = j; break; } }
		if(usernum==-1) {
			System.out.println("조회가 실패했습니다.");}
		if (pass2.equals(users[usernum].getPass())) {
			System.out.print("포인트 충전금액을 입금해주세요 >");
			balance2 = scanner.nextDouble();
			users[usernum].setBalance(users[usernum].getBalance()+balance2);
			} 
		
		System.out.print("아무키나 눌러주세요");
		scanner.next();
		
	}
	
}