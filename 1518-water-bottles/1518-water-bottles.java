class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
      int exchange = 0;
      int drunk = numBottles;
      while(numBottles >= numExchange){
        int remainder = numBottles % numExchange;
        exchange = numBottles / numExchange;
        numBottles = remainder+exchange;
        drunk =  drunk + exchange;
      }  
      return drunk;
    }
}