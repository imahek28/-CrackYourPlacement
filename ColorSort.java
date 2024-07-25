/*
* Date - 25/07/2024
* Problem - https://leetcode.com/problems/sort-colors/
* Category - Array
* Level - Easy
*/
class Solution {
      public void sortColors(int[] nums) {

        // easiest
        Arrays.sort(nums)
        
        //linear sort
        for(int j=0;j<nums.length;j++){
            for(int i=0;i<nums.length-1;i++){
                int temp=0;
                if(nums[i]>nums[i+1]){
                    temp=nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=temp;
                }
            }
        }
    }
}
