/*
Java HashSet class hierarchy
Java HashSet class is used to create a collection that uses a hash table for storage.
It inherits the AbstractSet class and implements Set interface.

The important points about Java HashSet class are:

HashSet stores the elements by using a mechanism called hashing.
HashSet contains unique elements only.
HashSet allows null value.
HashSet class is non synchronized.
HashSet doesn't maintain the insertion order. Here, elements are inserted on the 
basis of their hashcode.
HashSet is the best approach for search operations.
The initial default capacity of HashSet is 16, and the load factor is 0.75.*/

package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetEx {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		System.out.println("enter number of entries u want:");
		int n=input.nextInt();
		HashSet<Integer> hashSet=new HashSet<Integer>();
		
		System.out.println("Enteries:");
		 for (int i=0; i<n;i++)
		 {
			
			 hashSet.add(input.nextInt());
		 }
		 
		 Iterator iterator= hashSet.iterator();
		 
		 while(iterator.hasNext())
		 {
			 System.out.println("val entered are:  "+iterator.next());
		 }
		 
		 //lambda exp
		 hashSet.forEach((Integer value) -> System.out.print(value));//why Integer not int and look at the print order!!

		 hashSet.forEach(System.out::print);
	}

}
