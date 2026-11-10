class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;

        while (i<nums.length){
            int correct_index = nums[i]-1;

            if(nums[i]!=nums[correct_index])
                swap(nums,i,correct_index);
            else
                i++;
        }


        for(int index=0; index<nums.length; index++){
            if(nums[index]!=index+1){
                return new int[] {nums[index],index+1};
            }
        }
        return new int[] {-1,-1};
    }


    static void swap(int nums[],int i,int correct_index){
        int temp=nums[i];
        nums[i]=nums[correct_index];
        nums[correct_index]=temp;
    }
}