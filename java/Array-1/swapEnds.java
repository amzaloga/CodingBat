/*
Given an array of ints, swap the first and last elements in the array. 
Return the modified array. The array length will be at least 1.


swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
swapEnds([1, 2, 3]) → [3, 2, 1]
swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
*/

public int[] swapEnds(int[] nums) {
  int[] array = new int[nums.length];
  int[] temp = new int[nums.length];
  
  for(int i = 0; i <= nums.length - 1; i++){
    temp[i] = nums[i];
    array[i] = nums[i];
  }
  
  array[0] = nums[nums.length - 1];
  array[array.length - 1] = nums[0];
  
  return array;
  
}
