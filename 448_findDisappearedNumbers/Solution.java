/*
LeetCode Problem No.448:    https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
Author:                     zhangyixing1007
Idea:                       put nums[i] to where it should be until that place has been occupied correctly
Time:                       7 ms, beat 98.42%
Space:                      47.3MB, beat 95.66%
*/

class Solution { 
    public List<Integer> findDisappearedNumbers(int[] nums) { 
        List<Integer> list = new ArrayList<>(); 
         
        for (int i = 0; i < nums.length; i++) 
        { 
            while (nums[i]!=nums[nums[i]-1]) 
            { 
                int t = nums[i]; nums[i] = nums[nums[i]-1];nums[t-1] = t; 
            } 
        } 
         
        for (int i = 0; i < nums.length; i++) 
        { 
            if (nums[i]!=i+1) 
            { 
               list.add(i+1); 
            } 
        }         
        return list; 
    } 
} 
