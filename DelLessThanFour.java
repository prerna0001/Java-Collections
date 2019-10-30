//for loop to remove(i) wont work to remove element 
//coz every time u remove anything from list its index gets updated.

package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class DelLessThanFour {

public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		
		ArrayList<Integer> list= new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);

		System.out.println(list);
		
		
		list.removeIf(n->(n<4 || n>5));
		
		Iterator iterator=list.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println("after remove:"+iterator.next());
		}
	}
}
