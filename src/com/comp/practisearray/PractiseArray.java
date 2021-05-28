package com.comp.practisearray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class PractiseArray {
	public static int singleNumber(int[] nums) {
		int value = 0;
		Map<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
		for (int num : nums) {
			if (!numberMap.containsKey(num)) {
				numberMap.put(num, 1);
			} else {
				Integer val = (Integer) numberMap.get(num);
				numberMap.put(num, val + 1);
			}
		}
		for (Entry<Integer, Integer> entry : numberMap.entrySet()) {
			if (entry.getValue() == 1) {
				value = entry.getKey();
				break;
			}
		}
		return value;
	}
		
	/*
	 * public static int[] plusOne(int[] digits) { for(int i = 0; i < digits.length
	 * ; i++){
	 * 
	 * if(i==digits.length-1){ digits[i]=digits[i]+1; if(digits[i]>9) { digits=new
	 * int[digits.length] ; }
	 * 
	 * }
	 * 
	 * 
	 * } return digits;
	 * 
	 * }
	 */
	
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
	        for( int i=nums1.length ;i>0 &&  m>0;i--, m--){
	            for(int j=nums2.length;j>0;j--){
	                if(nums1[m]>nums2[j]){
	                    nums1[i]=nums1[m];
	                    
	                }else{
	                   nums1[i]=nums2[j];
	            }
	        }
	    }
	    }
	   
	 public static  int removeDuplicates(int[] nums) {
	        int j = 0;
	        int len= nums.length-1;
	        int k =0;
	        
	        for(int i =0; i< len; i++) {
	           if(nums[i]!=nums[i+1]){
	              nums[j] =nums[i+1];
	              j++;
	           }
	       
	           
	        }
			return j+1;
	    }
	 public static  boolean containDuplicates(int[] nums) {
	       boolean hasDuplicate=false;
			  for(int i=0; i<= nums.length-1; i++) {
				  for(int j=i+1; j<= nums.length-1;j++) {
					  if(nums[i]==nums[j]) {
						  hasDuplicate=true;
	                      break;
						 // return hasDuplicate;
						  
					  }else {
						  hasDuplicate= false;
						 // return hasDuplicate;
					  }
				  }
				 if(hasDuplicate==true) {
					 break;
				 }
			  }
	  return hasDuplicate;
	 }

		public static boolean findxinkindowSize(int N, int[] arr, int x, int k) {

			boolean isFound= false;
			int temp=0;
			int count=1;
			for (int i = 0 ; i< N ; i++) {
				 if(arr[i]==x && temp <k) {
					 isFound=true;
					 //break;
					 
				 }else {
					 isFound=false;
					 temp++;
				 }
				 if(isFound==true) {
					 i=count*(k);
					 temp=0;
					 count++;
				 }
			}
			return isFound;

		}
	
		public static int[] plusOne(int[] digits) {
	        int carry = 1; 
	        int i = -1;
	        for(i = digits.length - 1; i >= 0; i--) {
	            int digit = digits[i];
	            digits[i] = (digit + carry) % 10;
	            carry = (digit + carry) / 10;
	            if(carry == 0) break;
	        }
	        
	        int[] newdigits = new int[digits.length+1];
	        if(i == 0 && carry > 0) {
	            newdigits[0] = carry;
	            for(int j = 0; j < digits.length; j++) {
	                newdigits[j+1] = digits[j];
	            }
	            return newdigits;
	        }
	        
	        return digits;
	    }
		 public static void reverseArray(int [] nums) {
			 int start=0;
			 int end= nums.length-1;
			 while(start<end) {
				 int temp=nums[start];
				 nums[start]=nums[end];
				 nums[end]=temp;
				 start++;
				 end--;
			 }
			
		 }
		 
		 public static int findShortestSubArray(int[] nums) {
		        HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		       // int count=1;
		        for(int i =0 ;i<nums.length; i++){
		            if(!map.containsKey(nums[i])){
		            map.put(nums[i],1);
		            }
		            else{
		                map.put(nums[i],map.get(nums[i])+1);
		            }
		           // count++;
		        }
		      // Entry<Integer, Integer> entry= (Entry) map.entrySet();
		       //int val=entry.getValue();
		       int degree = Collections.max(map.values());
		  
		       return degree;
		    }

			public static  boolean containsDuplicate(int[] nums) {
				boolean isDuplicate = false;
				Map<Integer, Integer> map = new HashMap<Integer, Integer>();
				for (int i = 0; i < nums.length; i++) {
					if (!map.containsKey(nums[i])) {
						map.put(nums[i], 1);
					} else {
						map.put(nums[i], map.get(nums[i]) + 1);
					}
				}
				for (Entry<Integer, Integer> entry : map.entrySet()) {
					int val = entry.getValue();
					if (val > 1) {
						isDuplicate = true;
						break;

					} else {
						isDuplicate = false;
					}
				}
				return isDuplicate;
			}
			public int[] arrayRankTransform(int[] arr) {
		        int[] rank=new int[arr.length];
		        int[] orig= new int[arr.length];
		        ArrayList<Integer> result=new ArrayList<Integer>();
		       
		        int  j=0;
		        for(int i:arr) {
		        	orig[j]=i;
		        	j++;
		        }
		        Arrays.sort(arr);
		        //int rank=1;
		        for(int k=0; k< arr.length-1; k++) {
		        	//rank[i]=x;
		        	if(arr[k]!=arr[k+1]) {
		        	//	rank=rank+1;
		        	}
		        	//result.add(rank);
		        }
		        return rank;
		       
		    }
			
			public int[] intersect(int[] nums1, int[] nums2) {
				/*
				 * ArrayList<Integer> intersectedList =new ArrayList<Integer>();
				 * 
				 * int len_n1=nums1.length; int len_n2=nums2.length; List<Integer>
				 * numsList=null; if(len_n1>len_n2){ numsList =
				 * Arrays.stream(nums1).boxed().collect(Collectors.toList()); for(int i=0; i<
				 * nums2.length; i++) { if(numsList.contains(nums2[i])) {
				 * intersectedList.add(nums2[i]); numsList.remove(nums2[i]); } } }else {
				 * numsList=Arrays.stream(nums2).boxed().collect(Collectors.toList()); for(int
				 * i=0; i< nums1.length; i++) { if(numsList.contains(nums1[i])) {
				 * intersectedList.add(nums1[i]); numsList.remove(nums1[i]); } } }
				 */
		        //int[] result =new int[intersectedList.size()];
		        //Integer[] result=(Integer[])intersectedList.toArray();
				ArrayList<Integer> intersectedList =new ArrayList<Integer>();
                Arrays.sort(nums1);
                Arrays.sort(nums2);
                int i=0 ; 
                int j=0; 
                
                while(i< nums1.length && j < nums2.length){
                    if(nums1[i]>nums2[j]){
                        j++;
                    }
                    else if(nums2[j]>nums1[i]){
                        i++;
                    }else{
                      intersectedList.add(nums1[i]);
                        i++;
                        j++;
                    }
                }
		        return intersectedList.stream().mapToInt(k->k).toArray();
		    }
			static void printIntersection(int arr1[], int arr2[])
		    {
		        HashSet<Integer> hs = new HashSet<>();
		        HashSet<Integer> hs1 = new HashSet<>();
		 
		        for (int i = 0; i < arr1.length; i++)
		            hs.add(arr1[i]);
		 
		        for (int i = 0; i < arr2.length; i++)
		            if (hs.contains(arr2[i]))
		                System.out.print(arr2[i] + " ");
		    }

	public static void main(String[] args) {
		int[] nums1 = new int[] { 1,2,2,3,1, 5, 5,5};
		int[] arr1= {4,9,5};
		int[] arr2=	{9,4,9,8,4};
		System.out.println(
	            "Intersection of two arrays is : ");
	        printIntersection(arr1, arr2);
		boolean hasDuplicate=containsDuplicate(nums1);
		System.out.println("hasDuplicate"+hasDuplicate);
		//int degree=findShortestSubArray(nums1);
		//System.out.println("degree"+degree);
		//reverseArray(nums1);
		//int[] duplicate = new int[] { 0,1,2, 3,0, 4 };
		//boolean containDuplicate=containDuplicates(duplicate);
		//System.out.println("containDuplicate"+containDuplicate);
		//int[] nums=plusOne(nums1);
		//int vlaue = singleNumber(nums);
		//System.out.println("Single number" + vlaue);
		for (int i = 0; i < nums1.length  ; i++) {
			System.out.println(nums1[i]);
		}
		
		 int arr[] = new int[] {5, 8, 7, 12, 14, 3, 9 };
int x = 8, k = 2;
int n = arr.length;
if (findxinkindowSize(n, arr, x, k))
System.out.println("Yes");
else
System.out.println("No");
	}
}
