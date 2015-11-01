package accio.problem1;

/**
 * Created by Yuhuan Jiang (jyuhuan@gmail.com) on 10/31/15.
 */
public class Problem1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] candidates = new int[4];
        candidates[0] = 2;
        candidates[1] = 3;
        candidates[2] = 6;
        candidates[3] = 10;
        int[] answer = solution.twoSum(candidates, 13);

        int bp = 0;
    }
}
