package cn.itcast.junit;

/**
 * @Description：测试
 * @Author 金宇佳
 * @Date 2020/12/15 15:07
 * @Version 1.0
 */
public class CalculatorTest {
    public static void main(String[] args) {
        //创建对象
        Calculator c = new Calculator();
        //调用
        /*int result = c.add(1, 2);
        System.out.println(result);*/

        int result = c.sub(1, 1);
        System.out.println(result);
    }
}
