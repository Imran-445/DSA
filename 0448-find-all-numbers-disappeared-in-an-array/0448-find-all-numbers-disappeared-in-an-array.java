class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;

        while(i<nums.length){
            int correct_index=nums[i]-1;
            if (nums[i]!=nums[correct_index]){
                swap(nums,i,correct_index);
            }else{
                i++;
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                list.add(index+1);
            }
        }
        return list;
    }

    void swap(int nums[],int i,int correct_index){
        int temp=nums[i];
        nums[i]=nums[correct_index];
        nums[correct_index]=temp;
    }
}