/*
Given an array of ints of odd length, return a new array length 3 containing the elements 
from the middle of the array. The array length will be at least 3.

midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
midThree([1, 2, 3]) → [1, 2, 3]
*/

public int[] midThree(int[] nums) {
  
  float x = nums.length/3;
  int y = (int) Math.ceil(x);
  int[] array = new int[3];
  
  if(nums.length > 3){
    for(int i = 0; i < 3; i++){
    array[i] = nums[y];
    y++;}
  }else if(nums.length == 3){
    for(int u = 0; u < 3; u++){
    array[u] = nums[u];
    }
  }
  return array;
}
