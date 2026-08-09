class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a' && c<='z' || c>='0' && c<='9'){
                str.append(c);
            }
           
        }
         String org=str.toString();
              String rev=str.reverse().toString();
           return org.equals(rev);
    }
}