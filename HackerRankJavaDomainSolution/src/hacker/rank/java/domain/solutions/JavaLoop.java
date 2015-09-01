package hacker.rank.java.domain.solutions;

import java.util.Scanner;

public class JavaLoop {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int in = stdin.nextInt();
		int count = in * 3;
		int[][] intarray = new int[in][3];
		int i = 0;
		int firstdim = 0;

		do {
			int input = stdin.nextInt();
			if (i < 3) {

			} else {
				i = 0;
				firstdim++;
			}
			intarray[firstdim][i] = input;
			i++;
			count--;
		} while (count != 0);

		// call method to iterate over two dimentional array and print output
		count = 0;
		int output = 0;
		for (int r = 0; r < in; r++) {
			output=0;
			for (int p = 0; p < intarray[count][2]; p++) {
				output = (int) (output + Math.pow(2.0, p) * intarray[count][1]);
				System.out.print(intarray[count][0] + output + " ");
			}
			System.out.println();
			count++;
		}

	}

}
