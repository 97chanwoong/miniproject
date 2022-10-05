package com.company.mini;

import java.util.Scanner;

public class mini_Switch_If {
 public static void main(String[] args) {
	
	 int num=0;
	 int id=0;
	 int pass=1;
	 double balance=10000;
	 double balance2=0;
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("======BANK======");
		System.out.println("1.추가\n"
				+ "2.조회\n"
				+ "3.입금\n"
				+ "4.출금\n"
				+ "5.삭제\n"
				+ "9.종료");
		System.out.print("입력>>> ");
		num = scanner.nextInt();
		switch(num) {
		case 1:
			System.out.print("□ 아이디 : ");
			id = scanner.nextInt();
			System.out.print("□ 비밀번호 : ");
			pass=scanner.nextInt();
			System.out.print("ㅁ 잔  액 : "+balance+"\n설정되어 있습니다.");
			break;
	
		case 2: 
			System.out.println("ㅁ 조회기능입니다.");
			System.out.print("본인확인 ID : ");
			id = scanner.nextInt();
			System.out.print("본인확인 pass : ");
			pass = scanner.nextInt();
			if(id==1&&pass==1) {
				System.out.println("==반갑습니다 고객님\n"
						+ "ID : "+id+"\n"
						+"psss : "+pass+"\n"
						+"balance : "+balance);
			}
			else {System.out.println("다시 확인해주세요.");
			}
			break;
		case 3:
			System.out.println("ㅁ 입금기능입니다.");
			System.out.print("본인확인 ID : ");
			id = scanner.nextInt();
			System.out.print("본인확인 pass : ");
			pass = scanner.nextInt();
			if(id==1&&pass==1) {
				System.out.print("입금할 금액을 입금해주세요. > ");
				balance2 = scanner.nextDouble();
				System.out.println("==잔액확인\n"
						+ "ID : "+id+"\n"
						+"psss : "+pass+"\n"
						+"balance : "+(balance+balance2));
			}
			else {System.out.println("다시 확인해주세요.");
			}
			break;
		case 4:
			System.out.println("ㅁ 출금기능입니다.");
			System.out.print("본인확인 ID : ");
			id = scanner.nextInt();
			System.out.print("본인확인 pass : ");
			pass = scanner.nextInt();
			if(id==1&&pass==1) {
				System.out.print("출금할 금액을 입력해주세요. > ");
				balance2 = scanner.nextDouble();
				System.out.println("==잔액확인\n"
						+ "ID : "+id+"\n"
						+"psss : "+pass+"\n"
						+"balance : "+(balance-balance2));
			}
			else {System.out.println("다시 확인해주세요.");
			}
			break;
		case 5:
			    System.out.println("ㅁ 삭제기능입니다.");
			    System.out.println("==잔액확인");
				System.out.println("ID : "+ 0);
				System.out.println("pass : "+0);
				System.out.println("balance : "+ 0.0);
		    break;
		    
		    
		case 9:
			System.out.println("ㅁ 종료기능입니다.");
			break;
		}	
}
}
