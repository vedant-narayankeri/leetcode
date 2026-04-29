class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Anagrams have same character frequency
        //For grouped ones their lexicographically sorted strins are same as frequency of characters is same
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> groupedMap = new HashMap<>();
        for(int i = 0;i<strs.length;i++){
            char[] charsOfString = strs[i].toCharArray();
            Arrays.sort(charsOfString);
            String sortedString = String.valueOf(charsOfString);
            if(groupedMap.containsKey(sortedString)){
                groupedMap.get(sortedString).add(strs[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                groupedMap.put(sortedString, list);
            }
        }
        groupedMap.forEach((k, v) ->{
            result.add(v);
        });
        return result;
    }
}