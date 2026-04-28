class Solution {
    public boolean isAnagram(String s, String t) {
        int[] frequencyArray = new int[26];
        for(int i = 0;i<s.length();i++){
            frequencyArray[s.charAt(i)-'a']++;
        }
        for(int i = 0;i<t.length();i++){
            frequencyArray[t.charAt(i)-'a']--;
        }      
        for(int i = 0;i<26;i++){
            if(frequencyArray[i] != 0 ){
                return false;
            }
        }  
        return true;
    }
}