package com.company.Bank014;

import java.util.Scanner;

public class Show2 implements Bank_Controller2{

	public Show2() {
		super();
	}

	@Override
	public void exec(Bank_v7[] users) {
		Scanner scanner = new Scanner(System.in);
		int usernum = -1;
		String id2 = "";
		String pass2 = "";
		System.out.print("ID : ");
		id2 = scanner.next();
		System.out.print("PASS : ");
		pass2 = scanner.next();
		for (int j = 0; j < users.length; j++) {
			if (id2.equals(users[j].getId())) {
				usernum = j;
				break;
			}
		}
		if(usernum==-1) {
			System.out.println("조회를 실패했습니다.");
			return;
		}
		if (pass2.equals(users[usernum].getPass())) {
			System.out.println("======조회결과======");
			System.out.println("아이디 : " + users[usernum].getId() + "\r\n" + "비밀번호 : " + users[usernum].getPass()
					+ "\r\n" + "잔    액 : " + users[usernum].getBalance() + "\r\n" + "조회가 성공했습니다.\r\n==================");
		}
		System.out.print("아무키나 눌러주세요.");
		scanner.next();
	}
	
}
