package com.algo.twopointer.technique;
 
/**
 * Given 2 sorted arrays, merge the elements into a new sorted array.
 * 
 * @author Abhineet
 */

public class MergeSortedArrays {
  
	public int [] merge(int[] nums1, int[] nums2) {
        
        int i=0;
        int j=0;
        int k=0;
        
        int [] result = new int[nums1.length + nums2.length];
        
        while(i<nums1.length || j < nums2.length){
            
            if(i<nums1.length && j< nums2.length){
                if(nums1[i] < nums2[j]){
                    result[k] = nums1[i];
                    i++;
                }else{
                    result[k] = nums2[j];
                    j++;
                }
            }else if(i<nums1.length){
                result[k] = nums1[i];
                i++;
            }else if(j<nums2.length){
                result[k] = nums2[j];
                j++;
            }
            k++;
        }
        
        return result;
    }
}
