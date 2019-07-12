/*
Return the sum of the numbers in the array, except ignore sections of numbers 
starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.

sum67([1, 2, 2]) → 5
sum67([1, 2, 2, 6, 99, 99, 7]) → 5
sum67([1, 1, 6, 7, 2]) → 4
*/

public int sum67(int[] nums) {
  int sum = 0;
  
  for(int i = 0; i <= nums.length - 1; i++){
    if(nums[i] == 6){
      for(int j = i; j <= nums.length - 1; j++){
        if(nums[j] != 7){
          nums[j] = 0;
        }else if(nums[j] == 7){
          nums[j] = 0;
          break;
        }
      }
    }
  }
  
  for(int z = 0; z <= nums.length - 1; z++){
    sum = sum + nums[z];
  }
  return sum;
}
