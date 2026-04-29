class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> numToFreq = new HashMap<>();
        int index = -1;
        int comparison = (nums.length %2 == 0) ? nums.length/2 : (nums.length/2) + 1; 
        for(int i = 0;i<nums.length;i++){
            int newFrequency;
            if(numToFreq.containsKey(nums[i])){
                newFrequency =  numToFreq.get(nums[i]) + 1;
                numToFreq.put(nums[i],newFrequency);
            } else {
                newFrequency = 1;
                numToFreq.put(nums[i], newFrequency);
            }
            if(newFrequency >= comparison){
                index = i;
                break;
            }
        }
        return nums[index];
    }
}