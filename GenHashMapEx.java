//alt+shift+s --generate getters and setters

package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class GenHashMapEx {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		HashMap hashM=new HashMap();
		
		System.out.println("enter number of entries u want: ");
		int n=input.nextInt();
		
		int k;
		String v;
		
		for(int i=0;i<n;i++)
		{
//			System.out.println("enter key");
//			k=input.nextInt();
//			System.out.println("enter val");
//			v=input.nextLine();
			
			hashM.put(input.next(), input.next());
		}
		
		Set< Map.Entry> set=hashM.entrySet();
		for(Map.Entry maE:set){
			System.out.print("key: "+maE.getKey());
			System.out.println("val: "+maE.getValue());
		}
		
		
		
		

	}

}
