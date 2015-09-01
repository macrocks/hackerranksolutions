package hacker.rank.java.domain.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Map {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int count=Integer.parseInt(stdin.next());
		java.util.Map<String, Integer> phoneBook=new HashMap<String, Integer>();
		do {
			stdin.nextLine();
			String name=stdin.nextLine();
			Integer no=stdin.nextInt();
			phoneBook.put(name,no);
			count--;
		} while (count != 0);

		ArrayList<String> inputList=new ArrayList<String>();
		stdin.nextLine();
		while(stdin.hasNext())
		{
           inputList.add(stdin.nextLine());	
		}
		for(String s:inputList){
			Integer no=phoneBook.get(s);
			if(no!=null){
				System.out.println(s+"="+no);
			}else{
				System.out.println("Not found");
			}
		}
		
	}

}
