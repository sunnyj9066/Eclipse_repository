package jenkins_integration;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Palindrome {

	@Test
	public void palindrome() {

		String result = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number/string: ");
		String s = sc.next();
		for(int i=s.length()-1;i>=0;i--) {
			result = result+s.charAt(i);
		}
		System.out.print("The reversed number/string is :"+result);
		System.out.println();
		System.out.println("---------------------");
		if(result.equals(s)) {
			System.out.println("The entered number/string "+s+" is a palindrome");
		}else
			System.out.println("The entered number/string "+s+" is not a palindrome");
	}

}
