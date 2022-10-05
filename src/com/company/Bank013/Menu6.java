package com.company.Bank013;

import java.util.Scanner;

public class Menu6 implements Bank_Controller{
    Input input;
    Show show;
    Deposit deposit;
    Withdraw withdraw;
    Delete delete;
    public Menu6() {
		super();
		input = new Input();
		show = new Show();
		deposit = new Deposit();
		withdraw = new Withdraw();
		delete = new Delete();
	}
    
	@Override
	public void exec(Bank_v6 user1) {
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		do {	
		String bank = "======BANK======\r\n1.추가\r\n2.조회\r\n3.입금\r\n4.출금\r\n5.삭제\r\n9.종료\r\n입력>>>";
		System.out.print(bank);
		
			num = scanner.nextInt();
			switch (num) {
			case 1:
			    input.exec(user1);
				break;
			case 2:
				show.exec(user1);
			break; 
		    case 3:
				deposit.exec(user1);
				break; 
			case 4:
				withdraw.exec(user1);
				break;
   		     case 5:
				delete.exec(user1);
				break;
			case 9:
				System.out.println("종료기능입니다.");
				break;
			}
		} while (num != 9);
	}
}
	