package com.GQT.Custom;

public class UnderAgeException extends Exception{
	public String getMessage() {
		return "You are under age, Kindly have patience";
	}
}
