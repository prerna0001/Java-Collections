package practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author PRERNACHAUHAN
 *
 */
public class ArrayPracticeInsertDel {
	
	static Scanner input= new Scanner(System.in);
	
	public static void main(String[] args){
		
//		System.out.println("bakriiii");
		
		int pos,value,totalLength;
		
		System.out.println("enter array length:");
		totalLength=input.nextInt();
		int[] arr=new int[totalLength];
		
		System.out.println("enter array values: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=input.nextInt();
		}
		System.out.println("arry:"+ Arrays.toString(arr));
		
		System.out.println("pos: ");
		pos=input.nextInt();
		
		System.out.println("val: ");
		value= input.nextInt();
		
		arr[pos-1]=value;
		
		System.out.println("new array: "+Arrays.toString(arr));
	}

}
