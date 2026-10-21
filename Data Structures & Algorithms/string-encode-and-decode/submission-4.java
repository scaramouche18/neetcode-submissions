class Solution {

    public String encode(List<String> strs) {
        if(strs.size()==0)return "";
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            if( s == ""){
                sb.append("$");
                
            }
            else {
                sb.append(s);
                }
            sb.append("%#@");

        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        if(str.equals("")) return new ArrayList();
       String[] atr = str.split("%#@");
         List<String> s1 = new ArrayList<>();
        for(String s:atr){
            if(s.equals("$") ){
                s1.add("");
            }
            else{ 
                s1.add(s);
                }
        }
        return s1;

    }
}
