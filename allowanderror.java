package Javaexamples;

import java.util.Scanner;

public class allowanderror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password, confirm_password;
		Scanner y= new Scanner(System.in);
		System.out.println("Enter your password :");
		password= y.next();
		System.out.println("re-enter your password :");
		confirm_password = y.next();
		if (password.equals(confirm_password))
		{
			System.out.println("Password matched");
			
		}
		else
			System.out.println("Password is wrong");
	}

}
