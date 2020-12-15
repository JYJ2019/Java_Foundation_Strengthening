package cn.itcast.junit;

/**
 * @Description：计算机类
 * @Author 金宇佳
 * @Date 2020/12/15 14:40
 * @Version 1.0
 */
public class Calculator {
    /**
     * 加法
     * @param a
     * @param b
     * @return
     */
    public int add(int a, int b) {
        // int i = 3;//ArithmeticException: / by zero
        return a + b;
    }

    /**
     * 减法
     * @param a
     * @param b
     * @return
     */
    public  int sub(int a, int b) {
        return a - b;
    }
}
