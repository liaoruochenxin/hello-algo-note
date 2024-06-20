package chaptertwo;

public class TimeComplexity {
    public static void main(String[] args) {
        Example example = new Example();
        // System.out.println(example.linear(10));
        // System.out.println(example.constant(10));
        // System.out.println(example.quadratic(10));
        // int[] nums = { 4, 1, 3, 7, 9 };
        // nums = example.bubbleSort(nums);
        // for (int i : nums) {
        // System.out.println(i);
        // }
        // System.out.println(example.exponetial(10));
        // System.out.println(example.expRecur(10));
        // System.out.println(example.logarithmic(10));
        // System.out.println(example.logRecur(10));
        // System.out.println(example.linearLogRecur(10));
        System.out.println(example.factorialRecur(10));
    }
}

class Example {

    /* 阶乘阶 递归实现 */
    int factorialRecur(int n) {
        if (n == 0) {
            return 1;
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            count += factorialRecur(n - 1);
        }
        return count;
    }

    /* 线性对数阶 */
    int linearLogRecur(int n) {
        if (n <= 1) {
            return 0;
        }
        int count =  linearLogRecur(n / 2) + linearLogRecur(n / 2);
        for (int i = 0; i < n; i++) {
            count++;
        }
        return count;
    }

    /* 对数阶 递归实现 */
    int logRecur(int n) {
        if (n <= 1) {
            return 0;
        }
        return logRecur(n / 2) + 1;
    }

    /* 常数阶 */
    int constant(int n) {
        int count = 0;
        int size = 10000;
        for (int i = 0; i < size; i++)
            count++;
        return count;
    }

    /* 线性阶 */
    int linear(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            count++;
        }
        return count;
    }

    /* 平方阶 */
    int quadratic(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count++;
            }
        }
        return count;
    }

    /* 平方阶 冒泡算法 */
    int[] bubbleSort(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }

    /* 指数阶 */
    int exponetial(int n) {
        int count = 0;
        int base = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < base; j++) {
                count++;
            }
            base *= 2;
        }
        return count;
    }

    /* 指数阶 递归实现 */
    int expRecur(int n) {
        if (n == 1) {
            return 1;
        }
        return expRecur(n - 1) + expRecur(n - 1) + 1;
    }
    /* 对数阶 */
    int logarithmic(int n) {
        int count = 0;
        while (n > 1) {
            n = n / 2;
            count++;
        }
        return count;
    }
}
