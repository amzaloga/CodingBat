/*
Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.

either24([1, 2, 2]) → true
either24([4, 4, 1]) → true
either24([4, 4, 1, 2, 2]) → false
*/

public boolean either24(int[] nums) {
  boolean check1 = false;
  boolean check4 = false;
  boolean check = false;
  
  for(int i = 0; i < nums.length -1; i++){
    if(check1 == false){
    if(nums[i] == 2 && nums[i + 1] == 2){
      check1 = true;
    }
    }
    if(check4 == false){
    if(nums[i] == 4 && nums[i + 1] == 4){
      check4 = true;
    }
    }
    if(check1 == true && check4 != true || check1 != true && check4 == true){
      check = true;
    }else{
      check = false;
    }
  }
  return check;
}
