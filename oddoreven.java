package Javaexamples;
import java.util.Scanner;
public class oddoreven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		System.out.print("Enter a number:");
		int num=s.nextInt();
		if(num%2==0)
			System.out.println(num +"is even");
		else
			System.out.println(num +"is odd");

	}

}
