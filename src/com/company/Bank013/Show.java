package com.company.Bank013;

import java.util.Scanner;

public class Show implements Bank_Controller{

	public Show() {
		super();
		
	}

	@Override
	public void exec(Bank_v6 user1) {
		Scanner scanner = new Scanner(System.in);
		   String id2 = "";
			String pass2 = "";
			System.out.print("ID : ");
			id2 = scanner.next();
			System.out.print("PASS : ");
			pass2 = scanner.next();
			if (user1.getId().equals(id2) && user1.getPass().equals(pass2)) {
				System.out.println("======조회결과======");
				System.out.println(
						"아이디 : " + user1.getId()+ "\r\n" + "비밀번호 : " + user1.getPass() + "\r\n" + "잔    액 : " + user1.getBalance() + "\r\n" + "조회가 성공했습니다.");
			} else {
				System.out.println("조회가 실패했습니다.");
			}
			System.out.print("아무키나 누르세요.");
			scanner.next();
	}
	
}