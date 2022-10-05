package com.company.mini;

import java.util.Arrays;
import java.util.Scanner;

public class Mini_5_02 {
	public static void main(String[] args) {
		int num = 0;
		int balance2 = 0;
		int[] balance = { 0, 0, 0 };
		String[] id = new String[3];
		String[] pass = new String[3];
		char ch = ' ';
		String id2 = "";
		String pass2 = "";

		String bank = "======BANK======\r\n1.추가\n2.조회\n3.입금\n4.출금\n5.삭제\n9.종료\n입력>>>";

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 9; i = num) {
			System.out.println(Arrays.toString(id));
			System.out.println(Arrays.toString(pass));
			System.out.println(Arrays.toString(balance));
			System.out.print(bank);
			num = scanner.nextInt();

			switch (num) {

			case 1: {
				boolean tf = true;
				int usernum = -1;
				for (int j = 0; j < id.length; j++) {
					if (id[j] == null) {
						usernum = j;
						break;
					}
				}
				if (usernum == -1) {
					System.out.println("신규가입불가");
				} else {
					for (;;) {
						tf = true;
						System.out.print("ID : ");
						id2 = scanner.next();
						for (int j = 0; j < id.length; j++) {
							if (id2.equals(id[j])) {
								tf = false;
							}
						}
						if (tf) {
							id[usernum] = id2;
							break;
						} else {
							System.out.println("중복입니다.");
						}
					}
					System.out.print("PASS : ");
					pass[usernum] = scanner.next();
					System.out.print("BALANCE : ");
					balance[usernum] = scanner.nextInt();
				}

				System.out.println("아무키나 누르세요.");
				scanner.next();
			}
				break;

			case 2: {
				int usernum = -1;
				System.out.print("ID : ");
				id2 = scanner.next();
				System.out.print("PASS : ");
				pass2 = scanner.next();
				for (int j = 0; j < id.length; j++) {
					if (id2.equals(id[j])) {
						usernum = j;
						break;
					}
				}
				if (pass2.equals(pass[usernum])) {
					System.out.println("======조회결과======");
					System.out.println("아이디 : " + id[usernum] + "\r\n" + "비밀번호 : " + pass[usernum] + "\r\n"
							+ "잔    액 : " + balance[usernum] + "\r\n" + "조회가 성공했습니다.");
				} else {
					System.out.println("조회가 실패했습니다.");
				}
				System.out.print("아무키나 누르세요.");
				scanner.next();

			}
				break;

			case 3: {
				int usernum = -1;
				System.out.println("======입금 계좌정보 확인======");
				System.out.print("ID : ");
				id2 = scanner.next();
				System.out.print("PASS : ");
				pass2 = scanner.next();
				for (int j = 0; j < id.length; j++) {
					if (id2.equals(id[j])) {
						usernum = j;
						break;
					}
				}
				if (id2.equals(id[usernum]) && pass2.equals(pass[usernum])) {
					System.out.print("입금액 : ");
					balance2 = scanner.nextInt();
					balance[usernum] = balance[usernum] + balance2;
				} else {
					System.out.println("계좌정보가 없습니다.");
				}
				System.out.print("아무키나 누르세요");
				scanner.next();
			}
				break;

			case 4: {
				int usernum = -1;
				System.out.println("======입금 계좌정보 확인======");
				System.out.print("ID : ");
				id2 = scanner.next();
				System.out.print("PASS : ");
				pass2 = scanner.next();
				for (int j = 0; j < id.length; j++) {
					if (id2.equals(id[j])) {
						usernum = j;
						break;
					}
				}
				if (id2.equals(id[usernum]) && pass2.equals(pass[usernum])) {
					System.out.print("입금액 : ");
					balance2 = scanner.nextInt();
					balance[usernum] = balance[usernum] - balance2;
				} else {
					System.out.println("계좌정보가 없습니다.");
				}
				System.out.print("아무키나 누르세요");
				scanner.next();
			}
				break;

			case 5: {
				int usernum = -1;
				System.out.print("ID : ");
				id2 = scanner.next();
				System.out.print("PASS : ");
				pass2 = scanner.next();
				for (int j = 0; j < id.length; j++) {
					if (id2.equals(id[j])) {
						usernum = j;
						break;
					}
				}
				if (id2.equals(id[usernum]) && pass2.equals(pass[usernum])) {
					System.out.println("계좌를 삭제하시겠습니까?(Y/N)");
					ch = scanner.next().charAt(0);
					if (ch == 'y' || ch == 'Y') {
						id[usernum] = null;
						pass[usernum] = null;
						balance[usernum] = 0;
					} else {
						System.out.println("계좌정보가 없습니다.");
					}
				}
				System.out.print("아무키나 누르세요.");
				scanner.next();
			}
				break;

			case 9:
				System.out.println("종료프로그램입니다.");
				break;

			}// switch end

		} // end for
	}// end main
}
// end class
