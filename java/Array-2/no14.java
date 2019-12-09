/*
Given an array of ints, return true if it contains no 1's or it contains no 4's.

no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true
*/

public boolean no14(int[] nums) {
  boolean check1 = false;
  boolean check4 = false;
  boolean check = true;
  
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 1){
      check1 = true;
    }
    if(nums[i] == 4){
      check4 = true;
    }
  }
  
  if(check1 == true && check4 == true){
    check = false;
  }else if(check1 == true || check4 == true){
    check = true;
  }
  
  return check;
  
}
