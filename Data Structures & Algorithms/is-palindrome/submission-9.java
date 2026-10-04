class Solution {
    public boolean isPalindrome(String s) {
         String clear = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
         
         for(int i = 0; i < clear.length()/2;i++){
            if(clear.charAt(i) != clear.charAt(clear.length()-1-i)){
                return false;
            }
         }
         return true;
        
    }
}
