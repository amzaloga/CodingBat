/*
Given an int array length 2, return true if it does not contain a 2 or 3.

no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false
*/

public boolean no23(int[] nums) {
  boolean check = true;
  
  for(int i = 0; i <= nums.length - 1; i++){
    if(nums[i] == 2 || nums[i] == 3){
      check = false;
    }
  }
  return check;
}
