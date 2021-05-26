package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력해 주세요");
		
		System.out.print("숫자1 :");
		int num1 = sc.nextInt();
		
		System.out.print("숫자2 :");
		int num2 = sc.nextInt();
		
		System.out.print("숫자3 :");
		int num3 = sc.nextInt();
				
		//int min = (num1>num2 && num1>num3 && num2>num3);
		
		if (num1 < num2 && num1 < num3) {
			int min = num1;
			System.out.println("가장 작은 수는 " + min + "입니다.");
		} else if(num2 < num3 && num2 < num1) {
			int min = num2;
			System.out.println("가장 작은 수는 " + min + "입니다.");
		} else {
			int min = num3;
			System.out.println("가장 작은 수는 " + min + "입니다.");
		}
		
		sc.close();

	}

}
