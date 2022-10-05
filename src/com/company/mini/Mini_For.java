package com.company.mini;

import java.util.Scanner;

public class Mini_For {
	public static void main(String[] args) {
		
		int num = 0, sum = 0;
		int balance = 0;
		char ch = ' ';
		String id = "", pass = "";
		String id2 = "", pass2 = "";

		Scanner scanner = new Scanner(System.in);
		while (num != 9) {
			System.out.println("======BANK======");
			System.out.println("1.추가\n" + "2.조회\n" + "3.입금\n" + "4.출금\n" + "5.삭제\n" + "9.종료");
			System.out.print("입력>>> ");
			num = scanner.nextInt();
			switch (num) {
			case 1:
				System.out.print("*ID : ");
				id = scanner.next();
				System.out.print("*PASS : ");
				pass = scanner.next();
				System.out.print("*BALANCE : ");
				balance = scanner.nextInt();
				sum = sum + balance;
				System.out.println();
				break;
			case 2:
				System.out.print("*ID : ");
				id2 = scanner.next();
				System.out.print("*PASS : ");
				pass2 = scanner.next();
				if (id.equals(id2) && pass.equals(pass2)) {
					System.out.println("======조회결과======");
					System.out.println("아이디 : " + id);
					System.out.println("잔액 : " + sum + "\n" + "암호 : " + pass);
					System.out.println("조회가 성공했습니다.");
					System.out.print("아무키나 누르세요. ");
					ch = scanner.next().charAt(0);
				} else {
					System.out.println("조회가 실패했습니다.");
					System.out.print("아무키나 누르세요. ");
					ch = scanner.next().charAt(0);
				}
				break;
			case 3:
				System.out.println("====입금 계좌정보 입력====");
				System.out.print("*ID : ");
				id2 = scanner.next();
				System.out.print("*PASS : ");
				pass2 = scanner.next();
				if (id.equals(id2) && pass.equals(pass2)) {
					System.out.print("입금액 : ");
					balance = scanner.nextInt();
					sum = sum + balance;
				} else if (id2.equals(id)) {
					System.out.println("계좌 정보가 없습니다.");
				}
				break;
			case 4:
				System.out.println("====출금 계좌정보 입력====");
				System.out.print("*ID : ");
				id2 = scanner.next();
				System.out.print("*PASS : ");
				pass2 = scanner.next();
				if (id.equals(id2) && pass.equals(pass2)) {
					System.out.print("출금액 : ");
					balance = scanner.nextInt();
					sum = sum - balance;
				} else if (id2.equals(id)) {
					System.out.println("계좌 정보가 없습니다.");
				}
				break;
			case 5:
				System.out.print("*ID : ");
				id2 = scanner.next();
				System.out.print("*PASS : ");
				pass2 = scanner.next();
				if (id.equals(id2) && pass.equals(pass2)) {
					System.out.println("삭제하시겠습니까?(Y/N)");
					ch = scanner.next().charAt(0);
					if (ch == 'y' || ch == 'Y') {
						id = "";
						pass = "";
					}
				}
				break;
			case 9:
				System.out.print("종료기능입니다.");
				break;
			}

		}

	}// end main
}// end class
