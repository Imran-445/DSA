class Solution {
    public int missingNumber(int[] nums) {
        int i=0;

        while(i<nums.length) {
            int correct_index = nums[i];

            if(nums[i]<nums.length && nums[i]!=nums[correct_index]){
                swap(nums,i,correct_index);
            }else{
                i++;
            }
        }


        for(int index=0; index<nums.length; index++) {
            if(nums[index]!=index) {
                return index;
            }
        }
        return nums.length;
    }

    static void swap(int arr[], int i, int correct_index){
        int temp = arr[i];
        arr[i] = arr[correct_index];
        arr[correct_index]=temp;
    }
}