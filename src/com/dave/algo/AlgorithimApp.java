package com.dave.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.dave.algo.service.Service;
import com.dave.algo.service.Service.FindLowHigh;
import com.dave.algo.service.Service.MergeIntervals;
import com.dave.algo.service.Service.Pair;

public class AlgorithimApp {

	public static void main(String[] args) {
		//2i
		int a[] = {0, -1, 2, -3, 1};
		
	    int x = -2;
	    
	    int size = (a.length );
	    
		Service.compareGivenValueToIntArrayPair(a,size,x) ;
		//2i ends here
		
		
//		  int arr[] = {3, 5, 7, 9, 10, 90, 100, 130,
//                  140, 160, 170};
//			int ans = Service.findPos(arr, 10);
//			if (ans==-1)
//			System.out.println( "Element not found");
//			else
//			System.out.println( "Element found at index " +ans);
		
		
		//2ii
	    List<Integer> array = Arrays.asList(1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4,4, 5, 5, 5, 6, 6, 6, 6, 6, 6);
	    int key = 5;
	    int low = FindLowHigh.findLowIndex(array, key);
	    int high = FindLowHigh.findHighIndex(array, key);
	    System.out.println("Low Index of " + key + ": " + low);
	    System.out.println("High Index of " + key + ": " + high);

	    key = -2;
	    low = FindLowHigh.findLowIndex(array, key);
	    high = FindLowHigh.findHighIndex(array, key);
	    System.out.println("Low Index of " + key + ": " + low);
	    System.out.println("High Index of " + key + ": " + high);
//2ii ends here
	    
	    //2iii
	    
			 ArrayList<Pair> v = new ArrayList<Pair>();

			    v.add(new Pair(1, 5));
			    v.add(new Pair(3, 7));
			    v.add(new Pair(4, 6));
			    v.add(new Pair(6, 8));
			    v.add(new Pair(10, 12));
			    v.add(new Pair(11, 15));

			    ArrayList<Pair> result = MergeIntervals.mergeIntervals(v);

			    for(int i=0; i<result.size(); i++){
			      System.out.print(String.format("[%d, %d] ", result.get(i).first, result.get(i).second));
			    }
			    
			   //2iii ends here 
			   
			    
			    
			
			    

	}

}
