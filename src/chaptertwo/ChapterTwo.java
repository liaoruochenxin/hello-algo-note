package chaptertwo;

import java.util.Stack;

public class ChapterTwo {
    /**
     * 迭代与递归
     */
    public static void main(String[] args) {
        // System.out.println(nestedForLoop(10));
        // System.out.println(forLoop(10));
        // System.out.println("while loop: " + whileLoop(10));
        // System.out.println("recur: " + recur(10));
        // System.out.println("tailRecur: " + tailRecur(10, 0));
        // System.out.println("斐波那契: " + fib(8));
        System.out.println("迭代模拟递归: " + forLoopRecur(10));
    }

    /* 迭代 */
    /**
     * for 循环
     * 最常见的迭代形式之一
     * 适合在预先知道迭代次数时使用
     */
    static int forLoop(int n) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += i;
        }
        return res;
    }

    /**
     * while 循环
     * 
     * @param n
     * @return
     */
    static int whileLoop(int n) {
        int res = 0;
        int i = 1; // 初始化条件变量
        // 循环求和
        while (i <= n) {
            res += i;
            i++; // 更新变量条件
        }
        return res;
    }

    /* 双层 for 循环 */
    static String nestedForLoop(int n) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res.append("(" + i + ", " + j + "),");
            }
        }
        return res.toString();
    }

    /**
     * 递归
     * 两个阶段
     * 1、递：函数通过不断调用自身，传入逐渐接近终止条件的参数
     * 2、归：当参数达到终止条件之后，逐层返回，汇聚结果
     * 三要素:
     * 1、终止条件：决定什么时候由递转归
     * 2、递归调用
     * 3、返回结果
     * 当处理 分治 相关问题时，递归比迭代思路更直观，代码更易读
     */
    static int recur(int n) {
        // 终止条件
        if (n == 1) {
            return 1;
        }
        // 递
        int res = (recur(n - 1));
        // 归
        return n + res;
    }

    /**
     * 尾递归
     * 概念：函数在返回前最后一步才执行递归调用
     */
    static int tailRecur(int n, int res) {
        // 终止条件
        if (n == 0) {
            return res;
        }
        // 尾递归调用
        return tailRecur(n - 1, res + n);
    }

    /**
     * 斐波那契数列
     * @param n
     * @return
     */
    static int fib(int n) {
        if (n == 1 || n == 2) {
            return n - 1;
        }
        return fib(n-1) + fib(n-2);
    }

    /**
     * 用迭代模拟递归
     * @param n
     * @return
     */
    static int forLoopRecur(int n) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for (int i = n; i > 0; i--) {
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;
    }

}
