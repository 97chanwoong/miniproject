package com.company.minimini;

import java.util.Arrays;
import java.util.Scanner;

public class Process_v4 {

	public Process_v4() {

	}

	public int menu(Bank_v4[] users) {

		int num = 0;
		do {
			
			Scanner scanner = new Scanner(System.in);
			String bank = "======BANK======\r\n1.추가\r\n2.조회\r\n3.입금\r\n4.출금\r\n5.삭제\r\n9.종료\r\n입력>>>";
			System.out.println(Arrays.toString(users));
			System.out.print(bank);

			num = scanner.nextInt();// 리턴값int / 메서드명 menu/ 파라미터 x
			switch (num) {
			case 1:
				input(users);
				break; // 리턴값void / 메서드명 input/ 파라미터 x
			case 2:
				show(users);
				break; // 리턴값void / 메서드명 show/ 파라미터 x
		    case 3:
				deposit(users);
				break; // 리턴값void / 메서드명 deposit/ 파라미터 x
			case 4:
				withdraw(users);
				break;// 리턴값void / 메서드명 withdraw/ 파라미터 x
   		     case 5:
				delete(users);
				break;// 리턴값void / 메서드명 delete/ 파라미터 x
			case 9:
				System.out.println("종료기능입니다.");
				break;// 리턴값void / 메서드명 delete/ 파라미터 x
			}
		} while (num != 9);
		return num;
	}

	public void input(Bank_v4[] users) {
		Scanner scanner = new Scanner(System.in);
		boolean tf = true;
		int usernum = -1;
		String id2 = "";
		int count=0;
		for(Bank_v4 user : users) {
			if(user.getId()==null) {
				usernum=count;
				break;
			}
			count++;
//		for (int i = 0; i < users.length; i++) {
//			if (users[i].getId() == null) {
//				usernum = i;
//				break;
//			}
		}
		if (usernum == -1) {
			System.out.println("더이상 신규가입 불가입니다.");
		} else {
			for (;;) {
				tf = true;
				System.out.print("ID : ");
				id2 = scanner.next();
//				for (int i = 0; i < users.length; i++) {
//					if (id2.equals(users[i].getId())) {
//						tf = false;
//					}
//				}
				for(Bank_v4 user : users) {
					if(id2.equals(user.getId())) {
						tf=false;
					}
				}
				if (tf) {
					users[usernum].setId(id2);
					break;
				} else {
					System.out.println("중복아이디입니다.");
				}
			}
			System.out.print("PASS : ");
			users[usernum].setPass(scanner.next());
			System.out.print("BALANCE : ");
			users[usernum].setBalance(scanner.nextDouble());

		}
		System.out.print("아무키나 누르세요.");
		scanner.next();
	}

	public void show(Bank_v4[] users) {
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
		if (usernum == -1) {
			System.out.println("조회가 실패했습니다.");

		}
		if (pass2.equals(users[usernum].getPass())) {
			System.out.println("======조회결과======");
			System.out.println("아이디 : " + users[usernum].getId() + "\r\n" + "비밀번호 : " + users[usernum].getPass()
					+ "\r\n" + "잔    액 : " + users[usernum].getBalance() + "\r\n" + "조회가 성공했습니다.");
		}
		System.out.print("아무키나 누르세요.");
		scanner.next();
	}

	public void deposit(Bank_v4 [] users) {
		Scanner scanner = new Scanner(System.in);
		int usernum = -1;
		String id2 = "";
		String pass2 = "";
		double balance2=0;
		System.out.println("======입금 계좌정보 확인======");
		System.out.print("ID : ");
		id2 = scanner.next();
		System.out.print("PASS : ");
		pass2 = scanner.next();
		for (int j = 0; j < users.length; j++) { if (id2.equals(users[j].getId())) { usernum = j; break; } }
		if (usernum == -1) {
			System.out.println("조회가 실패했습니다.");
		}
		if (pass2.equals(users[usernum].getPass())) {
			System.out.print("입금액 : ");
		balance2 = scanner.nextDouble();
		users[usernum].setBalance(users[usernum].getBalance()+balance2);
		} 
		System.out.print("아무키나 누르세요");
		scanner.next();
	}
	
	public void withdraw(Bank_v4 [] users) {
		Scanner scanner = new Scanner(System.in);
		int usernum = -1;
		String id2 = "";
		String pass2 = "";
		double balance2=0;
		System.out.println("======입금 계좌정보 확인======");
		System.out.print("ID : ");
		id2 = scanner.next();
		System.out.print("PASS : ");
		pass2 = scanner.next();
		for (int j = 0; j < users.length; j++) { if (id2.equals(users[j].getId())) { usernum = j; break; } }
		if (usernum == -1) {
			System.out.println("조회가 실패했습니다.");
		}
		if (pass2.equals(users[usernum].getPass())) {
			System.out.print("입금액 : ");
			balance2 = scanner.nextDouble();
			users[usernum].setBalance(users[usernum].getBalance()-balance2);
			} 
		
		System.out.print("아무키나 누르세요");
		scanner.next();
	}
	
	public void delete(Bank_v4 [] users) {
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
		if (usernum == -1) {
			System.out.println("조회가 실패했습니다.");

		}
		if (pass2.equals(users[usernum].getPass())) {
			System.out.println("계좌를 삭제하시겠습니까?(Y/N)");
			ch = scanner.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				users[usernum].setId("");
				users[usernum].setPass("");
				users[usernum].setBalance(0);
			} 
		}
		System.out.print("아무키나 누르세요.");
		scanner.next();
	}
	
}
