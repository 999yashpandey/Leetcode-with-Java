class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;

        for(int i=0;i<s.length();i++){
            boolean[] seen=new boolean[128];
            int len=0;

            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);

                if(seen[ch]) break;

                seen[ch]=true;
                len++;
            }

            max=Math.max(max,len);
        }

        return max;
    }
}