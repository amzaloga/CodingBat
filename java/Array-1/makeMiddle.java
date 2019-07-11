/*
Given an array of ints of even length, return a new array length 2 containing the 
middle two elements from the original array. The original array will be length 2 or more.

makeMiddle([1, 2, 3, 4]) → [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
makeMiddle([1, 2]) → [1, 2]
*/

public int[] makeMiddle(int[] nums) {
  int[] array = new int[2];
  
  if(nums.length > 2){
    int x = nums.length / 2;
    array[0] = nums[x-1];
    array[1] = nums[x];
  }else{
    array[0] = nums[0];
    array[1] = nums[1];
  }
  return array;
}
