/*
 * Map cannot contain duplicate keys and each key can map to at most one value. 
Some implementations allow null key and null value like the HashMap and LinkedHashMap, 
but some do not like the TreeMap.

*First of all, we cannot iterate a Map directly using iterators,
because Map are not Collection.

*/

package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {

		

	       Map< String,Integer> hm =new HashMap<String, Integer>(); 
	       hm.put("a", 80); 
	       hm.put("b", 99); 
	       hm.put("c", new Integer("89")); //getting parsed due to wrapper class 
	       hm.put("d", new Integer(400)); //if string- "cd" is passed it will give runtime error "java.lang.NumberFormatException:"
	  
	       // Returns Set view      
	       Set< Map.Entry< String,Integer> > set = hm.entrySet();    
	  
	       for (Map.Entry< String,Integer> mE:set) 
	       { 
	           System.out.print(mE.getKey()+":"); 
	           System.out.println(mE.getValue()); 
	       } 

	       for(String key:hm.keySet())//what if we have generic map?? use Object!
	       {
	    	   System.out.println("keys: "+key);
	       }
	       
	       for(int val:hm.values())
	       {
	    	   System.out.println("val: "+val);
	       }
	       
	       
	       Scanner input= new Scanner(System.in);
			HashMap hashM=new HashMap();
			
			System.out.println("enter number of entries u want: ");
			int n=input.nextInt();
			
//			int k;
//			String v;
			
			for(int i=0;i<n;i++)
			{
				
				hashM.put(input.next(), input.next());
			}
			
			Set< Map.Entry> set1=hashM.entrySet();
			for(Map.Entry maE:set1){
				System.out.print("key: "+maE.getKey());
				System.out.println("val: "+maE.getValue());
			}
	       
	}

}
