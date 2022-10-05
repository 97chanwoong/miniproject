package com.company.mini;

import java.util.Scanner;

public class Mini_for_4 {
	public static void main(String[] args) {
		int num = 0, sum = 0;
		int balance = 0;
		char ch = ' ';

		String id = "", pass = "";
		String id2 = "", pass2 = "";
		String bank = "======BANK======\r\n1.추가\n2.조회\n3.입금\n4.출금\n5.삭제\n9.종료\n입력>>>";
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<9; i=num) {
			System.out.print(bank);
			num = scanner.nextInt();
			switch (num) {
			case 1:
				System.out.print("아이디 : ");
				id = scanner.next();
				System.out.print("비밀번호 : ");
				pass = scanner.next();
				System.out.print("잔   액 : ");
				balance = scanner.nextInt();
				sum = sum + balance;
				System.out.println();
				break;

			case 2:
				System.out.print("ID : ");
				id2 = scanner.next();
				System.out.print("PASS : ");
				pass2 = scanner.next();
				if (id.equals(id2) && pass.equals(pass2)) {
					System.out.println("======조회결과======");
					System.out.println("아이디 : " + id + "\r\n" + "비밀번호 : " + pass + "\r\n" + "잔    액 : " + sum + "\r\n"
							+ "조회가 성공했습니다.");
				} else {
					System.out.println("조회가 실패했습니다.");
				}
				System.out.print("아무키나 누르세요.");
				scanner.next();
				break;

			case 3:
				System.out.println("======입금 계좌정보 확인======");
				System.out.print("ID : ");
				id2 = scanner.next();
				System.out.print("PASS : ");
				pass2 = scanner.next();
				if (id.equals(id2) && pass.equals(pass2)) {
					System.out.print("입금액 : ");
					balance = scanner.nextInt();
					sum = sum + balance;
				} else {
					System.out.println("계좌정보가 없습니다.");
				}
				System.out.print("아무키나 누르세요");
				scanner.next();
				break;

			case 4:
				System.out.println("======출급 계좌정보 입력======");
				System.out.print("ID : ");
				id2 = scanner.next();
				System.out.print("PASS : ");
				pass2 = scanner.next();
				if (id.equals(id2) && pass.equals(pass2)) {
					System.out.print("출금액 : ");
					balance = scanner.nextInt();
					sum = sum - balance;
				} else {
					System.out.println("계좌 정보가 없습니다.");
				}
				System.out.print("아무키나 누르세요.");
				scanner.next();
				break;

			case 5:
				System.out.print("ID : ");
				id2 = scanner.next();
				System.out.print("PASS : ");
				pass2 = scanner.next();
				if (id.equals(id2) && pass.equals(pass2)) {
					System.out.println("계좌를 삭제하시겠습니까?(Y/N)");
					ch = scanner.next().charAt(0);
					if (ch == 'y' || ch == 'Y') {
						id = "";
						pass = "";
						balance = 0;
					} else {
						System.out.println("계좌정보가 없습니다.");
					}
				}
				System.out.print("아무키나 누르세요.");
				scanner.next();
				break;

			case 9:
				System.out.println("종료 합니다.");
				break;

			}
		} // end for

	}// end main
}// end class
