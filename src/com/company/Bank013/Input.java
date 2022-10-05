package com.company.Bank013;

import java.util.Scanner;

public class Input implements Bank_Controller{
    
	public Input() {
		super();
	}

	@Override
	public void exec(Bank_v6 user1) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("아이디 : ");
		user1.setId(scanner.next());
		user1.getId();
		System.out.print("비밀번호 : ");
		user1.setPass(scanner.next());
		user1.getPass();
		System.out.print("잔   액 : ");
		user1.setBalance(scanner.nextDouble());
	}

}
