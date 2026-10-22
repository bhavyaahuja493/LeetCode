import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int countLess = 0;
        int countEqual = 0;   //element count krta h smaller than target
        for (int num : nums) {
            if (num < target) {
                countLess++;
            } else if (num == target) {
                countEqual++;
            }
        }
        List<Integer> result = new ArrayList<>();
        //index ki list ko generate krne k liye
        for (int i = 0; i < countEqual; i++) {
            result.add(countLess + i);
        }
        return result;
    }
}