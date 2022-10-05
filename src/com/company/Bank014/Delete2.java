package com.company.Bank014;

import java.util.Scanner;

public class Delete2 implements Bank_Controller2{

	public Delete2() {
		super();
	}

	@Override
	public void exec(Bank_v7[] users) {
		Scanner scanner = new Scanner(System.in);
		int usernum = -1;
		String id2 = "";
		String pass2 = "";
		char ch=' ';
		System.out.print("ID : ");
		id2 = scanner.next();
		System.out.print("PASS : ");
		pass2 = scanner.next();
		for (int j = 0; j < users.length; j++) { if (id2.equals(users[j].getId())) { usernum = j; break; } }
		if(usernum==-1) {
			System.out.println("조회가 실패했습니다.");}
		if (pass2.equals(users[usernum].getPass())) {
			System.out.println("회원을 탈퇴하시겠습니까?(Y/N)");
			ch = scanner.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				users[usernum].setId("");
				users[usernum].setPass("");
				users[usernum].setBalance(0);
			} 
		}
		System.out.print("아무키나 눌러주세요.");
		scanner.next();
		
	}
	
}
