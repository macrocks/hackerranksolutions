package hacker.rank.java.domain.solutions;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class JavaBiGDecimal {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int count=Integer.parseInt(stdin.next());
		BigDecimal[] bigDecimalrArray=new BigDecimal[count];
		int i=0;
		do {
			bigDecimalrArray[i]=new BigDecimal(stdin.next());
			i++;
			count--;
		} while (count != 0);

		Arrays.sort(bigDecimalrArray);
		for(int j=bigDecimalrArray.length-1;j>=0;j--)
		{
			System.out.println(bigDecimalrArray[j].toString().replaceFirst("^0\\.", "."));
		}
	}
}
