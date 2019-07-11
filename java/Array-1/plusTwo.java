/*
Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.

plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
*/

public int[] plusTwo(int[] a, int[] b) {
  int[] array = new int[4];
  
  for(int i = 0; i <= array.length - 1; i++){
    if(i <= 1){
      array[i] = a[i];
    }
    if(i >= 2){
      array[i] = b[i-2];
    }
  }
  return array;
}
