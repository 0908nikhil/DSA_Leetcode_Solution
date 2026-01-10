class Solution {
    public String reverseWords(String s) {
        String rev="";
        String [] word=s.trim().split("\\s+");
        for(int i=word.length-1;i>=0;i--){
            rev+=word[i];
            if(i != 0){
                rev+=" ";
            }
        }
        return rev;
    }
    
}