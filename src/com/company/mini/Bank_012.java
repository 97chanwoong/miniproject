package com.company.mini;

import com.company.minimini.Bank_v5;
import com.company.minimini.Process_v5_2;

public class Bank_012 {
	public static void main(String[] args) {
		Bank_v5[]  users = new Bank_v5[] {  new Bank_v5() , new Bank_v5() ,new Bank_v5()  };
		//Bank_v5 users = new Bank_v5();
		Process_v5_2 process = new Process_v5_2();
		process.menu(users);
}
}