package chaptertwo;

import java.util.Arrays;
import java.util.Collections;

public class worst_best_time_complexity {
    public static void main(String[] args) {
        
    }

    int[] randomNumbers(int n) {
        Integer[] nums = new Integer[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        Collections.shuffle(Arrays.asList(nums));
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = nums[i];
        }
        return res;
    }
    /* 查找数组中数字1所在索引 */
    int findOne(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                return i;
            }
        }
        return -1;
    }
}


