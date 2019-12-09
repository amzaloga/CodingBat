/*
Given 2 int values greater than 0, return whichever value is nearest to 21 
without going over. Return 0 if they both go over.

blackjack(19, 21) → 21
blackjack(21, 19) → 21
blackjack(19, 22) → 19
*/

public int blackjack(int a, int b) {
  int answer = 0;
  
  if(b > 21 && a > 21){
    answer = 0;
  }else if(a <= 21 && a > b || b > 21){
    answer = a;
  }else if(b <= 21 && a < b || a > 21){
    answer = b;
  }
  return answer;
}
