package Guvi;

import java.util.Scanner;

public class ReverseInteger {
	public static void main(String[] args) {
		
		System.out.println("Enter the number:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int revno=0;
		while(n!=0)
		{
			revno = revno * 10;
			revno = revno + n%10;
	          n = n/10;
		}
		System.out.println(+revno);
	}

}
