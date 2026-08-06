#include <vector>
#include <unordered_map>
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> mp; // value -> index

        for (int i = 0; i < nums.size(); i++) {
            int complement = target - nums[i];
            
            // Check if the complement already exists in the map
            if (mp.find(complement) != mp.end()) {
                // Found the two indices
                return {mp[complement], i};
            }

            // Store the current number and its index
            mp[nums[i]] = i;
        }

        // Just to satisfy the function return type; problem guarantees one solution
        return {};
    }
};
