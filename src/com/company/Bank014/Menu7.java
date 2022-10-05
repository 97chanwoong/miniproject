package com.company.Bank014;

import java.util.Arrays;
import java.util.Scanner;



public class Menu7 {
	Bank_v7[] users;
    Input2 input;
    Show2 show;
    Deposit2 deposit;
    Withdraw2 withdraw;
    Delete2 delete;
	public Menu7() {
		super();
	      users = new Bank_v7[]{new Bank_v7(), new Bank_v7(), new Bank_v7()};
	        input = new Input2();
	        show = new Show2();
	        deposit = new Deposit2();
	        withdraw = new Withdraw2();
	        delete = new Delete2();
	    }
 
public void exec() {
	 int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		do {
		System.out.println("=======Chan's Burger=======");
		System.out.println("+         1.가입하기         +");
		System.out.println("+         2.조회하기         +");
		System.out.println("+         3.구매하기         +");
		System.out.println("+         4.충전하기         +");
		System.out.println("+         5.탈퇴하기         +");
		System.out.println("+         9.종료하기         +");
		System.out.println("============================");
		System.out.println("       버튼을 눌러주세요 ^^      ");
		System.out.print(">");
		
			num = scanner.nextInt();
			switch (num) {
			case 1:
			    input.exec(users);
				break;
			case 2:
				show.exec(users);
			break; 
		    case 3:
				deposit.exec(users);
				break; 
			case 4:
				withdraw.exec(users);
				break;
		     case 5:
				delete.exec(users);
				break;
			case 9:
				System.out.println("종료기능입니다. 이용해주셔서 감사합니다.");
				break;
			}
		} while (num != 9);
}

}

