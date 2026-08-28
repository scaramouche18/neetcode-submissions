class Solution {
    public boolean isValid(String s) {
        Stack<Character> valid = new Stack<>();
        
        for(char ch : s.toCharArray()){

            if(ch == '(' || ch == '{' || ch == '['){
                valid.push(ch);
            }
            else{
                if(valid.isEmpty()){
                    return false;
                }

                char top = valid.pop();

                if(ch == ')' && top != '('){
                    return false;
                }
                if(ch == '}' && top != '{'){
                    return false;
                }
                if(ch == ']' && top != '['){
                    return false;
                }
            }
        }
        return valid.isEmpty();
    }
}
