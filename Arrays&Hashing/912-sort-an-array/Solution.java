class Solution {
    public int[] sortArray(int[] nums) {
        //Merge Sort - recursive approach
        //Complexity - O(n*logn), everytime we merge half-half array
        //To do this we would need to give indices of parts - for avoiding array slicing
        mergeSort(nums, 0, nums.length -1);
        return nums;
    }

    //Helper for recursion
    private void mergeSort(int[] array, int left, int right){
        if(left>=right) return;//when we reach to single index
        //Note - looks like we are doing in place ops, cool
        int l = left;
        int mid = (left+right)/2;//Should work as base condition
        int r = right;
        mergeSort(array, l, mid);
        mergeSort(array, mid+ 1, r);
        //Below function is code to merge 2 sorted lists (O(N)) complexity - we have to compare element by element
        //Both pointers have to reach end and for each operation one pointer moves ahead
        merge(array, l, mid, r);//Do actual comparison and merging of smaller parts, need indices it
    }

    private void merge(int[] array, int l, int mid, int r){
        //Base cases might be an issue
        int temp[] = new int[r - l + 1];//Simple 2 indices - 1, 3 num of elements = 3 -> j - i + 1

        int i = l;//left array first element
        int j = mid+1;//right array first element
        int k = 0;//pointer for merged array
        //For reaching to ends of both arrays
        while(i<=mid && j<=r){
            if(array[i] > array[j]){
                temp[k++] = array[j++];
            } else {
                temp[k++] = array[i++];
            }        
        }
        //Handle cases when one of the pointers has reached it ends
        while(i<=mid){
            temp[k++] = array[i++];
        }
        while(j<=r){
            temp[k++] = array[j++];
        }

        //Now we have to do inplace copy and put data of temp array to nums
        //Syntax - System.arraycopy(source, srcPos, dest, destPos, length);
        System.arraycopy(temp, 0, array, l, temp.length);
    }
}