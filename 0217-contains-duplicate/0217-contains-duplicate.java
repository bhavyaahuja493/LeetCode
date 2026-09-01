class Solution {
    public boolean containsDuplicate(int[] nums) {
       Arrays.sort(nums);
       for(int i=0; i<nums.length-1; i++){
       if(nums[i]==nums[i+1])// it reprsent numbers inside array nums
       {
        return true;
       }
    }
        return false;
}
       }
