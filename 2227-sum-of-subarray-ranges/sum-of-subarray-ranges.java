class Solution {
    public long subArrayRanges(int[] nums) {
        return subArrayRangesBruteForce(nums);
    }

    private long subArrayRangesBruteForce(int[] nums) {
        //Brute force - Generate all sub-arrays and then compute difference b/w first & last elements for each sub-array
        //O(N*N)
        long result = 0;
        for(int i = 0;i < nums.length;i++){
            int max = nums[i];
            int min = nums[i];
            for(int j = i; j<nums.length;j++){
                //Keep re-calculating max min after addition of index
                max = Math.max(max, nums[j]);
                min = Math.min(min, nums[j]);
                result += max - min;
            }
        }
        return result;
    }

    private long subArrayRangesMonotonicStack(int[] nums) {
        int result = 0;
        return result;
    }    
}