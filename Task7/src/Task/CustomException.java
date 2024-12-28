package Task;

import java.util.Scanner;


class InvalidAgeException extends Exception{
	InvalidAgeException(String age){
		System.out.println(age);
	}
	
}



public class CustomException {

	public static void main(String[] args) {
	
	try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age--");
		int  a = sc.nextInt();
		checkAge(a);
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
	
	
	public static void checkAge(int age) throws InvalidAgeException {
		
	if(age < 18) {
		throw new InvalidAgeException("invalid age exception");
	}else
	{
		System.out.println("age is valid "+age);
	}

	
		
	}
}
