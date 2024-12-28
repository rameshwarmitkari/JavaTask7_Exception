package Task;

import java.util.Scanner;

public class ArithmaticException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the num1");
		int a = sc.nextInt();
		System.out.println("Eneter the num2");
		int b = sc.nextInt();
		int div;
		try {
			div = a / b;
			System.out.println(div);

		} catch (ArithmeticException e) {
			System.out.println("Exception handled- can not divide by zero");
			e.printStackTrace();  //It will show the exception name in output 
		}

	}

}
