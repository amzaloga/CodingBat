/*
Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.

double23([2, 2]) → true
double23([3, 3]) → true
double23([2, 3]) → false
*/

public boolean double23(int[] nums) {
  boolean check = false;
  
  if(nums.length <= 1){
    check = false;
  }else if(nums.length >= 2){
    if(nums[0] == 2 && nums[1] == 2 || nums[0] == 3 && nums[1] == 3){
      check = true;
    }
  }
  return check;
}
