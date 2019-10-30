/* passing value through object class used ForHashMapPojo.java
 * 
 * next() can read the input only till the space. It can't read two words separated by a space. 
Also, next() places the cursor in the same line after reading the input.

nextLine() reads input including space between the words (that is, it reads till the end of line \n). 
Once the input is read, nextLine() positions the cursor in the next line.

*----with next() after white spaces it considers next val
*
*enter number of entries u want: 
5
enter values: 
aaa a
dd f
v
key: 1 val: ForHashMapPojo [key=0, val=aaa]
key: 2 val: ForHashMapPojo [key=0, val=a]
key: 3 val: ForHashMapPojo [key=0, val=dd]
key: 4 val: ForHashMapPojo [key=0, val=f]
key: 5 val: ForHashMapPojo [key=0, val=v]

<ignore key 0>
*
*
*----with nextLine()
*
*enter number of entries u want: 
3
enter values: 
qqq q
ggg t
key: 1 val: ForHashMapPojo [key=0, val=]
key: 2 val: ForHashMapPojo [key=0, val=qqq q]
key: 3 val: ForHashMapPojo [key=0, val=ggg t]
*
*/


package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ForHashMap {
	
public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		HashMap<Integer,ForHashMapPojo> forHashMapPojo=new HashMap(); //what if i want both generic?

//		ForHashMapPojo p1 = new ForHashMapPojo(1, "1");
//		ForHashMapPojo p2 = new ForHashMapPojo(2, "2");
//		forHashMapPojo.put(4, p1);
//		forHashMapPojo.put(5, p2);
//		
//Set< Map.Entry<Integer,ForHashMapPojo>> set=forHashMapPojo.entrySet();  //Set< Map.Entry> set=forHashMapPojo.entrySet();ERROR--Set< Map.Entry> set=forHashMapPojo.entrySet();
//		
//		
//		for(Map.Entry maE:set){
//			System.out.print("key: "+maE.getKey());
//			System.out.println(" val: "+maE.getValue());
//		}
//		
		
		System.out.println("enter number of entries u want: ");
		int n=input.nextInt();

		System.out.println("enter values: ");
		for(int i=0;i<n;i++)
		{
			
			forHashMapPojo.put((i+1),new ForHashMapPojo(input.next())); //1st index val was coming empty with nextLine()
		}	
		
//		forHashMapPojo.put(1,new ForHashMapPojo("a"));
//
//		forHashMapPojo.put(2,new ForHashMapPojo("b"));
//
//		forHashMapPojo.put(3,new ForHashMapPojo("c"));
//		
		
		
		Set< Map.Entry<Integer,ForHashMapPojo>> set=forHashMapPojo.entrySet();  //Set< Map.Entry> set=forHashMapPojo.entrySet();ERROR--Set< Map.Entry> set=forHashMapPojo.entrySet();
		
		
		for(Map.Entry maE:set){
			System.out.print("key: "+maE.getKey());
			System.out.println(" val: "+maE.getValue());
		}
		
		
		
		

	}

}
