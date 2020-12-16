package cn.itcast.annotation;

/**
 * @Description：TODO
 * @Author 金宇佳
 * @Date 2020/12/16 10:14
 * @Version 1.0
 */
public @interface MyAnno {
    int value();
    Person per();
    MyAnno2 anno2();
    String[] strs();
    // String name() default "张三";
    /*String show2();

    Person per();
    MyAnno2 anno2();

    String[] strs();*/
}
