class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
        list.add(i);//index dlna hai agr he toh
    }}
    return list;

    }
}