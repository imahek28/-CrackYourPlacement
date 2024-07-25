/*
* Date - 25/07/2024
* Problem - https://leetcode.com/problems/two-sum/
* Category - Array
* Level - Easy
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){

                
                if(nums[i]+nums[j]==target){
                     result[0]=i;
                     result[1]=j;
                }
            }
        }

        
        return result;
    }
}
