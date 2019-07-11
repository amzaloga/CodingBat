/*
Given an array of ints of odd length, look at the first, last, and middle values 
in the array and return the largest. The array length will be a least 1.

maxTriple([1, 2, 3]) → 3
maxTriple([1, 5, 3]) → 5
maxTriple([5, 2, 3]) → 5
*/

public int maxTriple(int[] nums) {
  int first = nums[0];
  int last = nums[nums.length - 1];
  int calc = nums.length / 2;
  int middle = nums[(int)Math.ceil(calc)];
  int max = 0;
  
  if(first > middle && first > max){
    max = first;
  } if(first > last && first > max){
    max = middle;
  } if(middle > last && middle > max){
    max = middle;
  }if(middle > first && middle > max){
    max = middle;
  }if(last > first && last > max){
    max = last;
  }if(last > middle && last > max){
    max = last;
  }
  return max;
}
