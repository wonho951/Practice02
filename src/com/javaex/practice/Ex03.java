package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		//age에 20 초과인 숫자를 입력했을때 1번 그룹이 출력. 20미만인 숫자는 2번그룹이 출력.
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		if (age > 20) {
			System.out.println("\"1번그룹\"");
		} else {
			System.out.println("\"2번그룹\"");
		}
		sc.close();

	}

}
