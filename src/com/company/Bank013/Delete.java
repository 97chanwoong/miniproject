package com.company.Bank013;

import java.util.Scanner;

public class Delete implements Bank_Controller{

	public Delete() {
		super();
	}

	@Override
	public void exec(Bank_v6 user1) {
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
