package com.company.mini;

import java.util.Scanner;

public class A001 {
 public static void main(String[] args) {
	int num = 0;

	Scanner scanner = new Scanner(System.in);
	
	System.out.println("======BANK=====");
	System.out.println("1.추가\n"
			+ "2.조회\n"
			+ "3.입금\n"
			+ "4.출금\n"
			+ "5.삭제\n"
			+ "9.종료");
	System.out.print("입력>>> ");
	num = scanner.nextInt();
	System.out.print("번호가 "+num+"이라면 ");
	System.out.print(
			(num==1) ? "추가기능 입니다.":
			(num==2) ? "조회기능 입니다.":
			(num==3) ? "입금기능 입니다.":
		    (num==4) ? "출금기능 입니다.":
		    (num==5) ? "삭제기능 입니다.":
		    (num==9) ? "종료기능 입니다.":"");
	
	
	
	
}
}
