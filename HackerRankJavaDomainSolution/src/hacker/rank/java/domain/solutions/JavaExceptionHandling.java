package hacker.rank.java.domain.solutions;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class JavaExceptionHandling {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);

	        while(in.hasNextInt())
	        {
	            int n = in.nextInt();
	            int p = in.nextInt();
	            myCalculator M = new myCalculator();
	            try
	            {
	                System.out.println(M.power(n,p));
	            }
	            catch(java.lang.Exception e)
	            {
	                System.out.println(e);
	            }
	        }
	}

}


class myCalculator{
	
	public String power(int n,int p) throws java.lang.Exception{
		if(n<0 || p<0){
			throw new java.lang.Exception("n and p should be non-negative");
			
		}else{
			return Double.toString((Math.pow(n, p))).split("\\.")[0];
			
			
		}
	}
	
	
}