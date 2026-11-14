class Solution {
    public int hammingWeight(int n) {
        int nobits = 0;
        while( n >= 1){
            if(n%2 == 1){
                nobits++;
            }
            n = n/2;
        }
        return nobits;
    }
}
