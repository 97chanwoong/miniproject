package com.company.minimini;

import java.util.Scanner;

public class Bank_v2 {
	
		private	String id;
		private	String pass;
		private	double balance;
		private	double sum = 0;
		static String Company = "(주) 회사";
		
		

public int menu(Bank_v2 user1) {

	int num = 0;
	do {	Scanner scanner = new Scanner(System.in);
	String bank = "======BANK======\r\n1.추가\r\n2.조회\r\n3.입금\r\n4.출금\r\n5.삭제\r\n9.종료\r\n입력>>>";
	System.out.print(bank);
	
		num = scanner.nextInt();// 리턴값int / 메서드명 menu/ 파라미터 x
		switch (num) {
		case 1:
			user1.input();
			break; // 리턴값void / 메서드명 input/ 파라미터 x
		case 2:
			user1.show();
			break; // 리턴값void / 메서드명 show/ 파라미터 x
		case 3:
			user1.deposit();
			break; // 리턴값void / 메서드명 deposit/ 파라미터 x
		case 4:
			user1.withdraw();
			break;// 리턴값void / 메서드명 withdraw/ 파라미터 x
		case 5:
			user1.delete();
			break;// 리턴값void / 메서드명 delete/ 파라미터 x
		case 9:
			System.out.println("종료기능입니다.");
			break;// 리턴값void / 메서드명 delete/ 파라미터 x
		}
	} while (num != 9);
	return num;
}
 public void input() {
	Scanner scanner = new Scanner(System.in);
	System.out.print("아이디 : ");
	this.id = scanner.next();
	System.out.print("비밀번호 : ");
	this.pass = scanner.next();
	System.out.print("잔   액 : ");
	this.balance = scanner.nextInt();
	this.sum = this.sum + this.balance;
	System.out.println();
}
		
 public void show() {
		Scanner scanner = new Scanner(System.in);
		String id2 = "";
		String pass2 = "";
		System.out.print("ID : ");
		id2 = scanner.next();
		System.out.print("PASS : ");
		pass2 = scanner.next();
		if (this.id.equals(id2) && this.pass.equals(pass2)) {
			System.out.println("======조회결과======");
			System.out.println(
					"아이디 : " + id + "\r\n" + "비밀번호 : " + pass + "\r\n" + "잔    액 : " + sum + "\r\n" + "조회가 성공했습니다.");
		} else {
			System.out.println("조회가 실패했습니다.");
		}
		System.out.print("아무키나 누르세요.");
		scanner.next();
	}

 public void deposit() {
		Scanner scanner = new Scanner(System.in);
		String id2 = "";
		String pass2 = "";
		System.out.println("======입금 계좌정보 확인======");
		System.out.print("ID : ");
		id2 = scanner.next();
		System.out.print("PASS : ");
		pass2 = scanner.next();
		if (this.id.equals(id2) && this.pass.equals(pass2)) {
			System.out.print("입금액 : ");
			balance = scanner.nextInt();
			this.sum = sum + balance;
		} else {
			System.out.println("계좌정보가 없습니다.");
		}
		System.out.print("아무키나 누르세요");
		scanner.next();
	}
 
 public void withdraw() {
		Scanner scanner = new Scanner(System.in);
		String id2 = "";
		String pass2 = "";
		System.out.println("====출금 계좌정보 입력====");
		System.out.print("*ID : ");
		id2 = scanner.next();
		System.out.print("*PASS : ");
		pass2 = scanner.next();
		if (this.id.equals(id2) && this.pass.equals(pass2)) {
			System.out.print("출금액 : ");
			this.balance = scanner.nextInt();
			this.sum = this.sum - this.balance;
		} else if (id2.equals(id)) {
			System.out.println("계좌 정보가 없습니다.");
		}
	}
 
 public void delete() {
		Scanner scanner = new Scanner(System.in);
		String id2 = "";
		String pass2 = "";
		char ch=' ';
		System.out.print("*ID : ");
		id2 = scanner.next();
		System.out.print("*PASS : ");
		pass2 = scanner.next();
		if (this.id.equals(id2) && this.pass.equals(pass2)) {
			System.out.println("삭제하시겠습니까?(Y/N)");
			ch = scanner.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				this.id = "";
				this.pass = "";
			}
		}
	}

		public Bank_v2() {
			
		}
		public Bank_v2(String id, String pass, double balance, double sum) {
			this.id = id;
			this.pass = pass;
			this.balance = balance;
			this.sum = sum;
		}
		
		
		
		
		@Override
		public String toString() {
			return "Bank [id=" + id + ", pass=" + pass + ", balance=" + balance + ", sum=" + sum + "]";
		}
		
		
		
		
		
		
		
		
}

