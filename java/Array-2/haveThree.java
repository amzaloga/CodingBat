/*Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.


haveThree([3, 1, 3, 1, 3]) → true
haveThree([3, 1, 3, 3]) → false
haveThree([3, 4, 3, 3, 4]) → false */

public boolean haveThree(int[] nums) {
  boolean check = false;
  int counter = 0;
  boolean answer = false;
  
  for(int i = 0; i <= nums.length -1; i++){
    if(nums[i] == 3){
      counter++;
    }
  }
  
  for(int j = 0; j <= nums.length - 2; j++){
    if(nums[j] == 3 && nums[j + 1] == 3){
      check = true;
    }
  }
  
  if(counter == 3 && check != true){
    answer = true;
  }
  
  return answer;
  
}
