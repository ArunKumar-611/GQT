package com.GQT.Custom;

import java.util.Scanner;

public class Applicant {
	int age;
	
	public void getAge() {
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
	}
	public void verify() throws Exception {
		if(age<18) {
			UnderAgeException ue = new UnderAgeException();
			System.out.println(ue.getMessage());
			throw ue;
		}
		else if(age>=65) {
			OlderAgeException oa = new OlderAgeException();
			System.out.println(oa.getMessage());
			throw oa;
		}
		else
		{
			System.out.println("collect your driving license");
		}
	}
}
