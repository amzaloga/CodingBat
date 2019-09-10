/*
Given a string, compute recursively the number of times lowercase "hi" 
appears in the string, however do not count "hi" that have an 'x' immedately before them.

countHi2("ahixhi") → 1
countHi2("ahibhi") → 2
countHi2("xhixhi") → 0
*/

public int countHi2(String str) {
  if(str.length() <= 1){
    return 0;
  }if(str.charAt(0) == 'x' && str.charAt(1)  == 'h' && str.charAt(2)  == 'i'){
    return 0 + countHi2(str.substring(2));
  }
    if(str.charAt(0) == 'h' && str.charAt(1)  == 'i'){
    return 1 + countHi2(str.substring(2));
    }
  
  return countHi2(str.substring(1));
}
