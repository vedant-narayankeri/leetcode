class Solution {
    public void sortColors(int[] nums) {
        // 0, 1, 2 - Simple frequency counting approach
        int[] frequency = new int[3];
        for(int i = 0;i<nums.length;i++){
            frequency[nums[i]]++;
        }
        int k = 0;
        for(int i = 0;i<frequency.length;i++){
            while(frequency[i]>0){
                nums[k++] = i;
                frequency[i]--;
            }
        }
    }
}