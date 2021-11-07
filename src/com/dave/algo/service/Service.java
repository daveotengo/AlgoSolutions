package com.dave.algo.service;

import java.util.ArrayList;
import java.util.List;


public class Service {
	
	public static int  compareGivenValueToIntArrayPair(int A[], int size, int x) {
	    for (int i = 0; i < (size - 1); i++) {
	        for (int j = (i + 1); j < size; j++) {
	            if (A[i] + A[j] == x) {
	            	
	                System.out.println("Pair "+ A[i]+" and " +A[j]+" with a given sum "+x);
	 
	                return 1;
	            }
	        }
	    }
	 
	    return 0;
	}
	
	
	public static int findPos(int arr[], int key)
	{
	    int l = 0, h = 1;
	    int val = arr[0];
	 
	    // Find h to do binary search
	    while (val < key)
	    {
	        l = h;        // store previous high
	        h = 2*h;      // double high index
	        val = arr[h]; // update new val
	    }
	 
	    // at this point we have updated low and
	    // high indices, Thus use binary search
	    // between them
	    return binarySearch(arr, l, h, key);
	}
	
	static int binarySearch(int arr[], int l, int r, int x)
	{
	    if (r>=l)
	    {
	        int mid = l + (r - l)/2;
	        if (arr[mid] == x)
	            return mid;
	        if (arr[mid] > x)
	            return binarySearch(arr, l, mid-1, x);
	        return binarySearch(arr, mid+1, r, x);
	    }
	    return -1;
	}
	
	
	   
   public static class FindLowHigh{
    	  public static int findLowIndex (List<Integer> arr, int key) {
    	    int low = 0;
    	    int high = arr.size() - 1;
    	    int mid = high / 2;
    	  
    	    while (low <= high) {

    	      int mid_elem = arr.get(mid);

    	      if (mid_elem < key) {
    	        low = mid + 1;
    	      }
    	      else {
    	      high = mid - 1;
    	      }
    	  
    	      mid = low + (high - low) / 2;
    	    }

    	    if (low < arr.size() && arr.get(low) == key) {
    	      return low;
    	    }

    	    return -1;
    	  }

    	  public static int findHighIndex(List<Integer> arr, int key) {
    	    int low = 0;
    	    int high = arr.size() - 1;
    	    int mid = high / 2;

    	    while (low <= high) {
    	  
    	      int mid_elem = arr.get(mid);
    	  
    	      if (mid_elem <= key) {
    	        low = mid + 1;
    	      }
    	      else {
    	        high = mid - 1;
    	      }

    	      mid = low + (high - low) / 2;
    	    }
    	    
    	    if(high == -1){
    	      return high;
    	    }
    	    
    	    if (high < arr.size() && arr.get(high) == key) {
    	      return high;
    	    }

    	    return -1;
    	  }
    	
    	}
	
	public static class Pair{
	    public int first;
	    public int second;
	    
	    public Pair(int x, int y){
	      this.first = x;
	      this.second = y; 
	    }
	}

	public static class MergeIntervals{
	  public static ArrayList<Pair> mergeIntervals(ArrayList<Pair> v) {
	  
	    if(v == null || v.size() == 0) {
	      return null;
	    }

	    ArrayList<Pair> result = new ArrayList<Pair>();

	    result.add(new Pair(v.get(0).first, v.get(0).second));

	    for(int i = 1 ; i < v.size(); i++) {
	      int x1 = v.get(i).first;
	      int y1 = v.get(i).second;
	      int x2 = result.get(result.size() - 1).first;
	      int y2 = result.get(result.size() - 1).second;

	      if(y2 >= x1) {
	        result.get(result.size() - 1).second = Math.max(y1, y2);
	      } else {
	        result.add(new Pair(x1, y1));
	      }
	    }

	    return result;
	  }
	 
	}
	
	
	
	

}
