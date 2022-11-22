package com.GQT.Custom;

public class RTO {
	public void initiate() {
		Applicant a = new Applicant();
		try {
			a.getAge();
			a.verify();
		}
		catch(Exception e){
			try {
				a.getAge();
				a.verify();
			}
			catch(Exception f) {
				System.out.println("kindly apply only if your age is between 18 to 65");
				System.exit(0);
			}
		}
	}
	
}
