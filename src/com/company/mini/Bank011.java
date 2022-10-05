package com.company.mini;



import java.util.Arrays;

import com.company.minimini.Bank_v4;
import com.company.minimini.Process_v4;


public class Bank011 {
	public static void main(String[] args) {
		Bank_v4[] users = new Bank_v4[] { new Bank_v4(), new Bank_v4(), new Bank_v4() };
		 Process_v4 process = new Process_v4();
		 process.menu(users);
	}
}
