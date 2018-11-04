/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] find(int[] nums, int target) {

        if(nums == null || nums.length == 0){
            throw new IllegalStateException();
        }

        Map<Integer, Integer> maps = new HashMap<Integer, Integer>();

        for( int i = 0; i <nums.length; i++){
            maps.put(nums[i], i);
        }

        for(int j = 0; j < nums.length; j++){
            int compliment = target - nums[j];

            if(maps.containsKey(compliment)) {
                return new int[] {j, maps.get(compliment)};
            }
        }
        throw new IllegalArgumentException("Numbers equalling to target doesn't exist");
    }
}

