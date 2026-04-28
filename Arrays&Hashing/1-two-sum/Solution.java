class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numToIndex.put(nums[i], i);
        }

        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            // Complement should exist and index of diff shouldn't be same as itself
            if (numToIndex.containsKey(diff) && numToIndex.get(diff) != i) {
                result[0] = i;
                result[1] = numToIndex.get(diff);
            }
        }

        return result;
    }
}