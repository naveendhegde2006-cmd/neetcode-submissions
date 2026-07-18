class Solution {
    public boolean isAnagram(String s, String t) 
    {
         int[] freq=new int[52];
         if(s.length()!=t.length())
         return false;
         for(int i=0;i<s.length();i++)
         {
            freq[s.charAt(i)-'a']++;
         }
         for(int i=0;i<t.length();i++)
         {
            freq[(t.charAt(i)-'a')+26]++;
         }
         for(int i=0;i<26;i++)
         {
            if(freq[i]!=(freq[i+26]))
            return false;
         }
         return true;

    }
}
