/*
Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. 
Return the array which has the largest sum. In event of a tie, return a.

biggerTwo([1, 2], [3, 4]) → [3, 4]
biggerTwo([3, 4], [1, 2]) → [3, 4]
biggerTwo([1, 1], [1, 2]) → [1, 2]
*/

public int[] biggerTwo(int[] a, int[] b) {
  boolean check = false;
  if((a[0]+a[1]) > (b[0]+b[1])){
    check = true;
  }else if((a[0]+a[1]) < (b[0]+b[1])){
    check = false;
  }else if((a[0]+a[1] == b[0]+b[1])){
    check = true;
  }
  if(check == true){
    return a;
  }else{
    return b;
  }
}
