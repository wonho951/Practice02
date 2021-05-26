package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해주세요.");
		
		System.out.print("키 : ");			
		float tall = sc.nextFloat();
		
		System.out.print("몸무게 : ");
		float weight = sc.nextFloat();
		
		//표준체중
		float standard = (tall-100) * 0.9f;
		
		if (standard>weight) {			
			System.out.println("저체중입니다.");
			System.out.println("표준체중: " + standard);
		} else if (standard<weight){
			System.out.println("과체중입니다.");
			System.out.println("표준체중: " + standard);
		} else {
			System.out.println("표준 입니다.");
			System.out.println("표준체중: " + standard);
		}
		
		sc.close();

	}

}
