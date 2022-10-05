package com.company.Bank014;

import java.util.Scanner;

public class Deposit2 implements Bank_Controller2{

	public Deposit2() {
		super();
	}

	@Override
	public void exec(Bank_v7[] users) {
		Scanner scanner = new Scanner(System.in);
		int usernum = -1;
		String id2 = "";
		String pass2 = "";
		String ck = "ChickenBurger"; int cn = 6000;
		String bg = "BulgogiBurger"; int bn = 5500;
		int num = 0;
		double balance2=0;
		System.out.println("=======회원 정보 확인=======");
		System.out.print("ID : ");
		id2 = scanner.next();
		System.out.print("PASS : ");
		pass2 = scanner.next();
		for (int j = 0; j < users.length; j++) { if (id2.equals(users[j].getId())) { usernum = j; break; } }
		if (usernum == -1) {
			System.out.println("구매가 실패했습니다.");
		}
		if (pass2.equals(users[usernum].getPass())) {
			System.out.println("======================================");
			System.out.println("=                Menu                =");
			System.out.println("=   1. Chicken Burger Set [6000won]  =");
			System.out.println("=   2. Bulgogi Burger Set [5500won]  =");
			System.out.println("======================================");
			System.out.print("Menu를 선택해주세요 > ");
			num = scanner.nextInt();
			if(num==1) {
				balance2=cn;
			}else if(num==2) {
				balance2=bn;
			}
		users[usernum].setBalance(users[usernum].getBalance()-balance2);
		System.out.println("구매가 완료되었습니다");
		} 
		System.out.print("아무키나 눌러주세요");
		scanner.next();
	}
	
}