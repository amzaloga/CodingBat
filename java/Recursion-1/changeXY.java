/*
Given a string, compute recursively (no loops) a new string where 
all the lowercase 'x' chars have been changed to 'y' chars.

changeXY("codex") → "codey"
changeXY("xxhixx") → "yyhiyy"
changeXY("xhixhix") → "yhiyhiy"
*/

public String changeXY(String str) {
  
  char character; 
  if(str.length() <=0){
    return str;
  }
  
  character = str.charAt(0);
  
  if(character  == 'x'){
    return 'y' +changeXY(str.substring(1));
  }
  return character + changeXY(str.substring(1));
}
