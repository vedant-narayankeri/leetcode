class Solution {
    public int removeElement(int[] nums, int val) {
        //Need to do in-place modification for the array, everytime you change index that is the count
        int index = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != val){
                nums[index] = nums[i]; 
                index++;
            }
        }
        return index;//number of important elements
    }
}