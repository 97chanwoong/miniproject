package com.company.Bank014;

import java.util.Scanner;

public class Input2 implements Bank_Controller2{

	@Override
	public void exec(Bank_v7[] users) {
		Scanner scanner = new Scanner(System.in);
		boolean tf = true;
		int usernum = -1;
		String id2 = "";
		int count=0;
		for(Bank_v7 user : users) {
			if(user.getId()==null) {
				usernum=count;
				break;
			}
			count++;
		}
		if (usernum == -1) {
			System.out.println("더이상 신규가입 불가입니다.");
		} else {
			for (;;) {
				tf = true;
				System.out.print("ID : ");
				id2 = scanner.next();
				for(Bank_v7 user : users) {
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
		System.out.print("아무키나 눌러주세요.");
		scanner.next();
	}
	
}