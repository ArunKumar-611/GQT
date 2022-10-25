/**
 * 
 */
package javapractice;

import java.util.Scanner;

/**
 * @author Arun
 *
 */

// this program is to show the working of the Inheritance and the shadowing property of the local variables and the constructor
class Dog{
	// private key word is used to restrict the direct access of class members (data)
	 private String breed;
	 private float age;
	 private int price;
	 
	 //getters and setters are declared to give controlled access to the users
	 //here constructor of Dog class is used to initialize instance variables
	 public Dog(String breed,float age,int price) {
		 if(breed != null) {
			 this.breed=breed;
		 }
		 if(age>0) {
			 this.age=age;
		 }
		 else {
			 System.out.println("enter the valid age");
		 }
		 if(price>=0) {
			 this.price = price;
		 }
		 else {
			 System.out.println("enter valid price");
		 } 
	 }
	 public String getBreed() {
		 return breed;
	 }
	 public float getAge() {
		 return age;
	 }
	 public int getPrice() {
		 return price;
	 }
}
public class Launch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the breed, age and price of the dog");
		String breed = sc.next();
		float age = sc.nextFloat();
		int price = sc.nextInt();
		
// Dog constructor is used at the time of creating the time of creating the new dog object and parameters are passed
		
		Dog d = new Dog(breed,age,price);
		
//get methods are used as accessors to access the data from the Dog object that is Stored n Dog object
		// here we are storing Dogs data in local variables using get() method and printing the values 
		
		
		String dog_breed=d.getBreed();
		float dog_age = d.getAge();
		int dog_price = d.getPrice();
		
		System.out.println("the dogs breed is : "+dog_breed);
		System.out.println("age = "+dog_age);
		System.out.println("price = "+dog_price);
		
	}

}
