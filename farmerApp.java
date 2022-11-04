/**
 * 
 */
package javapractice;

import java.util.Scanner;

/**
 * @author Arun
 *
 */
public class farmerApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Farmer f1 = new Farmer();
		f1.eligcri();
		f1.acceptInput();
		f1.compute();
		f1.dispInterest();
	}

}
class Farmer{
	private float p;
	private float t;
	static float r = 2.5f;
	private float si;
	
	void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the principle amount : ");
		p = sc.nextFloat();
		System.out.println("enter the time duration : ");
		t = sc.nextFloat();
		
	}
	void compute() {
		si = (p*t*r)/100;
		
	}
	void dispInterest() {
		System.out.println(si);
		
	}
	static void eligcri() {
		System.out.println("age should be between 18 to 70");
	}
	
}