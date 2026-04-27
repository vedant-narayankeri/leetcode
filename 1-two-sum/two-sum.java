class Solution {
    public int[] twoSum(int[] nums, int target) {
        final Map<Integer, Integer> numsMap = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            //key - number and value is index
            numsMap.put(nums[i], i);
        }
        for(int i = 0; i<nums.length; i++){
            int diff = target-nums[i];
            //obviously it shouldn't be same number
            if(numsMap.containsKey(diff) && numsMap.get(diff) != i){
                return new int[]{i, numsMap.get(diff)};
            }
        }
        return new int[2];
    }
}