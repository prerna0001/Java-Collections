/*Java ArrayList class uses a dynamic array for storing the elements. It inherits
 *  AbstractList class and implements List interface.

The important points about Java ArrayList class are:

Java ArrayList class can contain duplicate elements.
Java ArrayList class maintains insertion order.
Java ArrayList class is non synchronized.
Java ArrayList allows random access because array works at the index basis.
In Java ArrayList class, manipulation is slow because a lot of shifting needs to occur
 if any element is removed from the array list.*/


/*CopyOnWriteArrayList: CopyOnWriteArrayList class is introduced in JDK 1.5, which 
 * implements List interface. It is enhanced version of ArrayList in which all modifications
 *  (add, set, remove, etc) are implemented by making a fresh copy.
*/

package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ListIterator;


public class ArrayListEx {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		int n;
		
		ArrayList list= new ArrayList();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add(2);
		
		for(Object print:list)
		{
			System.out.println(print); //also u can use list directly
		}
		
		list.remove(1);
		
		Iterator iterator=list.iterator(); //will work without you also
		while(iterator.hasNext())
		{
			System.out.println("after remove:"+iterator.next());
		}
		
		ArrayList list2=new ArrayList();
		System.out.println("enter number of entries u want:");
		n=input.nextInt();
		int myLi;
		 for (int i=0; i<n;i++)
		 {
			 myLi=input.nextInt();
			 list2.add(myLi);
		 }

		 for(Object print2:list2)
		{
			System.out.println(print2);
		}
		 
//	        Collections.sort(list, Collections.reverseOrder()); 
		
		 list.add(1,"gg");
		 list.add(1,"hh");
		 
		 ListIterator<String> listIterator= list.listIterator();
		 
		 while(listIterator.hasNext())
			{
				System.out.println("after index add:"+listIterator.next());
			}
		
		 list.add(2,"kkk");
		 list.addAll(3,list2);
	}

}
