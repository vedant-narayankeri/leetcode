class Solution {
    public String longestCommonPrefix(String[] strs) {
        //Check cells one by one, keep index with last match
        //Iterate for any of the string lenghts, if shortest good that will be max common prefix
        for(int i = 0;i<strs[0].length();i++){
            //Check for each string if current character is same
            for(String s : strs){
                //also need to check if we don't go out of bounds for string
                if(i == s.length() || s.charAt(i) != strs[0].charAt(i)){
                    return strs[0].substring(0,i);//substring(x,y) is from index x to y-1
                    //Hence substring(0,0) - is 0 to -1 which returns empty string
                }
            }
        }
        //Base case when all characters match for all strings - just return the string
        return strs[0];
    }
}