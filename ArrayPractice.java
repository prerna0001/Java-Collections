package practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class ArrayPractice {

	public static void main(String[] args) {
		
		
//		 System.out.println("foosball challllllloooooooooooooooooooooooooo");
		
		Scanner input= new Scanner(System.in);
		
		System.out.println(" enter array length ");
		int length1= input.nextInt();
		
		int[] array=new int[length1];
		
		System.out.println("Enter array values: ");		
		for(int i=0; i<array.length;i++)
		{			
			array[i]=input.nextInt();			
		}
		
		System.out.println("Array entered by you is: ");
		for(int i=0; i<array.length;i++)
		{			
			System.out.println(array[i]);			
		}
		
		System.out.println("lets get the highest value entered by you ;) ");
		int largestVal=array[0];
		for(int i=1; i<array.length;i++)
		{
			if(largestVal<array[i])
				largestVal=array[i];
				
		}
		System.out.println(largestVal);
		
		System.out.println("lets see two largest numbers ");
		int largest1=array[0];
		int largest2=array[1];
		
		if (largest1<largest2)
		{
			largest1=largest1+largest2;
			largest2=largest1-largest2;
			largest1=largest1-largest2;
		}
		
		for(int i=2;i<array.length;i++)
		{
			if(largest1<array[i])
			{
				largest2=largest1;
				largest1=array[i];
				
			}
			
			else if(array[i]>largest2&& array[i]!=largest1 )
			{
				largest2=array[i];
			}
		}
		
		System.out.println("largest1 is:"+largest1);
		System.out.println("largest2 is:"+largest2);
			
		Arrays.sort(array);
		System.out.println("sorted: "+Arrays.toString(array) );
		
		Arrays.sort(array);
	}

}
