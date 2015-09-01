package hacker.rank.java.domain.solutions;

import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaStringToken {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String input=stdin.nextLine();
		String delim="!,?._'@ ";
		StringTokenizer token= new StringTokenizer(input, delim);
		System.out.println(token.countTokens());
		while(token.hasMoreElements())
		{
			System.out.println(token.nextElement());
		}
		

	}
}
