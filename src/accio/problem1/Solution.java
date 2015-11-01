package accio.problem1;

import java.util.HashMap;

/**
 * Created by Yuhuan Jiang (jyuhuan@gmail.com) on 10/31/15.
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            int needed = target - cur;
            if (cache.containsKey(cur)) {
                int[] result = new int[2];
                result[0] = cache.get(cur) + 1;
                result[1] = i + 1;
                return result;
            }
            else cache.put(needed, i);
        }

        return null;
    }

}
