package com.company.mini;

import java.util.Arrays;
import java.util.Scanner;

public class Mini_bank_6ver {
	public static void main(String[] args) {
		String[][] users = { { "", "", "" }, { "", "", "" }, { "", "", "" } };
		int num = 0;
		int balance2 = 0;
		char ch = ' ';
		String id2 = "";
		String pass2 = "";
		String bank = "======BANK======\r\n1.추가\n2.조회\n3.입금\n4.출금\n5.삭제\n9.종료\n입력>>>";

		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 9; i = num) {
			System.out.println(Arrays.deepToString(users));
			System.out.print(bank);
			num = scanner.nextInt();
			switch (num) {
			case 1: {
				boolean tf = true;
				int usernum = -1;
				for (int j = 0; j < users.length; j++) {
					if (users[j][0] == "") {
						usernum = j;
						break;
					}
				}
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
				System.out.print("아무키나 누르세요.");
				scanner.next();
			}
				break;

			case 2: {
				int usernum = -1;

				System.out.print("ID : ");
				id2 = scanner.next();
				System.out.print("PASS : ");
				pass2 = scanner.next();
				for (int j = 0; j < users.length; j++) { if (id2.equals(users[j][0])) { usernum = j; break; } }
				if (usernum == -1) {
					System.out.println("조회가 실패했습니다.");
					break;
				}
				if (pass2.equals(users[usernum][1])) {
					System.out.println("======조회결과======");
					System.out.println("아이디 : " + users[usernum][0] + "\r\n" + "비밀번호 : " + users[usernum][1] + "\r\n"
							+ "잔    액 : " + users[usernum][2] + "\r\n" + "조회가 성공했습니다.");
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
				for (int j = 0; j < users.length; j++) { if (id2.equals(users[j][0])) { usernum = j; break; } }
				if (usernum == -1) {
					System.out.println("조회가 실패했습니다.");
					break;
				}
				if (pass2.equals(users[usernum][1])) {
					System.out.print("입금액 : ");
					balance2 = scanner.nextInt();
					users[usernum][2] = Integer.parseInt(users[usernum][2]) + balance2 + "";
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
				for (int j = 0; j < users.length; j++) { if (id2.equals(users[j][0])) { usernum = j; break; } }
				if (usernum == -1) {
					System.out.println("조회가 실패했습니다.");
					break;
				}
				if (pass2.equals(users[usernum][1])) {
					System.out.print("입금액 : ");
					balance2 = scanner.nextInt();
					users[usernum][2] = Integer.parseInt(users[usernum][2]) - balance2 + "";
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
				for (int j = 0; j < users.length; j++) { if (id2.equals(users[j][0])) { usernum = j; break; } }
				if (usernum == -1) {
					System.out.println("조회가 실패했습니다.");
					break;
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
				System.out.print("아무키나 누르세요.");
				scanner.next();
			}
				break;

			case 9:
				System.out.println("종료프로그램입니다.");
				break;
			} // end switch
		} // end for
	} // end main
} // end class
