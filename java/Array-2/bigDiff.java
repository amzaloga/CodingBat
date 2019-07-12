/*
Given an array length 1 or more of ints, return the difference between the 
largest and smallest values in the array. Note: the built-in Math.min(v1, v2) and 
Math.max(v1, v2) methods return the smaller or larger of two values.

bigDiff([10, 3, 5, 6]) → 7
bigDiff([7, 2, 10, 9]) → 8
bigDiff([2, 10, 7, 2]) → 8
*/

public int bigDiff(int[] nums) {
  int max = 0;
  int min = 1000;
  int diff = 0;
  
  if(nums.length == 1){
    diff = 0;
  }else if(nums.length == 2){
    diff = Math.abs(nums[0] - nums[1]);
  }else if(nums.length > 2){
    for(int i = 0; i <= nums.length - 1; i++){
    int currentMax = Math.max(max,nums[i]);
    int currentMin = Math.min(min,nums[i]);
    if(currentMax > max){
      max = currentMax; 
    }
    if(currentMin < min){
      min = currentMin; 
    }
  }
  diff = max - min;
  }
  return diff;
}
