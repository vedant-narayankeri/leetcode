class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Bucket Sort, leveraged using frequency counting
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            frequencyMap.put(nums[i], frequencyMap.getOrDefault(nums[i], 0)+1);
        }
        List<Integer>[] buckets = new List[nums.length+1];//Bucket = frequency which can be max when all numbers are the same
        //+1 because by default indexing is from Zero

        //Iterate over map keys as they are unique numbers
        for(int key: frequencyMap.keySet()){
            int frequency = frequencyMap.get(key);
            if(buckets[frequency] == null){
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(key);
        }
        int result[] = new int[k];
        int index = 0;
        for(int i = buckets.length-1;i>=0 && index<k;i--){
            if(buckets[i] != null){
                for(int num : buckets[i]){
                    result[index] = num;
                    index++;
                    if(index == k){
                        break;//Next iteration doesn't execute and we break for loop
                    }
                }
            }
        }
        return result;
    }
}