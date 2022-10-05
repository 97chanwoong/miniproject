package com.company.mini;

import java.util.Arrays;
import java.util.Scanner;

public class Mini_bank7ver {
	public static void main(String[] args) {
		String[][] users = { { "", "", "" }, // 00 01 02
			               { "", "", "" }, // 10 11 12
				           { "", "", "" } // 20 21 22
		};
		int num = 0;

		do {
			num = menu(users);
			switch (num) {
			case 1:
				input(users);
				break;
			case 2:
				show(users);
				break;
			case 3:
				deposit(users);
				break;
			case 4:
				withdraw(users);
				break;
			case 5:
				delete(users);
				break;
			case 9:
				System.out.print("종료되었습니다.");
				break;
			}
		} while (num != 9);

	}
	public static int ja(String [][] users) {
		int usernum = -1;
		for (int j = 0; j < users.length; j++) { 
			if (users[j][0] == "") { 
				usernum = j; 
				break; } 
			
		}
		return usernum;
	}
	
	public static int ja2(String [][] users, String id2) {
		int usernum=-1;
		for (int j = 0; j < users.length; j++) {
			if (id2.equals(users[j][0])) {
				usernum = j;
				break;
			}
		}
		return usernum;
	}
	
	public static String ipid() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ID : ");
		return scanner.next();
		
	}
	public static String ipip() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("PASS : ");
		return scanner.next();
		
	}
	
	public static String key() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("아무키나 누르세요.");
		return scanner.next();
	}

	public static int menu(String[][] users) {

		Scanner scanner = new Scanner(System.in);
		String bank = "======BANK======\r\n1.추가\r\n2.조회\r\n3.입금\r\n4.출금\r\n5.삭제\r\n9.종료\r\n입력>>>";
		//System.out.println(Arrays.deepToString(users));
		System.out.print(bank);
		return scanner.nextInt();
	}

	public static void input(String[][] users) {

		Scanner scanner = new Scanner(System.in);
		int usernum;
		String id2 = "";
		String key="";
		boolean tf = true;
		usernum=ja(users);
		if (usernum == -1) {
			System.out.println("더이상 신규가입 불가입니다.");
		} else {
			for (;;) {
				tf = true;
				System.out.print("ID : ");
				id2 = scanner.next();
				for (int j = 0; j < users.length; j++) {
					if (id2.equals(users[j][0])) {
						tf = false;
					}
				}
				if (tf) {
					users[usernum][0] = id2;
					break;
				} else {
					System.out.println("중복입니다.");
				}
			}
			System.out.print("PASS : ");
			users[usernum][1] = scanner.next();
			System.out.print("BALANCE : ");
			users[usernum][2] = scanner.next();

		}
		key=key();
	}

	public static void show(String[][] users) {
		Scanner scanner = new Scanner(System.in);
		int usernum;
		String id2 = "";
		String pass2 = "";
		String key="";
		id2=ipid();
		pass2=ipip();
		usernum=ja2(users,id2);

		if (usernum == -1) {
			System.out.println("조회가 실패했습니다.");
		}
		if (pass2.equals(users[usernum][1])) {
			System.out.println("======조회결과======");
			System.out.println("아이디 : " + users[usernum][0] + "\r\n" + "비밀번호 : " + users[usernum][1] + "\r\n"
					+ "잔    액 : " + users[usernum][2] + "\r\n" + "조회가 성공했습니다.");
		}
		key=key();

	}

	public static void deposit(String[][] users) {
		Scanner scanner = new Scanner(System.in);
		int usernum;
		int balance2 = 0;
		String id2 = "";
		String pass2 = "";
		String key="";
		System.out.println("======입금 계좌정보 확인======");
		id2=ipid();
		pass2=ipip();
		usernum=ja2(users,id2);
		if (usernum == -1) {
			System.out.println("조회가 실패했습니다.");

		}
		if (pass2.equals(users[usernum][1])) {
			System.out.print("입금액 : ");
			balance2 = scanner.nextInt();
			users[usernum][2] = Integer.parseInt(users[usernum][2]) + balance2 + "";
		}
		key=key();

	}

	public static void withdraw(String[][] users) {
		Scanner scanner = new Scanner(System.in);
		int usernum;
		int balance2 = 0;
		String id2 = "";
		String pass2 = "";
		String key="";
		System.out.println("======입금 계좌정보 확인======");
		id2=ipid();
		pass2=ipip();
		usernum=ja2(users,id2);
		if (usernum == -1) {
			System.out.println("조회가 실패했습니다.");
		}
		if (pass2.equals(users[usernum][1])) {
			System.out.print("입금액 : ");
			balance2 = scanner.nextInt();
			users[usernum][2] = Integer.parseInt(users[usernum][2]) - balance2 + "";
		}
		key=key();
	}

	public static void delete(String[][] users) {
		Scanner scanner = new Scanner(System.in);
		int usernum;
		String id2 = "";
		String pass2 = "";
		String key="";
		char ch = ' ';
		id2=ipid();
		pass2=ipip();
		usernum=ja2(users,id2);
		if (usernum == -1) {
			System.out.println("조회가 실패했습니다.");
		}
		if (pass2.equals(users[usernum][1])) {
			System.out.println("계좌를 삭제하시겠습니까?(Y/N)");
			ch = scanner.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				users[usernum][0] = "";
				users[usernum][1] = "";
				users[usernum][2] = "";
			}
		}
		key=key();
	}

}
