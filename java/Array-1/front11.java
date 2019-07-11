/*
Given 2 int arrays, a and b, of any length, return a new array with 
the first element of each array. If either array is length 0, ignore that array.

front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1]
*/

public int[] front11(int[] a, int[] b) {
  int[] array = new int[0];
  
  if(a.length != 0 && b.length != 0){
    array = new int[2];
    array[0] = a[0];
    array[1] = b[0];
  }else if(a.length == 0 && b.length == 0){
    array = new int[0];
  }else if(a.length == 0 || b.length == 0){
    array = new int[1];
    if(a.length == 0){
      array[0] = b[0];
    }
    if(b.length == 0){
      array[0] = a[0];
    }
  }
  return array;
}
