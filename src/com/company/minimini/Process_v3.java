package com.company.minimini;

import java.util.Scanner;

public class Process_v3 {
	public int menu(Bank_v3 user1) {

		int num = 0;
		do {	Scanner scanner = new Scanner(System.in);
		String bank = "======BANK======\r\n1.추가\r\n2.조회\r\n3.입금\r\n4.출금\r\n5.삭제\r\n9.종료\r\n입력>>>";
		System.out.print(bank);
		
			num = scanner.nextInt();// 리턴값int / 메서드명 menu/ 파라미터 x
			switch (num) {
			case 1:
			  input(user1);
				break; // 리턴값void / 메서드명 input/ 파라미터 x
			case 2:
				show(user1);
			break; // 리턴값void / 메서드명 show/ 파라미터 x
		    case 3:
				deposit(user1);
				break; // 리턴값void / 메서드명 deposit/ 파라미터 x
			case 4:
				withdraw(user1);
				break;// 리턴값void / 메서드명 withdraw/ 파라미터 x
   		     case 5:
				delete(user1);
				break;// 리턴값void / 메서드명 delete/ 파라미터 x
			case 9:
				System.out.println("종료기능입니다.");
				break;// 리턴값void / 메서드명 delete/ 파라미터 x
			}
		} while (num != 9);
		return num;
	}
	 public void input(Bank_v3 user1) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("아이디 : ");
		user1.setId(scanner.next());
		user1.getId();
		System.out.print("비밀번호 : ");
		user1.setPass(scanner.next());
		user1.getPass();
		System.out.print("잔   액 : ");
		user1.setBalance(scanner.nextDouble());
		user1.setSum(user1.getSum()+user1.getBalance());
	}
			
	 public void show(Bank_v3 user1) {
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
						"아이디 : " + user1.getId()+ "\r\n" + "비밀번호 : " + user1.getPass() + "\r\n" + "잔    액 : " + user1.getSum() + "\r\n" + "조회가 성공했습니다.");
			} else {
				System.out.println("조회가 실패했습니다.");
			}
			System.out.print("아무키나 누르세요.");
			scanner.next();
		}

	 public void deposit(Bank_v3 user1) {
			Scanner scanner = new Scanner(System.in);
			String id2 = "";
			String pass2 = "";
			System.out.println("======입금 계좌정보 확인======");
			System.out.print("ID : ");
			id2 = scanner.next();
			System.out.print("PASS : ");
			pass2 = scanner.next();
			if (user1.getId().equals(id2) && user1.getPass().equals(pass2)) {
				System.out.print("입금액 : ");
				user1.setBalance(scanner.nextDouble());
				user1.setSum(user1.getSum()+user1.getBalance());
	
				
			} else {
				System.out.println("계좌정보가 없습니다.");
			}
			System.out.print("아무키나 누르세요");
			scanner.next();
		}
	 
	 public void withdraw(Bank_v3 user1) {
			Scanner scanner = new Scanner(System.in);
			String id2 = "";
			String pass2 = "";
			System.out.println("====출금 계좌정보 입력====");
			System.out.print("*ID : ");
			id2 = scanner.next();
			System.out.print("*PASS : ");
			pass2 = scanner.next();
			if (user1.getId().equals(id2) && user1.getPass().equals(pass2)) {
				System.out.print("입금액 : ");
				user1.setBalance(scanner.nextDouble());
				user1.setSum(user1.getSum()-user1.getBalance());
			} else{
				System.out.println("계좌 정보가 없습니다.");
			}
		}
	 
	 public void delete(Bank_v3 user1) {
			Scanner scanner = new Scanner(System.in);
			String id2 = "";
			String pass2 = "";
			char ch=' ';
			System.out.print("*ID : ");
			id2 = scanner.next();
			System.out.print("*PASS : ");
			pass2 = scanner.next();
			if (user1.getId().equals(id2) && user1.getPass().equals(pass2)) {
				System.out.println("삭제하시겠습니까?(Y/N)");
				ch = scanner.next().charAt(0);
				if (ch == 'y' || ch == 'Y') {
					user1.setId("");
					user1.setPass("");
				}
			}
		}
}