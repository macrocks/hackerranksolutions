package hacker.rank.java.domain.solutions;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int count=0;
		BigInteger[] bigInterArray=new BigInteger[2];
		System.out.println("Enter : ");
		do {
			bigInterArray[count] =new BigInteger(stdin.next());
			count++;
		} while (count != 2);

		System.out.println(bigInterArray[0].add(bigInterArray[1]));
		System.out.println(bigInterArray[0].multiply(bigInterArray[1]));
		
	}

}
